package front.controllers;

import back.calculator.Main;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class MainSceneController {

    @FXML
    // This method is called when the user clicks on a character button (Not C and =
    public void characterButtonClicked(ActionEvent event) {
        Button button = (Button) event.getSource();
        String buttonText = button.getText();
        Main.userInput += buttonText;
    }
}
