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

public class GuiMain extends Application {

    private static final Logger logger = LoggerFactory.getLogger(GuiMain.class);

    @Override
    public void start(Stage stage) {
        Scene scene = createScene();

        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/icon.png")));
        stage.getIcons().add(icon);
        stage.setTitle("Calculator Cucumber");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public Scene createScene(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/GuiMainView.fxml"));
            Parent root = loader.load();
            root.requestFocus();
            return new Scene(root);
        } catch (Exception e) {
            logger.error("Erreur lors du chargement de l'interface utilisateur", e);
        }
        return null;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
