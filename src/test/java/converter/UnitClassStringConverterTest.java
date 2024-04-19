package converter;

import back.converter.UnitClassStringConverter;
import back.converter.UnitStringConverter;
import back.converter.Units;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Tests for the UnitClassStringConverter class.
 */
public class UnitClassStringConverterTest {

    /**
     * Test the toString method of the UnitClassStringConverter class.
     */
    @Test
    void testToString() {
        UnitClassStringConverter converter = new UnitClassStringConverter();
        assertEquals("Speed", converter.toString(Units.Speed.class));
        assertEquals("Weight", converter.toString(Units.Weight.class));
        assertEquals("Distance", converter.toString(Units.Distance.class));
        assertEquals("Time", converter.toString(Units.Time.class));
        assertNull(converter.toString(null));
    }

    /**
     * Test the fromString method of the UnitClassStringConverter class.
     */
    @Test
    public void testFromString() {
        UnitClassStringConverter converter = new UnitClassStringConverter();
        Class<Units.Time> clazz = Units.Time.class;
        assertNull(converter.fromString(clazz.toString()));
        assertNull(converter.fromString(null));
        assertNull(converter.fromString(""));
    }
}

