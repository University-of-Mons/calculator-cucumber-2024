package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

public class Controller {

    @FXML
    private Label currentExpression;
    @FXML
    private Label history;

    @FXML
    private Button operatorEquals;
    @FXML
    private Button operatorPlus;
    @FXML
    private Button operatorMinus;
    @FXML
    private Button operatorTimes;
    @FXML
    private Button operatorDivide;
    @FXML
    private Button digitZero;

    @FXML
    private Button optionUndo;
    @FXML
    private Button optionAnswer;

    @FXML
    private GridPane mainPane;

    @FXML
    private void handleKeyboard(KeyEvent event) {
        String typedCharacter = event.getText();
        if (event.getCode() == KeyCode.BACK_SPACE && !currentExpression.getText().isEmpty()) {
            removeCharacter();
        } else if (event.getCode() == KeyCode.ENTER) {
            evaluate();
        } else {
            addCharacter(typedCharacter);
        }
    }

    @FXML
    private void initialize() {

        for (int i = 0; i < 9; i++) {
            final String s = String.valueOf(i + 1);
            Button b = new Button(s);
            b.setStyle("-fx-font: 32 system;");
            b.getStyleClass().add("button-number");
            b.setOnAction(actionEvent -> addCharacter(s));
            mainPane.add(b, i % 3, i / 3 + 1);
        }

        digitZero.setOnAction(event -> addCharacter("0"));
        operatorPlus.setOnAction(event -> addCharacter("+"));
        operatorMinus.setOnAction(event -> addCharacter("-"));
        operatorTimes.setOnAction(event -> addCharacter("*"));
        operatorDivide.setOnAction(event -> addCharacter("/"));
        optionUndo.setOnAction(event -> removeCharacter());
        operatorEquals.setOnAction(event -> evaluate());
        optionAnswer.setOnAction(event -> addCharacter("ans"));
    }

    private void addCharacter(String character) {
        currentExpression.setText(currentExpression.getText() + character);
    }

    private void removeCharacter() {
        if (!currentExpression.getText().isEmpty()) {
            String temp = currentExpression.getText().substring(0, currentExpression.getText().length() - 1);
            currentExpression.setText(temp);
        }
    }

    private void evaluate() {
        // TODO: integrate with parser
        if (!currentExpression.getText().isEmpty()) {
            history.setText(history.getText() + "\n" + currentExpression.getText());
            currentExpression.setText("");
        }
    }
}
