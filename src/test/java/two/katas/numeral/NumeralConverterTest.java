package two.katas.numeral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class NumeralConverterTest {

    private static NumeralConverter numeralConverter;

    @BeforeAll
    static void Setup(){
        numeralConverter = new NumeralConverter();
    }


    @Test
    void ConvertSingleDigitTest(){
        // ACT
        String result = numeralConverter.convert(1L);
        String resultTwo = numeralConverter.convert(5L);
        String resultThree = numeralConverter.convert(9L);

        // Assert
        Assertions.assertEquals("I", result);
        Assertions.assertEquals("V", resultTwo);
        Assertions.assertEquals("IX", resultThree);
    }

    @Test
    void ConvertMultiDigitTest(){
        // ACT
        String result = numeralConverter.convert(10L);
        String resultTwo = numeralConverter.convert(50L);
        String resultThree = numeralConverter.convert(299L);

        // Assert
        Assertions.assertEquals("X", result);
        Assertions.assertEquals("L", resultTwo);
        Assertions.assertEquals("CCXCIX", resultThree);
    }

    @Test
    void ConvertBoundaryTest(){
        // ACT
        String result = numeralConverter.convert(1000L);
        String resultTwo = numeralConverter.convert(9999L);
        String resultThree = numeralConverter.convert(8885L);

        // Assert
        Assertions.assertEquals("M", result);
        Assertions.assertEquals("MMMMMMMMMCMXCIX", resultTwo);
        Assertions.assertEquals("MMMMMMMMDCCCLXXXV", resultThree);
    }

    @Test
    void WrongInputHandlingTest(){
        // ACT || Assert
        try{

            Assertions.assertThrows(IllegalArgumentException.class, () -> numeralConverter.convert(-1L));
        } catch (Exception e){
            Assertions.assertEquals("Number must be over 0",e.getMessage());
        }
        try{
            Assertions.assertThrows(IllegalArgumentException.class, () -> numeralConverter.convert(-9999L));
        } catch (Exception e){
            Assertions.assertEquals("Number must be over 0",e.getMessage());
        }

        try{
            Assertions.assertThrows(IllegalArgumentException.class, () -> numeralConverter.convert(0L));
        } catch (Exception e){
            Assertions.assertEquals("Number must be over 0",e.getMessage());
        }
    }
}