package calculator.operation;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.Value;

import java.util.List;

/**
 * This class represents the arithmetic operation "-".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 *
 * @see Operation
 * @see Plus
 * @see Times
 * @see Divides
 */
public final class Minus<T> extends Operation<T> {

    /**
     * Class constructor specifying a number of Expressions to subtract.
     *
     * @param elist The list of Expressions to subtract
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     */
    public /*constructor*/ Minus(List<Expression<T>> elist) throws IllegalConstruction {
        super(elist);
        symbol = "-";
    }

    /**
     * The actual computation of the (binary) arithmetic subtraction of two integers
     *
     * @param l The first integer
     * @param r The second integer that should be subtracted from the first
     * @return The integer that is the result of the subtraction
     */
    public Value<T> op(Value<T> l, Value<T> r) {
        return l.minus(r);
    }
}
