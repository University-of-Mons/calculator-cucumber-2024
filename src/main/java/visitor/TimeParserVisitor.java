package visitor;

import calculator.*;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;
import calculator.operators.*;
import parser.time.CalculatorExprTimeBaseVisitor;
import parser.time.CalculatorExprTimeParser;

import java.util.*;

public class TimeParserVisitor extends CalculatorExprTimeBaseVisitor<Expression> {
    private final Calculator c;

    public TimeParserVisitor(Calculator calculator) {
        this.c = calculator;
    }

    //-------------------- TIME_OPERATORS ----------------------

    //TODO : probablement

    //-------------------- INFIX ----------------------

    @Override
    public Expression visitParensInfix(CalculatorExprTimeParser.ParensInfixContext ctx){
        return visit(ctx.infix());
    }

    @Override
    public Expression visitTimeInfix(CalculatorExprTimeParser.TimeInfixContext ctx){
        //TODO : implement
        return new MyNumber(Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override
    public Expression visitAddSubInfix(CalculatorExprTimeParser.AddSubInfixContext ctx){
        //TODO
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

    //-------------------- PREFIX ----------------------

    @Override
    public Expression visitParensPrefix(CalculatorExprTimeParser.ParensPrefixContext ctx){
        return visit(ctx.prefix());
    }

    @Override
    public Expression visitTimePrefix(CalculatorExprTimeParser.TimePrefixContext ctx){
        //TODO
        if(ctx.SUB() != null){
            return new MyNumber(-Integer.parseInt(ctx.NUMBER().getText()));
        }
        return new MyNumber(Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override
    public Expression visitAddSubPrefix(CalculatorExprTimeParser.AddSubPrefixContext ctx){
        //TODO
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
    public Expression visitParensPostfix(CalculatorExprTimeParser.ParensPostfixContext ctx) {
        return visit(ctx.postfix());
    }

    @Override
    public Expression visitTimePostfix(CalculatorExprTimeParser.TimePostfixContext ctx) {
        //TODO
        if(ctx.SUB() != null){
            return new MyNumber(-Integer.parseInt(ctx.NUMBER().getText()));
        }
        return new MyNumber(Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override
    public Expression visitAddSubPostfix(CalculatorExprTimeParser.AddSubPostfixContext ctx){
        //TODO
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
}
