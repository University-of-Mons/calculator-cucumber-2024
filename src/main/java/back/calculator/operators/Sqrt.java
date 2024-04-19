package back.calculator.operators;

import back.calculator.Expression;
import back.calculator.IllegalConstruction;
import back.calculator.Notation;
import back.calculator.Operation;
import back.calculator.types.AbstractValue;
import back.calculator.types.IntValue;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;

import java.util.List;

/**
 * This class represents the arithmetic square root operation "sqrt".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 *
 * @see Operation
 * @see Minus
 * @see Times
 * @see Plus
 * @see Exponential
 * @see Divides
 * @see Logarithm
 * @see Sinus
 * @see Cosine
 * @see Modulus
 */
public class Sqrt extends Operation {
    /**
     * Class constructor specifying a number of Expressions to compute the square root on.
     * @param elist The list of Expressions to compute the square root on
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter or if the list contains more than one element
     * @see #Sqrt
     */
    public Sqrt(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to compute the square root on and the notation.
     * @param elist The list of Expressions to compute the square root on
     * @param n The notation of the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter or if the list contains more than one element
     */
    public Sqrt(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        if (elist.size() > 1)
            throw new IllegalConstruction();
        symbol = "sqrt";
        neutral = 1;
    }

    /**
     * This method is not supported as Sqrt is a unary operator.
     * @param l The left operand
     * @param r The right operand
     * @throws UnsupportedOperationException Always, as this operation is not supported.
     */
    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        throw new UnsupportedOperationException("Exponential is a unary operator");
    }

    /**
     * Computes the square root of a number.
     * @param l The number to compute the square root of
     * @return The square root of the number
     */
    @Override
    public MyNumber op(MyNumber l) {
        if (l instanceof NotANumber)
            return new NotANumber();
        if (l.isImaginary()) {
            // sqrt(a + bi) = sqrt((|a+bi| + a)/2 ) + i (sqrt((|a+bi| - a)/2))
            AbstractValue a = l.getReal();
            AbstractValue b = l.getImaginary();
            AbstractValue modulus = a.mul(a).add(b.mul(b)).sqrt();

            AbstractValue real = modulus.add(a).div(new IntValue(2));
            AbstractValue imaginary = modulus.sub(a).div(new IntValue(2));

            return new MyNumber(real.sqrt(), imaginary.sqrt());
        }

        if (!l.getReal().isPositive()){
            AbstractValue value = l.getReal().mul(new IntValue(-1));
            return new MyNumber(new IntValue(0), value.sqrt());
        }
        return new MyNumber(l.getReal().sqrt());
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