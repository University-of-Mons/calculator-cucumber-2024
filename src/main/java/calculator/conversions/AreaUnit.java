package calculator.conversions;

public enum AreaUnit implements Unit {
    SQUAREMETER(1.0, 0, true),
    SQUAREKILOMETER(0.000001, 6, true),
    SQUARECENTIMETER(10000.0, -4, true),
    SQUAREMILLIMETER(1000000.0, -6, true),
    HECTARE(0.0001, 4, true),
    SQUAREFOOT(10.7639, 0, false),
    SQUAREINCH(1550.0, 0, false),
    ACRE(0.000247105, 0, false),
    ARE(0.01, 2, true),
    SQUAREMILE(0.000000386102, 0, false),
    SQUAREYARD(1.19599, 0, false);

    private final double conversionFactor;
    private final boolean isPowerOfTen;
    private final int offset;

    AreaUnit(double conversionFactor, int offset, boolean isPowerOfTen) {
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
