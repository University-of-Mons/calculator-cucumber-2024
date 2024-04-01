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

    private static Calculator calculator = new Calculator();

    @Override
    public void start(Stage stage_) {
        stage = stage_;

        Scenes.MainScene = SceneLoader.load("MainScene.fxml");
        stage.setResizable(false);
        stage.setTitle("Please use gradle instead of maven");
        stage.setScene(Scenes.MainScene);
        stage.show();
    }

    public static MyNumber eval(Expression expression) {
        return calculator.eval(expression);
    }
}
