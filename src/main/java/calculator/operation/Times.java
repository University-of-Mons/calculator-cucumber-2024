package calculator.operation;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.Value;

import java.util.List;

/**
 * This class represents the arithmetic multiplication operation "*".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 *
 * @see Operation
 * @see Minus
 * @see Plus
 * @see Divides
 */
public final class Times<T> extends Operation<T> {
    /**
     * Class constructor specifying a number of Expressions to multiply.
     *
     * @param elist The list of Expressions to multiply
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     */
    public /*constructor*/ Times(List<Expression<T>> elist) throws IllegalConstruction {

        super(elist);
        symbol = "*";
        priority = 1;
        neutral = 1;
    }

    /**
     * The actual computation of the (binary) arithmetic multiplication of two integers
     *
     * @param l The first integer
     * @param r The second integer that should be multiplied with the first
     * @return The integer that is the result of the multiplication
     */
    public Value<T> op(Value<T> l, Value<T> r) {
        return l.times(r);
    }
}
