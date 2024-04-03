package calculator;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

import calculator.controller.GuiMainViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuiMain extends Application {

    private static final Logger logger = LoggerFactory.getLogger(GuiMain.class);
    private static final Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/", "="));

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/GuiMainView.fxml"));
            Parent root = loader.load();
            GuiMainViewController controller = loader.getController();
            Scene scene = new Scene(root);

            // Event handler for key pressed
            scene.setOnKeyPressed(event -> {
                String text = event.getText();
                if (Character.isDigit(text.charAt(0))) {
                    controller.appendToDisplay(text);
                } else if (operators.contains(text)) {
                    if (text.equals("=")) {
                        controller.onEquals();
                    } else if (text.equals("/")) {
                        controller.appendToDisplay("÷");
                    } else {
                        controller.appendToDisplay(text);
                    }
                }
                // Zoom in/out with Ctrl + +/-
                if (event.isControlDown()) {
                    switch (event.getCode()) {
                        case ADD:
                            controller.displayZoomIn();
                            break;
                        case MINUS:
                            controller.displayZoomOut();
                            break;
                        case DEAD_GRAVE:
                            controller.displayDefaultZoom();
                            break;
                        default:
                            break;
                    }
                }
            });

            Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/icon.png")));
            stage.getIcons().add(icon);
            stage.setTitle("Calculator Cucumber");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();

            root.requestFocus();
        } catch (IOException e) {
            logger.error("Error when loading user interface", e);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
