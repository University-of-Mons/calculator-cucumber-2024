package front.scenes;

import javafx.scene.Scene;

/**
 * Holds every required Scene for the Application.
 **/
public final class Scenes {
    public static final Scene MAIN_SCENE = SceneLoader.load("MainScene.fxml");
    public static final Scene CONVERTER_SCENE = SceneLoader.load("ConverterScene.fxml");

    private Scenes() {
        // Private constructor to hide the implicit public one
        throw new IllegalStateException("Utility class");
    }
}
