package converter;

import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;
import back.converter.Converter;
import back.converter.Units;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for the Converter class.
 */
public class ConverterTest {

    /**
     * Test valid speed unit conversions.
     */
    @Test
    public void testValidSpeedConversions() {
        assertEquals(new MyNumber(360), Converter.convert(100, Units.Speed.METERS_PER_SECOND, Units.Speed.KILOMETER_PER_HOUR));
        assertEquals(new MyNumber(360000), Converter.convert(100, Units.Speed.METERS_PER_SECOND, Units.Speed.METERS_PER_HOUR));
        assertEquals(new MyNumber(1), Converter.convert(1000, Units.Speed.METERS_PER_SECOND, Units.Speed.KILOMETER_PER_SECOND));
        assertEquals(new MyNumber(100), Converter.convert(100, Units.Speed.METERS_PER_SECOND, Units.Speed.METERS_PER_SECOND));
//        assertEquals(new MyNumber(0.277778f), Converter.convert(1, Units.Speed.METERS_PER_SECOND, Units.Speed.KILOMETER_PER_HOUR));
        assertEquals(new MyNumber(1), Converter.convert(1000, Units.Speed.METERS_PER_SECOND, Units.Speed.KILOMETER_PER_SECOND));
    }

    /**
     * Test invalid speed unit conversions.
     */
    @Test
    public void testInvalidSpeedConversions() {
        assertEquals(new NotANumber(), Converter.convert(100, Units.Speed.METERS_PER_SECOND, Units.Weight.GRAM));
        assertEquals(new NotANumber(), Converter.convert(100, Units.Speed.METERS_PER_SECOND, Units.Distance.METER));
    }

    /**
     * Test valid weight unit conversions.
     */
    @Test
    public void testValidWeightConversions() {
        assertEquals(new MyNumber(5), Converter.convert(5000, Units.Weight.GRAM, Units.Weight.KILOGRAM));
        assertEquals(new MyNumber(5000), Converter.convert(5, Units.Weight.KILOGRAM, Units.Weight.GRAM));
        assertEquals(new MyNumber(1), Converter.convert(1000, Units.Weight.GRAM, Units.Weight.KILOGRAM));
    }

    /**
     * Test invalid weight unit conversions.
     */
    @Test
    public void testInvalidWeightConversions() {
        assertEquals(new NotANumber(), Converter.convert(5000, Units.Weight.GRAM, Units.Speed.METERS_PER_SECOND));
        assertEquals(new NotANumber(), Converter.convert(100, Units.Weight.GRAM, Units.Distance.KILOMETER));
    }

    /**
     * Test valid distance unit conversions.
     */
    @Test
    public void testValidDistanceConversions() {
        assertEquals(new MyNumber(5), Converter.convert(5000, Units.Distance.METER, Units.Distance.KILOMETER));
        assertEquals(new MyNumber(5000), Converter.convert(5, Units.Distance.KILOMETER, Units.Distance.METER));
        assertEquals(new MyNumber(1000), Converter.convert(1, Units.Distance.KILOMETER, Units.Distance.METER));
    }

    /**
     * Test invalid distance unit conversions.
     */
    @Test
    public void testInvalidDistanceConversions() {
        assertEquals(new NotANumber(), Converter.convert(5000, Units.Distance.METER, Units.Time.SECOND));
        assertEquals(new NotANumber(), Converter.convert(100, Units.Distance.KILOMETER, Units.Weight.GRAM));
    }

    /**
     * Test valid time unit conversions.
     */
    @Test
    public void testValidTimeConversions() {
        assertEquals(new MyNumber(7200), Converter.convert(2, Units.Time.HOUR, Units.Time.SECOND));
        assertEquals(new MyNumber(5), Converter.convert(18000, Units.Time.SECOND, Units.Time.HOUR));
//        assertEquals(new MyNumber(0.000277778f), Converter.convert(1, Units.Time.SECOND, Units.Time.HOUR));
    }

    /**
     * Test invalid time unit conversions.
     */
    @Test
    public void testInvalidTimeConversions() {
        assertEquals(new NotANumber(), Converter.convert(5000, Units.Time.SECOND, Units.Speed.METERS_PER_SECOND));
        assertEquals(new NotANumber(), Converter.convert(100, Units.Time.HOUR, Units.Distance.KILOMETER));
    }
}





