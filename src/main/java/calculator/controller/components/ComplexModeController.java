package calculator.controller.components;

import calculator.Calculator;
import calculator.Parser;
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

public class ComplexModeController implements Initializable {

    // TODO : Vérifier, utilisez private avec l'annotation @FXML pour les champs et méthodes qui sont utilisés uniquement
    //  à l'intérieur de la classe de contrôleur.
    // TODO : Traduire en anglais si jamais il y a du français

    public static final String STANDARD_MODE = "Standard";
    public static final String RATIONAL_MODE = "Rational";
    public static final String COMPLEX_MODE = "Complex";
    public static final int BUTTON_SIZE = 120;
    private static final Logger logger = LoggerFactory.getLogger(ComplexModeController.class);

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
    @FXML
    private Button btnExtension1, btnExtension2, btnExtension3, btnExtension4, btnExtension5; // unused

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

    // Display event handlers
    public void appendToDisplay(String text) {
        if (resetDisplay) {
            expression.appendText(display.getText());
            display.clear();
        }
        display.appendText(text);
        resetDisplay = false;
    }

    // Setters
    public void setDisplayTextField(TextField display) {
        this.display = display;
    }

    public void setExpressionTextField(TextField expression) {
        this.expression = expression;
    }

    public void onExtension(ActionEvent actionEvent) {
        // just an example
    }
}
