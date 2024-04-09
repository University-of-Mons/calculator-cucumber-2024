package back.calculator.operators;

import back.calculator.*;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;

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
public final class Divides extends Operation {

    /**
     * Class constructor specifying a number of Expressions to divide.
     *
     * @param elist The list of Expressions to divide
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #Divides
     */
    public Divides(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to divide,
     * as well as the notation used to represent the operation.
     *
     * @param elist The list of Expressions to divide
     * @param n     The Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #Divides
     * @see Operation#Operation
     *
     */
    public Divides(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
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
    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        if ((r.getReal().isEqualsZero() && r.getImaginary().isEqualsZero()) || l instanceof NotANumber || r instanceof NotANumber)
            return new NotANumber();
        if (l.isImaginary() || r.isImaginary()) {
            // TODO: Implement division of complex numbers
            return new NotANumber();
            // (a + bi) / (c + di) = (ac + bd) + (bc - ad)i / (c^2 + d^2)
            /*int a = l.getReal();
            int b = l.getImaginary();
            int c = r.getReal();
            int d = r.getImaginary();
            int denom = c^2 + d^2;
            int real = (a * c + b * d) / denom;
            int imaginary = (b * c - a * d) / denom;
            return new MyNumber(real, imaginary);
             */
        }
        return new MyNumber(l.getReal().div(r.getReal()));
    }
}
