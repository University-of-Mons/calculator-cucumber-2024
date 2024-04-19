package calculator.conversions;

public enum TimeUnit implements Unit {
    SECOND(1.0, 0, true),
    MINUTE(0.0166667, 0, false),
    HOUR(0.000277778, 0, false),
    DAY(0.000011574, 0, false),
    MILLISECOND(1000.0, -3, true),
    CENTISECOND(100.0, -2, true),
    DECISECOND(10.0, -1, true),
    DECASECOND(0.1, 1, true),
    HECTOSECOND(0.01, 2, true),
    KILOSECOND(0.001, 3, true);

    private final double conversionFactor;
    private final boolean isPowerOfTen;
    private final int offset;

    TimeUnit(double conversionFactor, int offset, boolean isPowerOfTen) {
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
