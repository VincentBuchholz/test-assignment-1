package two.katas.temperature;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class TemperatureConverterTest {

    private static TemperatureConverter temperatureConverter;

    @BeforeAll
    static void Setup(){
        temperatureConverter = new TemperatureConverter();
    }


    //Fahrenheit to celsius

    @Test
    void BasicFahrenheitConversionTest(){

        // ACT
        BigDecimal result = temperatureConverter.convertToCelsius(new BigDecimal("100"));
        BigDecimal resultTwo = temperatureConverter.convertToCelsius(BigDecimal.ZERO);
        BigDecimal resultThree = temperatureConverter.convertToCelsius(new BigDecimal("150.3"));

        // Assert
        Assertions.assertEquals(new BigDecimal("37.7778"),result);
        Assertions.assertEquals(new BigDecimal("-17.7778"),resultTwo);
        Assertions.assertEquals(new BigDecimal("65.7222"),resultThree);
    }

    @Test
    void NegativeFahrenheitConversionTest(){
        // ACT
        BigDecimal result = temperatureConverter.convertToCelsius(new BigDecimal("-10"));
        BigDecimal resultTwo = temperatureConverter.convertToCelsius( new BigDecimal("-50"));
        BigDecimal resultThree = temperatureConverter.convertToCelsius(new BigDecimal("-150"));

        // Assert
        Assertions.assertEquals(new BigDecimal("-23.3333"),result);
        Assertions.assertEquals(new BigDecimal("-45.5556"),resultTwo);
        Assertions.assertEquals(new BigDecimal("-101.1111"),resultThree);
    }
    @Test
    void FahrenheitBoundaryConversionTest(){
        // ACT
        BigDecimal result = temperatureConverter.convertToCelsius(new BigDecimal("-459.67"));
        BigDecimal resultTwo = temperatureConverter.convertToCelsius(new BigDecimal("1000"));

        // Assert
        Assertions.assertEquals(new BigDecimal("-273.1500"),result);
        Assertions.assertEquals(new BigDecimal("537.7778"),resultTwo);
    }

    @Test
    void BasicCelsiusConversionTest(){

        // ACT
        BigDecimal result = temperatureConverter.convertToFahrenheit(new BigDecimal("100"));
        BigDecimal resultTwo = temperatureConverter.convertToFahrenheit(BigDecimal.ZERO);
        BigDecimal resultThree = temperatureConverter.convertToFahrenheit(new BigDecimal("37.3"));

        // Assert
        Assertions.assertEquals(new BigDecimal("212.0000"),result);
        Assertions.assertEquals(new BigDecimal("32.0000"),resultTwo);
        Assertions.assertEquals(new BigDecimal("99.1400"),resultThree);
    }

    @Test
    void NegativeCelsiusConversionTest(){
        // ACT
        BigDecimal result = temperatureConverter.convertToFahrenheit(new BigDecimal("-10"));
        BigDecimal resultTwo = temperatureConverter.convertToFahrenheit( new BigDecimal("-50"));
        BigDecimal resultThree = temperatureConverter.convertToFahrenheit(new BigDecimal("-150"));

        // Assert
        Assertions.assertEquals(new BigDecimal("14.0000"),result);
        Assertions.assertEquals(new BigDecimal("-58.0000"),resultTwo);
        Assertions.assertEquals(new BigDecimal("-238.0000"),resultThree);
    }
    @Test
    void FahrenheitCelsiusConversionTest(){
        // ACT
        BigDecimal result = temperatureConverter.convertToFahrenheit(new BigDecimal("-273.15"));
        BigDecimal resultTwo = temperatureConverter.convertToFahrenheit(new BigDecimal("1000"));

        // Assert
        Assertions.assertEquals(new BigDecimal("-459.6700"),result);
        Assertions.assertEquals(new BigDecimal("1832.0000"),resultTwo);
    }



}