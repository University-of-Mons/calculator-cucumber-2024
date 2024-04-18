package back.calculator.operators;

import back.calculator.Expression;
import back.calculator.IllegalConstruction;
import back.calculator.Notation;
import back.calculator.Operation;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;

import java.util.List;

public class Logarithm extends Operation {

    public Logarithm(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    public Logarithm(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        if (elist.size() > 1)
            throw new IllegalConstruction();
        symbol = "ln";
        neutral = 0;
    }

    @Override
    public MyNumber op(MyNumber l, MyNumber r){
        throw new UnsupportedOperationException("Logarithm is a unary operator");
    }

    @Override
    public MyNumber op(MyNumber l){
        if (l instanceof NotANumber)
            return new NotANumber();
        if (!l.getReal().isPositive())
            return new NotANumber();
        if (l.isImaginary())
            return new NotANumber();
        return new MyNumber(l.getReal().ln());
    }

    @Override
    public void addMoreParams(List<Expression> params) throws IllegalConstruction {
        super.addMoreParams(params);

        if (getArgs().size() > 1)
            throw new IllegalConstruction();
    }
}
