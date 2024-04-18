package back.calculator.operators;

import back.calculator.Expression;
import back.calculator.IllegalConstruction;
import back.calculator.Notation;
import back.calculator.Operation;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;

import java.util.List;

public class Cosine extends Operation {

    public Cosine(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    public Cosine(List<Expression> elist, Notation n) throws IllegalConstruction {
        // Modulus is a unary operator
        super(elist, n);
        if (elist.size() > 1)
            // Modulus is a unary operator
            throw new IllegalConstruction();
        symbol = "cos";
        neutral = 1;
    }

    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        throw new UnsupportedOperationException("Cosine is a unary operator");
    }

    @Override
    public MyNumber op(MyNumber l) {
        if (l instanceof NotANumber)
            return new NotANumber();
        if (l.isImaginary())
            throw new UnsupportedOperationException("Cosine is not defined for complex numbers in this calculator");

        return new MyNumber(l.getReal().cos());
    }

    @Override
    public void addMoreParams(List<Expression> params) throws IllegalConstruction {
        super.addMoreParams(params);

        if (getArgs().size() > 1)
            throw new IllegalConstruction();
    }
}
