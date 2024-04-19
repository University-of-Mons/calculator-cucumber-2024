package calculator.conversions;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Convertor {
    private final BigDecimal result;

    public Convertor(double value, Unit fromUnit, Unit toUnit) {
        BigDecimal inputValue = BigDecimal.valueOf(value);

        if (fromUnit.isPowerOfTen() && toUnit.isPowerOfTen()) {
            String valueStr = getString(value, fromUnit.getOffset() - toUnit.getOffset());
            this.result = new BigDecimal(valueStr);
        } else {
            BigDecimal fromUnitFactor = BigDecimal.valueOf(fromUnit.getConversionFactor());
            BigDecimal toUnitFactor = BigDecimal.valueOf(toUnit.getConversionFactor());
            this.result = inputValue.multiply(toUnitFactor).divide(fromUnitFactor, 10, RoundingMode.HALF_UP);
        }
    }

    public Convertor(double value, TemperatureUnit fromUnit, TemperatureUnit toUnit) {
        BigDecimal temp = BigDecimal.valueOf(value);
        switch (fromUnit) {
            case FAHRENHEIT:
                temp = temp.subtract(BigDecimal.valueOf(32)).multiply(BigDecimal.valueOf(5)).divide(BigDecimal.valueOf(9), 10, RoundingMode.HALF_UP);
                break;
            case KELVIN:
                temp = temp.subtract(BigDecimal.valueOf(273.15));
                break;
            default:
                break;
        }
        switch (toUnit) {
            case FAHRENHEIT:
                result = temp.multiply(BigDecimal.valueOf(9)).divide(BigDecimal.valueOf(5), 10, RoundingMode.HALF_UP).add(BigDecimal.valueOf(32));
                break;
            case KELVIN:
                result = temp.add(BigDecimal.valueOf(273.15));
                break;
            default:
                result = temp;
                break;
        }
    }

    private static String getString(double value, int powerDifference) {
        String valueStr = String.valueOf(value);
        while (powerDifference != 0){
            int decimalIndex = valueStr.indexOf(".");
            if (powerDifference > 0) {
                valueStr = valueStr.substring(0, decimalIndex) + valueStr.charAt(decimalIndex + 1) + "." + valueStr.substring(decimalIndex + 2);
                if (valueStr.indexOf(".") == valueStr.length() - 1) {
                    valueStr += "0";
                }
                powerDifference--;
            } else {
                valueStr = valueStr.substring(0, decimalIndex - 1) + "." + valueStr.charAt(decimalIndex - 1) + valueStr.substring(decimalIndex + 1);
                if (decimalIndex == 1) {
                    valueStr = "0" + valueStr;
                }
                powerDifference++;
            }
        }
        return valueStr;
    }

    public String getIntegerPart() {
        return result.toBigInteger().toString();
    }

    public String getDecimalPart() {
        BigInteger integerPart = result.toBigInteger();
        BigDecimal decimalPart = result.subtract(new BigDecimal(integerPart)).setScale(10, RoundingMode.HALF_UP);
        if(decimalPart.compareTo(BigDecimal.ZERO) == 0) {
            return "0";
        }
        String decimalPartStr = decimalPart.stripTrailingZeros().toPlainString().substring(2);
        int indexOfNine = decimalPartStr.indexOf("9", 2) - 2; // index for "9" not found is (-1-2)
        if (indexOfNine != -3) {
            decimalPart = decimalPart.setScale(indexOfNine + 2, RoundingMode.UP);
        }
        return decimalPart.stripTrailingZeros().toPlainString().substring(2);
    }
}
