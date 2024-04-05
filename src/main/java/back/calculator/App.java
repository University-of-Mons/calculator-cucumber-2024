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
public class App extends Application {

    public static String userInput = "";

    private static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stageP) {
        Stage stage = stageP;

        Scenes.mainScene = SceneLoader.load("MainScene.fxml");
        stage.setResizable(false);
        stage.setTitle("Amazing Calculator");
        stage.setScene(Scenes.mainScene);
        stage.show();
    }

    public static MyNumber eval(Expression expression) {
        return calculator.eval(expression);
    }

    public static Expression evalUserInput() {
        return calculator.eval(calculator.read(App.userInput));
    }
}
