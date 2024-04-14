package back.visitor;

import back.calculator.*;
import back.calculator.operators.*;
import back.calculator.types.IntValue;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;
import back.calculator.types.RealValue;
import org.antlr.v4.runtime.Token;
import back.parser.calculatorBaseVisitor;
import back.parser.calculatorParser;

import java.math.BigDecimal;
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

    @Override
    public Expression visitImaginaryInfix(calculatorParser.ImaginaryInfixContext ctx) {
        return visit(ctx.imaginaryAndReal());
    }
    @Override
    public Expression visitRealInfix(calculatorParser.RealInfixContext ctx) {
        return visit(ctx.realNumber());
    }

    @Override
    public Expression visitAtomInfix(calculatorParser.AtomInfixContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public Expression visitRealAtom(calculatorParser.RealAtomContext ctx) {
        if (ctx.SUB() != null)
            // '-' Infix
            return new MyNumber(new IntValue(-Integer.parseInt(ctx.NUMBER().getText())));
        // NUMBER
        return new MyNumber(new IntValue(Integer.parseInt(ctx.NUMBER().getText())));
    }

    @Override
    public Expression visitImaginaryAtom(calculatorParser.ImaginaryAtomContext ctx) {
        int value = 1;
        if (ctx.NUMBER() != null)
            value = Integer.parseInt(ctx.NUMBER().getText());
        if (ctx.SUB() != null)

            // '-' Atom
            return new MyNumber(0,-value);
        // Atom
        return new MyNumber(0,value);
    }

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

    @Override
    public Expression visitAtomPrefix(calculatorParser.AtomPrefixContext ctx) {
        return visit(ctx.atom());
    }

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

    @Override
    public Expression visitAtomPostfix(calculatorParser.AtomPostfixContext ctx) {
        return visit(ctx.atom());
    }


    @Override
    public Expression visitImaginaryAndReal(calculatorParser.ImaginaryAndRealContext ctx) {
        int real = Integer.parseInt(ctx.real.getText());
        int imaginary = 1;
        if (ctx.getChild(0) == ctx.SUB()) {
            real *= -1;
        }
        if (ctx.im != null) {
            imaginary = Integer.parseInt(ctx.im.getText());
        }
        if (ctx.op.getType() == SUB) {
            imaginary *= -1;
        }
        return new MyNumber(real, imaginary);
    }

    @Override
    public Expression visitRealNumber(calculatorParser.RealNumberContext ctx) {
        BigDecimal real = new BigDecimal(ctx.FLOAT().getText());
        if (ctx.getChild(0) == ctx.SUB()){
            real = real.negate();

        }
        RealValue realValue = new RealValue(real);
        return new MyNumber(realValue);
    }
}
