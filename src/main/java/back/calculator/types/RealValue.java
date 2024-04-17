package back.calculator.types;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class RealValue extends AbstractValue{

    private BigDecimal value;

    private final MathContext precision = new MathContext(5);

    public RealValue(BigDecimal value) {
        this.value = value;
        type = Type.REAL;
    }

    @Override
    public AbstractValue add(AbstractValue other) {
        RealValue result = null;
        switch (other.getType()){
            case INT:
                BigDecimal otherValue = new BigDecimal(((IntValue) other).getValue(), this.precision);
                result = new RealValue(this.value.add(otherValue, this.precision));
                break;

            case REAL:
                result = new RealValue(this.value.add(((RealValue) other).value, this.precision));
                break;
        }
        return result;
    }

    @Override
    public AbstractValue sub(AbstractValue other) {
        RealValue result = null;
        switch (other.getType()){
            case INT:
                BigDecimal otherValue = new BigDecimal(((IntValue) other).getValue());
                result = new RealValue(this.value.subtract(otherValue, this.precision));
                break;

            case REAL:
                result = new RealValue(this.value.subtract(((RealValue) other).value, this.precision));
                break;
        }
        return result;
    }

    @Override
    public AbstractValue mul(AbstractValue other) {
        RealValue result = null;
        switch (other.getType()){
            case INT:
                BigDecimal otherValue = new BigDecimal(((IntValue) other).getValue());
                result = new RealValue(this.value.multiply(otherValue,this.precision));
                break;

            case REAL:
                result = new RealValue(this.value.multiply(((RealValue) other).value,this.precision));
                break;
        }
        return result;
    }

    @Override
    public AbstractValue div(AbstractValue other) {
        RealValue result = null;
        switch (other.getType()){
            case INT:
                BigDecimal otherValue = new BigDecimal(((IntValue) other).getValue());
                result = new RealValue(this.value.divide(otherValue, this.precision));
                break;

            case REAL:
                result = new RealValue(this.value.divide(((RealValue) other).value, this.precision));
                break;
        }
        return result;
    }

    @Override
    public AbstractValue sqrt() throws IllegalArgumentException {
        if (this.value.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Cannot take the square root of a negative number");
        }
        return new RealValue(this.value.sqrt(this.precision));
    }

    @Override
    public AbstractValue cos() {
        return null;
    }

    @Override
    public AbstractValue sin() {
        return null;
    }

    @Override
    public AbstractValue ln() {
        return null;
    }

    @Override
    public AbstractValue exp() {
        return null;
    }

    @Override
    public AbstractValue atan() {
        return new RealValue(new BigDecimal(Math.atan(this.value.doubleValue()), this.precision));
    }


    @Override
    public boolean isEqualsZero() {
        return this.value.compareTo(BigDecimal.ZERO) == 0;
    }

    @Override
    public boolean isPositive() {
        return this.value.compareTo(BigDecimal.ZERO) > 0;
    }

    @Override
    public String toString() {
        return this.value.stripTrailingZeros().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RealValue)) return false;
        RealValue realValue = (RealValue) o;
        return this.value.compareTo(realValue.value) == 0;
    }

    @Override
    public int hashCode() {
        return (this.value.hashCode());
    }
}

