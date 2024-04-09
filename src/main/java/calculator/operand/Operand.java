package calculator.operand;

import calculator.Value;

public interface Operand<T> {
    Value<T> plus(Value<T> other);

    Value<T> minus(Value<T> other);

    Value<T> times(Value<T> other);

    Value<T> div(Value<T> other);
}
