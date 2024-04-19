package back.calculator.operators;

import back.calculator.Expression;
import back.calculator.IllegalConstruction;
import back.calculator.Notation;
import back.calculator.Operation;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;

import java.util.List;

/**
 * This class represents the arithmetic cosine operation "cos".
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
 * @see Divides
 * @see Modulus
 */
public class Cosine extends Operation {

    /**
     * Class constructor specifying a number of Expressions to compute cosine on.
     * (The list of expressions should contain only one element.)
     *
     * @param elist The list of Expressions to compute cosine on
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter or if the list contains more than one element
     * @see #Cosine
     */
    public Cosine(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to compute cosine on,
     * as well as the notation used to represent the operation.
     *
     * @param elist The list of Expressions to compute cosine on.
     * @param n The Notation to be used to represent the operation.
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter or if the list contains more than one element
     */
    public Cosine(List<Expression> elist, Notation n) throws IllegalConstruction {
        // Modulus is a unary operator
        super(elist, n);
        if (elist.size() > 1)
            // Modulus is a unary operator
            throw new IllegalConstruction();
        symbol = "cos";
        neutral = 1;
    }

    /**
     * Always throws an UnsupportedOperationException as cosine is a unary operator.
     *
     * @param l first argument of the binary operation
     * @param r second argument of the binary operation
     * @return never returns
     * @throws UnsupportedOperationException always because cosine is a unary operator
     */
    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        throw new UnsupportedOperationException("Cosine is a unary operator");
    }

    /**
     * The actual computation of the cosine of a number
     *
     * @param l The argument of the unary operation
     * @return The number that is the result of the cosine
     * @throws UnsupportedOperationException if the argument is an imaginary number
     */
    @Override
    public MyNumber op(MyNumber l) {
        if (l instanceof NotANumber)
            return new NotANumber();
        if (l.isImaginary())
            throw new UnsupportedOperationException("Cosine is not defined for complex numbers in this calculator");

        return new MyNumber(l.getReal().cos());
    }

    /**
     * Adds more parameters to the operation. (Needs to be overridden to check the number of parameters)
     *
     * @param params The list of parameters to add
     * @throws IllegalConstruction if the number of parameters after adding the new ones is greater than 1
     */
    @Override
    public void addMoreParams(List<Expression> params) throws IllegalConstruction {
        super.addMoreParams(params);

        if (getArgs().size() > 1)
            throw new IllegalConstruction();
    }
}
