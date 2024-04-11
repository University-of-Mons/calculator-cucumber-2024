package calculator.numbers;

/**
 * MyNotANumber is a class that extends MyNumber.
 * It represents a non-numeric value (NaN) in the context of the calculator.
 *
 * @see MyNumber
 */
public class NotComplexNumber extends ComplexNumber{

    /**
     * Default constructor.
     */
    public NotComplexNumber() {
        super(0,0);
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