package two.katas.numeral;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    public static String romanNumber;

    public static int arabicNumber= 0;



    @Given("I have the roman number {string}")
    public void i_have_the_roman_number(String string) {
        romanNumber = string;
    }
    @When("I convert it to arabic")
    public void i_convert_it_to_arabic() {
        NumeralConverter numeralConverter = new NumeralConverter();
        arabicNumber = numeralConverter.convertFromRoman(romanNumber);

    }
    @Then("I should get this number {int}")
    public void i_should_get_this_number(Integer int1) {
        assert(int1 == arabicNumber);
    }
}
