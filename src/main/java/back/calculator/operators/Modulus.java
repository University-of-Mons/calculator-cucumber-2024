package back.calculator.operators;

import back.calculator.Expression;
import back.calculator.IllegalConstruction;
import back.calculator.Notation;
import back.calculator.Operation;
import back.calculator.types.AbstractValue;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;

import java.util.List;

public class Modulus extends Operation {

    public Modulus(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    public Modulus(List<Expression> elist, Notation n) throws IllegalConstruction {
        // Modulus is a unary operator
        super(elist, n);
        if (elist.size() > 1)
            // Modulus is a unary operator
            throw new IllegalConstruction();
        symbol = "|";
        neutral = 1;
    }

    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        throw new UnsupportedOperationException("Modulus is a unary operator");
    }

    @Override
    public MyNumber op(MyNumber l) {
        if (l instanceof NotANumber)
            return new NotANumber();
        // |a + bi| = sqrt(a^2 + b^2)
        AbstractValue a = l.getReal();
        AbstractValue b = l.getImaginary();
        return new MyNumber(a.mul(a).add(b.mul(b)).sqrt());
    }

    @Override
    public void addMoreParams(List<Expression> params) throws IllegalConstruction {
        super.addMoreParams(params);

        if (getArgs().size() > 1)
            throw new IllegalConstruction();
    }
}
