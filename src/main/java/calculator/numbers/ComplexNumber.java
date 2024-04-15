package calculator.numbers;

/**
 * ComplexNumber is a class that extends MyNumber.
 * It represents a complex number in the context of the calculator.
 *
 * @see MyNumber
 *
 */
public class ComplexNumber extends MyNumber{
    private final float imaginary;

    /**
     * Constructor for the ComplexNumber class.
     *
     * @param real The real part of the complex number
     * @param imaginary The imaginary part of the complex number
     */
    public ComplexNumber(float real, float imaginary) {
        super(real);
        this.imaginary = imaginary;
    }




    /**
     * Getter method to obtain the real part of the complex number
     *
     * @return The floating number that represents the real part of the complex number
     */
    @Override
    public float getReal() {
        return this.getValue();
    }

    /**
     * Getter method to obtain the imaginary part of the complex number
     *
     * @return The floating number that represents the imaginary part of the complex number
     */
    @Override
    public float getImaginary() {
        return imaginary;
    }

    /**
     * Convert a complex number into a String to allow it to be printed.
     *
     * @return The String that is the result of the conversion.
     */
    @Override
    public String toString() {
        return (int) this.getReal() + " + " + (int) this.getImaginary()+ "i";
    }

    /**
     * Method to compare two complex numbers.
     *
     * @param other The object to compare to
     * @return True if the two complex numbers are equal, false otherwise
     */
    @Override
    public boolean equals(Object other) {
        // No object should be equal to null (not including this check can result in an exception if a MyNumber is tested against null)
        if (other == null) return false;

        // If the object is compared to itself then return true
        if (other == this) {
            return true;
        }

        // If the object is of another type then return false
        if (!(other instanceof ComplexNumber)) {
            return false;
        }
        return this.getReal() == ((ComplexNumber)other).getReal() && this.imaginary == ((ComplexNumber)other).imaginary;
    }

    /**
     * Method to compute the hash code of a complex number.
     *
     * @return The hash code of the complex number
     */
    @Override
    public int hashCode() {
        return (int) (this.getReal() + this.imaginary);
    }
}