package back.calculator.types;

public abstract class AbstractValue {

    private Type type;

    public abstract AbstractValue add(AbstractValue other);

    public abstract AbstractValue sub(AbstractValue other);

    public abstract AbstractValue mul(AbstractValue other);

    public abstract AbstractValue div(AbstractValue other);

    public abstract boolean isEqualsZero();

    public Type getType() {
        return type;
    }

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract int hashCode();
}
