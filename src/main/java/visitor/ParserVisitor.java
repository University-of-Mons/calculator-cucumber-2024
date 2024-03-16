package visitor;

import calculator.*;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;
import calculator.operators.*;
import gen.ParserCalculatorBaseVisitor;
import gen.ParserCalculatorParser;

import java.util.*;

public class ParserVisitor extends ParserCalculatorBaseVisitor<Expression> {
    private final Calculator c;

    public ParserVisitor(Calculator calculator) {
        this.c = calculator;
    }

    /**
     * This method visit the infix expression
     *
     * @param ctx the tree expression
     * @return A expression
     */
    @Override
    public Expression visitInfix(ParserCalculatorParser.InfixContext ctx) {
        if (ctx.getChildCount() == 1)
            return new MyNumber(Integer.parseInt(ctx.getChild(0).getText()));
        if (ctx.infix().size() == 1) {
            return visitInfix(ctx.infix(0));
        } else {
            Expression number1 = visitInfix(ctx.infix(0));
            Expression number2 = visitInfix(ctx.infix(1));
            List<Expression> params = new ArrayList<>();

            Collections.addAll(params, number1, number2);

            Operation op;
            try {
                switch (ctx.getChild(1).getText()) {
                    case "+":
                        op = new Plus(params);
                        break;
                    case "-":
                        op = new Minus(params);
                        break;
                    case "*":
                        op = new Times(params);
                        break;
                    case "/":
                        op = new Divides(params);
                        break;
                    default:
                        return new MyNotANumber();
                }
                return c.eval(op);
            } catch (IllegalConstruction e) {
                return new MyNotANumber();
            }
        }
    }


    /**
     * This method visit the prefix expression
     *
     * @param ctx the tree expression
     * @return A expression
     */
    @Override
    public Expression visitPrefix(ParserCalculatorParser.PrefixContext ctx) {
        if (ctx.getChildCount() == 1)
            return new MyNumber(Integer.parseInt(ctx.getChild(0).getText()));
        if (ctx.prefix().size() == 1) {
            return visitPrefix(ctx.prefix(0));
        } else {

            Expression number1 = visitPrefix(ctx.prefix(0));
            Expression number2 = visitPrefix(ctx.prefix(1));
            List<Expression> params = new ArrayList<>();
            Collections.addAll(params, number1, number2);
            for (int i = 2; i < ctx.prefix().size(); i++) {
                params.add(visitPrefix(ctx.prefix(i)));
            }
            Operation op;
            try {
                switch (ctx.getChild(0).getText()) {
                    case "+":
                        op = new Plus(params);
                        break;
                    case "-":
                        op = new Minus(params);
                        break;
                    case "*":
                        op = new Times(params);
                        break;
                    case "/":
                        op = new Divides(params);
                        break;
                    default:
                        return new MyNotANumber();
                }
                return c.eval(op);
            } catch (IllegalConstruction e) {
                return new MyNotANumber();
            }
        }
    }

    @Override
    public Expression visitPostfix(ParserCalculatorParser.PostfixContext ctx) {
        if (ctx.getChildCount() == 1)
            return new MyNumber(Integer.parseInt(ctx.getChild(0).getText()));
        if (ctx.postfix().size() == 1) {
            return visitPostfix(ctx.postfix(0));
        } else {

            Expression number1 = visitPostfix(ctx.postfix(0));
            Expression number2 = visitPostfix(ctx.postfix(1));
            List<Expression> params = new ArrayList<>();
            Collections.addAll(params, number1, number2);
            for (int i = 2; i < ctx.postfix().size(); i++) {
                params.add(visitPostfix(ctx.postfix(i)));
            }
            Operation op;
            try {
                switch (ctx.getChild(2).getText()) {
                    case "+":
                        op = new Plus(params);
                        break;
                    case "-":
                        op = new Minus(params);
                        break;
                    case "*":
                        op = new Times(params);
                        break;
                    case "/":
                        op = new Divides(params);
                        break;
                    default:
                        return new MyNotANumber();
                }
                return c.eval(op);
            } catch (IllegalConstruction e) {
                return new MyNotANumber();
            }
        }
    }
}