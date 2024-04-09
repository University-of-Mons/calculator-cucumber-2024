package back.calculator.operators;

import back.calculator.*;
import back.calculator.types.AbstractValue;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;

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
public final class Times extends Operation {
    /**
     * Class constructor specifying a number of Expressions to multiply.
     *
     * @param elist The list of Expressions to multiply
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #Times
     */
    public /*constructor*/ Times(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to multiply,
     * as well as the Notation used to represent the operation.
     *
     * @param elist The list of Expressions to multiply
     * @param n     The Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #Times
     * @see Operation#Operation
     */
    public Times(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "*";
        neutral = 1;
    }

    /**
     * The actual computation of the (binary) arithmetic multiplication of two integers
     *
     * @param l The first integer
     * @param r The second integer that should be multiplied with the first
     * @return The integer that is the result of the multiplication
     */
    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        if (l instanceof NotANumber || r instanceof NotANumber)
            return new NotANumber();
        if (l.isImaginary() || r.isImaginary()) {
            // (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
            AbstractValue a = l.getReal();
            AbstractValue b = l.getImaginary();
            AbstractValue c = r.getReal();
            AbstractValue d = r.getImaginary();
            AbstractValue real = a.mul(c).sub(b.mul(d));
            AbstractValue imaginary = a.mul(d).add(b.mul(c));
            return new MyNumber(real, imaginary);
        }
        return new MyNumber(l.getReal().mul(r.getReal()));
    }
}
