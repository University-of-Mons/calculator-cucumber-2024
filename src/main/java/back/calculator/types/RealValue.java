package back.calculator.types;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class RealValue extends AbstractValue{

    private BigDecimal value;

    private final MathContext precision = new MathContext(3, RoundingMode.HALF_UP);

    public RealValue(BigDecimal value) {
        this.value = value;
        type = Type.REAL;
    }

    @Override
    public AbstractValue add(AbstractValue other) {
        switch (other.getType()){
            case INT:
                BigDecimal otherValue = new BigDecimal(((IntValue) other).getValue());
                this.value = this.value.add(otherValue);
                break;

            case REAL:
                this.value = this.value.add(((RealValue) other).value);
                break;

            case RATIONAL:
                //TODO waiting for Rational conversion to real.
                break;
        }
        return this;
    }

    @Override
    public AbstractValue sub(AbstractValue other) {
        switch (other.getType()){
            case INT:
                BigDecimal otherValue = new BigDecimal(((IntValue) other).getValue());
                this.value = this.value.subtract(otherValue);
                break;

            case REAL:
                this.value = this.value.subtract(((RealValue) other).value);
                break;
        }
        return this;
    }

    @Override
    public AbstractValue mul(AbstractValue other) {
        switch (other.getType()){
            case INT:
                BigDecimal otherValue = new BigDecimal(((IntValue) other).getValue());
                this.value = this.value.multiply(otherValue/*,this.precision*/);
                break;

            case REAL:
                this.value = this.value.multiply(((RealValue) other).value/*this.precision*/);
                break;
        }
        return this;
    }

    @Override
    public AbstractValue div(AbstractValue other) {
        switch (other.getType()){
            case INT:
                BigDecimal otherValue = new BigDecimal(((IntValue) other).getValue());
                this.value = this.value.divide(otherValue/*,this.precision*/);
                break;

            case REAL:
                this.value = this.value.divide(((RealValue) other).value/*,this.precision*/);
                break;
        }
        return this;
    }

    @Override
    public AbstractValue sqrt() {
        return new RealValue(this.value.sqrt(this.precision));
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
        return this.value.toString();
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

