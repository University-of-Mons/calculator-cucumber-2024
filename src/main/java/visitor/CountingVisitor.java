package visitor;

import calculator.numbers.Expression;
import calculator.Counting;
import calculator.numbers.MyNumber;
import calculator.operators.Operation;

import java.util.ArrayList;

public class CountingVisitor extends Visitor{

    private Counting mode;
    private int value;

    public void setMode(Counting mode) {
        this.mode = mode;
    }

    public int getValue() {
        return value;
    }

    public void visit(MyNumber n){
        switch (mode){
            case COUNT_OPS,DEPTH:
                value = 0;
                break;
            case COUNT_NBS:
                value = 1;
                break;
        }
    }


     public void visit(Operation o){
         ArrayList<Integer> i = new ArrayList<>();
         for(Expression e : o.getArgs()) {
             e.accept(this);
             i.add(getValue());
         }
        switch (mode){
            case COUNT_OPS:
                value = 1 + i.stream()
                        .mapToInt(Integer::intValue)
                        .reduce(Integer::sum)
                        .getAsInt();
                break;
            case DEPTH:
                value =1 + i.stream()
                        .mapToInt(Integer::intValue)
                        .max()
                        .getAsInt();
                break;
            case COUNT_NBS:
                value = i.stream()
                        .mapToInt(Integer::intValue)
                        .reduce(Integer::sum)
                        .getAsInt();
                break;
        }
    }
}
