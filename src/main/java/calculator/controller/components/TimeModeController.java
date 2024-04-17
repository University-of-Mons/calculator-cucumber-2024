package calculator.controller.components;

import calculator.Calculator;
import calculator.TimeParser;
import calculator.numbers.MyTime;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class TimeModeController implements Initializable, ModeController {

    @FXML
    private TextField display, expression;
    @FXML
    private Button btnMinus, btnPlus, btnEquals; // unused
    @FXML
    private Button btnOpenParenthesis, btnCloseParenthesis, btnClear, btnRetrieve, btnDelete; // unused
    @FXML
    private Button btnTimeZone, btnComma, btnColon, btnAM, btnPM, btnUnitFull, btnUnitDay, btnUnitHour, btnUnitMin; // unused
    @FXML
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9; // unused

    private boolean resetDisplay = false;
    private MyTime time;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}

    // Button click event handlers
    @FXML
    public void onNumber(ActionEvent event) {
        Button button = (Button) event.getSource();
        appendToDisplay(button.getText());
    }

    public void onMinus() {
        appendToDisplay("-");
    }

    public void onPlus() {
        appendToDisplay("+");
    }

    public void onComma(){
        appendToDisplay(",");
    }

    public void onEquals() {
        //TODO implement correct display of time
        if (!resetDisplay && !display.getText().equals("0")) {
            expression.setText(display.getText()+" = ");
            Calculator calculator = new Calculator();
            try{
                TimeParser parser = new TimeParser(display.getText(), calculator);
                time = parser.evaluate();
                display.setText(
                        time.toString());}
            catch (Exception e){
                display.setText("Error");
            }
            resetDisplay = true;
        }
    }

    public void onTimeZone() {
        appendToDisplay("CET");
    }

    public void onColon() {
        appendToDisplay(":");
    }

    public void onAM() {
        appendToDisplay("AM");
    }

    public void onPM() {
        appendToDisplay("PM");
    }

    public void onUnitFull() {
        //TODO
        //appendToDisplay("+");
    }

    public void onUnitDay() {
        //TODO
        //appendToDisplay("-");
    }

    public void onUnitHour() {
        //TODO
        //appendToDisplay("*");
    }

    public void onUnitMin() {
        //TODO
        //appendToDisplay("/");
    }

    public void onOpenParenthesis() {
        appendToDisplay("(");
    }

    public void onCloseParenthesis() {
        appendToDisplay(")");
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
    @Override
    public void setDisplayTextField(TextField display) {
        this.display = display;
    }

    @Override
    public void setExpressionTextField(TextField expression) {
        this.expression = expression;
    }

    @Override
    public float getPreferredWidth() {
        return 480;
    }

    @Override
    public float getPreferredHeight() {
        return 640;
    }
}
