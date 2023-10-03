package two.katas.temperature;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TemperatureConverter {

    public BigDecimal convertToCelsius(BigDecimal degrees)  {
        return  ((degrees.subtract(new BigDecimal(32))).divide(new BigDecimal("1.8"),4,RoundingMode.HALF_UP));
    }

    public BigDecimal convertToFahrenheit(BigDecimal degrees) {
        return degrees.multiply(new BigDecimal("1.8")).add(new BigDecimal("32")).setScale(4,RoundingMode.HALF_UP);
    }
}
