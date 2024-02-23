package visitor;

import calculator.MyNumber;
import calculator.Operation;

public class Logician extends Visitor {
    private int operationsCount = 0;

    /**
     * Logician visitor constructor.
     */
    public Logician() {
    }

    /**
     * Use the visitor design pattern to visit a number.
     *
     * @param n The number being visited
     */
    @Override
    public void visit(MyNumber n) {
        System.out.println("I am number " + n + " and I am being visited.");
    }

    /**
     * Use the visitor design pattern to visit an operation
     * The operation is visited according to the notation set in the constructor.
     *
     * @param o The operation being visited
     */
    @Override
    public void visit(Operation o) {
        this.operationsCount += o.getArgs().size() - 1;
        System.out.println("In sub expression " + o + " we found " + this.operationsCount + " operations.");
    }

    /**
     * Depth getter
     *
     * @return The depth
     */
    public int getOperationsCount() {
        return operationsCount;
    }
}
