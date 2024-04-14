package calculator;

import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.junit.jupiter.api.BeforeEach;

@ExtendWith(ApplicationExtension.class)

public class TestTimeGUI {
    private final AppStarter guiStarter = new AppStarter();
    @Start
    private void start(Stage stage) {
        guiStarter.start(stage);
    }

    @BeforeEach
    void setUp(FxRobot fxRobot){
        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#timeMode");
    }

    @Test
    void testClickNewButtons(FxRobot fxRobot){
        fxRobot.clickOn("#btnTimeZone");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("CET+", display.getText());
        fxRobot.clickOn("#btnClear");
        fxRobot.clickOn("#btnSplitTime");
        Assertions.assertEquals(":", display.getText());
        fxRobot.clickOn("#btnClear");
        fxRobot.clickOn("#btnAM");
        Assertions.assertEquals("AM", display.getText());
        fxRobot.clickOn("#btnClear");
        fxRobot.clickOn("#btnPM");
        Assertions.assertEquals("PM", display.getText());
    }
}
