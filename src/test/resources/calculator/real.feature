Feature: Real numbers arithmetic operations
  This feature provides scenarios corresponding to the behavior
  of the arithmetic expression on real numbers.


  Background:
    Given I initialise a calculator

 ####################################  Evaluating tests  ##################################
  Scenario Outline: Evaluating the operation with real numbers
    Given a real operation <op>
    When I provide a first real number <real1>
    And I provide a second real number <real2>
    Then the operation evaluates to <res>

    Examples:
        | op | real1 | real2 | res |
        | '+'  | 3.14  | 1.5   | 4.64   |
        | '-'  | 3.14  | 2.71  | 0.43   |
        | '*'  | 3.14  | 2.71  | 8.5094 |
        | '/'  | 3.14  | 2.5   | 1.256   |

  Scenario Outline: Evaluating the operation between real and integer numbers
    Given a real operation <op>
    When I provide a first real number <real1>
    And I provide a second integer number <int2>
    Then the operation evaluates to <res>

    Examples:
        | op | real1 | int2 | res |
        | '+'  | 3.14  | 1    | 4.14   |
        | '-'  | 3.14  | 2    | 1.14   |
        | '*'  | 3.14  | 2    | 6.28   |
        | '/'  | 3.14  | 2    | 1.57   |

 ####################################  NaN test  ##################################
  Scenario: Dividing a real by zero
    Given a real operation '/'
    When I provide a first real number 3.14
    And I provide a second real number 0
    Then the operation evaluates to "NaN"

 ####################################  Printer tests  ##################################

  Scenario: Printing a real
    Given a real operation '+'
    When I provide a first real number 3.14
    And I provide a second real number 2.71
    Then its PREFIX notation is + (3.14, 2.71)
    And its INFIX notation is ( 3.14 + 2.71 )
    And its POSTFIX notation is (3.14, 2.71) +

#####################################  Parsing tests  ###################################

  Scenario: Parsing a real number
    Given the following expression '3.14'
    Then its parsing is '3.14'

  Scenario: Parsing a real number with a leading zero
    Given the following expression '0.123'
    Then its parsing is '0.123'