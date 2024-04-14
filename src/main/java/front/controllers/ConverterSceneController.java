package front.controllers;

import back.calculator.App;
import back.calculator.types.MyNumber;
import back.converter.Units;
import front.scenes.Scenes;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ConverterSceneController implements Initializable {
    @FXML
    MenuButton firstUnitSelector;
    @FXML
    MenuButton secondUnitSelector;
    @FXML
    MenuButton conversionModeSelector;
    @FXML
    MenuItem speedConversionModeItem;
    @FXML
    MenuItem weightConversionModeItem;
    @FXML
    MenuItem distanceConversionModeItem;
    @FXML
    MenuItem timeConversionModeItem;

    @FXML
    Button clear;
    @FXML
    Button nine;
    @FXML
    Button eight;
    @FXML
    Button seven;
    @FXML
    Button six;
    @FXML
    Button five;
    @FXML
    Button four;
    @FXML
    Button three;
    @FXML
    Button two;
    @FXML
    Button one;
    @FXML
    Button zero;
    @FXML
    Button equals;
    @FXML
    Button dot;

    @FXML
    Label lastExpression;
    @FXML
    Label lastExpression1;
    @FXML
    Label lastExpression2;
    @FXML
    Label lastExpression3;
    @FXML
    Label lastExpression4;
    @FXML
    Label lastResult;
    @FXML
    Label lastResult1;
    @FXML
    Label lastResult2;
    @FXML
    Label lastResult3;
    @FXML
    Label lastResult4;

    @FXML
    TextField inputField;

    private static Logger logger;

    static {
        logger = LoggerFactory.getLogger(ConverterSceneController.class);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // This method is called at the creation of the scene

        // At startup, the focus is set on the textField
        Platform.runLater(() -> inputField.requestFocus());

        // Add a listener that maintains the focus on the textField
        inputField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (Boolean.FALSE.equals(newValue)) {
                inputField.requestFocus();
            }
        });

        // Set the equals button event
        inputField.setOnKeyPressed(event -> {
            if (Objects.requireNonNull(event.getCode()) == KeyCode.ENTER) {
                equalsButtonClicked(null);
            }
        });
    }

    /**
     * Called when clicking on a button.
     */
    @FXML
    public void characterButtonClicked(MouseEvent event) {
        Button source = (Button) event.getSource();

        if (source.equals(equals)) equalsButtonClicked(event);
        else if (source.equals(clear)) clearButtonClicked(event);
        else regularButtonClicked(event);
    }

    /**
     * Handles the behavior that the app should have when the equals button is clicked.
     */
    private void equalsButtonClicked(MouseEvent event) {
        // TODO : actually retrieve the input units
        MyNumber result = App.convert(Float.parseFloat(inputField.getText()), Units.Distance.METER, Units.Distance.KILOMETER);
        String resultString = result.toString();
        switchHistory(inputField.getText(), resultString);
        inputField.setText(resultString);
        // Move the cursor to the end of the text
        inputField.positionCaret(inputField.getText().length());
    }

    /**
     * Handles the behavior that the app should have when any button but the equals button and the clear
     * button are clicked.
     */
    private void regularButtonClicked(MouseEvent event) {
        Button button = (Button) event.getSource();
        String buttonText = button.getText();


        int cursorPosition = inputField.getCaretPosition();
        inputField.insertText(cursorPosition, buttonText);
        App.setUserInput(inputField.getText());
        inputField.positionCaret(cursorPosition + 1);
    }

    /**
     * Handles the behavior that the app should have when the clear button is clicked.
     */
    private void clearButtonClicked(MouseEvent event) {
        clearInputField();
    }

    /**
     * This method clears the input field.
     */
    private void clearInputField() {
        inputField.setText("");
    }

    /**
     * Shift history and enter a new result
     *
     * @param newExpression The input expression
     * @param newResult     The result of the input expression
     */
    private void switchHistory(String newExpression, String newResult) {
        Label[] expressionHistory = new Label[5];
        expressionHistory[0] = lastExpression;
        expressionHistory[1] = lastExpression1;
        expressionHistory[2] = lastExpression2;
        expressionHistory[3] = lastExpression3;
        expressionHistory[4] = lastExpression4;
        Label[] resultHistory = new Label[5];
        resultHistory[0] = lastResult;
        resultHistory[1] = lastResult1;
        resultHistory[2] = lastResult2;
        resultHistory[3] = lastResult3;
        resultHistory[4] = lastResult4;

        for (int i = 4; i > 0; i--) {
            expressionHistory[i].setText(expressionHistory[i - 1].getText());
            resultHistory[i].setText(resultHistory[i - 1].getText());
        }
        expressionHistory[0].setText(newExpression);
        resultHistory[0].setText(newResult);
    }

    /**
     * Switches to the basic view.
     */
    @FXML
    private void handleBasicModeSelected(ActionEvent actionEvent) {
        App.setScene(Scenes.MAIN_SCENE);
    }

    /**
     * Switches to the advanced view.
     */
    @FXML
    private void handleAdvancedModeSelected(ActionEvent actionEvent) {
        App.setScene(Scenes.MAIN_SCENE);
    }

    /**
     * Defines the conversion as a conversion of speed.
     */
    @FXML
    private void handleSpeedConversionSelected(ActionEvent actionEvent) {
        replaceSelectorItems(firstUnitSelector, Units.Speed.values());
        replaceSelectorItems(secondUnitSelector, Units.Speed.values());
    }

    /**
     * Defines the conversion as a conversion of weight.
     */
    @FXML
    private void handleWeightConversionSelected(ActionEvent actionEvent) {
        replaceSelectorItems(firstUnitSelector, Units.Weight.values());
        replaceSelectorItems(secondUnitSelector, Units.Weight.values());
    }

    /**
     * Defines the conversion as a conversion of distance.
     */
    @FXML
    private void handleDistanceConversionSelected(ActionEvent actionEvent) {
        replaceSelectorItems(firstUnitSelector, Units.Distance.values());
        replaceSelectorItems(secondUnitSelector, Units.Distance.values());
    }

    /**
     * Defines the conversion as a conversion of time.
     */
    @FXML
    private void handleTimeConversionSelected(ActionEvent actionEvent) {
        replaceSelectorItems(firstUnitSelector, Units.Time.values());
        replaceSelectorItems(secondUnitSelector, Units.Time.values());
    }

    private void replaceSelectorItems(MenuButton selector, Units.Unit[] values) {
        selector.getItems().clear();

        for (Units.Unit value : values) {
            MenuItem item = new MenuItem(value.toString());
            item.setOnAction(event -> {
                logger.info(value + " selected");
            });
            selector.getItems().add(item);
        }
    }

    /**
     * Defines the unit to convert from to unit 1.
     */
    @FXML
    private void handleFromUnit1Selected(ActionEvent actionEvent) {
        // TODO : set unit 1
    }

    /**
     * Defines the unit to convert from to unit 2.
     */
    @FXML
    private void handleFromUnit2Selected(ActionEvent actionEvent) {
        // TODO : set unit 2
    }

    /**
     * Defines the unit to convert to to unit 1.
     */
    @FXML
    private void handleToUnit1Selected(ActionEvent actionEvent) {
        // TODO : set unit 1
    }

    /**
     * Defines the unit to convert to to unit 2.
     */
    @FXML
    private void handleToUnit2Selected(ActionEvent actionEvent) {
        // TODO : set unit 2
    }
}
