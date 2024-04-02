package front.controllers;

import back.calculator.*;

import java.util.Arrays;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

public class MainSceneController {
    @FXML
    Button clear, eight, nine, divide, sqrt, pi, exp, closeParen, openParen, seven, x, multiply, six, five, four, minus, three, two, one, equals, add, percent, dot, zero;

    @FXML
    TextField outputField;

    @FXML
    // This method is called when the user clicks on a character button (Not C and =)
    public void characterButtonClicked(MouseEvent event) {
        Button source = (Button) event.getSource();

        if (source.equals(equals)) equalsButtonClicked(event);
        else if (source.equals(clear)) clearButtonClicked(event);
        else regularButtonClicked(event);
    }

    private void equalsButtonClicked(MouseEvent event) {
        Expression result = App.evalUserInput();
        outputField.setText(result.toString());
        App.userInput = "";
    }

    private void clearButtonClicked(MouseEvent event) {
        clearOutputField();
    }

    private void regularButtonClicked(MouseEvent event) {
        Button button = (Button) event.getSource();
        String buttonText = button.getText();
        App.userInput += buttonText;
        outputField.setText(App.userInput);
    }

    private void clearOutputField() {
        outputField.setText("");
        App.userInput = "";
    }
}
