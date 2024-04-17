package calculator.time;

import calculator.AppStarter;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.junit.jupiter.api.BeforeEach;

@ExtendWith(ApplicationExtension.class)
//TODO add unit change tests
public class TestTimeGui {
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
        Assertions.assertEquals("CET", display.getText());
        fxRobot.clickOn("#btnClear");
        fxRobot.clickOn("#btnColon");
        Assertions.assertEquals(":", display.getText());
        fxRobot.clickOn("#btnClear");
        fxRobot.clickOn("#btnAM");
        Assertions.assertEquals("AM", display.getText());
        fxRobot.clickOn("#btnClear");
        fxRobot.clickOn("#btnPM");
        Assertions.assertEquals("PM", display.getText());
    }

    @Test
    void testTime(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnPM");
        fxRobot.clickOn("#btnTimeZone");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn6");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("16:34:25", display.getText());
    }

    @Test
    void testDateTime(FxRobot fxRobot){
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("2022:10:20:21:34:25", display.getText());
    }

    @Test
    void testTimeSum(FxRobot fxRobot){
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnPM");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnAM");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("20:08:50", display.getText());
    }

    @Test
    void testTimeSubtract(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnPM");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnPM");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("00:00:00", display.getText());
    }

    @Test
    void testPrefix(FxRobot fxRobot){
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn8");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("02:00:00", display.getText());
    }

    @Test
    void testPostfix(FxRobot fxRobot){
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn8");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("02:00:00", display.getText());
    }
}
