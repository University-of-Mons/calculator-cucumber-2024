package calculator;

import calculator.parser.CalculatorLexer;
import calculator.parser.CalculatorParser;
import calculator.parser.VisitorParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import visitor.Evaluator;
import visitor.Printer;

/**
 * This class represents the core logic of a Calculator.
 * It can be used to print and evaluate artihmetic expressions.
 *
 * @author tommens
 */
public class Calculator {

    /**
     * Default constructor of the class.
     * Does nothing since the class does not have any variables that need to be initialised.
     */
    public Calculator() {
    }

    /**
     * The read method is implemented with ANTLR4 parser.
     * We construct the AST with ANTLR4 and convert it into a valid expression
     * that the calculator can use.
     * @param s the string to parse
     * @return a new Expression
     */
    public Expression read(String s) {
        CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromString(s));
        CalculatorParser parser = new CalculatorParser(new CommonTokenStream(lexer));
        return parser.init().accept(new VisitorParser());
    }

    /**
     * Prints an arithmetic expression provided as input parameter.
     *
     * @param e the arithmetic Expression to be printed
     * @see #printExpressionDetails(Expression)
     */
    public void print(Expression e, Notation n) {
        Printer v = new Printer(n);
        e.accept(v);

        System.out.println("The result of evaluating expression " + v.getResult());
        System.out.println("is: " + eval(e) + ".");
        System.out.println();
    }

    public void print(Expression e) {
        Notation n = Notation.INFIX;
        print(e, n);
    }


    /**
     * Prints verbose details of an arithmetic expression provided as input parameter.
     *
     * @param e the arithmetic Expression to be printed
     * @see #print(Expression)
     */
    public void printExpressionDetails(Expression e) {
        print(e);
        System.out.print("It contains " + e.countDepth() + " levels of nested expressions, ");
        System.out.print(e.countOps() + " operations");
        System.out.println(" and " + e.countNbs() + " numbers.");
        System.out.println();
    }

    /**
     * Evaluates an arithmetic expression and returns its result
     *
     * @param e the arithmetic Expression to be evaluated
     * @return The result of the evaluation
     */
    public MyNumber eval(Expression e) {
        try {
            // create a new visitor to evaluate expressions
            Evaluator v = new Evaluator();
            // and ask the expression to accept this visitor to start the evaluation process
            e.accept(v);
            // and return the result of the evaluation at the end of the process
            return new MyNumber(v.getResult());
        }
        catch (ArithmeticException _e){
            return new MyNaN();
        }

    }

    /*
     We could also have other methods, e.g. to verify whether an expression is syntactically correct
     public Boolean validate(Expression e)
     or to simplify some expression
     public Expression simplify(Expression e)
    */
}
