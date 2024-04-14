package back.converter;

import java.util.HashMap;
import java.util.Map;

/**
 * This class provides all conversion methods.
 */
public class Converter {
    /**
     * Holds the conversion factors from all speed units to all speed units.
     */
    private static final Map<Units.Speed, Map<Units.Speed, Float>> speedConversionFactors = new HashMap<>();
    /**
     * Holds the conversion factors from all weight units to all speed units.
     */
    private static final Map<Units.Weight, Map<Units.Weight, Float>> weightConversionFactors = new HashMap<>();
    /**
     * Holds the conversion factors from all distance units to all speed units.
     */
    private static final Map<Units.Distance, Map<Units.Distance, Float>> distanceConversionFactors = new HashMap<>();
    /**
     * Holds the conversion factors from all time units to all speed units.
     */
    private static final Map<Units.Time, Map<Units.Time, Float>> timeConversionFactors = new HashMap<>();

    static {
        initializeSpeedConversionFactors();
        initializeWeightConversionFactors();
        initializeDistanceConversionFactors();
        initializeTimeConversionFactors();
    }

    /**
     * Defines the conversion factors for all speed units.
     */
    private static void initializeSpeedConversionFactors() {
        initializeSpeedConversionFactorsMetersPerSecond();
        initializeSpeedConversionFactorsMetersPerHour();
        initializeSpeedConversionFactorsKilometersPerSecond();
        initializeSpeedConversionFactorsKilometersPerHour();
    }

    /**
     * Initializes the conversion factors for meters per second.
     */
    private static void initializeSpeedConversionFactorsMetersPerSecond() {
        Map<Units.Speed, Float> factors = new HashMap<>();
        factors.put(Units.Speed.METERS_PER_SECOND, 1.0f);
        factors.put(Units.Speed.METERS_PER_HOUR, 3600.0f);
        factors.put(Units.Speed.KILOMETER_PER_SECOND, (float) (1/1000));
        factors.put(Units.Speed.KILOMETER_PER_HOUR, 3.6f);
        speedConversionFactors.put(Units.Speed.METERS_PER_SECOND, factors);
    }

    /**
     * Initializes the conversion factors for meters per hour.
     */
    private static void initializeSpeedConversionFactorsMetersPerHour() {
        Map<Units.Speed, Float> factors = new HashMap<>();
        factors.put(Units.Speed.METERS_PER_SECOND, (float) (1/3600));
        factors.put(Units.Speed.METERS_PER_HOUR, 1.0f);
        factors.put(Units.Speed.KILOMETER_PER_SECOND, (float) (1/3600000));
        factors.put(Units.Speed.KILOMETER_PER_HOUR, (float) (1/1000));
        speedConversionFactors.put(Units.Speed.METERS_PER_HOUR, factors);
    }

    /**
     * Initializes the conversion factors for meters per second.
     */
    private static void initializeSpeedConversionFactorsKilometersPerSecond() {
        Map<Units.Speed, Float> factors = new HashMap<>();
        factors.put(Units.Speed.METERS_PER_SECOND, 1000.0f);
        factors.put(Units.Speed.METERS_PER_HOUR, 3600000.0f);
        factors.put(Units.Speed.KILOMETER_PER_SECOND, 1.0f);
        factors.put(Units.Speed.KILOMETER_PER_HOUR, 3600.0f);
        speedConversionFactors.put(Units.Speed.KILOMETER_PER_SECOND, factors);
    }

    /**
     * Initializes the conversion factors for meters per hour.
     */
    private static void initializeSpeedConversionFactorsKilometersPerHour() {
        Map<Units.Speed, Float> factors = new HashMap<>();
        factors.put(Units.Speed.METERS_PER_SECOND, (float) (1/3.6));
        factors.put(Units.Speed.METERS_PER_HOUR, 1000.0f);
        factors.put(Units.Speed.KILOMETER_PER_SECOND, (float) (1/3600));
        factors.put(Units.Speed.KILOMETER_PER_HOUR, 1.0f);
        speedConversionFactors.put(Units.Speed.KILOMETER_PER_HOUR, factors);
    }

    /**
     * Defines the conversion factors for all weight units.
     */
    private static void initializeWeightConversionFactors() {
        initializeWeightConversionFactorsGram();
        initializeWeightConversionFactorsKilogram();
    }

    /**
     * Initializes the conversion factors for gram.
     */
    private static void initializeWeightConversionFactorsGram() {
        Map<Units.Weight, Float> factors = new HashMap<>();
        factors.put(Units.Weight.GRAM, 1.0f);
        factors.put(Units.Weight.KILOGRAM, (float) (1/1000));
        weightConversionFactors.put(Units.Weight.GRAM, factors);
    }

    /**
     * Initializes the conversion factors for kilogram.
     */
    private static void initializeWeightConversionFactorsKilogram() {
        Map<Units.Weight, Float> factors = new HashMap<>();
        factors.put(Units.Weight.GRAM, 1000.0f);
        factors.put(Units.Weight.KILOGRAM, 1.0f);
        weightConversionFactors.put(Units.Weight.KILOGRAM, factors);
    }

    /**
     * Defines the conversion factors for all distance units.
     */
    private static void initializeDistanceConversionFactors() {
        initializeDistanceConversionFactorsMeter();
        initializeDistanceConversionFactorsKilometer();
    }

    /**
     * Initializes the conversion factors for meter.
     */
    private static void initializeDistanceConversionFactorsMeter() {
        Map<Units.Distance, Float> factors = new HashMap<>();
        factors.put(Units.Distance.METER, 1.0f);
        factors.put(Units.Distance.KILOMETER, (float) (1/1000));
        distanceConversionFactors.put(Units.Distance.METER, factors);
    }

    /**
     * Initializes the conversion factors for kilometer.
     */
    private static void initializeDistanceConversionFactorsKilometer() {
        Map<Units.Distance, Float> factors = new HashMap<>();
        factors.put(Units.Distance.METER, 1000.0f);
        factors.put(Units.Distance.KILOMETER, 1.0f);
        distanceConversionFactors.put(Units.Distance.KILOMETER, factors);
    }

    /**
     * Defines the conversion factors for all time units.
     */
    private static void initializeTimeConversionFactors() {
        initializeTimeConversionFactorsSecond();
        initializeTimeConversionFactorsHour();
    }

    /**
     * Initializes the conversion factors for second.
     */
    private static void initializeTimeConversionFactorsSecond() {
        Map<Units.Time, Float> factors = new HashMap<>();
        factors.put(Units.Time.SECOND, 1.0f);
        factors.put(Units.Time.HOUR, (float) (1/3600));
        timeConversionFactors.put(Units.Time.SECOND, factors);
    }

    /**
     * Initializes the conversion factors for hour.
     */
    private static void initializeTimeConversionFactorsHour() {
        Map<Units.Time, Float> factors = new HashMap<>();
        factors.put(Units.Time.SECOND, 3600.0f);
        factors.put(Units.Time.HOUR, 1.0f);
        timeConversionFactors.put(Units.Time.HOUR, factors);
    }

    /**
     * Retrieve the conversion factor when converting from the first given unit to the second given unit.
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The conversion factor
     */
    private static float getSpeedFactor(Units.Speed from, Units.Speed to) {
        return speedConversionFactors.get(from).get(to);
    }

    /**
     * Retrieve the conversion factor when converting from the first given unit to the second given unit.
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The conversion factor
     */
    private static float getWeightFactor(Units.Weight from, Units.Weight to) {
        return weightConversionFactors.get(from).get(to);
    }

    /**
     * Retrieve the conversion factor when converting from the first given unit to the second given unit.
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The conversion factor
     */
    private static float getDistanceFactor(Units.Distance from, Units.Distance to) {
        return distanceConversionFactors.get(from).get(to);
    }

    /**
     * Retrieve the conversion factor when converting from the first given unit to the second given unit.
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The conversion factor
     */
    private static float getTimeFactor(Units.Time from, Units.Time to) {
        return timeConversionFactors.get(from).get(to);
    }

    /**
     * Converts the given speed from the first given unit to the second given unit.
     * @param value The value to convert
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The converted value
     */
    public static float convertSpeed(float value, Units.Speed from, Units.Speed to) {
        return value * getSpeedFactor(from, to);
    }

    /**
     * Converts the given speed from the first given unit to the second given unit.
     * @param value The value to convert
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The converted value
     */
    public static float convertWeight(float value, Units.Weight from, Units.Weight to) {
        return value * getWeightFactor(from, to);
    }

    /**
     * Converts the given speed from the first given unit to the second given unit.
     * @param value The value to convert
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The converted value
     */
    public static float convertDistance(float value, Units.Distance from, Units.Distance to) {
        return value * getDistanceFactor(from, to);
    }

    /**
     * Converts the given speed from the first given unit to the second given unit.
     * @param value The value to convert
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The converted value
     */
    public static float convertTime(float value, Units.Time from, Units.Time to) {
        return value * getTimeFactor(from, to);
    }
}
