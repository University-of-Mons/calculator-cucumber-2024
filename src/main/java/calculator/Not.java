package calculator;

import visitor.Visitor;

import java.util.List;

/** This class represents the boolean operation "NOT".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * @see Operation
 * @see And
 * @see Or
 * @see Xor
 */
public class Not implements Expression {

    public Expression arg;

    /**
     * Class constructor specifying an Expression to NOT.
     *
     * @param truthValue The Expression to NOT
     */
    public Not(MyNumber truthValue) {
        this.arg = truthValue;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int countDepth() {
        return 1 + arg.countDepth();
    }

    @Override
    public int countOps() {
        return 1 + arg.countOps();
    }

    @Override
    public int countNbs() {
        return 1 + arg.countNbs();
    }

    @Override
    public final String toString() {
        return "!" + arg.toString();
    }
}
