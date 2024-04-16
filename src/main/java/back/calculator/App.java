package back.calculator;

import back.calculator.types.MyNumber;
import back.converter.Converter;
import back.converter.Units;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import front.scenes.Scenes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


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

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    private static boolean isRationalMode = true; // TODO : Turn this on

    private static final Calculator calculator = new Calculator();

    public static void main(String[] args) {
        logger.info("Starting the application");
        launch(args);
    }

    @Override
    public void start(Stage _stage) {
        stage = _stage;
        stage.setResizable(false);
        stage.setTitle("Amazing Calculator");
        setScene(Scenes.CONVERTER_SCENE);
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

    public static Logger getLogger() {
        return logger;
    }

    public static boolean isRationalMode() {
        return isRationalMode;
    }

    public static MyNumber convert(float value, Units.Unit from, Units.Unit to) {
        return Converter.convert(value, from, to);
    }
}
