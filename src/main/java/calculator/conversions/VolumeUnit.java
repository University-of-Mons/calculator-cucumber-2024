package calculator.conversions;

public enum VolumeUnit implements Unit {
    CUBICMETER(1.0, 0, true),
    LITER(1000.0, -3, true),
    MILLILITER(1000000.0, -6, true),
    GALLON(264.172, 0, false),
    CUBICFOOT(35.3147, 0, false),
    CUBICYARD(1.30795, 0, false),
    BARREL(6.28981, 0, false),
    CUBICINCH(61023.7, 0, false),
    CUBICCENTIMETER(1000000.0, -6, true),
    CENTILITER(100000.0, -5, true),
    DECILITER(10000.0, -4, true),
    DECALITER(100.0, -2, true),
    HECTOLITER(10.0, -1, true),
    KILOLITER(1.0, 0, true);

    private final double conversionFactor;
    private final boolean isPowerOfTen;
    private final int offset;

    VolumeUnit(double conversionFactor, int offset, boolean isPowerOfTen) {
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