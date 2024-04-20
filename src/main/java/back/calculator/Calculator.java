package back.calculator;

import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;
import back.visitor.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * This class represents the core logic of a Calculator.
 * It can be used to print and evaluate arithmetic expressions.
 *
 * @author tommens
 */
public class Calculator {

    // Logger of the calculator : Use it to log messages coming from operations
    private static final Logger LOGGER = LoggerFactory.getLogger(Calculator.class);
    // The parser used to parse arithmetic expressions
    private final ExpressionParser parser;

    /**
     * Get the Logger of the calculator. (use it to log messages from operations and evaluations)
     * @return the Logger of the calculator
     */
    public static Logger getLogger() {
        return LOGGER;
    }

    /**
     * Class constructor - creates a new Calculator with a specific parser
     */
    public Calculator() {
        parser = new ExpressionParser();
    }

    /**
     * Evaluates an arithmetic expression and returns its result
     *
     * @param e the arithmetic Expression to be evaluated
     * @return The result of the evaluation
     */
    public MyNumber eval(Expression e) {
        // create a new visitor to evaluate expressions
        Evaluator v = new Evaluator();
        // and ask the expression to accept this visitor to start the evaluation process
        e.accept(v);

        // if the result is not a number, log a warning
        if (v.getResult() instanceof NotANumber) {
            LOGGER.warn("The result of the evaluation of {} is NaN", e);
        }

        // and return the result of the evaluation at the end of the process
        return v.getResult();
    }

    /**
     * Parse the string s and return the corresponding expression
     * @param s the string to parse
     * @return the corresponding {@link Expression}
     */
    public Expression read(String s) {
        try {
            return parser.parse(s);
        } catch (IllegalConstruction illegalConstruction) {
            return new NotANumber();
        }
    }

    public String format(Expression e, Notation notation) {
        Printer visitor = new Printer(notation);
        e.accept(visitor);
        return visitor.getComputedValue();
    }

    public int depth(Expression e) {
        Diver visitor = new Diver();
        e.accept(visitor);
        return visitor.getDepth();
    }

    public int numbersCount(Expression e) {
        Mathematician visitor = new Mathematician();
        e.accept(visitor);
        return visitor.getNumbersCount();
    }

    public int operationsCount(Expression e) {
        Logician visitor = new Logician();
        e.accept(visitor);
        return visitor.getOperationsCount();
    }
}
