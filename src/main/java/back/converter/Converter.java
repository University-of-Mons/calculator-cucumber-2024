package back.converter;

import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        factors.put(Units.Speed.METERS_PER_SECOND, 1f);
        factors.put(Units.Speed.METERS_PER_HOUR, 3600f);
        factors.put(Units.Speed.KILOMETER_PER_SECOND, 1f/1000);
        factors.put(Units.Speed.KILOMETER_PER_HOUR, 3.6f);
        speedConversionFactors.put(Units.Speed.METERS_PER_SECOND, factors);
    }

    /**
     * Initializes the conversion factors for meters per hour.
     */
    private static void initializeSpeedConversionFactorsMetersPerHour() {
        Map<Units.Speed, Float> factors = new HashMap<>();
        factors.put(Units.Speed.METERS_PER_SECOND, 1f/3600);
        factors.put(Units.Speed.METERS_PER_HOUR, 1f);
        factors.put(Units.Speed.KILOMETER_PER_SECOND, 1f/3600000);
        factors.put(Units.Speed.KILOMETER_PER_HOUR, 1f/1000);
        speedConversionFactors.put(Units.Speed.METERS_PER_HOUR, factors);
    }

    /**
     * Initializes the conversion factors for meters per second.
     */
    private static void initializeSpeedConversionFactorsKilometersPerSecond() {
        Map<Units.Speed, Float> factors = new HashMap<>();
        factors.put(Units.Speed.METERS_PER_SECOND, 1000f);
        factors.put(Units.Speed.METERS_PER_HOUR, 3600000f);
        factors.put(Units.Speed.KILOMETER_PER_SECOND, 1f);
        factors.put(Units.Speed.KILOMETER_PER_HOUR, 3600f);
        speedConversionFactors.put(Units.Speed.KILOMETER_PER_SECOND, factors);
    }

    /**
     * Initializes the conversion factors for meters per hour.
     */
    private static void initializeSpeedConversionFactorsKilometersPerHour() {
        Map<Units.Speed, Float> factors = new HashMap<>();
        factors.put(Units.Speed.METERS_PER_SECOND, 1f/3.6f);
        factors.put(Units.Speed.METERS_PER_HOUR, 1000f);
        factors.put(Units.Speed.KILOMETER_PER_SECOND, 1f/3600f);
        factors.put(Units.Speed.KILOMETER_PER_HOUR, 1f);
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
        factors.put(Units.Weight.GRAM, 1f);
        factors.put(Units.Weight.KILOGRAM, 1f/1000);
        weightConversionFactors.put(Units.Weight.GRAM, factors);
    }

    /**
     * Initializes the conversion factors for kilogram.
     */
    private static void initializeWeightConversionFactorsKilogram() {
        Map<Units.Weight, Float> factors = new HashMap<>();
        factors.put(Units.Weight.GRAM, 1000f);
        factors.put(Units.Weight.KILOGRAM, 1f);
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
        factors.put(Units.Distance.METER, 1f);
        factors.put(Units.Distance.KILOMETER, 1f/1000);
        distanceConversionFactors.put(Units.Distance.METER, factors);
    }

    /**
     * Initializes the conversion factors for kilometer.
     */
    private static void initializeDistanceConversionFactorsKilometer() {
        Map<Units.Distance, Float> factors = new HashMap<>();
        factors.put(Units.Distance.METER, 1000f);
        factors.put(Units.Distance.KILOMETER, 1f);
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
        factors.put(Units.Time.SECOND, 1f);
        factors.put(Units.Time.HOUR, 1f/3600);
        timeConversionFactors.put(Units.Time.SECOND, factors);
    }

    /**
     * Initializes the conversion factors for hour.
     */
    private static void initializeTimeConversionFactorsHour() {
        Map<Units.Time, Float> factors = new HashMap<>();
        factors.put(Units.Time.SECOND, 3600f);
        factors.put(Units.Time.HOUR, 1f);
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
    private static float convertSpeed(float value, Units.Speed from, Units.Speed to) {
        return value * getSpeedFactor(from, to);
    }

    /**
     * Converts the given speed from the first given unit to the second given unit.
     * @param value The value to convert
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The converted value
     */
    private static float convertWeight(float value, Units.Weight from, Units.Weight to) {
        return value * getWeightFactor(from, to);
    }

    /**
     * Converts the given speed from the first given unit to the second given unit.
     * @param value The value to convert
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The converted value
     */
    private static float convertDistance(float value, Units.Distance from, Units.Distance to) {
        return value * getDistanceFactor(from, to);
    }

    /**
     * Converts the given speed from the first given unit to the second given unit.
     * @param value The value to convert
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The converted value
     */
    private static float convertTime(float value, Units.Time from, Units.Time to) {
        return value * getTimeFactor(from, to);
    }

    /**
     * Converts the given value from the first given unit to the second given units.
     * This method performs the necessary checks and returns NotANumber if the units cannot be converted one to another.
     * @param value The value to convert
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The converted value
     */
    public static MyNumber convert(float value, Units.Unit from, Units.Unit to) {
        // TODO : what should I do here ????
        //  - Add float constructor
        //  - Use real numbers from issue #7
        //  - Round to integers
        if (from instanceof Units.Speed && to instanceof Units.Speed) {
            float result = convertSpeed(value, (Units.Speed) from, (Units.Speed) to);
            return new MyNumber((int) result);
        }
        if (from instanceof Units.Weight && to instanceof Units.Weight) {
            float result = convertWeight(value, (Units.Weight) from, (Units.Weight) to);
            return new MyNumber((int) result);
        }
        if (from instanceof Units.Distance && to instanceof Units.Distance) {
            float result = convertDistance(value, (Units.Distance) from, (Units.Distance) to);
            return new MyNumber((int) result);
        }
        if (from instanceof Units.Time && to instanceof Units.Time) {
            float result = convertTime(value, (Units.Time) from, (Units.Time) to);
            return new MyNumber((int) result);
        }

        return new NotANumber();
    }
}
