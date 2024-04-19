package calculator.conversions;

public enum LengthUnit implements Unit {
    METER(1.0, 0, true),
    CENTIMETER(100.0, -2, true),
    KILOMETER(0.001, 3, true),
    MILLIMETER(1000.0, -3, true),
    INCH(39.3701, 0, false),
    FOOT(3.28084, 0, false),
    YARD(1.09361, 0, false),
    MILE(0.000621371, 0, false),
    NAUTICAL_MILE(0.000539957, 0, false),
    DECAMETER(0.1, 1, true),
    HECTOMETER(0.01, 2, true),
    DECIMETER(10.0, -1, true);

    private final double conversionFactor;
    private final boolean isPowerOfTen;
    private final int offset;

    LengthUnit(double conversionFactor, int offset, boolean isPowerOfTen) {
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
