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
 * This class represents the complex modulus operation "modulus".
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
 * @see Sinus
 * @see Cosine
 * @see Divides
 */
public class Modulus extends Operation {
    /**
     * Class constructor specifying a number of Expressions to compute the modulus on.
     * @param elist The list of Expressions to compute the modulus on
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter or if the list contains more than one element
     * @see #Modulus
     */
    public Modulus(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to compute the modulus on and the notation.
     * @param elist The list of Expressions to compute the modulus on
     * @param n The notation of the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter or if the list contains more than one element
     */
    public Modulus(List<Expression> elist, Notation n) throws IllegalConstruction {
        // Modulus is a unary operator
        super(elist, n);
        if (elist.size() > 1)
            // Modulus is a unary operator
            throw new IllegalConstruction();
        symbol = "modulus";
        neutral = 1;
    }

    /**
     * This method is not supported as Modulus is a unary operator.
     * @param l The left operand
     * @param r The right operand
     * @throws UnsupportedOperationException Always, as this operation is not supported.
     */
    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        throw new UnsupportedOperationException("Modulus is a unary operator");
    }

    /**
     * Computes the modulus of a complex number.
     * @param l The complex number
     * @return The modulus of the complex number
     */
    @Override
    public MyNumber op(MyNumber l) {
        if (l instanceof NotANumber)
            return new NotANumber();
        // |a + bi| = sqrt(a^2 + b^2)
        AbstractValue a = l.getReal();
        AbstractValue b = l.getImaginary();
        return new MyNumber(a.mul(a).add(b.mul(b)).sqrt());
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