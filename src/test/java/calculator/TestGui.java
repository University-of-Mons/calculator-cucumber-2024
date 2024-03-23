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
    void testNumber1(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        //TODO Vérifier que cliquer sur le bouton 1 affiche bien 1
        //Assertions.assertEquals();
    }

    //TODO Vérifier que 1+1 affiche bien 2 (etc pour toutes les opérations)
}
