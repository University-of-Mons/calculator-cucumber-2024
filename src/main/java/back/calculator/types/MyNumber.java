package back.calculator.types;

import back.calculator.App;
import back.calculator.ComplexForm;
import back.calculator.Expression;
import back.calculator.Operation;
import back.visitor.Visitor;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * MyNumber is a concrete class that represents arithmetic numbers,
 * which are a special kind of Expressions, just like operations are.
 *
 * @see Expression
 * @see Operation
 */
public class MyNumber implements Expression {


    private final AbstractValue real;
    // INT - REAL - RATIONAL

    private final AbstractValue imaginary;
    // INT - REAL - RATIONAL

    private ComplexForm representation = ComplexForm.CARTESIAN;

    private MathContext precision = App.getPrecision();

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
        switch (v.getType()) {
            case REAL:
                imaginary = new RealValue(BigDecimal.ZERO);
                break;
            case RATIONAL:
                imaginary = new RationalValue(new IntValue(0), new IntValue(1));
                break;
            default:
                imaginary = new IntValue(0);

        }
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


    public MyNumber convertToReal(){
        // TODO: When the number si NaN, it returns -1
        AbstractValue newReal = this.real;
        AbstractValue newImaginary = this.imaginary;

        // Real part
        if (real.getType() == Type.INT){
            IntValue number = (IntValue) real;
            newReal = new RealValue(new BigDecimal(number.getValue(), precision));
        } else{
            if (real.getType() == Type.RATIONAL){
                RationalValue number = (RationalValue) real;
                newReal = number.convertToReal();
            } else{
                if (real.getType() == Type.REAL) {
                    newReal = real;
                }
            }
        }

        // Imaginary part
        if (imaginary.getType() == Type.INT){
            IntValue number = (IntValue) imaginary;
            newImaginary = new RealValue(new BigDecimal(number.getValue(), precision));
        } else{
            if (imaginary.getType() == Type.RATIONAL){
                RationalValue number = (RationalValue) imaginary;
                newImaginary = number.convertToReal();
            } else{
                if (real.getType() == Type.REAL) {
                    newImaginary = imaginary;
                }
            }
        }

        return new MyNumber(newReal, newImaginary);
    }

    /**
     * Method to check if the number is represented in polar, cartesian or exponential form
     * @see ComplexForm
     * @return The representation of the number
     */
    public ComplexForm getForm() {
        return representation;
    }

    /**
     * Method to set the representation of the number
     * @see ComplexForm
     * @param representation The representation to set
     */
    public void setForm(ComplexForm representation) {
        this.representation = representation;
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
        return switch (representation) {
            case POLAR -> toStringPolar();
            case EXPONENTIAL -> toStringExp();
            default -> toStringCartesian();
        };
    }

    private String toStringCartesian() {
        if (real.isEqualsZero()) {
            return toStringPurelyImaginary();
        } else {
            return toStringWithReal();
        }
    }

    private String toStringPurelyImaginary() {
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


    private String toStringPolar() {
        if (!isImaginary()) {
            if (real.isPositive()) {
                return real + "(cos(0)+isin(0))";
            } else {
                return real + "(cos(pi)+isin(pi))";
            }
        }
        // = modulus cos(theta) + i sin(theta)
        AbstractValue modulus = real.mul(real).add(imaginary.mul(imaginary)).sqrt();

        AbstractValue arg = imaginary.div(real.add(modulus)).atan().mul(new IntValue(2));

        return modulus + "(cos(" + arg + ")+isin(" + arg + "))";
    }

    private String toStringExp() {
        if (!isImaginary()) {
            if (real.isPositive()) {
                return real + "exp(0)";
            } else {
                return real + "exp(pii)";
            }
        }
        // val = modulus exp(i theta)
        AbstractValue modulus = real.mul(real).add(imaginary.mul(imaginary)).sqrt();

        AbstractValue arg = imaginary.div(real.add(modulus)).atan().mul(new IntValue(2));

        return modulus + "exp("+arg+"i)";
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
