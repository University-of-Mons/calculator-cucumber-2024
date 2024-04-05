package front.controllers;

import back.calculator.App;
import back.calculator.Expression;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainSceneController implements Initializable {
    @FXML
    Button clear;
    @FXML
    Button eight;
    @FXML
    Button nine;
    @FXML
    Button divide;
    @FXML
    Button closeParen;
    @FXML
    Button openParen;
    @FXML
    Button seven;
    @FXML
    Button multiply;
    @FXML
    Button six;
    @FXML
    Button five;
    @FXML
    Button four;
    @FXML
    Button minus;
    @FXML
    Button three;
    @FXML
    Button two;
    @FXML
    Button one;
    @FXML
    Button equals;
    @FXML
    Button add;
    @FXML
    Button dot;
    @FXML
    Button zero;

    @FXML
    TextField outputField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Set the focus always on the textField
        Platform.runLater(() -> outputField.requestFocus());
        outputField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (Boolean.FALSE.equals(newValue)) {
                outputField.requestFocus();
            }
        });
        outputField.setOnKeyPressed(event -> {
            if (Objects.requireNonNull(event.getCode()) == KeyCode.ENTER) {
                equalsButtonClicked();
            }
        });
    }

    @FXML
    // This method is called when the user clicks on a character button (Not C and =)
    public void characterButtonClicked(MouseEvent event) {
        Button source = (Button) event.getSource();

        if (source.equals(equals)) equalsButtonClicked();
        else if (source.equals(clear)) clearButtonClicked();
        else regularButtonClicked(event);
    }

    private void equalsButtonClicked() {
        App.userInput = outputField.getText();
        Expression result = App.evalUserInput();
        outputField.setText(result.toString());
        // Set the cursor at the end of the text
        outputField.positionCaret(outputField.getText().length());
        App.userInput = "";
    }

    private void clearButtonClicked() {
        clearOutputField();
    }

    private void regularButtonClicked(MouseEvent event) {
        Button button = (Button) event.getSource();
        String buttonText = button.getText();

        int cursorPosition = outputField.getCaretPosition();
        outputField.insertText(cursorPosition, buttonText);
        App.userInput = outputField.getText();
        // Move the cursor to the right of the new character
        outputField.positionCaret(cursorPosition + 1);
    }

    private void clearOutputField() {
        outputField.setText("");
        App.userInput = "";
    }
}
