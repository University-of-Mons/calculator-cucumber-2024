package visitor;

import calculator.*;
import calculator.numbers.Expression;
import calculator.numbers.MyNotATime;
import calculator.numbers.MyTime;
import calculator.operators.time.*;
import parser.time.*;

import java.time.LocalDateTime;
import java.util.*;

public class TimeParserVisitor extends CalculatorExprTimeBaseVisitor<Expression> {
    private final Calculator c;

    public TimeParserVisitor(Calculator calculator) {
        this.c = calculator;
    }

    //-------------------- INFIX ----------------------

    @Override
    public Expression visitParensInfix(CalculatorExprTimeParser.ParensInfixContext ctx){
        return visit(ctx.infix());
    }

    @Override
    public Expression visitTimeInfix(CalculatorExprTimeParser.TimeInfixContext ctx){
        MyTime time = new MyTime( Integer.parseInt(ctx.NUMBER().get(0).getText()),
                Integer.parseInt(ctx.NUMBER().get(1).getText()),
                Integer.parseInt(ctx.NUMBER().get(2).getText()));
        if (ctx.AM() != null){
            time.adjustTimeFormat("AM");
        }
        else if (ctx.PM() != null){
            time.adjustTimeFormat("PM");
        }
        if (ctx.CETADD() != null ){
            time.adjustTimeZone(Integer.parseInt(ctx.NUMBER().get(3).getText()));
        }
        else if (ctx.CETSUB() != null){
            time.adjustTimeZone(-Integer.parseInt(ctx.NUMBER().get(3).getText()));
        }
        return time;
    }

    @Override
    public Expression visitDateInfix(CalculatorExprTimeParser.DateInfixContext ctx){
        MyTime time = new MyTime(Integer.parseInt(ctx.NUMBER().get(0).getText()),
                Integer.parseInt(ctx.NUMBER().get(1).getText()),
                Integer.parseInt(ctx.NUMBER().get(2).getText()),
                Integer.parseInt(ctx.NUMBER().get(3).getText()),
                Integer.parseInt(ctx.NUMBER().get(4).getText()),
                Integer.parseInt(ctx.NUMBER().get(5).getText()));
        if (ctx.AM() != null){
            time.adjustTimeFormat("AM");
        }
        else if (ctx.PM() != null){
            time.adjustTimeFormat("PM");
        }
        if (ctx.CETADD() != null ){
            time.adjustTimeZone(Integer.parseInt(ctx.NUMBER().get(6).getText()));
        }
        else if (ctx.CETSUB() != null){
            time.adjustTimeZone(-Integer.parseInt(ctx.NUMBER().get(6).getText()));
        }
        return time;
    }

    @Override
    public Expression visitAddSubInfix(CalculatorExprTimeParser.AddSubInfixContext ctx){
        Expression time1 = visit(ctx.infix(0));
        Expression time2 = visit(ctx.infix(1));
        // current time operation is managed by prefix notation

        List<Expression> params = new ArrayList<>();
        Collections.addAll(params, time1, time2);
        try {
            if(ctx.op.getType() == CalculatorExprTimeParser.ADD)
                return c.timeEval(new Plus(params));
            return c.timeEval(new Minus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotATime();
        }
    }

    //-------------------- PREFIX ----------------------

    @Override
    public Expression visitParensPrefix(CalculatorExprTimeParser.ParensPrefixContext ctx){
        return visit(ctx.prefix());
    }

    @Override
    public Expression visitTimePrefix(CalculatorExprTimeParser.TimePrefixContext ctx){
        MyTime time = new MyTime( Integer.parseInt(ctx.NUMBER().get(0).getText()),
                Integer.parseInt(ctx.NUMBER().get(1).getText()),
                Integer.parseInt(ctx.NUMBER().get(2).getText()));
        if (ctx.AM() != null){
            time.adjustTimeFormat("AM");
        }
        else if (ctx.PM() != null){
            time.adjustTimeFormat("PM");
        }
        if (ctx.CETADD() != null ){
            time.adjustTimeZone(Integer.parseInt(ctx.NUMBER().get(3).getText()));
        }
        else if (ctx.CETSUB() != null){
            time.adjustTimeZone(-Integer.parseInt(ctx.NUMBER().get(3).getText()));
        }
        return time;
    }

    @Override
    public Expression visitDatePrefix(CalculatorExprTimeParser.DatePrefixContext ctx){
        MyTime time = new MyTime(Integer.parseInt(ctx.NUMBER().get(0).getText()),
                Integer.parseInt(ctx.NUMBER().get(1).getText()),
                Integer.parseInt(ctx.NUMBER().get(2).getText()),
                Integer.parseInt(ctx.NUMBER().get(3).getText()),
                Integer.parseInt(ctx.NUMBER().get(4).getText()),
                Integer.parseInt(ctx.NUMBER().get(5).getText()));
        if (ctx.AM() != null){
            time.adjustTimeFormat("AM");
        }
        else if (ctx.PM() != null){
            time.adjustTimeFormat("PM");
        }
        if (ctx.CETADD() != null ){
            time.adjustTimeZone(Integer.parseInt(ctx.NUMBER().get(6).getText()));
        }
        else if (ctx.CETSUB() != null){
            time.adjustTimeZone(-Integer.parseInt(ctx.NUMBER().get(6).getText()));
        }
        return time;
    }

    @Override
    public Expression visitAddSubPrefix(CalculatorExprTimeParser.AddSubPrefixContext ctx){
        Expression time1 = visit(ctx.prefix(0));
        Expression time2;
        if(ctx.prefix().size() == 1){
            LocalDateTime currentTime = LocalDateTime.now();
            MyTime now = new MyTime(currentTime.getYear(), currentTime.getMonthValue(),
                    currentTime.getDayOfMonth(), currentTime.getHour(),
                    currentTime.getMinute(), currentTime.getSecond());
            time2 = now;
        }
        else
            time2 = visit(ctx.prefix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, time1, time2);
        for (int i = 2; i < ctx.prefix().size(); i++) {
            params.add(visit(ctx.prefix(i)));
        }
        try {
            if(ctx.op.getType() == CalculatorExprTimeParser.ADD)
                return c.timeEval(new Plus(params));
            return c.timeEval(new Minus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotATime();
        }
    }

    //-------------------- POSTFIX ----------------------

    @Override
    public Expression visitParensPostfix(CalculatorExprTimeParser.ParensPostfixContext ctx) {
        return visit(ctx.postfix());
    }

    @Override
    public Expression visitTimePostfix(CalculatorExprTimeParser.TimePostfixContext ctx) {
        MyTime time = new MyTime( Integer.parseInt(ctx.NUMBER().get(0).getText()),
                Integer.parseInt(ctx.NUMBER().get(1).getText()),
                Integer.parseInt(ctx.NUMBER().get(2).getText()));
        if (ctx.AM() != null){
            time.adjustTimeFormat("AM");
        }
        else if (ctx.PM() != null){
            time.adjustTimeFormat("PM");
        }
        if (ctx.CETADD() != null ){
            time.adjustTimeZone(Integer.parseInt(ctx.NUMBER().get(3).getText()));
        }
        else if (ctx.CETSUB() != null){
            time.adjustTimeZone(-Integer.parseInt(ctx.NUMBER().get(3).getText()));
        }
        return time;
    }

    @Override
    public Expression visitDatePostfix(CalculatorExprTimeParser.DatePostfixContext ctx) {
        MyTime time = new MyTime(Integer.parseInt(ctx.NUMBER().get(0).getText()),
                Integer.parseInt(ctx.NUMBER().get(1).getText()),
                Integer.parseInt(ctx.NUMBER().get(2).getText()),
                Integer.parseInt(ctx.NUMBER().get(3).getText()),
                Integer.parseInt(ctx.NUMBER().get(4).getText()),
                Integer.parseInt(ctx.NUMBER().get(5).getText()));
        if (ctx.AM() != null){
            time.adjustTimeFormat("AM");
        }
        else if (ctx.PM() != null){
            time.adjustTimeFormat("PM");
        }
        if (ctx.CETADD() != null ){
            time.adjustTimeZone(Integer.parseInt(ctx.NUMBER().get(6).getText()));
        }
        else if (ctx.CETSUB() != null){
            time.adjustTimeZone(-Integer.parseInt(ctx.NUMBER().get(6).getText()));
        }
        return time;
    }

    @Override
    public Expression visitAddSubPostfix(CalculatorExprTimeParser.AddSubPostfixContext ctx){
        Expression time1 = visit(ctx.postfix(0));
        Expression time2;
        if(ctx.postfix().size() == 1){
            LocalDateTime currentTime = LocalDateTime.now();
            MyTime now = new MyTime(currentTime.getYear(), currentTime.getMonthValue(),
                    currentTime.getDayOfMonth(), currentTime.getHour(),
                    currentTime.getMinute(), currentTime.getSecond());
            time2 = now;
        }
        else
            time2 = visit(ctx.postfix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, time1, time2);
        for (int i = 2; i < ctx.postfix().size(); i++) {
            params.add(visit(ctx.postfix(i)));
        }
        try {
            if(ctx.op.getType() == CalculatorExprTimeParser.ADD)
                return c.timeEval(new Plus(params));
            return c.timeEval(new Minus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotATime();
        }
    }
}
