package calculator.operators;

import calculator.IllegalConstruction;
import calculator.Operation;
import calculator.numbers.ComplexForm;
import calculator.numbers.ComplexNumber;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;

import java.util.List;
public class IntoPolarForm extends Operation {

    public IntoPolarForm(List<Expression> expressionList) throws IllegalConstruction {
        super(expressionList);
        symbol = "intoPolarForme";
    }


    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        return new MyNotANumber();
    }

    @Override
    public MyNumber op(MyNumber l) {
        if (l instanceof ComplexNumber){
            ((ComplexNumber) l).setForm(ComplexForm.POLAR);
            return l;
        }
        return new MyNotANumber();
    }

}
