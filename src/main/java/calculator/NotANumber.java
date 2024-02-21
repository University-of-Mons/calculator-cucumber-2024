package calculator;

public class NotANumber extends MyNumber {

    public NotANumber() {
        super(-1);
    }


    @Override
    public String toString() {
        return "NaN";
    }
}
