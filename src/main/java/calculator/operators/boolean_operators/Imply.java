package calculator.operators.boolean_operators;

import calculator.IllegalConstruction;
import calculator.Operation;
import calculator.numbers.Expression;
import calculator.numbers.MyBool;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;
import calculator.operators.OperatorType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Imply extends Operation {

    private final Map<String, Boolean> dictionary = new HashMap<>();
    public static final OperatorType type = OperatorType.BINARY;


    /**
     * Class constructor specifying a number of Expressions to apply the IMPL operation on,
     * as well as the notation used to represent the operation.
     *
     * @param expressionList The list of Expressions
     * @throws IllegalConstruction  If an empty list of expressions if passed as parameter
     * @see #Imply(List)
     * @see Operation#Operation(List)
     */
    public Imply(List<Expression> expressionList) throws IllegalConstruction {
        super(expressionList);
        dictionary.put("0", Boolean.TRUE);
        dictionary.put("1", Boolean.FALSE);
        symbol = "IMPL";
        neutral = 0;
    }

    /**
     * The actual computation of the (binary) boolean IMPLY operation of two boolean.
     * If either of the numbers is a MyNotANumber instance, the method returns a new MyNotANumber instance.
     * If either of the numbers is different from 0 or 1, the method throws and catch an InvalidNumberException and returns a new
     * MyNotANumber instance.
     *
     * @param l The first number.
     * @param r The second number.
     * @return The result of the IMPLY operation, or a new MyNotANumber if either input number is a MyNotANumber or either
     * number is greater than 1.
     */
    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        if (l instanceof MyNotANumber || r instanceof MyNotANumber)
            return new MyNotANumber();
        try {
            if (l.getValue() > 1 || r.getValue() > 1){
                throw new MyBool.InvalidNumberException("Invalid number entered. Number should be either 0 or 1.");
            }
            boolean value = dictionary.get(l.toString()) == Boolean.FALSE || dictionary.get(r.toString()) == Boolean.TRUE;
            return new MyBool(value ? 0 : 1);
        }
        catch (MyBool.InvalidNumberException exception){
            Logger logger = Logger.getLogger(getClass().getName());
            logger.info(exception.getMessage());
            return new MyNotANumber();
        }
    }

    /**
     *The type of the operator.
     *
     * @return the type (unary or binary) of the operator.
     */
    @Override
    public OperatorType getType(){
        return type;
    }
}
