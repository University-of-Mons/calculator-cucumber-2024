package visitor;

import calculator.Expression;
import calculator.MyNumber;
import calculator.Operation;

import java.util.ArrayList;

public class CountNbs extends Visitor{

    private int nbs;

    public int getNbs() {
        return nbs;
    }

    @Override
    public void visit(MyNumber n) {
        nbs = 1;
    }

    @Override
    public void visit(Operation o) {
        ArrayList<Integer> args = new ArrayList<>();
        for(Expression a:o.getArgs()) {
            a.accept(this);
            args.add(nbs);
        }
        nbs = args.stream()
                .mapToInt(Integer::intValue)
                .reduce(Integer::sum)
                .getAsInt();
    }
}
