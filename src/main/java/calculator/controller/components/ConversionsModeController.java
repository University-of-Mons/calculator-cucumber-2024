package calculator.controller.components;

import calculator.conversions.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ConversionsModeController implements Initializable, ModeController {

    @FXML
    private GridPane conversionsGrid;
    @FXML
    private VBox conversionsVBox;
    @FXML
    private Button btnClear, btnDelete;
    @FXML
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnConvert;
    @FXML
    private TextField textFieldFrom1;
    @FXML
    private TextField textFieldFrom2;
    @FXML
    private TextField textFieldTo1;
    @FXML
    private TextField textFieldTo2;
    @FXML
    private ComboBox<UnitType> unitTypeComboBox;
    @FXML
    public ComboBox<Unit> comboBoxFromUnit;
    @FXML
    public ComboBox<Unit> comboBoxToUnit;

    private boolean resetDisplay = false;
    private boolean focusOnFrom1 = true;
    private boolean changedUnit = true;
    private TextField display, expression;
    private UnitType unitType;
    private Unit fromUnit;
    private Unit toUnit;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        unitTypeComboBox.getItems().setAll(UnitType.values());
        unitTypeComboBox.setValue(UnitType.LENGTH);
        unitTypeComboBox.setOnAction(event -> setUnits());
        setUnits();
        comboBoxFromUnit.setOnAction(event -> {
            fromUnit = comboBoxFromUnit.getValue();
            changedUnit = true;
        });
        comboBoxToUnit.setOnAction(event -> {
            toUnit = comboBoxToUnit.getValue();
            changedUnit = true;
        });
        fromUnit = comboBoxFromUnit.getValue();
        toUnit = comboBoxToUnit.getValue();
    }

    private void setUnits() {
        if (unitType == null || !unitType.equals(unitTypeComboBox.getValue())) {
            unitType = unitTypeComboBox.getValue();
            Unit[] units = getEnumValues(unitType);
            comboBoxFromUnit.getItems().setAll(units);
            comboBoxFromUnit.setValue(units[0]);
            fromUnit = units[0];
            comboBoxToUnit.getItems().setAll(units);
            comboBoxToUnit.setValue(units[1]);
            toUnit = units[1];
            changedUnit = true;
        }
    }

    private Unit[] getEnumValues(UnitType unitType) {
        return switch (unitType) {
            case LENGTH -> LengthUnit.values();
            case TIME -> TimeUnit.values();
            case AREA -> AreaUnit.values();
            case MASS -> MassAndWeightUnit.values();
            case POWER -> PowerUnit.values();
            case PRESSURE -> PressureUnit.values();
            case VOLUME -> VolumeUnit.values();
            case SPEED -> SpeedUnit.values();
            case ENERGY -> EnergyUnit.values();
            case CURRENCY -> CurrencyUnit.values();
            case TEMPERATURE -> TemperatureUnit.values();
        };
    }

    public void appendToDisplay(String text) {
        if (resetDisplay) {
            textFieldFrom1.clear();
            textFieldFrom2.clear();
            textFieldTo1.clear();
            textFieldTo2.clear();
            resetDisplay = false;
        }
        if (focusOnFrom1) {
            textFieldFrom1.appendText(text);
        } else {
            textFieldFrom2.appendText(text);
        }
    }

    public void onConvert() {
        if ((!resetDisplay || changedUnit) && !(textFieldFrom1.getText().isEmpty() && textFieldFrom2.getText().isEmpty())
                && !fromUnit.equals(toUnit)) {
            Convertor convertor;
            if (unitType == UnitType.TEMPERATURE) {
                convertor = new Convertor(getExpressionDouble(), (TemperatureUnit) fromUnit, (TemperatureUnit) toUnit);
            } else {
                convertor = new Convertor(getExpressionDouble(), fromUnit, toUnit);
            }
            textFieldTo1.setText(convertor.getIntegerPart());
            textFieldTo2.setText(convertor.getDecimalPart());
            resetDisplay = true;
            changedUnit = false;
        }
    }

    private double getExpressionDouble() {
        String from1 = textFieldFrom1.getText();
        String from2 = textFieldFrom2.getText();
        String result = "";
        if (from1.isEmpty()) {
            result = "0." + from2;
        } else if (from2.isEmpty()) {
            result = from1 + ".0";
        } else {
            result = from1 + "." + from2;
        }
        return Double.parseDouble(result);
    }

    @FXML
    public void clickOnFrom1(){
        focusOnFrom1 = true;
    }

    @FXML
    public void clickOnFrom2(){
        focusOnFrom1 = false;
    }

    @FXML
    public void onNumber(ActionEvent event) {
        Button button = (Button) event.getSource();
        appendToDisplay(button.getText());
    }

    @FXML
    public void onDelete() {
        if (resetDisplay) {
            textFieldTo1.clear();
            textFieldTo2.clear();
            resetDisplay = false;
        }
        if (focusOnFrom1) {
            textFieldFrom1.setText(textFieldFrom1.getText(0, textFieldFrom1.getText().length() - 1));
        } else {
            textFieldFrom2.setText(textFieldFrom2.getText(0, textFieldFrom2.getText().length() - 1));
        }
    }

    @FXML
    public void onClear() {
        if (resetDisplay) {
            textFieldTo1.clear();
            textFieldTo2.clear();
            resetDisplay = false;
        }
        if (focusOnFrom1) {
            textFieldFrom1.clear();
        } else {
            textFieldFrom2.clear();
        }
    }

    // Setters
    @Override
    public void setDisplayTextField(TextField display) {
        this.display = display;
    }

    @Override
    public void setExpressionTextField(TextField expression) {
        this.expression = expression;
    }

    @Override
    public float getPreferredWidth() {
        return 480;
    }

    @Override
    public float getPreferredHeight() {
        return 640;
    }
}
