package calculator;

import lombok.Getter;
import visitor.Visitor;

/**
 * MyNumber is a concrete class that represents arithmetic numbers,
 * which are a special kind of Expressions, just like operations are.
 *
 * @see Expression
 * @see Operation
 */
@Getter
public abstract class Value<T> implements Expression<T>, Operand<T> {

    /**
     * -- GETTER --
     *  getter method to obtain the value contained in the object
     */
    private final T val;

    /**
     * Constructor method
     *
     * @param v The integer value to be contained in the object
     */
    protected  /*constructor*/ Value(T v) {
        val = v;
    }

    /**
     * accept method to implement the visitor design pattern to traverse arithmetic expressions.
     * Each number will pass itself to the visitor object to get processed by the visitor.
     *
     * @param v The visitor object
     */
    public void accept(Visitor<T> v) {
        v.visit(this);
    }


    /**
     * The depth of a number expression is always 0
     *
     * @return The depth of a number expression
     */
    public int countDepth() {
        return 0;
    }

    /**
     * The number of operations contained in a number expression is always 0
     *
     * @return The number of operations contained in a number expression
     */
    public int countOps() {
        return 0;
    }

    /**
     * The number of numbers contained in a number expression is always 1
     *
     * @return The number of numbers contained in  a number expression
     */
    public int countNbs() {
        return 1;
    }

    @Override
    public abstract String toString();

    public abstract boolean equals(Object o);


    @Override
    public abstract int hashCode();

}
