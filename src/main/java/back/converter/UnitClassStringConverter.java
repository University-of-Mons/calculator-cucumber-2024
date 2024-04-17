package back.converter;

import javafx.util.StringConverter;

/**
 * StringConverter used to display the name of the class in the ComboBoxes of the converter instead of the plain
 * class name (for example : Speed instead of Units.SPEED).
 */
public class UnitClassStringConverter extends StringConverter<Class<? extends Units.Unit>> {
    @Override
    public String toString(Class<? extends Units.Unit> clazz) {
        if (clazz != null) {
            return clazz.getSimpleName();
        }
        return null;
    }

    @Override
    public Class<? extends Units.Unit> fromString(String string) {
        return null; // Not needed for our use case
    }
}

