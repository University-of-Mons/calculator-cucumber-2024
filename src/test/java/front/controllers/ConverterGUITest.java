package front.controllers;

import back.calculator.App;
import front.scenes.SceneLoader;
import front.scenes.Scenes;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.api.FxRobotException;
import org.testfx.api.FxToolkit;
import org.testfx.assertions.api.Assertions;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;

import java.util.concurrent.TimeoutException;

import static org.junit.jupiter.api.Assertions.fail;


@ExtendWith(ApplicationExtension.class)
class ConverterGUITest extends ApplicationTest {
    private static Stage stage;

    private static final String inputField = "#inputField";

    /**
     * Will be called with {@code @Before} semantics, i.e. before each test method.
     *
     * @param stage_ - Will be injected by the test runner.
     */
    @Override
    public void start(Stage stage_) {
        stage = stage_;

        stage.setResizable(false);
        stage.setTitle("Amazing Calculator");
        stage.setScene(Scenes.CONVERTER_SCENE);
        stage.show();
    }

    @AfterEach
    void afterTest() throws TimeoutException {
        FxToolkit.hideStage();
        release(new KeyCode[]{});
        release(new MouseButton[]{});
    }

    @BeforeEach
    void clear() {
        clickOn("#clear");
        Assertions.assertThat((TextField) lookup(inputField).query()).hasText("");
    }

    @Test
    void checkNumberButtons(FxRobot robot) {
        clickOn("#one");
        clickOn("#two");
        clickOn("#three");
        clickOn("#four");
        clickOn("#five");
        clickOn("#six");
        clickOn("#seven");
        clickOn("#eight");
        clickOn("#nine");
        clickOn("#dot");
        clickOn("#zero");
        clickOn("#zero");
        clickOn("#zero");
        Assertions.assertThat((TextField) lookup(inputField).query()).hasText("123456789,000");
    }

    @Test
    void checkAvailableConversions(FxRobot robot) {
        try {
            clickOn("#conversionModeSelector");
            clickOn("#speedConversionModeItem");
            clickOn("#conversionModeSelector");
            clickOn("#weightConversionModeItem");
            clickOn("#conversionModeSelector");
            clickOn("#distanceConversionModeItem");
            clickOn("#conversionModeSelector");
            clickOn("#timeConversionModeItem");
        } catch (FxRobotException e) {
            fail();
        }
    }
}