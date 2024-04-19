package converter;

import back.converter.UnitStringConverter;
import back.converter.Units;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the UnitStringConverter class.
 */
public class UnitStringConverterTest {

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
        assertNull(converter.toString(null));
    }

    /**
     * Test the fromString method of the UnitStringConverter class.
     */
    @Test
    public void testFromString() {
        UnitStringConverter converter = new UnitStringConverter();
        Units.Unit unit = Units.Time.HOUR;
        String symbol = unit.getSymbol();
        assertNull(converter.fromString(symbol));
        assertNull(converter.fromString(null));
        assertNull(converter.fromString(""));
    }
}
