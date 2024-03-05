package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {

    private String currentExpressionText = "";

    @FXML
    private Label currentExpression;

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
}
