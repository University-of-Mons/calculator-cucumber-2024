package back.calculator.types;

public abstract class AbstractValue {

    private Type type;

    public abstract AbstractValue add(AbstractValue other);

    public abstract AbstractValue sub(AbstractValue other);

    public abstract AbstractValue mul(AbstractValue other);

    public abstract AbstractValue div(AbstractValue other);

    public abstract AbstractValue sqrt();

    public abstract boolean isEqualsZero();

    public abstract boolean isPositive();

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract int hashCode();
}
