package converter;

import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;
import back.calculator.types.RealValue;
import back.converter.Converter;
import back.converter.Units;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the Converter class.
 */
class ConverterTest {

    /**
     * Test valid speed unit conversions.
     */
    @Test
    void testValidSpeedConversions() {
        assertEquals(new MyNumber(360), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(100), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Speed.METERS_PER_SECOND,
                Units.Speed.KILOMETER_PER_HOUR));
        assertEquals(new MyNumber(360000), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(100), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Speed.METERS_PER_SECOND,
                Units.Speed.METERS_PER_HOUR));
        assertEquals(new MyNumber(1), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(1000), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Speed.METERS_PER_SECOND,
                Units.Speed.KILOMETER_PER_SECOND));
        assertEquals(new MyNumber(100), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(100), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Speed.METERS_PER_SECOND,
                Units.Speed.METERS_PER_SECOND));
        assertEquals(new MyNumber(new RealValue(new BigDecimal(Float.toString(3.6f), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD))),
                Converter.convert(
                        new RealValue(new BigDecimal(Integer.toString(1), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                        Units.Speed.METERS_PER_SECOND,
                        Units.Speed.KILOMETER_PER_HOUR));
        assertEquals(new MyNumber(1), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(1000), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Speed.METERS_PER_SECOND,
                Units.Speed.KILOMETER_PER_SECOND));
    }

    /**
     * Test invalid speed unit conversions.
     */
    @Test
    void testInvalidSpeedConversions() {
        assertEquals(new NotANumber(), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(100), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Speed.METERS_PER_SECOND,
                Units.Weight.GRAM));
        assertEquals(new NotANumber(), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(100), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Speed.METERS_PER_SECOND,
                Units.Distance.METER));
    }

    /**
     * Test valid weight unit conversions.
     */
    @Test
    void testValidWeightConversions() {
        assertEquals(new MyNumber(5), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(5000), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Weight.GRAM,
                Units.Weight.KILOGRAM));
        assertEquals(new MyNumber(5000), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(5), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Weight.KILOGRAM,
                Units.Weight.GRAM));
        assertEquals(new MyNumber(1), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(1000), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Weight.GRAM,
                Units.Weight.KILOGRAM));
    }

    /**
     * Test invalid weight unit conversions.
     */
    @Test
    void testInvalidWeightConversions() {
        assertEquals(new NotANumber(), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(5000), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Weight.GRAM,
                Units.Speed.METERS_PER_SECOND));
        assertEquals(new NotANumber(), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(100), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Weight.GRAM,
                Units.Distance.KILOMETER));
    }

    /**
     * Test valid distance unit conversions.
     */
    @Test
    void testValidDistanceConversions() {
        assertEquals(new MyNumber(5), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(5000), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Distance.METER,
                Units.Distance.KILOMETER));
        assertEquals(new MyNumber(5000), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(5), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Distance.KILOMETER,
                Units.Distance.METER));
        assertEquals(new MyNumber(1000), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(1), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Distance.KILOMETER,
                Units.Distance.METER));
    }

    /**
     * Test invalid distance unit conversions.
     */
    @Test
    void testInvalidDistanceConversions() {
        assertEquals(new NotANumber(), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(5000), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Distance.METER,
                Units.Time.SECOND));
        assertEquals(new NotANumber(), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(100), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Distance.KILOMETER,
                Units.Weight.GRAM));
    }

    /**
     * Test valid time unit conversions.
     */
    @Test
    void testValidTimeConversions() {
        assertEquals(new MyNumber(7200), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(2), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Time.HOUR,
                Units.Time.SECOND));
        assertEquals(new MyNumber(5), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(18000), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Time.SECOND,
                Units.Time.HOUR));
        assertEquals(new MyNumber(new RealValue(new BigDecimal(Float.toString(0.000277778f), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD))),
                Converter.convert(
                        new RealValue(new BigDecimal(Integer.toString(1), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                        Units.Time.SECOND,
                        Units.Time.HOUR));
    }

    /**
     * Test invalid time unit conversions.
     */
    @Test
    void testInvalidTimeConversions() {
        assertEquals(new NotANumber(), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(5000), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Time.SECOND,
                Units.Speed.METERS_PER_SECOND));
        assertEquals(new NotANumber(), Converter.convert(
                new RealValue(new BigDecimal(Integer.toString(100), Converter.TODO_DELETE_THIS_TEMPORARY_PRECISION_AND_REPLACE_IT_WITH_APP_DOT_GET_PRECISION_METHOD)),
                Units.Time.HOUR,
                Units.Distance.KILOMETER));
    }

    /**
     * Test that verifies the Converter constructor is private and throws an error if its accessibility is changed.
     */
    @Test
    void testPrivateConverterConstructor() {
        Constructor<Converter> constructor;
        try {
            constructor = Converter.class.getDeclaredConstructor();
            assertTrue((constructor.getModifiers() & java.lang.reflect.Modifier.PRIVATE) > 0);
            constructor.setAccessible(true); // Make it accessible
            assertThrows(InvocationTargetException.class, constructor::newInstance);
        } catch (NoSuchMethodException e) {
            fail("No private constructor found for Converter");
        }
    }

    /**
     * Test that verifies the Units is private and throws an error if its accessibility is changed.
     */
    @Test
    void testPrivateUnitsConstructor() {
        Constructor<Units> constructor;
        try {
            constructor = Units.class.getDeclaredConstructor();
            assertTrue((constructor.getModifiers() & java.lang.reflect.Modifier.PRIVATE) > 0);
            constructor.setAccessible(true); // Make it accessible
            assertThrows(InvocationTargetException.class, constructor::newInstance);
        } catch (NoSuchMethodException e) {
            fail("No private constructor found for Units");
        }
    }
}





