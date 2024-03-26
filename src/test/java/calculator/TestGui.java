package calculator;

import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

@ExtendWith(ApplicationExtension.class)
public class TestGui {
    private final GuiMain guiMain = new GuiMain();
    @Start
    private void start(Stage stage) {
        guiMain.start(stage);
    }

    @Test
    void testClick(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        //TODO Vérifier que cliquer sur le bouton 1 affiche bien 1
        //Assertions.assertEquals(X, 1);
    }

    @Test
    void testSum(FxRobot fxRobot){
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnEquals");
        //TODO Vérifier que l'affichage est ok
        //Assertions.assertEquals(X, 5);
    }

    @Test
    void testMinus(FxRobot fxRobot){
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnEquals");
        //TODO Vérifier que l'affichage est ok
        //Assertions.assertEquals(X, 1);
    }

    @Test
    void testMultiply(FxRobot fxRobot){
        fxRobot.clickOn("#btn6");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btn7");
        fxRobot.clickOn("#btnEquals");
        //TODO Vérifier que l'affichage est ok
        //Assertions.assertEquals(X, 42);
    }

    @Test
    void testDivide(FxRobot fxRobot){
        fxRobot.clickOn("#btn8");
        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        //TODO Vérifier que l'affichage est ok
        //Assertions.assertEquals(X, 4);
    }

    @Test
    void testDivideBy0(FxRobot fxRobot){
        fxRobot.clickOn("#btn9");
        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnEquals");
        //TODO Vérifier que l'affichage est ok
        //Assertions.assertEquals(X, Nan);
    }

    @Test
    void testClear(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnClear");
        //TODO Vérifier que l'affichage est ok
        //Assertions.assertEquals(X, Vide);
    }
}
