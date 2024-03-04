package back.calculator;

import javafx.application.Application;
import javafx.stage.Stage;

import front.scenes.SceneLoader;
import front.scenes.Scenes;

/**
 * A very simple calculator in Java
 * University of Mons - UMONS
 * Software Engineering Lab
 * Faculty of Sciences
 *
 * @author tommens
 */
public class Main extends Application {

    private static Stage stage;

    public static String userInput = "";

    @Override
    public void start(Stage stage_){
        stage = stage_;

        Scenes.MainScene = SceneLoader.load("MainScene.fxml");
        stage.setResizable(false);
        stage.setTitle("Amazing calculator");
        stage.setScene(Scenes.MainScene);
        stage.show();
    }

}
