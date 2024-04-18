package back.calculator.operators;

import back.calculator.Expression;
import back.calculator.IllegalConstruction;
import back.calculator.Notation;
import back.calculator.Operation;
import back.calculator.types.AbstractValue;
import back.calculator.types.IntValue;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;

import java.util.List;

public class Sqrt extends Operation {

    public Sqrt(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    public Sqrt(List<Expression> elist, Notation n) throws IllegalConstruction {
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
            // sqrt(a + bi) = sqrt((|a+bi| + a)/2 ) + i (sqrt((|a+bi| - a)/2))
            AbstractValue a = l.getReal();
            AbstractValue b = l.getImaginary();
            AbstractValue modulus = a.mul(a).add(b.mul(b)).sqrt();

            AbstractValue real = modulus.add(a).div(new IntValue(2));
            AbstractValue imaginary = modulus.sub(a).div(new IntValue(2));

            return new MyNumber(real.sqrt(), imaginary.sqrt());
        }

        if (!l.getReal().isPositive()){
            AbstractValue value = l.getReal().mul(new IntValue(-1));
            return new MyNumber(new IntValue(0), value.sqrt());
        }
        return new MyNumber(l.getReal().sqrt());
    }

    @Override
    public void addMoreParams(List<Expression> params) throws IllegalConstruction {
        super.addMoreParams(params);

        if (getArgs().size() > 1)
            throw new IllegalConstruction();
    }
}
