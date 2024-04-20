package back.calculator.types;

/**
 *  Abstract class for all types of values.
 *
 *  <p>
 *      A value is a certain type of atom. (Ex: Float, Int, Rational, ...) which can be used to define a number. <br/>
 *      Each values must implements all necessary operations to seamlessly work with other values.
 *  </p>
 * @see back.calculator.types.IntValue
 * @see back.calculator.types.RealValue
 * @see back.calculator.types.RationalValue
 */
public abstract class AbstractValue {

    /**
     * The type of the value.
     * @see Type
     */
    protected Type type;

    /**
     * Add two values together.
     * @param other The value to add to this value.
     * @return The result of the addition (new value).
     */
    public abstract AbstractValue add(AbstractValue other);

    /**
     * Subtract two values.
     * @param other The value to subtract from this value.
     * @return The result of the subtraction (new value).
     */
    public abstract AbstractValue sub(AbstractValue other);

    /**
     * Multiply two values together.
     * @param other The value to multiply with this value.
     * @return The result of the multiplication (new value).
     */
    public abstract AbstractValue mul(AbstractValue other);

    /**
     * Divide two values.
     * @param other The value to divide this value by.
     * @return The result of the division (new value).
     */
    public abstract AbstractValue div(AbstractValue other);

    /**
     * Compute the square root of the value.
     * @return The result of the square root (new value).
     */
    public abstract AbstractValue sqrt();

    /**
     * Compute the cosine of the value.
     * @return The result of the cosine (new value).
     */
    public abstract AbstractValue cos();

    /**
     * Compute the sine of the value.
     * @return The result of the sine (new value).
     */
    public abstract AbstractValue sin();

    /**
     * Compute the natural logarithm of the value.
     * @return The result of the natural logarithm (new value).
     */
    public abstract AbstractValue ln();

    /**
     * Compute the exponential (e^val) of the value.
     * @return The result of the exponential (new value).
     */
    public abstract AbstractValue exp();

    /**
     * Compute the inverse tangent of the value.
     * @return The result of the inverse tangent (new value).
     */
    public abstract AbstractValue atan();

    /**
     * Checks if the value is equal to zero.
     * @return True if the value is equal to zero, false otherwise.
     */
    public abstract boolean isEqualsZero();

    /**
     * Checks if the value is positive (>= 0).
     * @return True if the value is positive, false otherwise.
     */
    public abstract boolean isPositive();

    /**
     * Get the type of the value.
     * @return The type of the value.
     */
    public Type getType() {
        return type;
    }


    /**
     * Convert the value to a string.
     * @return The string representation of the value.
     */
    @Override
    public abstract String toString();

    /**
     * Check if two values are equal. <br/>
     * Two values are equal if their values are equal. A Integer could be equal to a Float for example.
     * @param o The object to compare to.
     * @return True if the values are equal, false otherwise.
     */
    @Override
    public abstract boolean equals(Object o);

    /**
     * Get the hash code of the value.
     * @return The hash code of the value.
     */
    @Override
    public abstract int hashCode();
}
