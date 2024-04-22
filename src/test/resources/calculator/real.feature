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
      | op  | real1 | real2 | res    |
      | '+' | 3.14  | 1.5   | 4.64   |
      | '-' | 3.14  | 2.71  | 0.43   |
      | '*' | 3.14  | 2.71  | 8.5094 |
      | '/' | 3.14  | 2.5   | 1.256  |

  Scenario Outline: Evaluating the operation between real and integer numbers
    Given a real operation <op>
    When I provide a first real number <real1>
    And I provide a second integer number <int2>
    Then the operation evaluates to <res>

    Examples:
      | op  | real1 | int2 | res  |
      | '+' | 3.14  | 1    | 4.14 |
      | '-' | 3.14  | 2    | 1.14 |
      | '*' | 3.14  | 2    | 6.28 |
      | '/' | 3.14  | 2    | 1.57 |

  Scenario Outline: Evaluating the operation between real and rational numbers
    Given a real operation <op>
    When I provide a first real number <real1>
    And I provide a second rational number <rat2>
    Then the operation evaluates to <res>

    Examples:
      | op  | real1 | rat2 | res  |
      | '+' | 3.14  | 1/2  | 3.64 |
      | '-' | 3.14  | 1/2  | 2.64 |
      | '*' | 3.14  | 1/2  | 1.57 |
      | '/' | 3.14  | 1/2  | 6.28 |

  Scenario: Compute the square root of a real number
    Given a real operation 'sqrt'
    When I provide a first real number 0.25
    Then the operation evaluates to 0.5

  Scenario: Compute the log of a real number
    Given a real operation 'ln'
    When I provide a first real number 2.71
    Then the operation evaluates to 0.99695

  Scenario: Compute the log of a real number
    Given a real operation 'ln'
    When I provide a first real number 1
    Then the operation evaluates to 0

  Scenario: Compute the log of 0
    Given a real operation 'ln'
    When I provide a first real number 0
    Then the operation evaluates to "NaN"

  Scenario: Compute the cosine of a real number
    Given a real operation 'cos'
    When I provide a first real number 0
    Then the operation evaluates to 1

  Scenario: Compute the cosine of a real number
    Given a real operation 'cos'
    When I provide a first real number 3.14
    Then the operation evaluates to -1

  Scenario: Compute the exponential of a real number
    Given a real operation 'exp'
    When I provide a first real number 1
    Then the operation evaluates to 2.71828

  Scenario Outline: Evaluating the operation with real numbers
    Given a real operation <op>
    When I provide a first real number <real>
    Then the operation evaluates to <res>

    Examples:
      | op     | real | res     |
      | 'sqrt' | 0.25 | 0.5     |
      | 'ln'   | 2.71 | 0.99695 |
      | 'ln'   | 1    | 0       |
      | 'ln'   | 0    | "NaN"   |
      | 'cos'  | 0    | 1       |
      | 'cos'  | 3.14 | -1      |
      | 'exp'  | 1    | 2.71828 |
      | 'sin'  | 0    | 0       |




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
  Scenario Outline: Parsing expressions
    Given the following expression <expr>
    Then its parsing is <parsed>

    Examples:
      | expr             | parsed     |
      | '3.14'           | '3.14'     |
      | '-3.14'          | '-3.14'    |
      | '0.123'          | '0.123'    |
      | '3.141E+2'        | '314.1'    |
      | '3.141E-2'       | '0.03141'  |
      | '0.000000000314' | '3.14E-10' |
      | 'pi'             | '3.1416'   |

  Scenario Outline: Parsing expressions with ln
    Given the following expression <expr>
    Then its parsing is <parsed>

    Examples:
      | expr             | parsed         |
      | 'ln(3.14)'       | 'ln(3.14)'     |
      | 'ln()'           | "NaN"          |
      | 'ln(3.14, 2.71)' | "NaN"          |
      | 'ln((5,2)+)'     | "ln((5, 2) +)" |
      | 'ln(+ (5, 2))'   | 'ln(+ (5, 2))' |
      | 'ln(+ (5, )'     | "NaN"          |
      | 'ln((5,  +)'     | "NaN"          |
      | 'ln(5 + '        | "NaN"          |

  Scenario Outline: Parsing expressions with cos
    Given the following expression <expr>
    Then its parsing is <parsed>

    Examples:
      | expr              | parsed          |
      | 'cos(3.14)'       | 'cos(3.14)'     |
      | 'cos()'           | "NaN"           |
      | 'cos(3.14, 2.71)' | "NaN"           |
      | 'cos((5,2)+)'     | "cos((5, 2) +)" |
      | 'cos(+ (5, 2))'   | 'cos(+ (5, 2))' |
      | 'cos(+ (5, )'     | "NaN"           |
      | 'cos((5,  +)'     | "NaN"           |
      | 'cos(5 + '        | "NaN"           |

  Scenario Outline: Parsing expressions with sin
    Given the following expression <expr>
    Then its parsing is <parsed>

    Examples:
      | expr              | parsed          |
      | 'sin(3.14)'       | 'sin(3.14)'     |
      | 'sin()'           | "NaN"           |
      | 'sin(3.14, 2.71)' | "NaN"           |
      | 'sin((5,2)+)'     | "sin((5, 2) +)" |
      | 'sin(+ (5, 2))'   | 'sin(+ (5, 2))' |
      | 'sin(+ (5, )'     | "NaN"           |
      | 'sin((5,  +)'     | "NaN"           |
      | 'sin(5 + '        | "NaN"           |

  Scenario Outline: Parsing expressions with sqrt
    Given the following expression <expr>
    Then its parsing is <parsed>

    Examples:
      | expr               | parsed           |
      | 'sqrt(3.14)'       | 'sqrt(3.14)'     |
      | 'sqrt()'           | "NaN"            |
      | 'sqrt(3.14, 2.71)' | "NaN"            |
      | 'sqrt((5,2)+)'     | "sqrt((5, 2) +)" |
      | 'sqrt(+ (5, 2))'   | 'sqrt(+ (5, 2))' |
      | 'sqrt(+ (5, )'     | "NaN"            |
      | 'sqrt((5,  +)'     | "NaN"            |
      | 'sqrt(5 + '        | "NaN"            |

  Scenario Outline: Parsing expressions with exp
    Given the following expression <expr>
    Then its parsing is <parsed>

    Examples:
      | expr              | parsed          |
      | 'exp(3.14)'       | 'exp(3.14)'     |
      | 'exp()'           | "NaN"           |
      | 'exp(3.14, 2.71)' | "NaN"           |
      | 'exp((5,2)+)'     | "exp((5, 2) +)" |
      | 'exp(+ (5, 2))'   | 'exp(+ (5, 2))' |
      | 'exp(+ (5, )'     | "NaN"           |
      | 'exp((5,  +)'     | "NaN"           |
      | 'exp(5 + '        | "NaN"           |