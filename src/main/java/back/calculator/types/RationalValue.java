package back.calculator.types;

public class RationalValue extends AbstractValue {

    private final Type type = Type.RATIONAL;

    private int num;

    private int den;

    public RationalValue(AbstractValue num, AbstractValue den) {
        switch (num.getType()) {
            case INT:
                IntValue intNum = (IntValue) num;
                switch (den.getType()) {
                    case INT:
                        IntValue intDen = (IntValue) den;

                        this.num = intNum.getValue();
                        this.den = intDen.getValue();

                    case RATIONAL:
                        // Invert the den and multiply the numerators
                        // 2 / (1/2) = 2 * (2/1)
                        RationalValue rationalDen = (RationalValue) den;

                        this.num = intNum.getValue() * rationalDen.getDen();
                        this.den = rationalDen.getNum();
                }

            case RATIONAL:
                RationalValue rationalNum = (RationalValue) num;

                switch (den.getType()) {
                    case INT:
                        // Put the denominator to the numerator and make the multiplication with the numerator and the other denominator
                        // (1/2) / 2 = (2/1) * (1/2)
                        IntValue intDen = (IntValue) den;

                        this.num = rationalNum.getNum();
                        this.den = rationalNum.getDen() * intDen.getValue();

                    case RATIONAL:
                        // Same as above but two multiplications
                        RationalValue rationalDen = (RationalValue) den;

                        this.num = rationalNum.getNum() * rationalDen.getDen();
                        this.den = rationalDen.getNum() * rationalNum.getDen();
                }
        }
    }

    // TODO : Implements all the methods
    @Override
    public AbstractValue add(AbstractValue other) {
        return null;
    }

    @Override
    public AbstractValue sub(AbstractValue other) {
        return null;
    }

    @Override
    public AbstractValue mul(AbstractValue other) {
        return null;
    }

    @Override
    public AbstractValue div(AbstractValue other) {
        return null;
    }

    public int getNum(){
        return this.num;
    }

    public int getDen(){
        return this.den;
    }

    @Override
    public boolean isEqualsZero() {
        return false;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
