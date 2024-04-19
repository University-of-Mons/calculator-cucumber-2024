package front.scenes;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class TestScenes {

    @Test
    void testConstructor() {
        // Test that the constructor is private
        // and throws an exception
        try {
            Constructor<Scenes> c = Scenes.class.getDeclaredConstructor();
            c.setAccessible(true);
            c.newInstance();
        } catch (InvocationTargetException e) {
            assertInstanceOf(IllegalStateException.class, e.getCause());
        } catch (Exception e) {
            fail("No constructor found in SceneLoader class");
        }
    }
}
