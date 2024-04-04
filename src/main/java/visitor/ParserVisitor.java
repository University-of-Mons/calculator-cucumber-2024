package visitor;

import calculator.*;
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
        return new MyNumber(Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override
    public Expression visitMulInfix(CalculatorExprParser.MulInfixContext ctx) {
            Expression number1 = visit(ctx.infix(0));
            Expression number2 = visit(ctx.infix(1));
            List<Expression> params = new ArrayList<>();

            Collections.addAll(params, number1, number2);
            try {
                if(ctx.infix().size() == 1){
                    return visit(ctx.infix(0));
                }
                return c.eval(new Times(params));
            }
            catch (IllegalConstruction e){
                return new MyNotANumber();
            }
    }

    @Override
    public Expression visitDivInfix(CalculatorExprParser.DivInfixContext ctx){
        Expression number1 = visit(ctx.infix(0));
        Expression number2 = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.infix().size() == 1){
                return visit(ctx.infix(0));
            }
            return c.eval(new Divides(params));
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

    //-------------------- PREFIX ----------------------

    @Override
    public Expression visitParensPrefix(CalculatorExprParser.ParensPrefixContext ctx){
        return visit(ctx.prefix());
    }

    @Override
    public Expression visitIntPrefix(CalculatorExprParser.IntPrefixContext ctx){
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

//    /**
//     * This method visit the infix expression
//     *
//     * @param ctx the tree expression
//     * @return A expression
//     */
//    @Override
//    public Expression visitInfix(ParserCalculatorParser.InfixContext ctx) {
//        if (ctx.getChildCount() == 1)
//            return new MyNumber(Integer.parseInt(ctx.getChild(0).getText()));
//        if (ctx.infix().size() == 1) {
//            return visitInfix(ctx.infix(0));
//        } else {
//            Expression number1 = visitInfix(ctx.infix(0));
//            Expression number2 = visitInfix(ctx.infix(1));
//            List<Expression> params = new ArrayList<>();
//
//            Collections.addAll(params, number1, number2);
//
//            Operation op;
//            try {
//                if (ctx.getChildCount() == 2){
//                    op =  new Times(params);
//                }
//                else {
//                    switch (ctx.getChild(1).getText()) {
//                        case "+":
//                            op = new Plus(params);
//                            break;
//                        case "-":
//                            op = new Minus(params);
//                            break;
//                        case "*", "":
//                            op = new Times(params);
//                            break;
//                        case "/":
//                            op = new Divides(params);
//                            break;
//                        default:
//                            return new MyNotANumber();
//                    }
//                }
//                return c.eval(op);
//            } catch (IllegalConstruction e) {
//                return new MyNotANumber();
//            }
//        }
//    }
//
//
//    /**
//     * This method visit the prefix expression
//     *
//     * @param ctx the tree expression
//     * @return A expression
//     */
//    @Override
//    public Expression visitPrefix(ParserCalculatorParser.PrefixContext ctx) {
//        if (ctx.getChildCount() == 1)
//            return new MyNumber(Integer.parseInt(ctx.getChild(0).getText()));
//        if (ctx.prefix().size() == 1) {
//            return visitPrefix(ctx.prefix(0));
//        } else {
//            Expression number1 = visitPrefix(ctx.prefix(0));
//            Expression number2 = visitPrefix(ctx.prefix(1));
//            List<Expression> params = new ArrayList<>();
//            Collections.addAll(params, number1, number2);
//            for (int i = 2; i < ctx.prefix().size(); i++) {
//                params.add(visitPrefix(ctx.prefix(i)));
//            }
//            Operation op;
//            try {
//                switch (ctx.getChild(0).getText()) {
//                    case "+":
//                        op = new Plus(params);
//                        break;
//                    case "-":
//                        op = new Minus(params);
//                        break;
//                    case "*":
//                        op = new Times(params);
//                        break;
//                    case "/":
//                        op = new Divides(params);
//                        break;
//                    default:
//                        return new MyNotANumber();
//                }
//                return c.eval(op);
//            } catch (IllegalConstruction e) {
//                return new MyNotANumber();
//            }
//        }
//    }
//
//    @Override
//    public Expression visitPostfix(ParserCalculatorParser.PostfixContext ctx) {
//        if (ctx.getChildCount() == 1)
//            return new MyNumber(Integer.parseInt(ctx.getChild(0).getText()));
//        if (ctx.postfix().size() == 1) {
//            return visitPostfix(ctx.postfix(0));
//        } else {
//
//            Expression number1 = visitPostfix(ctx.postfix(0));
//            Expression number2 = visitPostfix(ctx.postfix(1));
//            List<Expression> params = new ArrayList<>();
//            Collections.addAll(params, number1, number2);
//            for (int i = 2; i < ctx.postfix().size(); i++) {
//                params.add(visitPostfix(ctx.postfix(i)));
//            }
//            Operation op;
//            try {
//                switch (ctx.getChild(ctx.getChildCount()-1).getText()) {
//                    case "+":
//                        op = new Plus(params);
//                        break;
//                    case "-":
//                        op = new Minus(params);
//                        break;
//                    case "*":
//                        op = new Times(params);
//                        break;
//                    case "/":
//                        op = new Divides(params);
//                        break;
//                    default:
//                        return new MyNotANumber();
//                }
//                return c.eval(op);
//            } catch (IllegalConstruction e) {
//                return new MyNotANumber();
//            }
//        }
//    }
}