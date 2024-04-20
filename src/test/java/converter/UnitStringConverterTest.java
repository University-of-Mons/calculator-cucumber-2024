package converter;

import back.converter.UnitStringConverter;
import back.converter.Units;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the UnitStringConverter class.
 */
class UnitStringConverterTest {

    /**
     * Test the toString method of the UnitStringConverter class.
     */
    @Test
    void testToString() {
        UnitStringConverter converter = new UnitStringConverter();
        assertEquals("Meters per second (m/s)", converter.toString(Units.Speed.METERS_PER_SECOND));
        assertEquals("Meters per hour (m/h)", converter.toString(Units.Speed.METERS_PER_HOUR));
        assertEquals("Kilometers per second (km/s)", converter.toString(Units.Speed.KILOMETERS_PER_SECOND));
        assertEquals("Kilometers per hour (km/h)", converter.toString(Units.Speed.KILOMETERS_PER_HOUR));
        assertEquals("Gram (g)", converter.toString(Units.Weight.GRAM));
        assertEquals("Kilogram (kg)", converter.toString(Units.Weight.KILOGRAM));
        assertEquals("Meter (m)", converter.toString(Units.Distance.METER));
        assertEquals("Kilometer (km)", converter.toString(Units.Distance.KILOMETER));
        assertEquals("Second (s)", converter.toString(Units.Time.SECOND));
        assertEquals("Hour (h)", converter.toString(Units.Time.HOUR));
        assertEquals("Degree (deg)", converter.toString(Units.Angles.DEGREE));
        assertEquals("Radian (rad)", converter.toString(Units.Angles.RADIAN));
        assertNull(converter.toString(null));
    }

    /**
     * Test the fromString method of the UnitStringConverter class.
     */
    @Test
    void testFromString() {
        UnitStringConverter converter = new UnitStringConverter();
        Units.Unit unit = Units.Time.HOUR;
        String symbol = unit.getSymbol();
        assertNull(converter.fromString(symbol));
        assertNull(converter.fromString(null));
        assertNull(converter.fromString(""));
    }

    /**
     * Test the formatUnit method of the UnitStringConverter class.
     */
    @Test
    void testFormatUnit() {
        assertEquals("Meter", UnitStringConverter.formatUnit(Units.Distance.METER));
        assertEquals("Mach", UnitStringConverter.formatUnit(Units.Speed.MACH));
        assertEquals("Meters per second", UnitStringConverter.formatUnit(Units.Speed.METERS_PER_SECOND));
        assertEquals("Kilometers per hour", UnitStringConverter.formatUnit(Units.Speed.KILOMETERS_PER_HOUR));
    }
}
