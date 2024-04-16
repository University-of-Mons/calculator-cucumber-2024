package calculator.numbers;

public class MyNotATime extends MyTime {
    public MyNotATime() {
        super(0, 1, 1, 0, 0, 0);
    }

    @Override
    public String toString() {
        return "NaT";
    }
}
