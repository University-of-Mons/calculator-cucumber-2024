package calculator.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ComplexModeController implements Initializable {

    private static final Logger logger = LoggerFactory.getLogger(ComplexModeController.class);

    @FXML
    private GridPane complexGrid;
    @FXML
    public Button btnExtension;
    @FXML
    private Button btnOpenParenthesis, btnCloseParenthesis, btnComma, btnClear, btnDivide, btnMultiply, btnMinus, btnPlus;
    @FXML
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnEquals;

    private boolean resetDisplay = true;
    private TextField display, expression;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}
    /*public void appendToDisplay(String text) {
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
    private void onStandardMode(ActionEvent actionEvent) {
        try {
            // Chargement de la nouvelle scène pour le mode complexe
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/GuiMainView.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            // Obtention de la scène actuelle et mise à jour avec la nouvelle scène
            Stage stage = (Stage) ((MenuItem) actionEvent.getSource()).getParentPopup().getOwnerWindow();
            stage.setScene(scene);
            stage.show();

            root.requestFocus();
        } catch (IOException e) {
            logger.error("Error loading standard mode", e);
        }    }

    @FXML
    private void onRationalMode(ActionEvent actionEvent) {
        // we already are in rational mode
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

    public void setDisplayTextField(TextField display) {
            this.display = display;
    }

    public void setExpressionTextField(TextField expression) {
            this.expression = expression;
    }

    public void onExtension(ActionEvent actionEvent) {
    }*/
}
