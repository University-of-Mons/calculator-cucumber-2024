package calculator;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(ApplicationExtension.class)
public class TestGUI {
    private final GuiMain mainUI = new GuiMain();
    @Start
    private void start(Stage stage) {
        Scene scene = mainUI.createScene();
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/icon.png")));
        stage.getIcons().add(icon);
        stage.setTitle("Calculator Cucumber");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @Test
    void testNumber1(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        //TODO Vérifier que cliquer sur le bouton 1 affiche bien 1
        //Assertions.assertEquals();
    }

    //TODO Vérifier que 1+1 affiche bien 2 (etc pour toutes les opérations)
}
