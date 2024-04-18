package calculator.controller.components;


import calculator.BooleanParser;
import calculator.Calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class BooleanModeController implements Initializable, ModeController{

    @FXML
    private TextField display, expression;
    @FXML
    private Button btnNot, btnAnd, btnOr, btnXor, btnEquiv, btnImply, btnEquals; // unused
    @FXML
    private Button btnOpenParenthesis, btnCloseParenthesis, btnComma, btnClear, btnRetrieve, btnDelete; // unused
    @FXML
    private Button btn0, btn1;


    private boolean resetDisplay = false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}

    // Button click event handlers
    @FXML
    public void onNumber(ActionEvent event) {
        Button button = (Button) event.getSource();
        appendToDisplay(button.getText());
    }

    public void onNot() {
        appendToDisplay("NOT");
    }

    public void onOr() {
        appendToDisplay("OR");
    }

    public void onAnd() {
        appendToDisplay("AND");
    }

    public void onXor() {
        appendToDisplay("XOR");
    }

    public void onImply() {
        appendToDisplay("IMPL");
    }

    public void onEquiv() {
        appendToDisplay("EQ");
    }

    public void onEquals() {
        if (!resetDisplay && !display.getText().equals("0")) {
            expression.setText(display.getText()+" = ");
            Calculator calculator = new Calculator();
            try{
                BooleanParser parser = new BooleanParser(display.getText(), calculator);
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
        return 600;
    }

    @Override
    public float getPreferredHeight() {
        return 640;
    }
}
