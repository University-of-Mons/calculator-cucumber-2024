package back.calculator.operators;

import back.calculator.*;
import back.calculator.types.AbstractValue;
import back.calculator.types.IntValue;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;

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
public final class Minus extends Operation {

    /**
     * Class constructor specifying a number of Expressions to subtract.
     *
     * @param elist The list of Expressions to subtract
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #Minus
     */
    public /*constructor*/ Minus(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to subtract,
     * as well as the Notation used to represent the operation.
     *
     * @param elist The list of Expressions to subtract
     * @param n     The Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #Minus
     * @see Operation#Operation
     */
    public Minus(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "-";
        neutral = 0;
    }

    /**
     * The actual computation of the (binary) arithmetic subtraction of two numbers
     *
     * @param l The first number
     * @param r The second number that should be subtracted from the first
     * @return The number that is the result of the subtraction
     */
    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        if (l instanceof NotANumber || r instanceof NotANumber)
            return new NotANumber();
        if (l.isImaginary() || r.isImaginary()) {
            AbstractValue real = l.getReal().sub(r.getReal());
            AbstractValue imaginary = l.getImaginary().sub(r.getImaginary());
            return new MyNumber(real, imaginary);
        }
        return new MyNumber(l.getReal().sub(r.getReal()));
    }

    /**
     * The actual computation of the (unary) arithmetic subtraction of a number
     *
     * @param l The number
     * @return The number that is the result of the subtraction (- number)
     */
    @Override
    public MyNumber op(MyNumber l) {
        if (l instanceof NotANumber)
            return new NotANumber();
        if (l.isImaginary()) {
            AbstractValue real = l.getReal().mul(new IntValue(-1));
            AbstractValue imaginary = l.getImaginary().mul(new IntValue(-1));
            return new MyNumber(real, imaginary);
        }
        return new MyNumber(l.getReal().mul(new IntValue(-1)));
    }
}
