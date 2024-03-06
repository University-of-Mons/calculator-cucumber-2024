package visitor;

import calculator.Expression;
import calculator.MyNumber;
import calculator.Operation;

import java.util.ArrayList;

public class CountDepth extends Visitor{

    private int depth;

    public int getDepth() {
        return depth;
    }
    
    @Override
    public void visit(MyNumber n) {
        depth = 0;
    }

    @Override
    public void visit(Operation o) {
        ArrayList<Integer> args = new ArrayList<>();
        for(Expression a:o.getArgs()) {
            a.accept(this);
            args.add(depth);
        }
        // use of Java 8 functional programming capabilities
        depth =  1 + args.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
    }
}
