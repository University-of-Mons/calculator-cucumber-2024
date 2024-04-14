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

    /**
     * Helper for checkAvailableUnits with the speed units.
     */
    @Test
    void checkAvailableSpeedUnits(FxRobot robot) {
        List<String> expectedItems = Arrays.stream(Units.Speed.values())
                .map(Units.Unit::getSymbol)
                .toList();
        checkAvailableUnits(robot, "#speedConversionModeItem", expectedItems);
    }

    /**
     * Helper for checkAvailableUnits with the weight units.
     */
    @Test
    void checkAvailableWeightUnits(FxRobot robot) {
        List<String> expectedItems = Arrays.stream(Units.Weight.values())
                .map(Units.Unit::getSymbol)
                .toList();
        checkAvailableUnits(robot, "#weightConversionModeItem", expectedItems);
    }

    /**
     * Helper for checkAvailableUnits with the distance units.
     */
    @Test
    void checkAvailableDistanceUnits(FxRobot robot) {
        List<String> expectedItems = Arrays.stream(Units.Distance.values())
                .map(Units.Unit::getSymbol)
                .toList();
        checkAvailableUnits(robot, "#distanceConversionModeItem", expectedItems);
    }

    /**
     * Helper for checkAvailableUnits with the time units.
     */
    @Test
    void checkAvailableTimeUnits(FxRobot robot) {
        List<String> expectedItems = Arrays.stream(Units.Time.values())
                .map(Units.Unit::getSymbol)
                .toList();
        checkAvailableUnits(robot, "#timeConversionModeItem", expectedItems);
    }

    /**
     * Selects the unit type and triggers the verification of the available units.
     */
    private void checkAvailableUnits(FxRobot robot, String conversionModeItem, List<String> units) {
        try {
            selectConversionMode(conversionModeItem);
            verifyUnitSelectors(units);
        } catch (FxRobotException e) {
            fail();
        }
    }

    /**
     * Selects the unit type that we are going to verify (speed, weight...).
     */
    private void selectConversionMode(String conversionModeItem) {
        clickOn("#conversionModeSelector");
        clickOn(conversionModeItem);
    }

    /**
     * Constructs three lists :
     *  - the expected units,
     *  - the units of the first unit selector and
     *  - the units of the second unit selector.
     *  Then, verifies that both unit selectors have all expected units available.
     * @param units The units of the enum that we are testing (example : Units.Speed.values()).
     */
    private void verifyUnitSelectors(List<String> units) {
        MenuButton firstUnitSelector = lookup("#firstUnitSelector").query();
        List<String> firstSelectorItems = firstUnitSelector.getItems().stream()
                .map(MenuItem::getText)
                .collect(Collectors.toList());
        Assertions.assertThat(firstSelectorItems).containsExactlyInAnyOrderElementsOf(units);

        MenuButton secondUnitSelector = lookup("#secondUnitSelector").query();
        List<String> secondSelectorItems = secondUnitSelector.getItems().stream()
                .map(MenuItem::getText)
                .collect(Collectors.toList());
        Assertions.assertThat(secondSelectorItems).containsExactlyInAnyOrderElementsOf(units);
    }
}