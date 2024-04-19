package calculator.conversions;

public enum EnergyUnit implements Unit {
    JOULE(1.0, 0, true),
    KILOJOULE(0.001, 3, true),
    CALORIE(0.239006, 0, false),
    KILOCALORIE(0.000239006, 0, false),
    WATTHOUR(0.000277778, 0, false),
    KILOWATTHOUR(0.000000277778, 0, false),
    BRITISHTHERMALUNIT(0.000947817, 0, false);

    private final double conversionFactor;
    private final boolean isPowerOfTen;
    private final int offset;

    EnergyUnit(double conversionFactor, int offset, boolean isPowerOfTen) {
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
