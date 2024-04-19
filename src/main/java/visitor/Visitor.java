package visitor;

import calculator.MyNumber;
import calculator.Not;
import calculator.Operation;
import calculator.Value;
import calculator.operation.Operation;

/**
 * Visitor design pattern
 */
public abstract class Visitor<T> {

    /**
     * The Visitor can traverse a number (a subtype of Expression)
     *
     * @param n The number being visited
     */
    public abstract void visit(Value<T> n);

    /**
     * The Visitor can traverse an operation (a subtype of Expression)
     *
     * @param o The operation being visited
     */   public abstract void visit(Operation<T> o);

    /**
     * The Visitor can traverse a Not operation (a subtype of Expression)
     *
     * @param n The Not operation being visited
     */
    public abstract void visit(Not n);

}
