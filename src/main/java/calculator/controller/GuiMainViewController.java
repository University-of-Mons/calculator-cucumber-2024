package calculator.controller;

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
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GuiMainViewController implements Initializable {

    // TODO : Vérifier, utilisez public pour les méthodes de contrôleur qui sont appelées par le fichier FXML,
    //  et utilisez private avec l'annotation @FXML pour les champs et méthodes qui sont utilisés uniquement
    //  à l'intérieur de la classe de contrôleur.

    private static final Logger logger = LoggerFactory.getLogger(GuiMainViewController.class);

    @FXML
    private CheckMenuItem standardMode, rationalMode;
    @FXML
    private TextField display, expression;
    @FXML
    private Button btnOpenParenthesis, btnCloseParenthesis, btnComma, btnClear, btnDivide, btnMultiply, btnMinus, btnPlus;
    @FXML
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnEquals;

    private boolean resetDisplay = true;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        standardMode.setSelected(true);
    }

    public void appendToDisplay(String text) {
        if (resetDisplay) {
            expression.appendText(display.getText());
            display.clear();
        }
        display.appendText(text);
        resetDisplay = false;
    }

    public void onEquals() {
        if (!resetDisplay && !display.getText().equals("0")) {
            expression.setText(display.getText()+" = ");
            display.setText("Answer");// TODO : Remplacer "Answer" par le résultat de l'expression
            resetDisplay = true;
        }
    }

    public void onDivide() {
        appendToDisplay("÷");
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
    private void onStandardMode(ActionEvent actionEvent) {
        // we already are in standard mode
    }

    @FXML
    private void onRationalMode(ActionEvent actionEvent) {
        try {
            // Chargement de la nouvelle scène pour le mode complexe
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/rationalModeView.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            // Obtention de la scène actuelle et mise à jour avec la nouvelle scène
            Stage stage = (Stage) ((MenuItem) actionEvent.getSource()).getParentPopup().getOwnerWindow();
            stage.setScene(scene);
            stage.show();

            root.requestFocus();
        } catch (IOException e) {
            logger.error("Error loading rational mode", e);
        }
    }

    public void onOpenParenthesis(ActionEvent actionEvent) {
        appendToDisplay("(");
    }

    public void onCloseParenthesis(ActionEvent actionEvent) {
        // TODO : interdire la fermeture de parenthèse si aucune ouverture
        appendToDisplay(")");
    }

    public void onComma(ActionEvent actionEvent) {
        // TODO : à revoir
        if (resetDisplay) {
            display.setText("0,");
            resetDisplay = false;
        } else if (!display.getText().contains(",")) {
            display.appendText(",");
        }
    }

    public void onClear(ActionEvent actionEvent) {
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
    }

    public void onRetrieve() {
        String expressionString = expression.getText();
        int index = expressionString.lastIndexOf("=");
        if (index != -1 && index < expressionString.length() - 2) {
            String retrieved = expressionString.substring(index + 2);
            if (!retrieved.equals(display.getText())) {
                display.setText(retrieved);
                resetDisplay = false;
            }
        }
    } */
}
