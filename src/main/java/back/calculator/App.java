package back.calculator;

import javafx.application.Application;
import javafx.scene.Scene;
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
    /**
     * Static variable holding the stage of the application. Refer to this variable for any stage modification.
     */
    private static Stage stage;

    private static String userInput = "";

    private static final Calculator calculator = new Calculator();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage _stage) {
        stage = _stage;
        stage.setResizable(false);
        stage.setTitle("Amazing Calculator");
        setScene(Scenes.MAIN_SCENE);
        stage.show();
    }

    /**
     * Set the currently displayed scene.
     * Usage : <code>setScene(Scenes.YOUR_SCENE);</code>
     * @param scene The scene to display
     */
    public static void setScene(Scene scene) {
        stage.setScene(scene);
    }

    public static Expression evalUserInput() {
        return calculator.eval(calculator.read(App.userInput));
    }

    @SuppressWarnings("unused")
    public static String getUserInput() {
        return userInput;
    }

    public static void setUserInput(String userInput) {
        App.userInput = userInput;
    }
}
