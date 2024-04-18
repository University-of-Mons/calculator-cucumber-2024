package back.calculator.operators;

import back.calculator.Expression;
import back.calculator.IllegalConstruction;
import back.calculator.Notation;
import back.calculator.Operation;
import back.calculator.types.AbstractValue;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;

import java.util.List;

public class Exponential extends Operation {

    public Exponential(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    public Exponential(List<Expression> elist, Notation n) throws IllegalConstruction {
        // Modulus is a unary operator
        super(elist, n);
        if (elist.size() > 1)
            // Modulus is a unary operator
            throw new IllegalConstruction();
        symbol = "exp";
        neutral = 1;
    }

    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        throw new UnsupportedOperationException("Exponential is a unary operator");
    }

    @Override
    public MyNumber op(MyNumber l) {
        if (l instanceof NotANumber)
            return new NotANumber();
        if (l.isImaginary()) {
            // e^(a + bi) = e^a * e^(bi) = e^a * (cos(b) + i sin(b))
            AbstractValue a = l.getReal();
            AbstractValue b = l.getImaginary();
            return new MyNumber(a.exp().mul(b.cos()), (a.exp().mul(b.sin())));
        }

        return new MyNumber(l.getReal().exp());
    }

    @Override
    public void addMoreParams(List<Expression> params) throws IllegalConstruction {
        super.addMoreParams(params);

        if (getArgs().size() > 1)
            throw new IllegalConstruction();
    }
}
