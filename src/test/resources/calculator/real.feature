Feature: Real numbers arithmetic operations
  This feature provides scenarios corresponding to the behavior
  of the arithmetic expression on real numbers.


  Background:
    Given I initialise a calculator

  Scenario: Parsing a real number
    Given the following expression '3.14'
    Then its parsing is '3.14'

  Scenario: Parsing a real number with a leading zero
    Given the following expression '0.123'
    Then its parsing is '0.123'