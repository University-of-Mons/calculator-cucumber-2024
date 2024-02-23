package visitor;

import calculator.Expression;
import calculator.MyNumber;
import calculator.Operation;

public class Mathematician extends Visitor {
    private int numbersCount = 0;

    /**
     * Mathematician visitor constructor.
     */
    public Mathematician() {
    }

    /**
     * Use the visitor design pattern to visit a number.
     *
     * @param n The number being visited
     */
    @Override
    public void visit(MyNumber n) {
        System.out.println("I am number " + n + " and I am being visited. Incrementing numbersCount by 1.");
        this.numbersCount += 1;
    }

    /**
     * Use the visitor design pattern to visit an operation
     * The operation is visited according to the notation set in the constructor.
     *
     * @param o The operation being visited
     */
    @Override
    public void visit(Operation o) {
        System.out.println("In sub expression " + o + " we found " + this.numbersCount + " numbers.");
    }

    /**
     * Depth getter
     *
     * @return The depth
     */
    public int getNumbersCount() {
        return numbersCount;
    }
}
