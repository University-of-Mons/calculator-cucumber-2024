package back.visitor;

import back.calculator.Expression;
import back.calculator.types.MyNumber;
import back.calculator.Operation;
import back.calculator.types.NotANumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * Evaluation is a concrete visitor that serves to
 * compute and evaluate the results of arithmetic expressions.
 */
public class Evaluator extends Visitor {

    /**
     * The result of the evaluation will be stored in this private variable
     */
    private MyNumber computedValue;

    /**
     * getter method to obtain the result of the evaluation
     *
     * @return an Integer object containing the result of the evaluation
     */
    public MyNumber getResult() {
        return computedValue;
    }

    /**
     * Use the visitor design pattern to visit a number.
     *
     * @param n The number being visited
     */
    @Override
    public void visit(MyNumber n) {
        computedValue = n;
    }

    /**
     * Use the visitor design pattern to visit an operation
     *
     * @param o The operation being visited
     */
    @Override
    public void visit(Operation o) {
        ArrayList<MyNumber> evaluatedArgs = new ArrayList<>();
        //first loop to recursively evaluate each subexpression
        for (Expression a : o.getArgs()) {
            a.accept(this);
            evaluatedArgs.add(computedValue);
        }
        //second loop to accumulate all the evaluated sub results
        MyNumber temp = evaluatedArgs.get(0);
        int max = evaluatedArgs.size();
        if (max == 1) {
            try {
                // unary operation
                computedValue = o.op(temp);
                return;
            } catch (UnsupportedOperationException e) {
                // unary operation not supported
                Logger logger = LoggerFactory.getLogger(Evaluator.class);
                if (logger.isWarnEnabled())
                    logger.warn("{} {}", e.getMessage(), o);
                computedValue = new NotANumber();
                return;
            }
        }
        for (int counter = 1; counter < max; counter++) {
            temp = o.op(temp, evaluatedArgs.get(counter));
        }
        // store the accumulated result
        computedValue = temp;
    }

}
