package visitor;

import calculator.*;
import calculator.numbers.ComplexNumber;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;
import calculator.operators.*;
import parser.CalculatorExprBaseVisitor;
import parser.CalculatorExprParser;

import java.util.*;

public class ParserVisitor extends CalculatorExprBaseVisitor<Expression> {
    private final Calculator c;

    public ParserVisitor(Calculator calculator) {
        this.c = calculator;
    }

    //-------------------- INFIX ----------------------

    @Override
    public Expression visitParensInfix(CalculatorExprParser.ParensInfixContext ctx){
        return visit(ctx.infix());
    }

    @Override
    public Expression visitIntInfix(CalculatorExprParser.IntInfixContext ctx){
        if(ctx.SUB() != null){
            return new MyNumber(-Integer.parseInt(ctx.NUMBER().getText()));
        }
        return new MyNumber(Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override
    public Expression visitMulDivInfix(CalculatorExprParser.MulDivInfixContext ctx) {
        Expression number1 = visit(ctx.infix(0));
        Expression number2 = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.infix().size() == 1){
                return visit(ctx.infix(0));
            }
            if(ctx.op.getType() == CalculatorExprParser.DIV)
                return c.eval(new Divides(params));
            return c.eval(new Times(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitAddSubInfix(CalculatorExprParser.AddSubInfixContext ctx){
        Expression number1 = visit(ctx.infix(0));
        Expression number2 = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.infix().size() == 1){
                return visit(ctx.infix(0));
            }
            if(ctx.op.getType() == CalculatorExprParser.ADD)
                return c.eval(new Plus(params));
            return c.eval(new Minus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitSqrtInfix(CalculatorExprParser.SqrtInfixContext ctx){
        Expression number = new MyNumber(Integer.parseInt(ctx.NUMBER().getText()));
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new Sqrt(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitComplexInfix(CalculatorExprParser.ComplexInfixContext ctx){
        return visit(ctx.complex());
    }


    //-------------------- PREFIX ----------------------

    @Override
    public Expression visitParensPrefix(CalculatorExprParser.ParensPrefixContext ctx){
        return visit(ctx.prefix());
    }

    @Override
    public Expression visitIntPrefix(CalculatorExprParser.IntPrefixContext ctx){
        if(ctx.SUB() != null){
            return new MyNumber(-Integer.parseInt(ctx.NUMBER().getText()));
        }
        return new MyNumber(Integer.parseInt(ctx.NUMBER().getText()));
    }


    @Override
    public Expression visitMulDivPrefix(CalculatorExprParser.MulDivPrefixContext ctx){
        Expression number1 = visit(ctx.prefix(0));
        Expression number2 = visit(ctx.prefix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        for (int i = 2; i < ctx.prefix().size(); i++) {
            params.add(visit(ctx.prefix(i)));
        }
        try {
            if(ctx.prefix().size() == 1){
                return visit(ctx.prefix(0));
            }
            if(ctx.op.getType() == CalculatorExprParser.MUL)
                return c.eval(new Times(params));
            return c.eval(new Divides(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitAddSubPrefix(CalculatorExprParser.AddSubPrefixContext ctx){
        Expression number1 = visit(ctx.prefix(0));
        Expression number2 = visit(ctx.prefix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        for (int i = 2; i < ctx.prefix().size(); i++) {
            params.add(visit(ctx.prefix(i)));
        }
        try {
            if(ctx.prefix().size() == 1){
                return visit(ctx.prefix(0));
            }
            if(ctx.op.getType() == CalculatorExprParser.ADD)
                return c.eval(new Plus(params));
            return c.eval(new Minus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }


    //-------------------- POSTFIX ----------------------

    @Override
    public Expression visitParensPostfix(CalculatorExprParser.ParensPostfixContext ctx) {
        return visit(ctx.postfix());
    }

    @Override
    public Expression visitIntPostfix(CalculatorExprParser.IntPostfixContext ctx) {
        if(ctx.SUB() != null){
            return new MyNumber(-Integer.parseInt(ctx.NUMBER().getText()));
        }
        return new MyNumber(Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override
    public Expression visitMulDivPostfix(CalculatorExprParser.MulDivPostfixContext ctx){
        Expression number1 = visit(ctx.postfix(0));
        Expression number2 = visit(ctx.postfix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        for (int i = 2; i < ctx.postfix().size(); i++) {
            params.add(visit(ctx.postfix(i)));
        }
        try {
            if(ctx.postfix().size() == 1){
                return visit(ctx.postfix(0));
            }
            if(ctx.op.getType() == CalculatorExprParser.MUL)
                return c.eval(new Times(params));
            return c.eval(new Divides(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitAddSubPostfix(CalculatorExprParser.AddSubPostfixContext ctx){
        Expression number1 = visit(ctx.postfix(0));
        Expression number2 = visit(ctx.postfix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        for (int i = 2; i < ctx.postfix().size(); i++) {
            params.add(visit(ctx.postfix(i)));
        }
        try {
            if(ctx.postfix().size() == 1){
                return visit(ctx.postfix(0));
            }
            if(ctx.op.getType() == CalculatorExprParser.ADD)
                return c.eval(new Plus(params));
            return c.eval(new Minus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    // --------------------- Complex --------------------

    @Override
    public Expression visitComplexPlus(CalculatorExprParser.ComplexPlusContext ctx){
        float number1 = Float.parseFloat(ctx.NUMBER(0).getText());
        if (ctx.NUMBER(1) == null)
            return new ComplexNumber(number1, 1);
        float number2 = Float.parseFloat(ctx.NUMBER(1).getText());
        return new ComplexNumber(number1, number2);
    }

    @Override
    public Expression visitComplexMinus(CalculatorExprParser.ComplexMinusContext ctx){
        float number1 = Float.parseFloat(ctx.NUMBER(0).getText());
        if (ctx.NUMBER(1) == null)
            return new ComplexNumber(number1, -1);
        float number2 = - Float.parseFloat(ctx.NUMBER(1).getText());
        return new ComplexNumber(number1, number2);
    }

    @Override
    public Expression visitComplexI(CalculatorExprParser.ComplexIContext ctx){
        float number1 = 0;
        if (ctx.NUMBER() == null)
            return new ComplexNumber(number1, 1);
        float number2 = Float.parseFloat(ctx.NUMBER().getText());
        return new ComplexNumber(number1, number2);
    }

    @Override
    public Expression visitAddSubComplex(CalculatorExprParser.AddSubComplexContext ctx){
        Expression number1 = visit(ctx.complex(0));
        Expression number2 = visit(ctx.complex(1));
        List<Expression> params = new ArrayList<>();
        Collections.addAll(params, number1, number2);
        try {
            if(ctx.complex().size() == 1){
                return visit(ctx.complex(0));
            }
            if(ctx.op.getType() == CalculatorExprParser.ADD)
                return c.eval(new Plus(params));
            return c.eval(new Minus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitParensComplex(CalculatorExprParser.ParensComplexContext ctx){
        return visit(ctx.complex());
    }
    @Override
    public Expression visitMulDivComplex(CalculatorExprParser.MulDivComplexContext ctx){
        Expression number1 = visit(ctx.complex(0));
        Expression number2 = visit(ctx.complex(1));
        List<Expression> params = new ArrayList<>();
        Collections.addAll(params, number1, number2);
        try {
            if(ctx.complex().size() == 1){
                return visit(ctx.complex(0));
            }
            if(ctx.op.getType() == CalculatorExprParser.MUL)
                return c.eval(new Times(params));
            return c.eval(new Divides(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitModulus(CalculatorExprParser.ModulusContext ctx){
        Expression number = visit(ctx.complex());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new Modulus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }
}