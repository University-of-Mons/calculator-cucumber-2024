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
    private Calculator c;

    public ParserVisitor(Calculator calculator){
        this.c = calculator;
    }

    /*
     * This method visit the expression
     *
     * @param ctx the tree expression
     * @return A of the expression
     */
    @Override
    public Expression visitExp(ParserCalculatorParser.ExpContext ctx){
        if (ctx.getChild(0).getClass().equals(ParserCalculatorParser.InfixContext.class))
            return visitInfixExp(ctx.infix());
        else if (ctx.getChild(0).getClass().equals(ParserCalculatorParser.PrefixContext.class))
            return visitPrefix(ctx.prefix());
        else
            return new MyNotANumber();
    }

    @Override
    public Expression visitNumber(ParserCalculatorParser.NumberContext ctx) {
        return new MyNumber(Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override
    public Expression visitAddSub(ParserCalculatorParser.AddSubContext ctx){
        Expression leftExpr = visit(ctx.infix(0));
        Expression rightExpr = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();
        Collections.addAll(params,leftExpr, rightExpr);
        try{
            if(ctx.op.getType() == ParserCalculatorParser.SUB) {
                return c.eval(new Minus(params));
            }
            return c.eval(new Plus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber(); // Don't know if it's the correct way to proceed
        }

    }

    @Override
    public Expression visitMulDiv(ParserCalculatorParser.MulDivContext ctx){
        Expression leftExpr = visit(ctx.infix(0));
        Expression rightExpr = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();
        Collections.addAll(params,leftExpr, rightExpr);
        try{
            if(ctx.op.getType() == ParserCalculatorParser.DIV) {
                return c.eval(new Divides(params));
            }
            return c.eval(new Times(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber(); // Don't know if it's the correct way to proceed
        }

    }

    @Override
    public Expression visitInfixExp(ParserCalculatorParser.Infix_expContext ctx){
        return c.eval(visit(ctx.infix()));
    }

    /**
     * This method visit the prefix expression
     * @param ctx the tree expression
     * @return A expression
     */
    @Override
    public Expression visitPrefix(ParserCalculatorParser.PrefixContext ctx) {
        if (ctx.getChildCount() == 1)
            return new MyNumber(Integer.parseInt(ctx.getChild(0).getText()));
        if (ctx.prefix().size()==1){
            return visitPrefix(ctx.prefix(0));
        }
        else{

            Expression number1=  visitPrefix(ctx.prefix(0));
            Expression number2 = visitPrefix(ctx.prefix(1));
            List<Expression> params = new ArrayList<>();
            Collections.addAll(params,number1, number2);
            for (int i = 2; i < ctx.prefix().size(); i++) {
                params.add(visitPrefix(ctx.prefix(i)));
            }
            Operation op ;
            try {
                switch (ctx.getChild(0).getText()){
                    case "+": op = new Plus(params); break;
                    case "-": op = new Minus(params); break;
                    case "*": op = new Times(params); break;
                    case "/": op = new Divides(params); break;
                    default: return new MyNotANumber();
                }
                return c.eval(op);
            } catch (IllegalConstruction e) {
                return new MyNotANumber();
            }
        }
    }
}