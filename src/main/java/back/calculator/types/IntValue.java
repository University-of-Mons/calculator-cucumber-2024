package back.calculator.types;

import back.calculator.App;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Represents an Integer value. IT extends AbstractValue.
 *
 * <p>
 *     Most operations will return a new RealValue or RationalValue if necessary to avoid loss of precision.
 * </p>
 *
 * @see back.calculator.types.AbstractValue
 * @see back.calculator.types.RealValue
 * @see back.calculator.types.RationalValue
 */
public class IntValue extends AbstractValue {

    // The int value of the object.
    private final int value;

    // The precision of the object. (Use to create RealValue objects in the operations)
    private final MathContext precision = App.getPrecision();

    /**
     * Constructor for an integer value.
     * @param value The integer value.
     */
    public IntValue(int value) {
        this.type = Type.INT;
        this.value = value;
    }

    /**
     * Get the int value of the object.
     * @return The int value.
     */
    public int getValue() {
        return value;
    }

    /**
     * Get the String representation of the object.
     * @return The String representation of the int value.
     */
    @Override
    public String toString() {
        return Integer.toString(value);
    }

    /**
     * Compare the object value to another object value.
     * @param o The object to compare to.
     * @return True if the values are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractValue abstractValue)) {
            return false;
        }
        return switch (abstractValue.getType()) {
            case REAL -> new RealValue(new BigDecimal(this.value, precision)).equals(abstractValue);
            case RATIONAL -> new RationalValue(this, new IntValue(1)).equals(abstractValue);
            default -> value == ((IntValue) abstractValue).getValue();
        };
    }

    /**
     * Get the hash code of the object. (The hash code of the int value).
     * @return The hash code of the int value.
     */
    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }

    /**
     * Add a value to this value. <br/>
     * The result will be an object of the same type as the other value.
     * @param other The value to add to this value.
     * @return The result of the addition.
     */
    @Override
    public AbstractValue add(AbstractValue other) {
        return switch (other.getType()) {
            case REAL -> new RealValue(new BigDecimal(this.value, precision)).add((other));
            case RATIONAL -> new RationalValue(new IntValue(this.value), new IntValue(1)).add(other);
            default -> new IntValue(this.value + ((IntValue) other).getValue());
        };
    }

    /**
     * Subtract a value from this value. <br/>
     * The result will be an object of the same type as the other value.
     * @param other The value to subtract from this value.
     * @return The result of the subtraction.
     */
    @Override
    public AbstractValue sub(AbstractValue other) {
        return switch (other.getType()) {
            case REAL -> new RealValue(new BigDecimal(this.value, precision)).sub((other));
            case RATIONAL -> new RationalValue(new IntValue(this.value), new IntValue(1)).sub(other);
            default -> new IntValue(this.value - ((IntValue) other).getValue());
        };
    }

    /**
     * Multiply this value by another value. <br/>
     * The result will be an object of the same type as the other value.
     * @param other The value to multiply this value by.
     * @return The result of the multiplication.
     */
    @Override
    public AbstractValue mul(AbstractValue other) {
        return switch (other.getType()) {
            case REAL -> new RealValue(new BigDecimal(this.value, precision)).mul((other));
            case RATIONAL -> new RationalValue(new IntValue(this.value), new IntValue(1)).mul(other);
            default -> new IntValue(this.value * ((IntValue) other).getValue());
        };
    }

    /**
     * Divide this value by another value. <br/>
     * The result will be an object of the same type as the other value
     * or if both values are integers and the division is exact, the result will be an integer.
     * If the division is not exact, the result will be a RationalValue.
     *
     * @param other The value to divide this value by.
     * @return The result of the division.
     */
    @Override
    public AbstractValue div(AbstractValue other) {
        switch (other.getType()) {
            case REAL:
                return new RealValue(new BigDecimal(this.value, precision)).div((other));
            case RATIONAL:
                return new RationalValue(new IntValue(this.value), new IntValue(1)).div(other);
            default:
                // INT
        }

        if (this.value == ((IntValue) other).getValue()) {
            return new IntValue(1);
        }
        if (((IntValue) other).getValue() == 1) {
            return new IntValue(this.value);
        }
        if (this.value % ((IntValue) other).getValue() == 0) {
            return new IntValue(this.value / ((IntValue) other).getValue());
        }
        return new RationalValue(this, other);
    }

    /**
     * Compute the square root of the value.
     * @return The result of the square root as a {@link RealValue}
     */
    @Override
    public AbstractValue sqrt() {
        return new RealValue(new BigDecimal(Double.toString(Math.sqrt(this.value)), precision));
    }

    /**
     * Compute the cosine of the value.
     * @return The result of the cosine as a {@link RealValue}
     */
    @Override
    public AbstractValue cos() {
        return new RealValue(new BigDecimal(Double.toString(Math.cos(this.value)), precision));
    }

    /**
     * Compute the sine of the value.
     * @return The result of the sine as a {@link RealValue}
     */
    @Override
    public AbstractValue sin() {
        return new RealValue(new BigDecimal(Double.toString(Math.sin(this.value)), precision));
    }

    /**
     * Compute the natural logarithm of the value.
     * @return The result of the natural logarithm as a {@link RealValue}
     */
    @Override
    public AbstractValue ln() {
        return new RealValue(new BigDecimal(Double.toString(Math.log(this.value)), precision));
    }

    /**
     * Compute the exponential (e^val) of the value.
     * @return The result of the exponential as a {@link RealValue}
     */
    @Override
    public AbstractValue exp() {
        return new RealValue(new BigDecimal(Double.toString(Math.exp(this.value)), precision));
    }

    /**
     * Compute the inverse tangent of the value.
     * @return The result of the inverse tangent as a {@link RealValue}
     */
    @Override
    public AbstractValue atan() {
        return new RealValue(new BigDecimal(Double.toString(Math.atan(this.value)), precision));
    }

    /**
     * Checks if the value is equal to zero.
     * @return True if the value is equal to zero, false otherwise.
     */
    @Override
    public boolean isEqualsZero() {
        return this.value == 0;
    }

    /**
     * Checks if the value is positive (>= 0).
     * @return True if the value is positive, false otherwise.
     */
    @Override
    public boolean isPositive() {
        return this.value >= 0;
    }
}
