package back.calculator.types;

import java.math.BigDecimal;

public class RealValue extends AbstractValue{

    private BigDecimal value;
    private final Type type = Type.REAL;

    public RealValue(BigDecimal value) {
        this.value = value;
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
        }
        return this;
    }

    @Override
    public AbstractValue sub(AbstractValue other) {
        return new RealValue(this.value.subtract(((RealValue) other).value));
    }

    @Override
    public AbstractValue mul(AbstractValue other) {
        return new RealValue(this.value.multiply(((RealValue) other).value));
    }

    @Override
    public AbstractValue div(AbstractValue other) {
        return new RealValue(this.value.divide(((RealValue) other).value));
    }

    @Override
    public AbstractValue sqrt() {
        return null;
    }

    @Override
    public boolean isEqualsZero() {
        return false;
    }

    @Override
    public boolean isPositive() {
        return false;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
