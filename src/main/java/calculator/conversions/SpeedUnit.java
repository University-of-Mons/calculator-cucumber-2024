package calculator.conversions;

public enum SpeedUnit implements Unit {
    METERS_PER_SECOND(1.0, 0, true),
    KILOMETERS_PER_HOUR(3.6, 0, false),
    MILES_PER_HOUR(2.23694, 0, false),
    FEET_PER_SECOND(3.28084, 0, false),
    KNOT(1.94384, 0, false);

    private final double conversionFactor;
    private final boolean isPowerOfTen;
    private final int offset;

    SpeedUnit(double conversionFactor, int offset, boolean isPowerOfTen) {
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