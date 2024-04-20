package converter;

import back.converter.UnitStringConverter;
import back.converter.Units;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
        assertEquals("m/s", converter.toString(Units.Speed.METERS_PER_SECOND));
        assertEquals("m/h", converter.toString(Units.Speed.METERS_PER_HOUR));
        assertEquals("km/s", converter.toString(Units.Speed.KILOMETER_PER_SECOND));
        assertEquals("km/h", converter.toString(Units.Speed.KILOMETER_PER_HOUR));
        assertEquals("g", converter.toString(Units.Weight.GRAM));
        assertEquals("kg", converter.toString(Units.Weight.KILOGRAM));
        assertEquals("m", converter.toString(Units.Distance.METER));
        assertEquals("km", converter.toString(Units.Distance.KILOMETER));
        assertEquals("s", converter.toString(Units.Time.SECOND));
        assertEquals("h", converter.toString(Units.Time.HOUR));
        assertEquals("deg", converter.toString(Units.Angles.DEGREE));
        assertEquals("rad", converter.toString(Units.Angles.RADIAN));
        assertNull(converter.toString(null));
    }
}
