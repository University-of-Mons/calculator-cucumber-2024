package visitor;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.numbers.ComplexNumber;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;
import calculator.operators.*;
import parser.ComplexNumber.ComplexExprBaseVisitor;
import parser.ComplexNumber.ComplexExprParser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComplexParserVisitor  extends ComplexExprBaseVisitor<Expression> {

    private final Calculator c;

    public ComplexParserVisitor(Calculator calculator) {
        this.c = calculator;
    }


    //-------------------- INFIX ----------------------
/*| SUB? NUMBER '+' SUB? NUMBER I  ComplexPlusInfix
      | SUB? NUMBER '-' SUB? NUMBER I    # ComplexMinusInfix
      | SUB? NUMBER?  I                    # ComplexIInfix
      | SUB? NUMBER                     # IntInfix*/


    @Override
    public Expression visitComplexMinusInfix(ComplexExprParser.ComplexMinusInfixContext ctx){
        if (ctx.SUB().size() == 2){
            if (ctx.NUMBER(1) == null)
                return new ComplexNumber(-Double.parseDouble(ctx.NUMBER(0).getText()), -1);
            return new ComplexNumber(-Double.parseDouble(ctx.NUMBER(0).getText()), -Double.parseDouble(ctx.NUMBER(1).getText()));
        }
        else {
            if (ctx.NUMBER(1) == null)
                return new ComplexNumber(Double.parseDouble(ctx.NUMBER(0).getText()), -1);
            return new ComplexNumber(Double.parseDouble(ctx.NUMBER(0).getText()), -Double.parseDouble(ctx.NUMBER(1).getText()));

        }
    }

    @Override
    public Expression visitComplexPlusInfix(ComplexExprParser.ComplexPlusInfixContext ctx){
        if (ctx.SUB() != null){
            if (ctx.NUMBER(1) == null)
                return new ComplexNumber(-Double.parseDouble(ctx.NUMBER(0).getText()), 1);
            return new ComplexNumber(-Double.parseDouble(ctx.NUMBER(0).getText()), Double.parseDouble(ctx.NUMBER(1).getText()));
        }
        else {
            if (ctx.NUMBER(1) == null)
                return new ComplexNumber(Double.parseDouble(ctx.NUMBER(0).getText()), 1);
            return new ComplexNumber(Double.parseDouble(ctx.NUMBER(0).getText()), Double.parseDouble(ctx.NUMBER(1).getText()));

        }
    }

    @Override
    public Expression visitIntInfix(ComplexExprParser.IntInfixContext ctx){
        if (ctx.SUB() != null){
            return new MyNumber(-Double.parseDouble(ctx.NUMBER().getText()));
        }
        return new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
    }

    @Override
    public Expression visitComplexIInfix(ComplexExprParser.ComplexIInfixContext ctx){
        if (ctx.SUB() != null){
            return new ComplexNumber(0, -1);
        }
        return new ComplexNumber(0, 1);
    }



    @Override
    public Expression visitSqrtInfix(ComplexExprParser.SqrtInfixContext ctx){
        Expression number = visit(ctx.infix());
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
    public Expression visitCisInfix(ComplexExprParser.CisInfixContext ctx){
        Expression number = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new Cis(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }


    @Override
    public Expression visitSqrtComplexInfix(ComplexExprParser.SqrtComplexInfixContext ctx){
        Expression number = visit(ctx.infix(0));
        List<Expression> params1= new ArrayList<>();
        params1.add(number);
        Expression number2 = visit(ctx.infix(1));
        List<Expression> params2= new ArrayList<>();
        params2.add(number2);
        try {
            return c.eval(new ComplexNumber(c.eval(new Sqrt(params1)).getReal(), c.eval(new Sqrt(params2)).getReal()));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitExpInfixComplex(ComplexExprParser.ExpInfixComplexContext ctx){
        Expression number = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new Exponential_i(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitComplexMulDivInfix(ComplexExprParser.ComplexMulDivInfixContext ctx){
        Expression number1 = visit(ctx.infix(0));
        Expression number2 = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.infix().size() == 1){
                return visit(ctx.infix(0));
            }
            if(ctx.op.getType() == ComplexExprParser.MUL)
                return c.eval(new Times(params));
            return c.eval(new Divides(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitComplexAddSubInfix(ComplexExprParser.ComplexAddSubInfixContext ctx){
        System.out.println("ComplexAddSubInfix");
        Expression number1 = visit(ctx.infix(0));
        Expression number2 = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.infix().size() == 1){
                return visit(ctx.infix(0));
            }
            if(ctx.op.getType() == ComplexExprParser.ADD)
                return c.eval(new Plus(params));
            return c.eval(new Minus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitModulusInfix(ComplexExprParser.ModulusInfixContext ctx){
        Expression number = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new Modulus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitParensComplexInfix(ComplexExprParser.ParensComplexInfixContext ctx) {
        return visit(ctx.infix());
    }

    @Override
    public Expression visitIntoCartesianInfix(ComplexExprParser.IntoCartesianInfixContext ctx){
        Expression number = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new IntoCartesianFrom(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitIntoPolarInfix(ComplexExprParser.IntoPolarInfixContext ctx){
        Expression number = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new IntoPolarForm(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitIntoExpoInfix(ComplexExprParser.IntoExpoInfixContext ctx){
        Expression number = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new IntoExponentialForm(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }


}
