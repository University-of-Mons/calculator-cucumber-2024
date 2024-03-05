package calculator;

public class MyNaN<T> extends Value<T> {
    /**
     * Constructor method
     */
    public MyNaN() {
        super(null);
    }

    @Override
    public String toString() {
        return "NaN";
    }

    @Override
    public boolean equals(Object o) {
        // No object should be equal to null (not including this check can result in an exception if a MyNumber is tested against null)
        if (o == null) return false;

        // If the object is of another type then return false
        return o instanceof MyNaN;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    // TODO : Throw from fucntions ?
    @Override
    public Value<T> plus(Value<T> other) {
        return null;
    }

    @Override
    public Value<T> minus(Value<T> other) {
        return null;
    }

    @Override
    public Value<T> times(Value<T> other) {
        return null;
    }

    @Override
    public Value<T> div(Value<T> other) {
        return null;
    }
}
