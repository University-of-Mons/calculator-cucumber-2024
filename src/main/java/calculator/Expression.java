package calculator;

import calculator.operand.MyNumber;
import calculator.operation.Operation;
import visitor.Visitor;

/**
 * Expression is an abstract class that represents arithmetic expressions.
 * It has two concrete subclasses Operation and MyNumber.
 *
 * @see Operation
 * @see MyNumber
 */
public interface Expression<T> {
    /**
     * accept is a method needed to implement the visitor design pattern
     *
     * @param v The visitor object being passed as a parameter
     */
    void accept(Visitor<T> v);
}
