package visitor;

import calculator.Expression;
import calculator.MyNumber;
import calculator.Operation;

import java.util.ArrayList;

public class CountOps extends Visitor{

    private int ops;

    public int getOps() {
        return ops;
    }

    @Override
    public void visit(MyNumber n) {
        ops = 0;
    }

    @Override
    public void visit(Operation o) {
        ArrayList<Integer> args = new ArrayList<>();
        for(Expression a:o.getArgs()) {
            a.accept(this);
            args.add(ops);
        }
        ops =  1 + args.stream()
                .mapToInt(Integer::intValue)
                .reduce(Integer::sum)
                .getAsInt();
    }
}
