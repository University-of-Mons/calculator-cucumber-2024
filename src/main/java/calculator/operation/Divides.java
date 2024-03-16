package calculator.operation;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.Value;

import java.util.List;

/**
 * This class represents the arithmetic division operation "/".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 *
 * @see Operation
 * @see Minus
 * @see Times
 * @see Plus
 */
public final class Divides<T> extends Operation<T> {


    /**
     * Class constructor specifying a number of Expressions to divide,
     *
     * @param elist The list of Expressions to divide
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     */
    public Divides(List<Expression<T>> elist) throws IllegalConstruction {
        super(elist);
        symbol = "/";
        neutral = 1;
    }

    /**
     * The actual computation of the (binary) arithmetic division of two integers
     *
     * @param l The first integer
     * @param r The second integer that should divide the first
     * @return The integer that is the result of the division
     */

    public Value<T> op(Value<T> l, Value<T> r) throws ArithmeticException {
        return l / r;
    }
}
