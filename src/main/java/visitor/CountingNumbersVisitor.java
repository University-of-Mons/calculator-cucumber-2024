package visitor;

import calculator.Operation;
import calculator.TimeOperation;
import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import calculator.numbers.MyTime;

import java.util.ArrayList;

public class CountingNumbersVisitor extends Visitor{

    private int value;

    public int getValue() {
        return value;
    }

    public void visit(MyNumber n){
        value = 1;
    }

    public void visit(MyTime t){
        value = 1;
    }

    public void visit(Operation o){
        ArrayList<Integer> i = new ArrayList<>();
        for(Expression e : o.getArgs()) {
            e.accept(this);
            i.add(getValue());
        }
        value = i.stream()
                .mapToInt(Integer::intValue)
                .reduce(Integer::sum)
                .getAsInt();

    }

    public void visit(TimeOperation o){
        ArrayList<Integer> i = new ArrayList<>();
        for(Expression e : o.getArgs()) {
            e.accept(this);
            i.add(getValue());
        }
        value = i.stream()
                .mapToInt(Integer::intValue)
                .reduce(Integer::sum)
                .getAsInt();

    }
}
