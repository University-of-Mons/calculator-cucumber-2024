package back.calculator.types;

import back.calculator.App;

import java.math.BigDecimal;
import java.math.MathContext;

public class IntValue extends AbstractValue {

    private int value;

    private MathContext precision = App.getPrecision();

    public IntValue(int value) {
        this.setType(Type.INT);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractValue abstractValue)){
            return false;
        }
        return switch (abstractValue.getType()) {
            case REAL -> new RealValue(new BigDecimal(this.value, precision)).equals(abstractValue);
            case RATIONAL -> new RationalValue(this, new IntValue(1)).equals(abstractValue);
            default -> value == ((IntValue) abstractValue).getValue();
        };
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }

    @Override
    public AbstractValue add(AbstractValue other) {
        return switch (other.getType()) {
            case REAL -> new RealValue(new BigDecimal(this.value, precision)).add((other));
            case RATIONAL -> new RationalValue(new IntValue(this.value), new IntValue(1)).add(other);
            default -> new IntValue(this.value + ((IntValue) other).getValue());
        };
    }

    @Override
    public AbstractValue sub(AbstractValue other) {
        return switch (other.getType()) {
            case REAL -> new RealValue(new BigDecimal(this.value, precision)).sub((other));
            case RATIONAL -> new RationalValue(new IntValue(this.value), new IntValue(1)).sub(other);
            default -> new IntValue(this.value - ((IntValue) other).getValue());
        };
    }

    @Override
    public AbstractValue mul(AbstractValue other) {
        return switch (other.getType()) {
            case REAL -> new RealValue(new BigDecimal(this.value, precision)).mul((other));
            case RATIONAL -> new RationalValue(new IntValue(this.value), new IntValue(1)).mul(other);
            default -> new IntValue(this.value * ((IntValue) other).getValue());
        };
    }

    @Override
    public AbstractValue div(AbstractValue other) {
        switch (other.getType()) {
            case REAL:
                return new RealValue(new BigDecimal(this.value, precision)).div((other));
            case RATIONAL:
                return new RationalValue(new IntValue(this.value), new IntValue(1)).div(other);
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

    @Override
    public AbstractValue sqrt() {
        return new RealValue(new BigDecimal(Double.toString(Math.sqrt(this.value)), precision));
    }

    @Override
    public AbstractValue cos() {
        return new RealValue(new BigDecimal(Double.toString(Math.cos(this.value)), precision));
    }

    @Override
    public AbstractValue sin() {
        return new RealValue(new BigDecimal(Double.toString(Math.sin(this.value)), precision));
    }

    @Override
    public AbstractValue ln() {
        return new RealValue(new BigDecimal(Double.toString(Math.log(this.value)), precision));
    }

    @Override
    public AbstractValue exp() {
        return new RealValue(new BigDecimal(Double.toString(Math.exp(this.value)), precision));
    }

    @Override
    public AbstractValue atan() {
        return new RealValue(new BigDecimal(Double.toString(Math.atan(this.value)), precision));
    }

    @Override
    public boolean isEqualsZero(){
        return this.value == 0;
    }

    @Override
    public boolean isPositive(){
        return this.value > 0;
    }
}
