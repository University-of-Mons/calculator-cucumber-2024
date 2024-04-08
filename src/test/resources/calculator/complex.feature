Feature: Complex arithmetic expressions
  This feature provides a range of scenarios corresponding to the
  intended external behaviour of arithmetic expressions on integers.

  # You can start with a Background: that will be run before executing each scenario.
  Background:
    Given I initialise a calculator

  Scenario: Adding two complex numbers
    Given a complex operation '+'
    When I provide a first complex number 5+2i
    And I provide a second complex number 3-4i
    Then the operation evaluates to '8-2i'

  Scenario: Subtracting two complex numbers
    Given a complex operation '-'
    When I provide a first complex number 5+2i
    And I provide a second complex number 3-4i
    Then the operation evaluates to '2+6i'

  Scenario: Multiplying two complex numbers
    Given a complex operation '*'
    When I provide a first complex number 5+2i
    And I provide a second complex number 3-4i
    Then the operation evaluates to '23-14i'


  ##################################### Parsing tests #####################################
  Scenario: Parsing a complex number
    Given the following expression '5+2i'
    Then its parsing is '5+2i'

  Scenario: Parsing a complex number only with imaginary part
    Given the following expression '5i'
    Then its parsing is '5i'

  Scenario: Parsing a complex number with only imaginary part and negative sign
    Given the following expression '-5i'
    Then its parsing is '-5i'

  Scenario: Parsing i as imaginary unit
    Given the following expression 'i'
    Then its parsing is 'i'

  Scenario: Parsing a complex number in prefix notation
    Given the following expression '+ (5 (-2+5i))'
    Then its parsing is '+ (5, -2+5i)'

  Scenario: Parsing a complex number in postfix notation
    Given the following expression '(5 2-i) +'
    Then its parsing is '(5, 2-i) +'

