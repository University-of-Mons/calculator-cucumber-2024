Feature: Notation Test
  This feature provides a scenario that covers all unit tests
  currently specified in the TestNotation.java JUnit test class.

  Scenario Outline: Test all notations
    Given the numbers 8 and 6
    When I perform the operation <op>
    Then I should get the correct notation for <op>

    Examples:
    | op  |
    | "+" |
    | "-" |
    | "*" |
    | "/" |