package calculator;

import java.util.Objects;
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
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/MainView.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/icon.png")));
            stage.getIcons().add(icon);
            stage.setTitle("Calculator Cucumber");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
            root.requestFocus();
        } catch (Exception e) {
            logger.error("Erreur lors du chargement de l'interface utilisateur", e);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
