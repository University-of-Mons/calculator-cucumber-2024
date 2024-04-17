package back.converter;

import javafx.util.StringConverter;

/**
 * StringConverter used to display the name of the class in the ComboBoxes of the converter instead of the plain
 * class name (for example : m/s instead of METER_PER_SECOND).
 */
public class UnitStringConverter extends StringConverter<Units.Unit> {
    @Override
    public String toString(Units.Unit unit) {
        if (unit != null) {
            return unit.getSymbol();
        }
        return null;
    }

    @Override
    public Units.Unit fromString(String string) {
        return null; // Not needed for our use case
    }
}