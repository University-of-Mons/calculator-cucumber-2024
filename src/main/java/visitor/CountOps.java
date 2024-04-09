package visitor;

import calculator.Expression;
import calculator.operation.Operation;
import calculator.Value;
import lombok.Getter;

@Getter
public class CountOps<T> extends Visitor<T> {

    private int ops;

    @Override
    public void visit(Value<T> n) {
        // If not opp does nothing
    }

    @Override
    public void visit(Operation<T> o) {
        for (Expression<T> a : o.getArgs()) {
            a.accept(this);
        }
        ops += 1;
    }
}
