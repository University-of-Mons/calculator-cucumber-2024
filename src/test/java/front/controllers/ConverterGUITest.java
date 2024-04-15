package front.controllers;

import back.converter.Units;
import front.scenes.Scenes;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testfx.api.FxRobot;
import javafx.scene.control.*;
import org.testfx.api.FxRobotException;
import org.testfx.api.FxToolkit;
import org.testfx.assertions.api.Assertions;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.fail;


/**
 * Tests for the GUI, more specifically the units converter feature.
 */
@ExtendWith(ApplicationExtension.class)
class ConverterGUITest extends ApplicationTest {
    private static Stage stage;

    /**
     * The id of the input field of the application where the user can input data to be taken into account in
     * computations.
     */
    private static final String inputFieldId = "#inputField";

    private Logger logger = LoggerFactory.getLogger(ConverterGUITest.class);

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

    /**
     * Clears the input.
     */
    @BeforeEach
    void clear() {
        clickOn("#clear");
        Assertions.assertThat((TextField) lookup(inputFieldId).query()).hasText("");
    }

    /**
     * Verifies that all numbers are available.
     */
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
        Assertions.assertThat((TextField) lookup(inputFieldId).query()).hasText("123456789,000");
    }
}