package converter;

import back.converter.Units;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for the Units class.
 */
class UnitsTest {
    /**
     * Tests the getUnitClasses method of the Units class.
     */
    @Test
    void testGetUnitClasses() {
        List<Class<? extends Units.Unit>> unitClasses = Units.getUnitClasses();
        assertEquals(5, unitClasses.size());
        assertEquals(Units.Speed.class, unitClasses.get(0));
        assertEquals(Units.Weight.class, unitClasses.get(1));
        assertEquals(Units.Distance.class, unitClasses.get(2));
        assertEquals(Units.Time.class, unitClasses.get(3));
        assertEquals(Units.Angles.class, unitClasses.get(4));
    }

    /**
     * Tests the getSymbol method of the Speed enum.
     */
    @Test
    void testSpeedSymbols() {
        assertEquals("m/s", Units.Speed.METERS_PER_SECOND.getSymbol());
        assertEquals("m/h", Units.Speed.METERS_PER_HOUR.getSymbol());
        assertEquals("km/s", Units.Speed.KILOMETER_PER_SECOND.getSymbol());
        assertEquals("km/h", Units.Speed.KILOMETER_PER_HOUR.getSymbol());
    }

    /**
     * Tests the getSymbol method of the Weight enum.
     */
    @Test
    void testWeightSymbols() {
        assertEquals("g", Units.Weight.GRAM.getSymbol());
        assertEquals("kg", Units.Weight.KILOGRAM.getSymbol());
    }

    /**
     * Tests the getSymbol method of the Distance enum.
     */
    @Test
    void testDistanceSymbols() {
        assertEquals("m", Units.Distance.METER.getSymbol());
        assertEquals("km", Units.Distance.KILOMETER.getSymbol());
    }

    /**
     * Tests the getSymbol method of the Time enum.
     */
    @Test
    void testTimeSymbols() {
        assertEquals("s", Units.Time.SECOND.getSymbol());
        assertEquals("h", Units.Time.HOUR.getSymbol());
    }
}
