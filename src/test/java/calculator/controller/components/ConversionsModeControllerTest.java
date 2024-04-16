package calculator.controller.components;

import calculator.AppStarter;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

@ExtendWith(ApplicationExtension.class)
class ConversionsModeControllerTest {
    private final AppStarter guiStarter = new AppStarter();
    @Start
    private void start(Stage stage) {
        guiStarter.start(stage);
    }

    @BeforeEach
    void setUp(FxRobot fxRobot){
        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#conversionsMode");
    }

    @Test
    void testClick(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        TextField textFieldFrom1 = fxRobot.lookup("#textFieldFrom1").queryAs(TextField.class);
        Assertions.assertEquals("1", textFieldFrom1.getText());
    }

    @Test
    void testClickDecimal(FxRobot fxRobot){
        fxRobot.clickOn("#textFieldFrom2");
        fxRobot.clickOn("#btn6");
        TextField textFieldFrom2 = fxRobot.lookup("#textFieldFrom2").queryAs(TextField.class);
        Assertions.assertEquals("6", textFieldFrom2.getText());
    }

    @Test
    void testClickInteger(FxRobot fxRobot){
        fxRobot.clickOn("#textFieldFrom2");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#textFieldFrom1");
        fxRobot.clickOn("#btn2");
        TextField textFieldFrom1 = fxRobot.lookup("#textFieldFrom1").queryAs(TextField.class);
        Assertions.assertEquals("2", textFieldFrom1.getText());
    }

    @Test
    void testDelete(FxRobot fxRobot){
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnDelete");
        TextField textFieldFrom1 = fxRobot.lookup("#textFieldFrom1").queryAs(TextField.class);
        Assertions.assertEquals("3", textFieldFrom1.getText());
        fxRobot.clickOn("#textFieldFrom2");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btn7");
        fxRobot.clickOn("#btnDelete");
        TextField textFieldFrom2 = fxRobot.lookup("#textFieldFrom2").queryAs(TextField.class);
        Assertions.assertEquals("4", textFieldFrom2.getText());
    }

    @Test
    void testClear(FxRobot fxRobot){
        fxRobot.clickOn("#btn8");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnClear");
        TextField textFieldFrom1 = fxRobot.lookup("#textFieldFrom1").queryAs(TextField.class);
        Assertions.assertEquals("", textFieldFrom1.getText());
        fxRobot.clickOn("#textFieldFrom2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btn7");
        fxRobot.clickOn("#btnDelete");
        TextField textFieldFrom2 = fxRobot.lookup("#textFieldFrom2").queryAs(TextField.class);
        Assertions.assertEquals("5", textFieldFrom2.getText());
    }

    @Test
    void testConvertInteger(FxRobot fxRobot){
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn6");
        fxRobot.clickOn("#btnConvert");
        TextField textFieldTo1 = fxRobot.lookup("#textFieldTo1").queryAs(TextField.class);
        Assertions.assertEquals("2600", textFieldTo1.getText());
        TextField textFieldTo2 = fxRobot.lookup("#textFieldTo2").queryAs(TextField.class);
        Assertions.assertEquals("0", textFieldTo2.getText());
    }

    @Test
    void testConvertDecimal(FxRobot fxRobot){
        fxRobot.clickOn("#textFieldFrom2");
        fxRobot.clickOn("#btn8");
        fxRobot.clickOn("#btnConvert");
        TextField textFieldTo1 = fxRobot.lookup("#textFieldTo1").queryAs(TextField.class);
        Assertions.assertEquals("80", textFieldTo1.getText());
        TextField textFieldTo2 = fxRobot.lookup("#textFieldTo2").queryAs(TextField.class);
        Assertions.assertEquals("0", textFieldTo2.getText());
    }

    @Test
    void testConvert(FxRobot fxRobot){
        fxRobot.clickOn("#btnConvert");
        TextField textFieldTo1 = fxRobot.lookup("#textFieldTo1").queryAs(TextField.class);
        Assertions.assertEquals("", textFieldTo1.getText());
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#textFieldFrom2");
        fxRobot.clickOn("#btn6");
        fxRobot.clickOn("#btn9");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnConvert");
        textFieldTo1 = fxRobot.lookup("#textFieldTo1").queryAs(TextField.class);
        Assertions.assertEquals("1369", textFieldTo1.getText());
        TextField textFieldTo2 = fxRobot.lookup("#textFieldTo2").queryAs(TextField.class);
        Assertions.assertEquals("2", textFieldTo2.getText());
    }
}