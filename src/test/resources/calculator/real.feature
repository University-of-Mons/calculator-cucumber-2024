Feature: Real numbers arithmetic operations
  This feature provides scenarios corresponding to the behavior
  of the arithmetic expression on real numbers.


  Background:
    Given I initialise a calculator

 ####################################  NaN test  ##################################
  Scenario: Dividing a real by zero
    Given a real operation '/'
    When I provide a first real number 3.14
    And I provide a second real number 0
    Then the operation evaluates to "NaN"

 ####################################  Printer tests  ##################################

  Scenario: Printing a real

#####################################  Parsing tests  ###################################

  Scenario: Parsing a real number
    Given the following expression '3.14'
    Then its parsing is '3.14'

  Scenario: Parsing a real number with a leading zero
    Given the following expression '0.123'
    Then its parsing is '0.123'