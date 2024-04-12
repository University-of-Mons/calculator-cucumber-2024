package calculator;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

import calculator.controller.MainViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppStarter extends Application {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/", "="));
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/MainView.fxml"));
            Parent root = loader.load();
            MainViewController mainViewController = loader.getController();
            mainViewController.setStage(stage);
            Scene scene = new Scene(root);

            // addKeyListeners(scene, mainViewController);

            Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/icon.png")));
            stage.getIcons().add(icon);
            stage.setTitle("Calculator Cucumber");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
            root.requestFocus();
        } catch (IOException e) {
            logger.error("Erreur lors du chargement de l'interface utilisateur", e);
        }
    }

    /* private void addKeyListeners(Scene scene, MainViewController mainViewController) {
        // to pass this method like python
        scene.setOnKeyPressed(event -> {
                String text = event.getText();
                if (Character.isDigit(text.charAt(0))) {
                    mainViewController.appendToDisplay(text);
                } else if (operators.contains(text)) {
                    if (text.equals("=")) {
                        mainViewController.onEquals();
                    } else if (text.equals("/")) {
                        mainViewController.appendToDisplay("÷");
                    } else {
                        mainViewController.appendToDisplay(text);
                    }
                }
                // Zoom in/out with Ctrl + "+/-"
                if (event.isControlDown()) {
                    switch (event.getCode()) {
                        case ADD:
                            mainViewController.displayZoomIn();
                            break;
                        case MINUS:
                            mainViewController.displayZoomOut();
                            break;
                        case DEAD_GRAVE:
                            mainViewController.displayDefaultZoom();
                            break;
                        default:
                            break;
                    }
                }
            });
    } */

    public static void main(String[] args) {
        launch(args);
    }
}
