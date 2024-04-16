package calculator.conversions;

public enum CurrencyUnit implements Unit {
    EUR(1.0, 0, true), // Euro
    USD(1.06, 0, false), // United States Dollar
    JPY(164.57, 0, false), // Japanese Yen
    GBP(0.85, 0, false), // British Pound Sterling
    AUD(1.66, 0, false), // Australian Dollar
    CAD(1.47, 0, false), // Canadian Dollar
    CHF(0.97, 0, false), // Swiss Franc
    CNY(7.7, 0, false), // Chinese Yuan
    BEF(40.3399, 0, false); // Belgian Franc

    private final double conversionFactor;
    private final boolean isPowerOfTen;
    private final int offset;

    CurrencyUnit(double conversionFactor, int offset, boolean isPowerOfTen) {
        this.conversionFactor = conversionFactor;
        this.isPowerOfTen = isPowerOfTen;
        this.offset = offset;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }

    public boolean isPowerOfTen() {
        return isPowerOfTen;
    }

    public int getOffset() {
        return offset;
    }
}