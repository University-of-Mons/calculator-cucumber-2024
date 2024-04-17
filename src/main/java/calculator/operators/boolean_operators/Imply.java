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
     * Class constructor specifying,
     * as well as the notation used to represent the operation.
     *
     * @param expressionList The list of Expressions to divide
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

    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        if (l instanceof MyNotANumber || r instanceof MyNotANumber)
            return new MyNotANumber();
        try {
            boolean value = dictionary.get(l.toString()) == Boolean.FALSE || dictionary.get(r.toString()) == Boolean.TRUE;
            return new MyBool(value ? 0 : 1);
        }
        catch (MyBool.InvalidNumberException exception){
            Logger logger = Logger.getLogger(getClass().getName());
            logger.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public OperatorType getType(){
        return type;
    }
}
