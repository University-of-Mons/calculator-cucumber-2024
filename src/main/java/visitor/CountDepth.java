package visitor;

import calculator.Expression;
import calculator.operation.Operation;
import calculator.Value;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;

@Getter
public class CountDepth<T> extends Visitor<T> {

    private int depth;

    @Override
    public void visit(Value<T> n) {
        depth = 0;
    }

    @Override
    public void visit(Operation<T> o) {
        ArrayList<Integer> args = new ArrayList<>();
        for (Expression<T> a : o.getArgs()) {
            a.accept(this);
            args.add(depth);
        }
        depth = 1 + Collections.max(args);
    }
}
