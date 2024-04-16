package calculator.conversions;

public enum MassAndWeightUnit implements Unit {
    GRAM(1.0, 0, true),
    KILOGRAM(0.001, 3, true),
    MILLIGRAM(1000.0, -3, true),
    POUND(0.00220462, 0, false),
    OUNCE(0.035274, 0, false),
    NEWTON(0.00981, 0, false),
    POUND_FORCE(0.0022053763, 0, false),;

    private final double conversionFactor;
    private final boolean isPowerOfTen;
    private final int offset;

    MassAndWeightUnit(double conversionFactor, int offset, boolean isPowerOfTen) {
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
