package calculator.conversions;

public enum PowerUnit implements Unit {
    WATT(1.0, 0, true),
    KILOWATT(0.001, 3, true),
    MILLIWATT(1000.0, -3, true),
    HORSEPOWER(0.00134102, 0, false),
    FOOT_POUND_PER_MINUTE(44.2537, 0, false),
    BTU_PER_HOUR(3.412142, 0, false),
    TON_OF_REFRIGERATION(0.000284345, 0, false);

    private final double conversionFactor;
    private final boolean isPowerOfTen;
    private final int offset;

    PowerUnit(double conversionFactor, int offset, boolean isPowerOfTen) {
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
