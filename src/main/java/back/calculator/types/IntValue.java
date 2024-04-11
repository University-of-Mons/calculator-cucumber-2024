package back.calculator.types;

import back.calculator.App;

public class IntValue extends AbstractValue {
    private final Type type = Type.INT;

    private int value;

    public IntValue(int value) {
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
        if (!(o instanceof IntValue)) return false;
        IntValue intValue = (IntValue) o;
        return value == intValue.value;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }

    @Override
    public AbstractValue add(AbstractValue other) {
        // Check for the type but atm there is only one type
        return new IntValue(this.value + ((IntValue) other).getValue());
    }

    @Override
    public AbstractValue sub(AbstractValue other) {
        // Check for the type but atm there is only one type
        return new IntValue(this.value - ((IntValue) other).getValue());
    }

    @Override
    public AbstractValue mul(AbstractValue other) {
        // Check for the type but atm there is only one type
        return new IntValue(this.value * ((IntValue) other).getValue());
    }

    @Override
    public AbstractValue div(AbstractValue other) {
        // Check for the type but atm there is only one type

        if (App.isRationalMode()){
            return new RationalValue(this, other);
        }

        return new IntValue(this.value / ((IntValue) other).getValue());
    }

    @Override
    public AbstractValue sqrt() {
        // This should return a double but atm there is only int type available
        return new IntValue((int) Math.sqrt(this.value));
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
