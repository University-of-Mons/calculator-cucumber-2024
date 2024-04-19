package calculator.conversions;

public enum TemperatureUnit implements Unit {
    CELSIUS,
    FAHRENHEIT,
    KELVIN;

    @Override
    public double getConversionFactor() {
        return 0;
    }

    @Override
    public boolean isPowerOfTen() {
        return false;
    }

    @Override
    public int getOffset() {
        return 0;
    }
}
