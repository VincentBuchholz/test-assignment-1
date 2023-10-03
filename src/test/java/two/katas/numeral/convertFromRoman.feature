Feature: Convert from roman to arabic numerals
  Scenario: convert positive numbers
    Given I have the roman number "MMXI"
    When I convert it to arabic
    Then I should get this number 2011