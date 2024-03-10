package calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParserVisitor extends ParserCalculatorBaseVisitor<MyNumber> {
    
    /**
     * This method visit the expression
     * @param ctx the expression
     * @return the result of the expression
     */
    @Override
    public MyNumber visitExpre(ParserCalculatorParser.ExpreContext ctx) {
        if (ctx.getChildCount() == 1)
            return new MyNumber(Integer.parseInt(ctx.getChild(0).getText()));
        if (ctx.expre().size()==1){
            return visitExpre(ctx.expre(0));
        }
        else{
            Calculator c= new Calculator();
            MyNumber number1 = visitExpre(ctx.expre(0));
            MyNumber number2 = visitExpre(ctx.expre(1));
            List<Expression> params = new ArrayList<>();
            Collections.addAll(params,number1, number2);
            Operation op ;
            try {
                switch (ctx.getChild(1).getText()){
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