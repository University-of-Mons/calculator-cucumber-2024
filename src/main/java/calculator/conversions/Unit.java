package calculator.conversions;

public interface Unit {
    double getConversionFactor();
    boolean isPowerOfTen();
    int getOffset();
}
