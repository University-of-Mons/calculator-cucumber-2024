package calculator.numbers;

import calculator.numbers.MyNumber;

/**
 * MyNotANumber is a class that extends MyNumber.
 * It represents a non-numeric value (NaN) in the context of the calculator.
 *
 * @see MyNumber
 */
public class MyNotANumber extends MyNumber {

    /**
     * Default constructor.
     */
    public MyNotANumber() {
        super(0);
    }

    /**
     * Convert a NaN into a String to allow it to be printed.
     *
     * @return The string "NaN".
     */
    @Override
    public String toString() {
        return "NaN";
    }
}