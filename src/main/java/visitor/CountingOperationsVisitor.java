package visitor;

import calculator.Operation;
import calculator.TimeOperation;
import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import calculator.numbers.MyTime;

import java.util.ArrayList;

public class CountingOperationsVisitor extends Visitor{

    private int value;

    public int getValue() {
        return value;
    }

    public void visit(MyNumber n){
        value = 0;
    }

    public void visit(MyTime t){
        value = 0;
    }

    public void visit(Operation o){
        ArrayList<Integer> i = new ArrayList<>();
        for(Expression e : o.getArgs()) {
            e.accept(this);
            i.add(getValue());
        }
        value = 1 + i.stream()
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
        value = 1 + i.stream()
                .mapToInt(Integer::intValue)
                .reduce(Integer::sum)
                .getAsInt();
    }
}
