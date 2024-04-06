package calculator.controller;

import calculator.Calculator;
import calculator.Parser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.Parent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GuiMainViewController implements Initializable {

    // TODO : Vérifier, utilisez private avec l'annotation @FXML pour les champs et méthodes qui sont utilisés uniquement
    //  à l'intérieur de la classe de contrôleur.
    // TODO : Traduire en anglais si jamais il y a du français

    private static final Logger logger = LoggerFactory.getLogger(GuiMainViewController.class);

    @FXML
    private CheckMenuItem standardMode, rationalMode, complexMode;
    @FXML
    private VBox displayContainer;
    @FXML
    private TextField display, expression;
    @FXML
    private GridPane buttonGrid;
    @FXML
    private Button btnOpenParenthesis, btnCloseParenthesis, btnComma, btnClear, btnDivide, btnMultiply, btnMinus, btnPlus;
    @FXML
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnEquals;

    private boolean resetDisplay = false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}

    public void appendToDisplay(String text) {
        if (resetDisplay) {
            expression.appendText(display.getText());
            display.clear();
        }
        display.appendText(text);
        resetDisplay = false;
    }

    private void resetDisplay() {
        expression.setText("");
        display.setText("");
    }

    public void onEquals() {
        if (!resetDisplay && !display.getText().equals("0")) {
            expression.setText(display.getText()+" = ");

            // System.out.println("Expression : " + display.getText());
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

    @FXML
    public void onNumber(ActionEvent event) {
        Button button = (Button) event.getSource();
        appendToDisplay(button.getText());
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

    @FXML
    private void onStandardMode(ActionEvent actionEvent) {
        // we already are in standard mode
    }

    @FXML
    private void onRationalMode(ActionEvent actionEvent) {
        updateButtonsForMode("Rational");
    }

    @FXML
    private void onComplexMode(ActionEvent actionEvent) {
        updateButtonsForMode("Complex");
    }

   private void updateButtonsForMode(String mode) {
        // TODO : Renommer les fxml et pas toucher au rationnal, c'est un ancien test
        // TODO : Gérer dans le menu, le mode selectionné
        String fxmlFile = String.format("/fxml/%sMode.fxml", mode);
        URL resource = getClass().getResource(fxmlFile);

        if (resource == null) {
            logger.error("Le fichier FXML pour le mode " + mode + " n'a pas été trouvé : " + fxmlFile);
            // Vous pouvez gérer l'erreur comme bon vous semble ici
            // TODO : afficher une pop up erreur utilisateur
        } else {
            try {
                buttonGrid.getChildren().clear(); // Nettoyez d'abord le contenu actuel
                FXMLLoader loader = new FXMLLoader(resource);
                GridPane complexGrid = loader.load();
                // Récupérer le contrôleur pour le mode complexe et lui passer les champs
                ComplexModeController complexModeController = loader.getController();
                complexModeController.setDisplayTextField(display);
                complexModeController.setExpressionTextField(expression);

                buttonGrid.getChildren().setAll(complexGrid.getChildren()); // Ajoutez les nouveaux boutons
            } catch (IOException e) {
                logger.error("Erreur lors du chargement des boutons pour le mode " + mode, e);
            }
        }
}



    public void onOpenParenthesis(ActionEvent actionEvent) {
        appendToDisplay("(");
    }

    public void onCloseParenthesis(ActionEvent actionEvent) {
        // TODO : interdire la fermeture de parenthèse si aucune ouverture ou pas
        appendToDisplay(")");
    }

    public void onComma(ActionEvent actionEvent) {
        // TODO : à revoir (revu par Samuel)
        if (resetDisplay) {
            display.setText("0,");
            resetDisplay = false;
        } else{
            display.appendText(",");
        }
    }

    public void onClear(ActionEvent actionEvent) {
        if (resetDisplay) {
            expression.appendText(display.getText());
        }
        display.clear();
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


    /* public void onNegate() {
        if (display.getText().equals("0") || resetDisplay) {
            return;
        }
        if (display.getText().charAt(0) == '-') {
            display.setText(display.getText().substring(1));
        } else {
            display.setText("-" + display.getText());
        }
    }

    public void onFraction() {
        if (display.getText().equals("0")||resetDisplay) {
            return;
        }
        display.setText("1/" + display.getText());
    }*/

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
}
