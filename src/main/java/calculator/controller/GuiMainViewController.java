package calculator.controller;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class GuiMainViewController implements Initializable {

    public TextField display;
    public Button btnClear, btnNegate, btnFraction, btnDivide, btnMultiply, btnMinus, btnPlus, btnEquals;
    public Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // TODO : Initialisation du contrôleur
    }

    public void onClear() {
        // TODO : Gérer l'événement de clic sur le bouton "C"
    }

    public void onNegate() {
        // TODO : Gérer l'événement de clic sur le bouton "+/-"
    }

    public void onFraction() {
        // TODO : Gérer l'événement de clic sur le bouton "1/x"
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

    public void onEquals() {
        // TODO : Gérer l'événement de clic sur le bouton "="
    }

    public void onNumber() {
        // TODO : Gérer l'événement de clic sur un bouton numérique
    }
}
