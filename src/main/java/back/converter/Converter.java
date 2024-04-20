package back.converter;

import back.calculator.types.AbstractValue;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;

import back.calculator.types.RealValue;

import java.math.BigDecimal;
import java.util.EnumMap;
import back.calculator.App;
import java.util.Map;

/**
 * This class provides all conversion methods.
 */
public class Converter {
    /**
     * Holds the conversion factors from all speed units to all speed units.
     */
    private static final Map<Units.Speed, Map<Units.Speed, RealValue>> speedConversionFactors = new EnumMap<>(Units.Speed.class);
    /**
     * Holds the conversion factors from all weight units to all speed units.
     */
    private static final Map<Units.Weight, Map<Units.Weight, RealValue>> weightConversionFactors = new EnumMap<>(Units.Weight.class);
    /**
     * Holds the conversion factors from all distance units to all speed units.
     */
    private static final Map<Units.Distance, Map<Units.Distance, RealValue>> distanceConversionFactors = new EnumMap<>(Units.Distance.class);
    /**
     * Holds the conversion factors from all time units to all speed units.
     */
    private static final Map<Units.Time, Map<Units.Time, RealValue>> timeConversionFactors = new EnumMap<>(Units.Time.class);
    /**
     * Holds the conversion factors from all angles units to all angles units.
     */
    private static final Map<Units.Angles, Map<Units.Angles, RealValue>> anglesConversionFactors = new EnumMap<>(Units.Angles.class);

    static {
        initializeSpeedConversionFactors();
        initializeWeightConversionFactors();
        initializeDistanceConversionFactors();
        initializeTimeConversionFactors();
        initializeAnglesConversionFactors();
    }

    private Converter() {
        throw new IllegalStateException("Utility class");
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
        Map<Units.Speed, RealValue> factors = new EnumMap<>(Units.Speed.class);
        factors.put(Units.Speed.METERS_PER_SECOND, new RealValue(new BigDecimal(Float.toString(1f), App.getPrecision())));
        factors.put(Units.Speed.METERS_PER_HOUR, new RealValue(new BigDecimal(Float.toString(3600f), App.getPrecision())));
        factors.put(Units.Speed.KILOMETER_PER_SECOND, new RealValue(new BigDecimal(Float.toString(1f/1000), App.getPrecision())));
        factors.put(Units.Speed.KILOMETER_PER_HOUR, new RealValue(new BigDecimal(Float.toString(3.6f), App.getPrecision())));
        speedConversionFactors.put(Units.Speed.METERS_PER_SECOND, factors);
    }

    /**
     * Initializes the conversion factors for meters per hour.
     */
    private static void initializeSpeedConversionFactorsMetersPerHour() {
        Map<Units.Speed, RealValue> factors = new EnumMap<>(Units.Speed.class);
        factors.put(Units.Speed.METERS_PER_SECOND, new RealValue(new BigDecimal(Float.toString(1f/3600), App.getPrecision())));
        factors.put(Units.Speed.METERS_PER_HOUR, new RealValue(new BigDecimal(Float.toString(1f), App.getPrecision())));
        factors.put(Units.Speed.KILOMETER_PER_SECOND, new RealValue(new BigDecimal(Float.toString(1f/3600000), App.getPrecision())));
        factors.put(Units.Speed.KILOMETER_PER_HOUR, new RealValue(new BigDecimal(Float.toString(1f/1000), App.getPrecision())));
        speedConversionFactors.put(Units.Speed.METERS_PER_HOUR, factors);
    }

    /**
     * Initializes the conversion factors for meters per second.
     */
    private static void initializeSpeedConversionFactorsKilometersPerSecond() {
        Map<Units.Speed, RealValue> factors = new EnumMap<>(Units.Speed.class);
        factors.put(Units.Speed.METERS_PER_SECOND, new RealValue(new BigDecimal(Float.toString(1000f), App.getPrecision())));
        factors.put(Units.Speed.METERS_PER_HOUR, new RealValue(new BigDecimal(Float.toString(3600000f), App.getPrecision())));
        factors.put(Units.Speed.KILOMETER_PER_SECOND, new RealValue(new BigDecimal(Float.toString(1f), App.getPrecision())));
        factors.put(Units.Speed.KILOMETER_PER_HOUR, new RealValue(new BigDecimal(Float.toString(3600f), App.getPrecision())));
        speedConversionFactors.put(Units.Speed.KILOMETER_PER_SECOND, factors);
    }

    /**
     * Initializes the conversion factors for meters per hour.
     */
    private static void initializeSpeedConversionFactorsKilometersPerHour() {
        Map<Units.Speed, RealValue> factors = new EnumMap<>(Units.Speed.class);
        factors.put(Units.Speed.METERS_PER_SECOND, new RealValue(new BigDecimal(Float.toString(1f/3.6f), App.getPrecision())));
        factors.put(Units.Speed.METERS_PER_HOUR, new RealValue(new BigDecimal(Float.toString(1000f), App.getPrecision())));
        factors.put(Units.Speed.KILOMETER_PER_SECOND, new RealValue(new BigDecimal(Float.toString(1f/3600f), App.getPrecision())));
        factors.put(Units.Speed.KILOMETER_PER_HOUR, new RealValue(new BigDecimal(Float.toString(1f), App.getPrecision())));
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
        Map<Units.Weight, RealValue> factors = new EnumMap<>(Units.Weight.class);
        factors.put(Units.Weight.GRAM, new RealValue(new BigDecimal(Float.toString(1f), App.getPrecision())));
        factors.put(Units.Weight.KILOGRAM, new RealValue(new BigDecimal(Float.toString(1f/1000), App.getPrecision())));
        weightConversionFactors.put(Units.Weight.GRAM, factors);
    }

    /**
     * Initializes the conversion factors for kilogram.
     */
    private static void initializeWeightConversionFactorsKilogram() {
        Map<Units.Weight, RealValue> factors = new EnumMap<>(Units.Weight.class);
        factors.put(Units.Weight.GRAM, new RealValue(new BigDecimal(Float.toString(1000f), App.getPrecision())));
        factors.put(Units.Weight.KILOGRAM, new RealValue(new BigDecimal(Float.toString(1f), App.getPrecision())));
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
        Map<Units.Distance, RealValue> factors = new EnumMap<>(Units.Distance.class);
        factors.put(Units.Distance.METER, new RealValue(new BigDecimal(Float.toString(1f), App.getPrecision())));
        factors.put(Units.Distance.KILOMETER, new RealValue(new BigDecimal(Float.toString(1f/1000), App.getPrecision())));
        distanceConversionFactors.put(Units.Distance.METER, factors);
    }

    /**
     * Initializes the conversion factors for kilometer.
     */
    private static void initializeDistanceConversionFactorsKilometer() {
        Map<Units.Distance, RealValue> factors = new EnumMap<>(Units.Distance.class);
        factors.put(Units.Distance.METER, new RealValue(new BigDecimal(Float.toString(1000f), App.getPrecision())));
        factors.put(Units.Distance.KILOMETER, new RealValue(new BigDecimal(Float.toString(1f), App.getPrecision())));
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
        Map<Units.Time, RealValue> factors = new EnumMap<>(Units.Time.class);
        factors.put(Units.Time.SECOND, new RealValue(new BigDecimal(Float.toString(1f), App.getPrecision())));
        factors.put(Units.Time.HOUR, new RealValue(new BigDecimal(Float.toString(1f/3600), App.getPrecision())));
        timeConversionFactors.put(Units.Time.SECOND, factors);
    }

    /**
     * Initializes the conversion factors for hour.
     */
    private static void initializeTimeConversionFactorsHour() {
        Map<Units.Time, RealValue> factors = new EnumMap<>(Units.Time.class);
        factors.put(Units.Time.SECOND, new RealValue(new BigDecimal(Float.toString(3600f), App.getPrecision())));
        factors.put(Units.Time.HOUR, new RealValue(new BigDecimal(Float.toString(1f), App.getPrecision())));
        timeConversionFactors.put(Units.Time.HOUR, factors);
    }

    /**
     * Defines the conversion factors for all angles units.
     */
    private static void initializeAnglesConversionFactors() {
        initializeAnglesConversionFactorsDegree();
        initializeAnglesConversionFactorsRadian();
    }

    /**
     * Initializes the conversion factors for degree.
     */
    private static void initializeAnglesConversionFactorsDegree() {
        Map<Units.Angles, RealValue> factors = new EnumMap<>(Units.Angles.class);
        factors.put(Units.Angles.DEGREE, new RealValue(new BigDecimal(Float.toString(1f), App.getPrecision())));
        factors.put(Units.Angles.RADIAN, new RealValue(new BigDecimal(Float.toString((float) Math.PI / 180), App.getPrecision())));
        anglesConversionFactors.put(Units.Angles.DEGREE, factors);
    }
    /**
     * Initializes the conversion factors for radian.
     */
    private static void initializeAnglesConversionFactorsRadian() {
        Map<Units.Angles, RealValue> factors = new EnumMap<>(Units.Angles.class);
        factors.put(Units.Angles.DEGREE, new RealValue(new BigDecimal(Float.toString(180f / (float) Math.PI), App.getPrecision())));
        factors.put(Units.Angles.RADIAN, new RealValue(new BigDecimal(Float.toString(1f), App.getPrecision())));
        anglesConversionFactors.put(Units.Angles.RADIAN, factors);
    }

    /**
     * Retrieve the conversion factor when converting from the first given unit to the second given unit.
     *
     * @param from The unit of the value
     * @param to   The unit of the result
     * @return The conversion factor
     */
    private static RealValue getSpeedFactor(Units.Speed from, Units.Speed to) {
        return speedConversionFactors.get(from).get(to);
    }

    /**
     * Retrieve the conversion factor when converting from the first given unit to the second given unit.
     *
     * @param from The unit of the value
     * @param to   The unit of the result
     * @return The conversion factor
     */
    private static RealValue getWeightFactor(Units.Weight from, Units.Weight to) {
        return weightConversionFactors.get(from).get(to);
    }

    /**
     * Retrieve the conversion factor when converting from the first given unit to the second given unit.
     *
     * @param from The unit of the value
     * @param to   The unit of the result
     * @return The conversion factor
     */
    private static RealValue getDistanceFactor(Units.Distance from, Units.Distance to) {
        return distanceConversionFactors.get(from).get(to);
    }

    /**
     * Retrieve the conversion factor when converting from the first given unit to the second given unit.
     *
     * @param from The unit of the value
     * @param to   The unit of the result
     * @return The conversion factor
     */
    private static RealValue getTimeFactor(Units.Time from, Units.Time to) {
        return timeConversionFactors.get(from).get(to);
    }

    /**
     * Retrieve the conversion factor when converting from the first given unit to the second given unit.
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The conversion factor
     */
    private static RealValue getAngleFactor(Units.Angles from, Units.Angles to) {
        return anglesConversionFactors.get(from).get(to);
    }

    /**
     * Converts the given speed from the first given unit to the second given unit.
     * @param value The value to convert
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The converted value
     */
    private static AbstractValue convertSpeed(RealValue value, Units.Speed from, Units.Speed to) {
        return value.mul(getSpeedFactor(from, to));
    }

    /**
     * Converts the given speed from the first given unit to the second given unit.
     * @param value The value to convert
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The converted value
     */
    private static AbstractValue convertWeight(RealValue value, Units.Weight from, Units.Weight to) {
        return value.mul(getWeightFactor(from, to));
    }

    /**
     * Converts the given speed from the first given unit to the second given unit.
     * @param value The value to convert
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The converted value
     */
    private static AbstractValue convertDistance(RealValue value, Units.Distance from, Units.Distance to) {
        return value.mul(getDistanceFactor(from, to));
    }

    /**
     * Converts the given speed from the first given unit to the second given unit.
     * @param value The value to convert
     * @param from The unit of the value
     * @param to The unit of the result
     * @return The converted value
     */
    private static AbstractValue convertTime(RealValue value, Units.Time from, Units.Time to) {
        return value.mul(getTimeFactor(from, to));
    }

    private static AbstractValue convertAngle(RealValue value, Units.Angles from, Units.Angles to) {
        return value.mul(getAngleFactor(from, to));
    }

    /**
     * Converts the given value from the first given unit to the second given units.
     * This method performs the necessary checks and returns NotANumber if the units cannot be converted one to another.
     *
     * @param value The value to convert
     * @param from  The unit of the value
     * @param to    The unit of the result
     * @return The converted value
     */
    public static MyNumber convert(RealValue value, Units.Unit from, Units.Unit to) {
        if (from instanceof Units.Speed fromSpeed && to instanceof Units.Speed toSpeed) {
            AbstractValue result = convertSpeed(value, fromSpeed, toSpeed);
            return new MyNumber(result);
        }
        if (from instanceof Units.Weight fromWeight && to instanceof Units.Weight toWeight) {
            AbstractValue result = convertWeight(value, fromWeight, toWeight);
            return new MyNumber(result);
        }
        if (from instanceof Units.Distance fromDistance && to instanceof Units.Distance toDistance) {
            AbstractValue result = convertDistance(value, fromDistance, toDistance);
            return new MyNumber(result);
        }
        if (from instanceof Units.Time fromTime && to instanceof Units.Time toTime) {
            AbstractValue result = convertTime(value, fromTime, toTime);
            return new MyNumber(result);
        }
        if (from instanceof Units.Angles fromAngle && to instanceof Units.Angles toAngle) {
            AbstractValue result = convertAngle(value, fromAngle, toAngle);
            return new MyNumber(result);
        }
        return new NotANumber();
    }
}
