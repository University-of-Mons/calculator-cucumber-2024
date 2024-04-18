package back.calculator.types;

import back.calculator.App;

import java.math.BigDecimal;
import java.math.MathContext;

public class RealValue extends AbstractValue{

    private BigDecimal value;

    private final MathContext precision;

    public RealValue(BigDecimal value) {
        this.value = value;
        type = Type.REAL;
        this.precision = App.getPrecision();
    }

    @Override
    public AbstractValue add(AbstractValue other) {
        RealValue result = null;
        switch (other.getType()){
            case INT:
                BigDecimal otherValue = new BigDecimal(((IntValue) other).getValue(), this.precision);
                result = new RealValue(this.value.add(otherValue, this.precision));
                break;

            case REAL:
                result = new RealValue(this.value.add(((RealValue) other).value, this.precision));
                break;

            case RATIONAL:
                BigDecimal otherValueRational = new BigDecimal(((RationalValue) other).getNum()).divide(new BigDecimal(((RationalValue) other).getDen()), this.precision);
                result = new RealValue(this.value.add(otherValueRational, this.precision));
                break;
        }
        return result;
    }

    @Override
    public AbstractValue sub(AbstractValue other) {
        RealValue result = null;
        switch (other.getType()){
            case INT:
                BigDecimal otherValue = new BigDecimal(((IntValue) other).getValue());
                result = new RealValue(this.value.subtract(otherValue, this.precision));
                break;

            case REAL:
                result = new RealValue(this.value.subtract(((RealValue) other).value, this.precision));
                break;

            case RATIONAL:
                BigDecimal otherValueRational = new BigDecimal(((RationalValue) other).getNum()).divide(new BigDecimal(((RationalValue) other).getDen()), this.precision);
                result = new RealValue(this.value.subtract(otherValueRational, this.precision));
                break;
        }
        return result;
    }

    @Override
    public AbstractValue mul(AbstractValue other) {
        RealValue result = null;
        switch (other.getType()){
            case INT:
                BigDecimal otherValue = new BigDecimal(((IntValue) other).getValue());
                result = new RealValue(this.value.multiply(otherValue,this.precision));
                break;

            case REAL:
                result = new RealValue(this.value.multiply(((RealValue) other).value,this.precision));
                break;

            case RATIONAL:
                BigDecimal otherValueRational = new BigDecimal(((RationalValue) other).getNum()).divide(new BigDecimal(((RationalValue) other).getDen()), this.precision);
                result = new RealValue(this.value.multiply(otherValueRational, this.precision));
                break;
        }
        return result;
    }

    @Override
    public AbstractValue div(AbstractValue other) {
        RealValue result = null;
        switch (other.getType()){
            case INT:
                BigDecimal otherValue = new BigDecimal(((IntValue) other).getValue());
                result = new RealValue(this.value.divide(otherValue, this.precision));
                break;

            case REAL:
                result = new RealValue(this.value.divide(((RealValue) other).value, this.precision));
                break;

            case RATIONAL:
                BigDecimal otherValueRational = new BigDecimal(((RationalValue) other).getNum()).divide(new BigDecimal(((RationalValue) other).getDen()), this.precision);
                result = new RealValue(this.value.divide(otherValueRational, this.precision));
                break;
        }
        return result;
    }

    @Override
    public AbstractValue sqrt() {
        return new RealValue(this.value.sqrt(this.precision));
    }

    @Override
    public AbstractValue cos() {
        double longValue = this.value.doubleValue();
        BigDecimal cos = new BigDecimal(Math.cos(longValue), this.precision);
        return new RealValue(cos);
    }

    @Override
    public AbstractValue sin() {
       double longValue = this.value.doubleValue();
       BigDecimal sin = new BigDecimal(Math.sin(longValue), this.precision);
       return new RealValue(sin);
    }

    @Override
    public AbstractValue ln() {
        BigDecimal lnValue = new BigDecimal(Math.log(this.value.doubleValue()), this.precision);
        return new RealValue(lnValue);
    }

    @Override
    public AbstractValue exp() {
        double e = Math.E;
        BigDecimal eValue = new BigDecimal(BigDecimal.valueOf(e).pow(this.value.intValue()).longValueExact(), this.precision);
        return new RealValue(eValue);
    }

    @Override
    public AbstractValue atan() {
        BigDecimal atanValue = new BigDecimal(Math.atan(this.value.doubleValue()), this.precision);
        return new RealValue(atanValue);
    }


    @Override
    public boolean isEqualsZero() {
        return this.value.compareTo(BigDecimal.ZERO) == 0;
    }

    @Override
    public boolean isPositive() {
        return this.value.compareTo(BigDecimal.ZERO) > 0;
    }

    @Override
    public String toString() {
        return this.value.stripTrailingZeros().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this.value == o) return true;
        if (!(o instanceof RealValue)) return false;
        RealValue realValue = (RealValue) o;
        return (this.value).stripTrailingZeros().compareTo(realValue.value.stripTrailingZeros()) == 0;
    }

    @Override
    public int hashCode() {
        return (this.value.hashCode());
    }
}

