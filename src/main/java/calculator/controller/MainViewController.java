package calculator.controller;

import calculator.Calculator;
import calculator.Parser;
import calculator.controller.components.ComplexModeController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    // TODO : Vérifier, utilisez private avec l'annotation @FXML pour les champs et méthodes qui sont utilisés uniquement
    //  à l'intérieur de la classe de contrôleur.
    // TODO : Traduire en anglais si jamais il y a du français

    public static final String STANDARD_MODE = "Standard";
    public static final String RATIONAL_MODE = "Rational";
    public static final String COMPLEX_MODE = "Complex";
    public static final int BUTTON_SIZE = 120;
    private static final Logger logger = LoggerFactory.getLogger(MainViewController.class);

    @FXML
    private BorderPane root;
    @FXML
    private CheckMenuItem standardMode, rationalMode, complexMode; // unused
    @FXML
    private Menu modeMenu, zoomMenu; // unused
    @FXML
    private MenuItem zoomIn, zoomOut, zoomDefault; // unused
    @FXML
    private VBox displayContainer; // unused
    @FXML
    private TextField display, expression;
    @FXML
    private Button btnDivide, btnMultiply, btnMinus, btnPlus, btnEquals; // unused
    @FXML
    private Button btnOpenParenthesis, btnCloseParenthesis, btnComma, btnClear, btnRetrieve, btnDelete; // unused
    @FXML
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9; // unused

    private Stage stage;
    private String currentMode = STANDARD_MODE;
    private boolean resetDisplay = false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}

    // Button click event handlers
    @FXML
    public void onNumber(ActionEvent event) {
        Button button = (Button) event.getSource();
        appendToDisplay(button.getText());
    }

    public void onDivide() {
        appendToDisplay("/");
    }

    public void onMultiply() {
        appendToDisplay("*");
    }

    public void onMinus() {
        appendToDisplay("-");
    }

    public void onPlus() {
        appendToDisplay("+");
    }

    public void onEquals() {
        if (!resetDisplay && !display.getText().equals("0")) {
            expression.setText(display.getText()+" = ");
            Calculator calculator = new Calculator();
            try{
                Parser parser = new Parser(display.getText(), calculator);
                display.setText(parser.evaluate().toString());}
            catch (Exception e){
                display.setText("Error");
            }
            resetDisplay = true;
        }
    }

    public void onOpenParenthesis() {
        appendToDisplay("(");
    }

    public void onCloseParenthesis() {
        appendToDisplay(")");
    }

    public void onComma() {
        if (resetDisplay) {
            display.setText("0,");
            resetDisplay = false;
        } else {
            display.appendText(",");
        }
    }

    public void onClear() {
        if (resetDisplay) {
            expression.appendText(display.getText());
        }
        display.clear();
    }

    @FXML
    public void onDelete() {
        if (resetDisplay) {
            expression.appendText(display.getText());
            display.clear();
        }
        if (!display.getText().isEmpty()) {
            display.setText(display.getText(0, display.getText().length() - 1));
        }
    }

    public void onRetrieve() {
        String expressionString = expression.getText();
        int index = expressionString.lastIndexOf("=");
        if (index != -1 && index < expressionString.length() - 2) {
            String retrieved = expressionString.substring(index + 2);
            if (!retrieved.equals(display.getText())) {
                display.setText(display.getText() + retrieved);
                resetDisplay = false;
            }
        }
    }

    // Mode change event handlers
    @FXML
    private void onStandardMode() {
        updateButtonsForMode(STANDARD_MODE);
    }

    @FXML
    private void onRationalMode() {
        updateButtonsForMode(RATIONAL_MODE);
    }

    @FXML
    private void onComplexMode() {
        updateButtonsForMode(COMPLEX_MODE);
    }

    private void updateButtonsForMode(String mode) {
        // TODO : Renommer les fxml et pas toucher au rationnal, c'est un ancien test
        // TODO : Gérer dans le menu, le mode selectionné
        String fxmlFile = String.format("/fxml/components/%sModeComponent.fxml", mode);
        URL resource = getClass().getResource(fxmlFile);

        if (resource == null) {
            logger.error("Le fichier FXML pour le mode " + mode + " n'a pas été trouvé : " + fxmlFile);
            // Vous pouvez gérer l'erreur comme bon vous semble ici
            // TODO : afficher une pop up erreur utilisateur
        } else {
            try {
                //buttonGrid.getChildren().clear(); // Nettoyez d'abord le contenu actuel
                FXMLLoader loader = new FXMLLoader(resource);
                GridPane complexGrid = loader.load();
                // Récupérer le contrôleur pour le mode complexe et lui passer les champs
                ComplexModeController complexModeController = loader.getController();
                complexModeController.setDisplayTextField(display);
                complexModeController.setExpressionTextField(expression);

                stage.setWidth(stage.getWidth() + BUTTON_SIZE);
                root.setCenter(complexGrid);
            } catch (IOException e) {
                logger.error("Erreur lors du chargement des boutons pour le mode " + mode, e);
            }
        }
    }

    // Display event handlers
    public void appendToDisplay(String text) {
        if (resetDisplay) {
            expression.appendText(display.getText());
            display.clear();
        }
        display.appendText(text);
        resetDisplay = false;
    }

    public void displayZoomIn() {
        double size = display.getFont().getSize();
        if (size < 72) {
            display.setStyle("-fx-font-size: " + (size + 2) + "px;");
        }
    }

    public void displayZoomOut() {
        double size = display.getFont().getSize();
        display.setStyle("-fx-font-size: " + (size - 2) + "px;");
    }

    public void displayDefaultZoom() {
        display.setStyle("-fx-font-size: 72px;");
    }

    // Setters
    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
