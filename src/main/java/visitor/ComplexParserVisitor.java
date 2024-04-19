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
            if (ctx.NUMBER() == null)
                return new ComplexNumber(0, -1);
            return new ComplexNumber(0, -Double.parseDouble(ctx.NUMBER().getText()));
        }
        else {
            if (ctx.NUMBER() == null)
                return new ComplexNumber(0, 1);
            return new ComplexNumber(0, Double.parseDouble(ctx.NUMBER().getText()));
        }
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
        Expression number1 = new MyNumber(1.0);
        if (ctx.NUMBER() != null)
            number1 = new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
        Expression number2 = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();
        params.add(number1);
        params.add(number2);
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
        Expression number1 = new MyNumber(1.0);
        if (ctx.NUMBER() != null)
            number1 = new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
        Expression number2 = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();
        params.add(number1);
        params.add(number2);
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
        Expression number1 = visit(ctx.infix(0));
        Expression number2 = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();
        Collections.addAll(params, number1, number2);
        try {
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

    //-------------------- PREFIX ----------------------

   @Override
    public Expression visitSqrtComplexPrefix(ComplexExprParser.SqrtComplexPrefixContext ctx){
        Expression number = visit(ctx.prefix(0));
        List<Expression> params1= new ArrayList<>();
        params1.add(number);
        Expression number2 = visit(ctx.prefix(1));
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
    public Expression visitSqrtPrefix(ComplexExprParser.SqrtPrefixContext ctx){
        Expression number = visit(ctx.prefix());
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
    public Expression visitCisPrefix(ComplexExprParser.CisPrefixContext ctx){
        Expression number1 = new MyNumber(1.0);
        if (ctx.NUMBER() != null)
            number1 = new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
        Expression number2 = visit(ctx.prefix());
        List<Expression> params = new ArrayList<>();
        params.add(number1);
        params.add(number2);
        try {
            return c.eval(new Cis(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitExpPrefixComplex(ComplexExprParser.ExpPrefixComplexContext ctx){
        Expression number1 = new MyNumber(1.0);
        if (ctx.NUMBER() != null)
            number1 = new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
        Expression number2 = visit(ctx.prefix());
        List<Expression> params = new ArrayList<>();
        params.add(number1);
        params.add(number2);
        try {
            return c.eval(new Exponential_i(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitMulDivPrefix(ComplexExprParser.MulDivPrefixContext ctx){
        Expression number1 = visit(ctx.prefix(0));
        Expression number2 = visit(ctx.prefix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.prefix().size() == 1){
                return visit(ctx.prefix(0));
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
    public Expression visitAddSubPrefix(ComplexExprParser.AddSubPrefixContext ctx){
        Expression number1 = visit(ctx.prefix(0));
        Expression number2 = visit(ctx.prefix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.prefix().size() == 1){
                return visit(ctx.prefix(0));
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
    public Expression visitModulusPrefix(ComplexExprParser.ModulusPrefixContext ctx){
        Expression number = visit(ctx.prefix());
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
    public Expression visitIntPrefix(ComplexExprParser.IntPrefixContext ctx){
        if (ctx.SUB() != null){
            return new MyNumber(-Double.parseDouble(ctx.NUMBER().getText()));
        }
        return new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
    }

    @Override
    public Expression visitComplexIPrefix(ComplexExprParser.ComplexIPrefixContext ctx){
        if (ctx.SUB() != null){
            if (ctx.NUMBER() == null)
                return new ComplexNumber(0, -1);
            return new ComplexNumber(0, -Double.parseDouble(ctx.NUMBER().getText()));
        }
        else {
            if (ctx.NUMBER() == null)
                return new ComplexNumber(0, 1);
            return new ComplexNumber(0, Double.parseDouble(ctx.NUMBER().getText()));
        }
    }

    @Override
    public Expression visitParensComplexPrefix(ComplexExprParser.ParensComplexPrefixContext ctx) {
        return visit(ctx.prefix());
    }

    @Override
    public Expression visitIntoCartesianPrefix(ComplexExprParser.IntoCartesianPrefixContext ctx){
        Expression number = visit(ctx.prefix());
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
    public Expression visitIntoPolarPrefix(ComplexExprParser.IntoPolarPrefixContext ctx){
        Expression number = visit(ctx.prefix());
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
    public Expression visitIntoEPrefix(ComplexExprParser.IntoEPrefixContext ctx){
        Expression number = visit(ctx.prefix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new IntoExponentialForm(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    //-------------------- POSTFIX ----------------------

    @Override
    public Expression visitSqrtComplexPostfix(ComplexExprParser.SqrtComplexPostfixContext ctx){
        Expression number = visit(ctx.postfix(0));
        List<Expression> params1= new ArrayList<>();
        params1.add(number);
        Expression number2 = visit(ctx.postfix(1));
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
    public Expression visitSqrtPostfix(ComplexExprParser.SqrtPostfixContext ctx){
        Expression number = visit(ctx.postfix());
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
    public Expression visitCisPostfix(ComplexExprParser.CisPostfixContext ctx){
        Expression number1 = new MyNumber(1.0);
        if (ctx.NUMBER() != null)
            number1 = new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
        Expression number2 = visit(ctx.postfix());
        List<Expression> params = new ArrayList<>();
        params.add(number1);
        params.add(number2);
        try {
            return c.eval(new Cis(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitExpPostfixComplex(ComplexExprParser.ExpPostfixComplexContext ctx){
        Expression number1 = new MyNumber(1.0);
        if (ctx.NUMBER() != null)
            number1 = new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
        Expression number2 = visit(ctx.postfix());
        List<Expression> params = new ArrayList<>();
        params.add(number1);
        params.add(number2);
        try {
            return c.eval(new Exponential_i(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitMulDivPostfix(ComplexExprParser.MulDivPostfixContext ctx){
        Expression number1 = visit(ctx.postfix(0));
        Expression number2 = visit(ctx.postfix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.op.getType() == ComplexExprParser.MUL)
                return c.eval(new Times(params));
            return c.eval(new Divides(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitAddSubPostfix(ComplexExprParser.AddSubPostfixContext ctx){
        Expression number1 = visit(ctx.postfix(0));
        Expression number2 = visit(ctx.postfix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.op.getType() == ComplexExprParser.ADD)
                return c.eval(new Plus(params));
            return c.eval(new Minus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    @Override
    public Expression visitModulusPostfix(ComplexExprParser.ModulusPostfixContext ctx){
        Expression number = visit(ctx.postfix());
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
    public Expression visitIntPostfix(ComplexExprParser.IntPostfixContext ctx){
        if (ctx.SUB() != null){
            return new MyNumber(-Double.parseDouble(ctx.NUMBER().getText()));
        }
        return new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
    }

    @Override
    public Expression visitComplexIPostfix(ComplexExprParser.ComplexIPostfixContext ctx){
        if (ctx.SUB() != null){
            if (ctx.NUMBER() == null)
                return new ComplexNumber(0, -1);
            return new ComplexNumber(0, -Double.parseDouble(ctx.NUMBER().getText()));
        }
        else {
            if (ctx.NUMBER() == null)
                return new ComplexNumber(0, 1);
            return new ComplexNumber(0, Double.parseDouble(ctx.NUMBER().getText()));
        }
    }

    @Override
    public Expression visitParensComplexPostfix(ComplexExprParser.ParensComplexPostfixContext ctx) {
        return visit(ctx.postfix());
    }

    @Override
    public Expression visitIntoCartesianPostfix(ComplexExprParser.IntoCartesianPostfixContext ctx){
        Expression number = visit(ctx.postfix());
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
    public Expression visitIntoPolarPostfix(ComplexExprParser.IntoPolarPostfixContext ctx){
        Expression number = visit(ctx.postfix());
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
    public Expression visitIntoEPostfix(ComplexExprParser.IntoEPostfixContext ctx){
        Expression number = visit(ctx.postfix());
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
