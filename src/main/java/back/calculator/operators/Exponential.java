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
 * This class represents the arithmetic exponential operation "exp".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 *
 * @see Operation
 * @see Minus
 * @see Times
 * @see Plus
 * @see Divides
 * @see Sqrt
 * @see Logarithm
 * @see Sinus
 * @see Cosine
 * @see Modulus
 */
public class Exponential extends Operation {

    /**
     * Class constructor specifying a number of Expressions to compute exponential on.
     * (The list of expressions should contain only one element.)
     *
     * @param elist The list of Expressions to compute exponential on
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter or if the list contains more than one element
     * @see #Exponential
     */
    public Exponential(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to compute exponential on,
     * as well as the notation used to represent the operation.
     *
     * @param elist The list of Expressions to compute exponential on.
     * @param n The Notation to be used to represent the operation.
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter or if the list contains more than one element
     */
    public Exponential(List<Expression> elist, Notation n) throws IllegalConstruction {
        // Modulus is a unary operator
        super(elist, n);
        if (elist.size() > 1)
            // Modulus is a unary operator
            throw new IllegalConstruction();
        symbol = "exp";
        neutral = 1;
    }

    /**
     * Always throws an UnsupportedOperationException as exponential is a unary operator.
     *
     * @param l first argument of the binary operation
     * @param r second argument of the binary operation
     * @return never returns
     * @throws UnsupportedOperationException always because exponential is a unary operator
     */
    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        throw new UnsupportedOperationException("Exponential is a unary operator");
    }

    /**
     * The actual computation of the exponential of a number
     * @param l The argument of the unary operation
     * @return The result of computing the unary operation
     */
    @Override
    public MyNumber op(MyNumber l) {
        if (l instanceof NotANumber)
            return new NotANumber();
        if (l.isImaginary()) {
            // e^(a + bi) = e^a * e^(bi) = e^a * (cos(b) + i sin(b))
            AbstractValue a = l.getReal();
            AbstractValue b = l.getImaginary();
            return new MyNumber(a.exp().mul(b.cos()), (a.exp().mul(b.sin())));
        }

        return new MyNumber(l.getReal().exp());
    }

    /**
     * Method to add more parameters to the operation (Needs to be overridden to check the number of parameters)
     * @param params The list of parameters to add
     * @throws IllegalConstruction If the number of parameters after adding the new ones is greater than 1
     */
    @Override
    public void addMoreParams(List<Expression> params) throws IllegalConstruction {
        super.addMoreParams(params);

        if (getArgs().size() > 1)
            throw new IllegalConstruction();
    }
}
