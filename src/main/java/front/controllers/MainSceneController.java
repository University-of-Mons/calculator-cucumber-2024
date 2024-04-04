package front.controllers;

import back.calculator.*;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

public class MainSceneController implements Initializable{
    @FXML
    Button clear, eight, nine, divide, closeParen, openParen, seven, x, multiply, six, five, four, minus, three, two, one, equals, add, percent, dot, zero;

    @FXML
    TextField outputField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Set the focus always on the textField
        Platform.runLater( () -> outputField.requestFocus() );
        outputField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                outputField.requestFocus();
            }
        });
    }

    @FXML
    // This method is called when the user clicks on a character button (Not C and =)
    public void characterButtonClicked(MouseEvent event) {
        Button source = (Button) event.getSource();

        if (source.equals(equals)) equalsButtonClicked(event);
        else if (source.equals(clear)) clearButtonClicked(event);
        else regularButtonClicked(event);
    }

    private void equalsButtonClicked(MouseEvent event) {
        App.userInput = outputField.getText();
        Expression result = App.evalUserInput();
        outputField.setText(result.toString());
        // Set the cursor at the end of the text
        outputField.positionCaret(outputField.getText().length());
        App.userInput = "";
    }

    private void clearButtonClicked(MouseEvent event) {
        clearOutputField();
    }

    private void regularButtonClicked(MouseEvent event) {
        Button button = (Button) event.getSource();
        String buttonText = button.getText();

        int cursorPosition = outputField.getCaretPosition();
        outputField.insertText(cursorPosition, buttonText);
        App.userInput = outputField.getText();
        // Move the cursor to the right of the new character
        outputField.positionCaret(cursorPosition +1);
    }

    private void clearOutputField() {
        outputField.setText("");
        App.userInput = "";
    }
}
