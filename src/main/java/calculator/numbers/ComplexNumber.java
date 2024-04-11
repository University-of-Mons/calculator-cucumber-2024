package calculator.numbers;

public class ComplexNumber extends MyNumber{
    private final int imaginary;

    public ComplexNumber(int real, int imaginary) {
        super(real);
        this.imaginary = imaginary;
    }


    public int getReal() {
        return this.getValue();
    }

    public int getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return this.getReal() + " + " + imaginary+ "i";
    }


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

    @Override
    public int hashCode() {
        return this.getReal() + this.imaginary;
    }
}