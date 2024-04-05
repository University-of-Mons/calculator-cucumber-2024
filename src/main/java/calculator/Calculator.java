package calculator;

import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import visitor.CountingVisitor;
import visitor.Evaluator;
import visitor.ExpressionVisitor;

/**
 * This class represents the core logic of a Calculator.
 * It can be used to print and evaluate arithmetic expressions.
 *
 * @author tommens
 */
public class Calculator {

    /**
     * Default constructor of the class.
     * Does nothing since the class does not have any variables that need to be initialised.
     */
    public Calculator() {
        // Nothing to be done
    }

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
     * @param e the arithmetic Expression to be printed
     * @param notation the notation to be used
     * @see #printExpressionDetails(Expression, Notation)
     */

    public void print(Expression e, Notation notation) {
        ExpressionVisitor ev = new ExpressionVisitor();
        ev.setNotation(notation);
        e.accept(ev);
        System.out.println("The result of evaluating expression " + ev.getExpression());
        System.out.println("is: " + eval(e) + ".");
        System.out.println();
    }

    /**
     * Prints verbose details of an arithmetic expression provided as input parameter.
     * @param e the arithmetic Expression to be printed
     * @param n the notation to be used
     * @see #print(Expression, Notation)
     */
    public void printExpressionDetails(Expression e, Notation n) {
        print(e,n);
        CountingVisitor cv = new CountingVisitor();
        cv.setMode(Counting.DEPTH);
        e.accept(cv);
        System.out.print("It contains " + cv.getValue() + " levels of nested expressions, ");
        cv.setMode(Counting.COUNT_OPS);
        e.accept(cv);
        System.out.print(cv.getValue() + " operations");
        cv.setMode(Counting.COUNT_NBS);
        e.accept(cv);
        System.out.println(" and " + cv.getValue() + " numbers.");
        System.out.println();
    }

    /**
     * Evaluates an arithmetic expression and returns its result
     * @param e the arithmetic Expression to be evaluated
     * @return The result of the evaluation
     */
    public MyNumber eval(Expression e) {
        // create a new visitor to evaluate expressions
        Evaluator v = new Evaluator();
        // and ask the expression to accept this visitor to start the evaluation process
        e.accept(v);
        // and return the result of the evaluation at the end of the process
        return v.getResult();
    }

    /*
     We could also have other methods, e.g. to verify whether an expression is syntactically correct
     public Boolean validate(Expression e)
     or to simplify some expression
     public Expression simplify(Expression e)
    */
}
