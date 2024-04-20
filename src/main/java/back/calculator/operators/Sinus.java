package back.calculator.operators;

import back.calculator.Expression;
import back.calculator.IllegalConstruction;
import back.calculator.Notation;
import back.calculator.Operation;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;

import java.util.List;

/**
 * This class represents the arithmetic sinus operation "sin".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 *
 * @see Operation
 * @see Minus
 * @see Times
 * @see Plus
 * @see Exponential
 * @see Sqrt
 * @see Logarithm
 * @see Divides
 * @see Cosine
 * @see Modulus
 */
public class Sinus extends Operation {
    /**
     * Class constructor specifying a number of Expressions to compute the sinus on.
     * @param elist The list of Expressions to compute the sinus on
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter or if the list contains more than one element
     * @see #Sinus
     */
    public Sinus(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to compute the sinus on and the notation.
     * @param elist The list of Expressions to compute the sinus on
     * @param n The notation of the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter or if the list contains more than one element
     */
    public Sinus(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        if (elist.size() > 1)
            throw new IllegalConstruction();
        symbol = "sin";
        neutral = 0;
    }

    /**
     * This method is not supported as Sinus is a unary operator.
     * @param l The left operand
     * @param r The right operand
     * @throws UnsupportedOperationException Always, as this operation is not supported.
     */
    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        throw new UnsupportedOperationException("Sinus is a unary operator");
    }

    /**
     * Computes the sinus of a number.
     * @param l The number
     * @return The sinus of the number
     * @throws UnsupportedOperationException If the number is complex, as Sinus is not defined for complex numbers in this calculator
     */
    @Override
    public MyNumber op(MyNumber l) {
        if (l instanceof NotANumber)
            return new NotANumber();
        if (l.isImaginary())
            throw new UnsupportedOperationException("Sinus is not defined for complex numbers in this calculator");

        return new MyNumber(l.getReal().sin());
    }

    /**
     * Adds more parameters to the operation.
     * @param params The additional parameters
     * @throws IllegalConstruction If the number of parameters is greater than one after adding the new ones.
     */
    @Override
    public void addMoreParams(List<Expression> params) throws IllegalConstruction {
        super.addMoreParams(params);

        if (getArgs().size() > 1)
            throw new IllegalConstruction();
    }
}