package front.controllers;

import back.converter.Units;
import front.scenes.Scenes;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import org.junit.jupiter.api.*;
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

    private static final Logger logger = LoggerFactory.getLogger(ConverterGUITest.class);

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
        checkAvailableUnits(robot, expectedItems, 0);
    }

    /**
     * Helper for checkAvailableUnits with the weight units.
     */
    @Test
    void checkAvailableWeightUnits(FxRobot robot) {
        List<String> expectedItems = Arrays.stream(Units.Weight.values())
                .map(Units.Unit::getSymbol)
                .toList();
        checkAvailableUnits(robot, expectedItems, 1);
    }

    /**
     * Helper for checkAvailableUnits with the distance units.
     */
    @Test
    void checkAvailableDistanceUnits(FxRobot robot) {
        List<String> expectedItems = Arrays.stream(Units.Distance.values())
                .map(Units.Unit::getSymbol)
                .toList();
        checkAvailableUnits(robot, expectedItems, 2);
    }

    /**
     * Helper for checkAvailableUnits with the time units.
     */
    @Test
    void checkAvailableTimeUnits(FxRobot robot) {
        List<String> expectedItems = Arrays.stream(Units.Time.values())
                .map(Units.Unit::getSymbol)
                .toList();
        checkAvailableUnits(robot, expectedItems, 3);
    }

    /**
     * Helper for checkAvailableUnits with the angles units.
     */
    @Test
    void checkAvailableAnglesUnits(FxRobot robot){
        List<String> expectedItems = Arrays.stream(Units.Angles.values())
                .map(Units.Unit::getSymbol)
                .toList();
        checkAvailableUnits(robot, expectedItems, 4);
    }

    /**
     * Selects the unit type and triggers the verification of the available units.
     */
    private void checkAvailableUnits(FxRobot robot, List<String> units, int indexToClick) {
        try {
            selectConversionMode(indexToClick);
            verifyUnitSelectors(units);
            resetConversionMode();
        } catch (FxRobotException e) {
            fail();
        }
    }

    /**
     * Selects the unit type that we are going to verify (speed, weight...).
     */
    private void selectConversionMode(int indexToClick) {
        ComboBox<Class<? extends Units.Unit>> selector = lookup("#conversionModeSelector").queryComboBox();
        clickOn(selector);
        for (int i = 0; i < indexToClick; i++) {
            type(KeyCode.DOWN);
        }
        type(KeyCode.ENTER);
    }

    /**
     * Resets the conversion mode to speed : move the select back to the top of the combo box's list of elements.
     */
    private void resetConversionMode() {
        ComboBox<Class<? extends Units.Unit>> selector = lookup("#conversionModeSelector").queryComboBox();
        clickOn(selector);
        for (int i = 0; i < 10; i++) {
            type(KeyCode.UP);
        }
        type(KeyCode.ENTER);
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
        ComboBox<Units.Unit> firstUnitSelector = lookup("#firstUnitSelector").queryComboBox();
        List<String> firstSelectorItems = firstUnitSelector.getItems().stream()
                .map(Units.Unit::getSymbol)
                .collect(Collectors.toList());

        Assertions.assertThat(firstSelectorItems).containsExactlyInAnyOrderElementsOf(units);

        ComboBox<Units.Unit> secondUnitSelector = lookup("#secondUnitSelector").queryComboBox();
        List<String> secondSelectorItems = secondUnitSelector.getItems().stream()
                .map(Units.Unit::getSymbol)
                .collect(Collectors.toList());

        Assertions.assertThat(secondSelectorItems).containsExactlyInAnyOrderElementsOf(units);
    }

    /**
     * Test the conversion history
     */
    @Test
    void testHistory(FxRobot robot) {
        // Input 1000 in weight conversion (1000 grams by default)
        selectConversionMode(1);
        clickOn("#one");

        // Select kilogram as second unit
        ComboBox<Units.Unit> secondUnitSelector = lookup("#secondUnitSelector").queryComboBox();
        clickOn(secondUnitSelector);
        type(KeyCode.DOWN);
        type(KeyCode.ENTER);

        zeroZeroZeroEquals();
        // Expected : 1 kilogram
        Assertions.assertThat((TextField) lookup(inputFieldId).query()).hasText("1");

        // Fill history
        for (int i = 0; i < 4; i++) zeroZeroZeroEquals();

        // Verify history
        Assertions.assertThat((Label) lookup("#lastExpression").query()).hasText("1000g");
        Assertions.assertThat((Label) lookup("#lastResult").query()).hasText("1kg");
        Assertions.assertThat((Label) lookup("#lastExpression1").query()).hasText("1000g");
        Assertions.assertThat((Label) lookup("#lastResult1").query()).hasText("1kg");
        Assertions.assertThat((Label) lookup("#lastExpression2").query()).hasText("1000g");
        Assertions.assertThat((Label) lookup("#lastResult2").query()).hasText("1kg");
        Assertions.assertThat((Label) lookup("#lastExpression3").query()).hasText("1000g");
        Assertions.assertThat((Label) lookup("#lastResult3").query()).hasText("1kg");
        Assertions.assertThat((Label) lookup("#lastExpression4").query()).hasText("1000g");
        Assertions.assertThat((Label) lookup("#lastResult4").query()).hasText("1kg");
        resetConversionMode();
    }

    /**
     * Inputs three zeroes and presses enter.
     */
    void zeroZeroZeroEquals() {
        clickOn("#zero");
        clickOn("#zero");
        clickOn("#zero");
        // Trigger conversion with keyboard shortcut (variation from previous tests)
        type(KeyCode.ENTER);
    }
}