package calculator.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class GuiMainViewController implements Initializable {

    public TextField display;
    @FXML
    private TextField expression;
    public Button btnClear, btnNegate, btnFraction, btnDivide, btnMultiply, btnMinus, btnPlus, btnEquals,
            btnRetrieve, btnUpSize, btnDownSize;
    public Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    private boolean resetDisplay = true;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btn0.setId("btn0");
        btn1.setId("btn1");
        btn2.setId("btn2");
        btn3.setId("btn3");
        btn4.setId("btn4");
        btn5.setId("btn5");
        btn6.setId("btn6");
        btn7.setId("btn7");
        btn8.setId("btn8");
        btn9.setId("btn9");
        btnPlus.setId("btnPlus");
        btnMinus.setId("btnMinus");
        btnMultiply.setId("btnMultiply");
        btnDivide.setId("btnDivide");
        btnClear.setId("btnClear");
        btnEquals.setId("btnEquals");
        btnRetrieve.setId("btnRetrieve");
        btnUpSize.setId("btnUpSize");
        btnDownSize.setId("btnDownSize");
    }

    private void appendToDisplay(String text) {
        if (resetDisplay){
            expression.appendText(display.getText());
            display.clear();
        }
        display.appendText(text);
        resetDisplay = false;
    }

    public void onNegate() {
        if (display.getText().equals("0")||resetDisplay) {
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

    public void onClear() {
        display.clear();
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
    }

    public void onUpSize() {
        double size = display.getFont().getSize();
        if (size < 72) {
            display.setStyle("-fx-font-size: " + (size + 2) + "px;");
        }
    }

    public void onDownSize() {
        double size = display.getFont().getSize();
        display.setStyle("-fx-font-size: " + (size - 2) + "px;");
    }
}
