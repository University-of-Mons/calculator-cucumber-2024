package back.calculator.types;

import back.calculator.Expression;
import back.calculator.Operation;
import back.visitor.Visitor;

/**
 * MyNumber is a concrete class that represents arithmetic numbers,
 * which are a special kind of Expressions, just like operations are.
 *
 * @see Expression
 * @see Operation
 */
public class MyNumber implements Expression {
    private final AbstractValue real;

    private final AbstractValue imaginary;

    /**
     * getter method to obtain the value contained in the object
     *
     * @return The integer number contained in the object
     */

    public AbstractValue getReal() {
        return real;
    }

    /**
     * Getter method to obtain the imaginary part of the object
     *
     * @return The imaginary part of the object
     */
    public AbstractValue getImaginary() {
        return imaginary;
    }

    public MyNumber(AbstractValue v) {
        real = v;
        // TODO: add a switch to check the type of v to create the same type.
        imaginary = new IntValue(0);
    }

    public MyNumber(int v) {
        real = new IntValue(v);
        imaginary = new IntValue(0);
    }

    /**
     * Constructor method for complex numbers
     *
     * @param real The real part of the complex number
     * @param imaginary The imaginary part of the complex number
     */
    public MyNumber(AbstractValue real, AbstractValue imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public MyNumber(int real, int imaginary) {
        this.real = new IntValue(real);
        this.imaginary = new IntValue(imaginary);
    }

    /**
     * Method to check if the number is imaginary
     *
     * @return True if the number is imaginary, false otherwise.
     */
    public boolean isImaginary() {
        return !imaginary.isEqualsZero();
    }

    /**
     * accept method to implement the visitor design pattern to traverse arithmetic expressions.
     * Each number will pass itself to the visitor object to get processed by the visitor.
     *
     * @param v The visitor object
     */
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    /**
     * Convert a number into a String to allow it to be printed.
     *
     * @return The String that is the result of the conversion.
     */
    @Override
    public String toString() {
        if (real.isEqualsZero()) {
            return toStringPurelyImaginary();
        } else {
            return toStringWithReal();
        }
    }

    private String toStringPurelyImaginary() {
        System.out.println(imaginary + "" + real);
        if (imaginary.isEqualsZero()) {
            return "0";
        } else if (imaginary.equals(new IntValue(1))) {
            return "i";
        } else {
            return imaginary + "i";
        }
    }

    private String toStringWithReal() {
        if (imaginary.isEqualsZero()) {
            return real.toString();
        } else if (imaginary.equals(new IntValue(1))) {
            return real + "+i";
        } else if (imaginary.equals(new IntValue(-1))) {
            return real + "-i";
        } else if (imaginary.isPositive()) {
            return real + "+" + imaginary + "i";
        } else {
            return real + "" + imaginary + "i";
        }
    }

    /**
     * Two MyNumber expressions are equal if the values they contain are equal
     *
     * @param o The object to compare to
     * @return A boolean representing the result of the equality test
     */
    @Override
    public boolean equals(Object o) {
        // No object should be equal to null (not including this check can result in an exception if a MyNumber is tested against null)
        if (o == null) return false;

        // If the object is compared to itself then return true
        if (o == this) {
            return true;
        }

        // If the object is of another type then return false
        if (!(o instanceof MyNumber)) {
            return false;
        }
        return this.real.equals(((MyNumber) o).real) && this.imaginary.equals(((MyNumber) o).imaginary);
        // Used == since the contained value is a primitive value
        // If it had been a Java object, .equals() would be needed
    }

    /**
     * The method hashCode needs to be overridden it the equals method is overridden;
     * otherwise there may be problems when you use your object in hashed collections
     * such as HashMap, HashSet, LinkedHashSet.
     *
     * @return The result of computing the hash.
     */
    @Override
    public int hashCode() {
        if (isImaginary()) {
            return real.hashCode() + imaginary.hashCode();
        }
        return real.hashCode();
    }

}
