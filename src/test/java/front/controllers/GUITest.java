package front.controllers;

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
import org.testfx.api.FxToolkit;
import org.testfx.assertions.api.Assertions;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;

import java.util.concurrent.TimeoutException;


@ExtendWith(ApplicationExtension.class)
class GUITest extends ApplicationTest {
    private static Stage stage;

    private static final String OUTPUT_FIELD = "#outputField";

    /**
     * Will be called with {@code @Before} semantics, i.e. before each test method.
     *
     * @param stage_ - Will be injected by the test runner.
     */
    @Override
    public void start(Stage stage_) {
        stage = stage_;

        //Scenes.setMainScene(SceneLoader.load("MainScene.fxml"));
        stage.setResizable(false);
        stage.setTitle("Please use gradle instead of maven");
        stage.setScene(Scenes.MAIN_SCENE);
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
        Assertions.assertThat((TextField) lookup(OUTPUT_FIELD).query()).hasText("");
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
        clickOn("#coma");
        clickOn("#zero");
        clickOn("#zero");
        clickOn("#zero");
        Assertions.assertThat((TextField) lookup(OUTPUT_FIELD).query()).hasText("123456789.,000");
    }

    @Test
    void checkOperandButtons(FxRobot robot) {
        clickOn("#add");
        clickOn("#minus");
        clickOn("#multiply");
        clickOn("#divide");
        clickOn("#openParen");
        clickOn("#closeParen");
        clickOn("#modulus");
        clickOn("#eNotation");
        clickOn("#i");
        clickOn("#pi");
        clickOn("#exp");
        Assertions.assertThat((TextField) lookup(OUTPUT_FIELD).query()).hasText("+-*/()|Eipiexp");
    }
    @Test
    void checkSinButton(FxRobot robot) {
        clickOn("#sin");
        Assertions.assertThat((TextField) lookup(OUTPUT_FIELD).query()).hasText("sin");
    }

    @Test
    void checkCosButton(FxRobot robot) {
        clickOn("#cos");
        Assertions.assertThat((TextField) lookup(OUTPUT_FIELD).query()).hasText("cos");
    }

    @Test
    void checkLnButton(FxRobot robot) {
        clickOn("#ln");
        Assertions.assertThat((TextField) lookup(OUTPUT_FIELD).query()).hasText("ln");
    }

    @Test
    void testFormButton(FxRobot robot) {
        // create 4+4i
        clickOn("#four");
        clickOn("#add");
        clickOn("#four");
        clickOn("#i");
        Assertions.assertThat((TextField) lookup(OUTPUT_FIELD).query()).hasText("4+4i");

        clickOn("#formSelector");
        // Select cartesian
        type(KeyCode.DOWN);
        type(KeyCode.ENTER);
        Assertions.assertThat((TextField) lookup(OUTPUT_FIELD).query()).hasText("4+4i");

        // Select polar
        clickOn("#formSelector");
        type(KeyCode.DOWN);
        type(KeyCode.DOWN);
        type(KeyCode.ENTER);
        // 4 sqrt(2) (cos(pi/4)+isin(pi/4))
        Assertions.assertThat((TextField) lookup(OUTPUT_FIELD).query()).hasText("5.6569(cos(0.7854)+isin(0.7854))");

        clickOn("#clear");
        // create 4+4i
        clickOn("#four");
        clickOn("#add");
        clickOn("#four");
        clickOn("#i");
        clickOn("#formSelector");
        // Select Exp
        type(KeyCode.DOWN);
        type(KeyCode.DOWN);
        type(KeyCode.DOWN);
        type(KeyCode.ENTER);
        // 4 sqrt(2) e^(i pi/4)
        Assertions.assertThat((TextField) lookup(OUTPUT_FIELD).query()).hasText("5.6569exp(0.7854i)");


    }


    @Test
    void checkEqualsButton(FxRobot robot) {
        clickOn("#one");
        clickOn("#add");
        clickOn("#four");
        clickOn("#equals");
        Assertions.assertThat((TextField) lookup(OUTPUT_FIELD).query()).hasText("5");
    }
}