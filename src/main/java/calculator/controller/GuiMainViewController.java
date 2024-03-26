package calculator.controller;

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
    public Button btnClear, btnNegate, btnFraction, btnDivide, btnMultiply, btnMinus, btnPlus, btnEquals;
    public Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    private boolean resetDisplay = true;
    private boolean resetExpression = false;

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
        btn0.setOnAction(e -> appendToDisplay("0"));
        btn1.setOnAction(e -> appendToDisplay("1"));
        btn2.setOnAction(e -> appendToDisplay("2"));
        btn3.setOnAction(e -> appendToDisplay("3"));
        btn4.setOnAction(e -> appendToDisplay("4"));
        btn5.setOnAction(e -> appendToDisplay("5"));
        btn6.setOnAction(e -> appendToDisplay("6"));
        btn7.setOnAction(e -> appendToDisplay("7"));
        btn8.setOnAction(e -> appendToDisplay("8"));
        btn9.setOnAction(e -> appendToDisplay("9"));
        btnPlus.setOnAction(e -> handleOperator("+"));
        btnMinus.setOnAction(e -> handleOperator("-"));
        btnMultiply.setOnAction(e -> handleOperator("*"));
        btnDivide.setOnAction(e -> handleOperator("/"));
    }

    private void appendToDisplay(String text) {//TODO : Gérer le cas "0"
        if (resetDisplay){
            display.clear();
        }
        if (resetExpression){
            expression.clear();
            resetExpression = false;
        }
        display.appendText(text);
        resetDisplay = false;
    }

    private void handleOperator(String operator) {
        if (resetExpression) {
            expression.setText("0 " + operator + " ");
            resetExpression = false;
        }else{
            if (resetDisplay) {
                expression.setText(expression.getText().substring(0, expression.getText().length() - 2) + operator + " ");
            }else {
                expression.appendText(display.getText() + " " + operator + " ");
            }
        }
        display.setText(operator);
        resetDisplay = true;
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
        display.setText("0");
        expression.clear();
    }

    public void onEquals() {
        expression.appendText(display.getText() + " = ");
        display.setText("Answer");// TODO : Remplacer "Answer" par le résultat de l'expression
        resetDisplay = true;
        resetExpression = true;
    }

    public void onDivide() {
        // TODO : Gérer l'événement de clic sur le bouton "/"
    }

    public void onMultiply() {
        // TODO : Gérer l'événement de clic sur le bouton "*"
    }

    public void onMinus() {
        // TODO : Gérer l'événement de clic sur le bouton "-"
    }

    public void onPlus() {
        // TODO : Gérer l'événement de clic sur le bouton "+"
    }

    public void onNumber() {
        // TODO : Gérer l'événement de clic sur un bouton numérique
    }
}
