package back.calculator.types;

import back.calculator.App;

import java.math.BigDecimal;
import java.math.MathContext;

public class IntValue extends AbstractValue {

    private int value;

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
            case REAL -> new RealValue(new BigDecimal(this.value, new MathContext(5))).equals(abstractValue);
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
            case REAL -> new RealValue(new BigDecimal(this.value, new MathContext(5))).add((other));
            case RATIONAL -> new RationalValue(new IntValue(this.value), new IntValue(1)).add(other);
            default -> new IntValue(this.value + ((IntValue) other).getValue());
        };
    }

    @Override
    public AbstractValue sub(AbstractValue other) {
        return switch (other.getType()) {
            // TODO: change précision
            case REAL -> new RealValue(new BigDecimal(this.value, new MathContext(5))).sub((other));
            case RATIONAL -> new RationalValue(new IntValue(this.value), new IntValue(1)).sub(other);
            default -> new IntValue(this.value - ((IntValue) other).getValue());
        };
    }

    @Override
    public AbstractValue mul(AbstractValue other) {
        return switch (other.getType()) {
            // TODO: check precision
            case REAL -> new RealValue(new BigDecimal(this.value, new MathContext(5))).mul((other));
            case RATIONAL -> new RationalValue(new IntValue(this.value), new IntValue(1)).mul(other);
            default -> new IntValue(this.value * ((IntValue) other).getValue());
        };
    }

    @Override
    public AbstractValue div(AbstractValue other) {
        switch (other.getType()) {
            case REAL:
                // TODO: check precision
                return new RealValue(new BigDecimal(this.value, new MathContext(5))).div((other));
            case RATIONAL:
                return new RationalValue(new IntValue(this.value), new IntValue(1)).div(other);
        }

        // Check for the type but atm there is only one type
        if (this.value == ((IntValue) other).getValue()) {
            return new IntValue(1);
        }
        if (((IntValue) other).getValue() == 1) {
            return new IntValue(this.value);
        }
        if (this.value % ((IntValue) other).getValue() == 0) {
            return new IntValue(this.value / ((IntValue) other).getValue());
        }
        if (App.isRationalMode()){
            return new RationalValue(this, other);
        }

        return new IntValue(this.value / ((IntValue) other).getValue());
    }

    @Override
    public AbstractValue sqrt() {
        // TODO: Check for precision here
        return new RealValue(new BigDecimal(Double.toString(Math.sqrt(this.value)), new MathContext(5)));
    }

    @Override
    public AbstractValue cos() {
        // TODO: Check for precision here
        return new RealValue(new BigDecimal(Double.toString(Math.cos(this.value)), new MathContext(5)));
    }

    @Override
    public AbstractValue sin() {
        // TODO: Check for precision here
        return new RealValue(new BigDecimal(Double.toString(Math.sin(this.value)), new MathContext(5)));
    }

    @Override
    public AbstractValue ln() {
        // TODO: Check for precision here
        return new RealValue(new BigDecimal(Double.toString(Math.log(this.value)), new MathContext(5)));
    }

    @Override
    public AbstractValue exp() {
        // TODO: Check for precision here
        return new RealValue(new BigDecimal(Double.toString(Math.exp(this.value)), new MathContext(5)));
    }

    @Override
    public AbstractValue atan() {
        // TODO: Check for precision here
        return new RealValue(new BigDecimal(Double.toString(Math.atan(this.value)), new MathContext(5)));
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
