package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {

    private String currentExpressionText = "";

    @FXML private Label currentExpression;

    @FXML private Button digitZero;
    @FXML private Button digitOne;
    @FXML private Button digitTwo;
    @FXML private Button digitThree;
    @FXML private Button digitFour;
    @FXML private Button digitFive;
    @FXML private Button digitSix;
    @FXML private Button digitSeven;
    @FXML private Button digitEight;
    @FXML private Button digitNine;

    @FXML private Button operatorEquals;
    @FXML private Button operatorPlus;
    @FXML private Button operatorMinus;
    @FXML private Button operatorTimes;
    @FXML private Button operatorDivide;

    @FXML private Button optionUndo;
    @FXML private Button optionAnswer;

    @FXML
    private void handleKeyboard(KeyEvent event) {
        String typedCharacter = event.getText();
        if (event.getCode() == KeyCode.BACK_SPACE && !currentExpressionText.isEmpty()) {
            currentExpressionText = currentExpressionText.substring(0, currentExpressionText.length() - 1);
        } else {
            currentExpressionText += typedCharacter;
        }
        currentExpression.setText(currentExpressionText);
    }

    @FXML
    private void initialize() {
        digitZero.setOnAction(event -> addCharacter("0"));
        digitOne.setOnAction(event -> addCharacter("1"));
        digitTwo.setOnAction(event -> addCharacter("2"));
        digitThree.setOnAction(event -> addCharacter("3"));
        digitFour.setOnAction(event -> addCharacter("4"));
        digitFive.setOnAction(event -> addCharacter("5"));
        digitSix.setOnAction(event -> addCharacter("6"));
        digitSeven.setOnAction(event -> addCharacter("7"));
        digitEight.setOnAction(event -> addCharacter("8"));
        digitNine.setOnAction(event -> addCharacter("9"));
        operatorEquals.setOnAction(event -> addCharacter("="));
        operatorPlus.setOnAction(event -> addCharacter("+"));
        operatorMinus.setOnAction(event -> addCharacter("-"));
        operatorTimes.setOnAction(event -> addCharacter("*"));
        operatorDivide.setOnAction(event -> addCharacter("/"));
        optionUndo.setOnAction(event -> removeCharacter());
        optionAnswer.setOnAction(event -> addCharacter("ans"));
    }

    private void addCharacter(String character) {
        currentExpressionText += character;
        currentExpression.setText(currentExpressionText);
    }

    private void removeCharacter() {
        if (!currentExpressionText.isEmpty()) {
            currentExpressionText = currentExpressionText.substring(0, currentExpressionText.length() - 1);
            currentExpression.setText(currentExpressionText);
        }
    }

    private void handleDigitButton(Button button, String character) {

    }
}
