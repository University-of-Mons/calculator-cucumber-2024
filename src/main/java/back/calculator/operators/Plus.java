package back.calculator.operators;

import back.calculator.Expression;
import back.calculator.IllegalConstruction;
import back.calculator.Notation;
import back.calculator.Operation;
import back.calculator.types.AbstractValue;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;

import java.util.List;

/**
 * This class represents the arithmetic sum operation "+".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 *
 * @see Operation
 * @see Minus
 * @see Times
 * @see Divides
 */
public final class Plus extends Operation {

    /**
     * Class constructor specifying a number of Expressions to add.
     *
     * @param elist The list of Expressions to add
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #Plus
     */
    public /*constructor*/ Plus(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to add,
     * as well as the Notation used to represent the operation.
     *
     * @param elist The list of Expressions to add
     * @param n     The Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #Plus
     * @see Operation#Operation
     */
    public Plus(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "+";
        neutral = 0;
    }

    /**
     * The actual computation of the (binary) arithmetic addition of two numbers
     *
     * @param l The first number
     * @param r The second number that should be added to the first
     * @return The number that is the result of the addition
     */
    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        if (l instanceof NotANumber || r instanceof NotANumber)
            return new NotANumber();
        if (l.isImaginary() || r.isImaginary()) {
            AbstractValue real = l.getReal().add(r.getReal());
            AbstractValue imaginary = l.getImaginary().add(r.getImaginary());
            return new MyNumber(real, imaginary);
        }
        return new MyNumber(l.getReal().add(r.getReal()));
    }

    /**
     * The actual computation of the (unary) arithmetic addition of a number.
     *
     * @param l The argument of the unary operation
     * @return The result of the unary operation. (The argument itself)
     */
    @Override
    public MyNumber op(MyNumber l) {
        return l;
    }
}
