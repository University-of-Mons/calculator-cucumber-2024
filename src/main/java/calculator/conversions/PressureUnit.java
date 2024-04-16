package calculator.conversions;

public enum PressureUnit implements Unit {
    PASCAL(1.0, 0, true),
    KILOPASCAL(0.001, 3, true),
    MEGAPASCAL(0.000001, 6, true),
    BAR(0.00001, 5, true),
    MILLIBAR(0.01, 2, true),
    ATMOSPHERE(0.0000098692, 0, false),
    TORR(0.00750062, 0, false),
    PSI(0.000145038, 0, false),;

    private final double conversionFactor;
    private final boolean isPowerOfTen;
    private final int offset;

    PressureUnit(double conversionFactor, int offset, boolean isPowerOfTen) {
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