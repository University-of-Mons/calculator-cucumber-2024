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

public class Not extends Operation {

    private final Map<String, Boolean> dictionary = new HashMap<>();
    private final OperatorType type = OperatorType.UNARY;

    /**
     * Class constructor specifying,
     * as well as the notation used to represent the operation.
     *
     * @param expressionList The list of Expressions to divide
     * @throws IllegalConstruction  If an empty list of expressions if passed as parameter
     * @see #Not(List)
     * @see Not#Not(List)
     */
    public Not(List<Expression> expressionList) throws IllegalConstruction {
        super(expressionList);
        dictionary.put("0", Boolean.TRUE);
        dictionary.put("1", Boolean.FALSE);
        symbol = "NOT";
        neutral = 0;
    }

    @Override
    public MyNumber op(MyNumber l){
        if (l instanceof MyNotANumber)
            return new MyNotANumber();
        try {
            return new MyBool(dictionary.get(l.toString()) == Boolean.TRUE ? 1 : 0);
        }
        catch (MyBool.InvalidNumberException exception){
            Logger logger = Logger.getLogger(getClass().getName());
            logger.info(exception.getMessage());
            return new MyNotANumber();
        }
    }

    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        Logger logger = Logger.getLogger(getClass().getName());
        logger.info("Not is an unary operator, keeping only the first number");
        return op(l);
    }

    @Override
    public OperatorType getType(){
        return type;
    }
}
