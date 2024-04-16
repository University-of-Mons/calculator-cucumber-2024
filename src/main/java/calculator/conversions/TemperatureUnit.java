package calculator.conversions;

public enum TemperatureUnit {//TODO separate handling
    KELVIN(1.0),
    CELSIUS(273.15),
    FAHRENHEIT(255.372);

    private final double conversionFactor;

    TemperatureUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }
}
