package front.scenes;

import javafx.scene.Scene;

/**
 * Holds every required Scene for the Application.
 **/
public final class Scenes {
    public final static Scene MAIN_SCENE = SceneLoader.load("MainScene.fxml");

    private Scenes() {
        // Private constructor to hide the implicit public one
        throw new IllegalStateException("Utility class");
    }
}
