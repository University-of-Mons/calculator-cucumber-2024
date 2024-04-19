package converter;

import back.calculator.App;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;
import back.calculator.types.RealValue;
import back.converter.Converter;
import back.converter.Units;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for the Converter class.
 */
class ConverterTest {

    MathContext precision = App.getPrecision();

    /**
     * Test valid speed unit conversions.
     */
    @Test
    void testValidSpeedConversions() {
        assertEquals(new MyNumber(360), Converter.convert(100, Units.Speed.METERS_PER_SECOND, Units.Speed.KILOMETER_PER_HOUR));
        assertEquals(new MyNumber(360000), Converter.convert(100, Units.Speed.METERS_PER_SECOND, Units.Speed.METERS_PER_HOUR));
        assertEquals(new MyNumber(1), Converter.convert(1000, Units.Speed.METERS_PER_SECOND, Units.Speed.KILOMETER_PER_SECOND));
        assertEquals(new MyNumber(100), Converter.convert(100, Units.Speed.METERS_PER_SECOND, Units.Speed.METERS_PER_SECOND));
//        assertEquals(new MyNumber(0.277778f), Converter.convert(1, Units.Speed.METERS_PER_SECOND, Units.Speed.KILOMETER_PER_HOUR));
        assertEquals(new MyNumber(1), Converter.convert(1000, Units.Speed.METERS_PER_SECOND, Units.Speed.KILOMETER_PER_SECOND));
        assertEquals(new MyNumber(new RealValue(new BigDecimal(Double.toString(Math.PI), precision))), Converter.convert(180, Units.Angles.DEGREE, Units.Angles.RADIAN));
        assertEquals(new MyNumber(180), Converter.convert(Float.parseFloat(Double.toString(Math.PI)), Units.Angles.RADIAN, Units.Angles.DEGREE));
    }

    /**
     * Test invalid speed unit conversions.
     */
    @Test
    void testInvalidSpeedConversions() {
        assertEquals(new NotANumber(), Converter.convert(100, Units.Speed.METERS_PER_SECOND, Units.Weight.GRAM));
        assertEquals(new NotANumber(), Converter.convert(100, Units.Speed.METERS_PER_SECOND, Units.Distance.METER));
    }

    /**
     * Test valid weight unit conversions.
     */
    @Test
    void testValidWeightConversions() {
        assertEquals(new MyNumber(5), Converter.convert(5000, Units.Weight.GRAM, Units.Weight.KILOGRAM));
        assertEquals(new MyNumber(5000), Converter.convert(5, Units.Weight.KILOGRAM, Units.Weight.GRAM));
        assertEquals(new MyNumber(1), Converter.convert(1000, Units.Weight.GRAM, Units.Weight.KILOGRAM));
    }

    /**
     * Test invalid weight unit conversions.
     */
    @Test
    void testInvalidWeightConversions() {
        assertEquals(new NotANumber(), Converter.convert(5000, Units.Weight.GRAM, Units.Speed.METERS_PER_SECOND));
        assertEquals(new NotANumber(), Converter.convert(100, Units.Weight.GRAM, Units.Distance.KILOMETER));
    }

    /**
     * Test valid distance unit conversions.
     */
    @Test
    void testValidDistanceConversions() {
        assertEquals(new MyNumber(5), Converter.convert(5000, Units.Distance.METER, Units.Distance.KILOMETER));
        assertEquals(new MyNumber(5000), Converter.convert(5, Units.Distance.KILOMETER, Units.Distance.METER));
        assertEquals(new MyNumber(1000), Converter.convert(1, Units.Distance.KILOMETER, Units.Distance.METER));
    }

    /**
     * Test invalid distance unit conversions.
     */
    @Test
    void testInvalidDistanceConversions() {
        assertEquals(new NotANumber(), Converter.convert(5000, Units.Distance.METER, Units.Time.SECOND));
        assertEquals(new NotANumber(), Converter.convert(100, Units.Distance.KILOMETER, Units.Weight.GRAM));
    }

    /**
     * Test valid time unit conversions.
     */
    @Test
    void testValidTimeConversions() {
        assertEquals(new MyNumber(7200), Converter.convert(2, Units.Time.HOUR, Units.Time.SECOND));
        assertEquals(new MyNumber(5), Converter.convert(18000, Units.Time.SECOND, Units.Time.HOUR));
//        assertEquals(new MyNumber(0.000277778f), Converter.convert(1, Units.Time.SECOND, Units.Time.HOUR));
    }

    /**
     * Test invalid time unit conversions.
     */
    @Test
    void testInvalidTimeConversions() {
        assertEquals(new NotANumber(), Converter.convert(5000, Units.Time.SECOND, Units.Speed.METERS_PER_SECOND));
        assertEquals(new NotANumber(), Converter.convert(100, Units.Time.HOUR, Units.Distance.KILOMETER));
    }

    /**
     * Test valid angle conversions.
     */
    @Test
    void testValidAngleConversions() {
        assertEquals(new MyNumber(180), Converter.convert(Float.parseFloat(Double.toString(Math.PI)), Units.Angles.RADIAN, Units.Angles.DEGREE));
        assertEquals(new MyNumber(new RealValue(new BigDecimal(Double.toString(Math.PI), precision))), Converter.convert(180, Units.Angles.DEGREE, Units.Angles.RADIAN));
    }

    /**
     * Test invalid angle conversions.
     */
    @Test
    void testInvalidAngleConversions() {
        assertEquals(new NotANumber(), Converter.convert(5000, Units.Angles.DEGREE, Units.Speed.METERS_PER_SECOND));
        assertEquals(new NotANumber(), Converter.convert(100, Units.Angles.RADIAN, Units.Distance.KILOMETER));
    }
}





