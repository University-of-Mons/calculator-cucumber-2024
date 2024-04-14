package back.calculator.types;

import java.math.BigDecimal;

public class RealValue extends AbstractValue{

    private BigDecimal value;

    public RealValue(float value) {
        this.value = BigDecimal.valueOf(value);
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
        return null;
    }

    @Override
    public AbstractValue mul(AbstractValue other) {
        return null;
    }

    @Override
    public AbstractValue div(AbstractValue other) {
        return null;
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
        return "";
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
