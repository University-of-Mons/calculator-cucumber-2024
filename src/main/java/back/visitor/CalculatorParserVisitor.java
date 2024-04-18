package back.visitor;

import back.calculator.*;
import back.calculator.operators.*;
import back.calculator.types.*;
import org.antlr.v4.runtime.Token;
import back.parser.calculatorBaseVisitor;
import back.parser.calculatorParser;
import org.slf4j.Logger;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static back.parser.calculatorLexer.*;

/**
 * Visitor class that extends the calculatorBaseVisitor class to visit the nodes of the parse tree.
 *
 * <p>
 *     It is used to visit each type of node in the parse tree and create the corresponding Expression object.
 * </p>
 */
public class CalculatorParserVisitor extends calculatorBaseVisitor<Expression> {

    private Expression getExpression(List<Expression> params, Token op, Notation notation) {
        try {
            return switch (op.getType()) {
                case MUL -> new Times(params, notation);
                case DIV -> new Divides(params, notation);
                case ADD -> new Plus(params, notation);
                case SUB -> new Minus(params, notation);
                default -> throw new IllegalConstruction();
            };
        } catch (IllegalConstruction e) {
            // Shouldn't happen since it would be detected by the parser as a syntax error before.
            return new NotANumber();
        }
    }

    private List<Expression> getInfixParams(calculatorParser.InfixContext ctx) {
        List<Expression> params = new ArrayList<>();
        Collections.addAll(params, visit(ctx.getChild(0)), visit(ctx.getChild(2)));
        return params;
    }

    private List<Expression> getPrefixParams(List<calculatorParser.PrefixContext> prefixContextList) {
        List<Expression> params = new ArrayList<>();
        for (calculatorParser.PrefixContext prefix : prefixContextList)
            params.add(visit(prefix));
        return params;
    }

    private List<Expression> getPostfixParams(List<calculatorParser.PostfixContext> postfixContextList) {
        List<Expression> params = new ArrayList<>();
        for (calculatorParser.PostfixContext postfix : postfixContextList)
            params.add(visit(postfix));
        return params;
    }

    private AbstractValue getValueFromAtom(calculatorParser.AtomContext ctx) {
        // Since this visitor can only return Expression object,
        // We have to return MyNumber for atom with their value as real part.
        MyNumber val = (MyNumber) visit(ctx);
        return val.getReal();
    }

    @Override
    public Expression visitCartesian(calculatorParser.CartesianContext ctx) {
        AbstractValue real = getValueFromAtom(ctx.real);
        AbstractValue imaginary;
        if (ctx.im != null) {
            imaginary = getValueFromAtom(ctx.im);
        } else {
            imaginary = new IntValue(1);
        }
        if (ctx.op.getType() == SUB) {
            imaginary = imaginary.mul(new IntValue(-1));
        }
        return new MyNumber(real, imaginary);
    }

    @Override
    public Expression visitPolar(calculatorParser.PolarContext ctx) {
        AbstractValue modulus = getValueFromAtom(ctx.r);
        AbstractValue arg1 = getValueFromAtom(ctx.theta1);
        AbstractValue arg2 = getValueFromAtom(ctx.theta2);
        if (!arg1.equals(arg2)) {
            Logger logger = org.slf4j.LoggerFactory.getLogger(CalculatorParserVisitor.class);
            logger.warn("The two angles are different. Please check the input. {} != {}", arg1, arg2);
            return new NotANumber();
        }

        System.out.println("modulus: " + modulus);
        System.out.println("argument: " + arg1);
        MyNumber res = new MyNumber(modulus.mul(arg1.cos()), modulus.mul(arg1.sin()));
        res.setRepresentation(ComplexRepresentation.POLAR);
        return res;
    }

    @Override
    public Expression visitExponential(calculatorParser.ExponentialContext ctx) {
        // Same as polar in this case
        AbstractValue modulus = getValueFromAtom(ctx.r);
        AbstractValue argument = getValueFromAtom(ctx.theta);
        MyNumber res = new MyNumber(modulus.mul(argument.cos()), modulus.mul(argument.sin()));
        res.setRepresentation(ComplexRepresentation.EXPONENTIAL);
        return res;
    }

    // ================================= INFIX =============================================
    @Override
    public Expression visitModulusInfix(calculatorParser.ModulusInfixContext ctx) {
        // '|' Infix '|'
        List<Expression> params = new ArrayList<>();
        params.add(visit(ctx.infix()));
        try {
            return new Modulus(params, Notation.INFIX);
        } catch (IllegalConstruction e) {
            // Shouldn't happen since it would be detected by the parser as a syntax error before.
            return new NotANumber();
        }
    }

    @Override
    public Expression visitMulDivInfix(calculatorParser.MulDivInfixContext ctx) {
        // Infix ( '*' | '/' ) Infix
        return getExpression(
                getInfixParams(ctx),
                ctx.op,
                Notation.INFIX);
    }

    @Override
    public Expression visitAddSubInfix(calculatorParser.AddSubInfixContext ctx) {
        // Infix ( '+' | '-' ) Infix
        return getExpression(
                getInfixParams(ctx),
                ctx.op,
                Notation.INFIX);
    }

    @Override
    public Expression visitParensInfix(calculatorParser.ParensInfixContext ctx) {
        // '(' Infix ')'
        return visit(ctx.infix());
    }

    // ================================= PREFIX =============================================

    @Override
    public Expression visitModulusPrefix(calculatorParser.ModulusPrefixContext ctx) {
        // '|' Infix '|'
        List<Expression> params = new ArrayList<>();
        params.add(visit(ctx.prefix()));
        try {
            return new Modulus(params, Notation.INFIX);
        } catch (IllegalConstruction e) {
            // Shouldn't happen since it would be detected by the parser as a syntax error before.
            return new NotANumber();
        }
    }

    @Override
    public Expression visitMulDivPrefix(calculatorParser.MulDivPrefixContext ctx) {
        // ( '*' | '/' ) Prefix Prefix
        return getExpression(
                getPrefixParams(ctx.prefix()),
                ctx.op,
                Notation.PREFIX);
    }

    @Override
    public Expression visitAddSubPrefix(calculatorParser.AddSubPrefixContext ctx) {
        // ( '+' | '-' ) Prefix Prefix
        return getExpression(
                getPrefixParams(ctx.prefix()),
                ctx.op,
                Notation.PREFIX);
    }

    @Override
    public Expression visitParensPrefix(calculatorParser.ParensPrefixContext ctx) {
        // '(' Prefix ')'
        return visit(ctx.prefix());
    }

    // ================================= POSTFIX =============================================

    @Override
    public Expression visitModulusPostfix(calculatorParser.ModulusPostfixContext ctx) {
        // '|' Infix '|'
        List<Expression> params = new ArrayList<>();
        params.add(visit(ctx.postfix()));
        try {
            return new Modulus(params, Notation.INFIX);
        } catch (IllegalConstruction e) {
            // Shouldn't happen since it would be detected by the parser as a syntax error before.
            return new NotANumber();
        }
    }

    @Override
    public Expression visitMulDivPostfix(calculatorParser.MulDivPostfixContext ctx) {
        // Postfix Postfix ( '*' | '/' )
        return getExpression(
                getPostfixParams(ctx.postfix()),
                ctx.op,
                Notation.POSTFIX);
    }

    @Override
    public Expression visitAddSubPostfix(calculatorParser.AddSubPostfixContext ctx) {
        // Postfix Postfix ( '+' | '-' )
        return getExpression(
                getPostfixParams(ctx.postfix()),
                ctx.op,
                Notation.POSTFIX);
    }

    @Override
    public Expression visitParensPostfix(calculatorParser.ParensPostfixContext ctx) {
        // Postfix '(' Postfix ')'
        return visit(ctx.postfix());
    }

    // ================================= ATOMS =============================================

    /**
     * Visit a FloatAtom and return a MyNumber object with the value of the float as its real part.
     *
     * <p>
     *     This method returns a MyNumber object and not an AbstractValue object because the parser
     *     can only return Expression objects in this configuration.
     * </p>
     * @param ctx A FloatAtomContext object that represents a float number in the parse tree.
     * @return A MyNumber object with the value of the float as its real part.
     */
    @Override
    public Expression visitFloatAtom(calculatorParser.FloatAtomContext ctx) {
        BigDecimal real = new BigDecimal(ctx.FLOAT().getText(), new MathContext(5));
        if (ctx.getChild(0) == ctx.SUB()){
            real = real.negate();

        }
        RealValue realValue = new RealValue(real);
        return new MyNumber(realValue);
    }

    /**
     * Visit a ENotationAtom and return a MyNumber object with the value of the float as its real part.
     *
     * <p>
     *     This method returns a MyNumber object and not an AbstractValue object because the parser
     *     can only return Expression objects in this configuration.
     * </p>
     * @param ctx A ENotationAtomContext object that represents an ENotation number in the parse tree.
     * @return A MyNumber object with the value of the float as its real part.
     */
    @Override
    public Expression visitENotationAtom(calculatorParser.ENotationAtomContext ctx){
        BigDecimal real = new BigDecimal(ctx.getText());
        RealValue realValue = new RealValue(real);
        return new MyNumber(realValue);
    }

    /**
     * Visit a IntAtom and return a MyNumber object with the value of the int as its real part.
     *
     * <p>
     *     This method returns a MyNumber object and not an AbstractValue object because the parser
     *     can only return Expression objects in this configuration.
     * </p>
     * @param ctx A IntAtomContext object that represents an int number in the parse tree.
     * @return A MyNumber object with the value of the int as its real part.
     */
    @Override
    public Expression visitIntAtom(calculatorParser.IntAtomContext ctx) {
        int real = Integer.parseInt(ctx.NUMBER().getText());
        IntValue res;
        if (ctx.SUB() != null) {
            res = new IntValue(-real);
        } else {
            res = new IntValue(real);
        }
        return new MyNumber(res);
    }

    @Override
    public Expression visitImAtom(calculatorParser.ImAtomContext ctx) {
        if (ctx.atom() == null) {
            // Only 'i'
            return new MyNumber(new IntValue(0), new IntValue(1));
        }
        AbstractValue imaginary = getValueFromAtom(ctx.atom());
        return new MyNumber(new IntValue(0), imaginary);
    }

    @Override
    public Expression visitReAtom(calculatorParser.ReAtomContext ctx) {
        return new MyNumber(getValueFromAtom(ctx.atom()));
    }
}
