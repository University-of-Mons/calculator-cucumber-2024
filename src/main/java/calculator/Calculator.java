package calculator;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import visitor.Evaluator;
import visitor.Printer;

/**
 * This class represents the core logic of a Calculator.
 * It can be used to print and evaluate artihmetic expressions.
 *
 * @author tommens
 */
@Slf4j
@NoArgsConstructor
public class Calculator<T> {

    /*
     For the moment the calculator only contains a print method and an eval method
     It would be useful to complete this with a read method, so that we would be able
     to implement a full REPL cycle (Read-Eval-Print loop) such as in Scheme, Python, R and other languages.
     To do so would require to implement a method with the following signature, converting an input string
     into an arithmetic expression:
     public Expression read(String s)
    */

    /**
     * Prints an arithmetic expression provided as input parameter.
     *
     * @param e the arithmetic Expression to be printed
     * @see #printExpressionDetails(Expression)
     */
    public void print(Expression<T> e, Notation n) {
        Printer<T> v = new Printer<>(n);
        e.accept(v);

        log.info("The result of evaluating expression {}%nis; {}.",v.getResult(),eval(e));
    }

    public void print(Expression<T> e) {
        Notation n = Notation.INFIX;
        print(e, n);
    }


    /**
     * Prints verbose details of an arithmetic expression provided as input parameter.
     *
     * @param e the arithmetic Expression to be printed
     * @see #print(Expression)
     */
    public void printExpressionDetails(Expression<T> e) {
        print(e);
        log.info("It contains {} levels of nested expressions, {} operations and {} numbers.",e.countDepth(),e.countOps(),e.countNbs());
    }

    /**
     * Evaluates an arithmetic expression and returns its result
     *
     * @param expr the arithmetic Expression to be evaluated
     * @return The result of the evaluation
     */
    public Value<T> eval(Expression<T> expr) {
        try {
            // create a new visitor to evaluate expressions
            Evaluator<T> v = new Evaluator<>();
            // and ask the expression to accept this visitor to start the evaluation process
            expr.accept(v);
            // and return the result of the evaluation at the end of the process
            return v.getResult();
        } catch (ArithmeticException e) {
            return new MyNaN<>();
        }

    }

    /*
     We could also have other methods, e.g. to verify whether an expression is syntactically correct
     public Boolean validate(Expression e)
     or to simplify some expression
     public Expression simplify(Expression e)
    */
}
