package calculator;

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
        try {
            System.out.println("is: " + eval(e) + ".");
        }catch (ArithmeticException ex) {
            System.out.println("is: NaN.");
        }
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
        System.out.print("It contains " + e.countDepth() + " levels of nested expressions, ");
        System.out.print(e.countOps() + " operations");
        System.out.println(" and " + e.countNbs() + " numbers.");
        System.out.println();
    }

    /**
     * Evaluates an arithmetic expression and returns its result
     * @param e the arithmetic Expression to be evaluated
     * @return The result of the evaluation
     */
    public int eval(Expression e) throws ArithmeticException{
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
