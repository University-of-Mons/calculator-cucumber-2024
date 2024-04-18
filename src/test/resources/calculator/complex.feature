Feature: Complex arithmetic expressions
  This feature provides a range of scenarios corresponding to the
  intended external behaviour of arithmetic expressions on integers.

  # You can start with a Background: that will be run before executing each scenario.
  Background:
    Given I initialise a calculator

  Scenario Outline: Evaluating the operations with complex numbers
    Given a complex operation <op>
    When I provide a first complex number <c1>
    And I provide a second complex number <c2>
    Then the operation evaluates to <res>

    Examples:
      | op  | c1   | c2   | res  |
      | '+' | 5+2i | 3-4i | '8-2i'   |
      | '-' | 5+2i | 3-4i | '2+6i'   |
      | '*' | 5+2i | 3-4i | '23-14i' |
      | '/' | 6i   | 2i   | '3'      |

   Scenario Outline: Evaluating the operations between real and complex numbers
     Given a complex operation <op>
     When I provide a first number <n1>
     And I provide a second complex number <c2>
     Then the operation evaluates to <res>

     Examples:
       | op  | n1   | c2   | res  |
       | '+' | 2 | 3-4i | '5-4i'   |
       | '-' | 2 | 3-4i | '-1+4i'   |
       | '*' | 2 | 3-4i | '6-8i' |
       | '/' | 6   | 2i   | '-3i'      |

  Scenario: Dividing two complex numbers with integer results
    Given a complex operation '/'
    When I provide a first complex number 20+15i
    And I provide a second complex number 2-1i
    Then the operation evaluates to '5+10i'


  Scenario: Dividing two complex numbers with floating point results (floored)
    Given a complex operation '/'
    When I provide a first complex number 5+4i
    And I provide a second complex number 1+2i
    Then the operation evaluates to '13/5-6/5i'

  Scenario: Compute the modulus of a complex number
    Given a complex operation '|'
    When I provide a first complex number 3+4i
    Then the operation evaluates to '5'

  Scenario: Compute the modulus of a NaN number
    Given a complex operation '|'
    When I provide a NaN number
    Then the operation evaluates to 'NaN'

  ################################### Complex representation ##################################

  Scenario: Printing a complex number
    Given the following expression "4+4i"
    Then its CARTESIAN form is 4+4i
    And its POLAR form is 5.6569(cos(0.7854)+isin(0.7854))
    And its EXPONENTIAL form is 5.6569exp(0.7854i)

  ################################### Printer with unary ##################################
  Scenario: Printing a complex number
    Given a complex operation '+'
    When I provide a first complex number 5+2i
    And I provide a second complex number 3-4i
    Then its PREFIX notation is + (5+2i, 3-4i)
    And its INFIX notation is ( 5+2i + 3-4i )
    And its POSTFIX notation is (5+2i, 3-4i) +

  Scenario: Printing modulus
    Given a complex operation '|'
    When I provide a first complex number 3+4i
    Then its PREFIX notation is modulus(3+4i)
    And its INFIX notation is modulus(3+4i)
    And its POSTFIX notation is modulus(3+4i)

  Scenario: Printing modulus with operation
    Given a complex operation '|'
    When I provide the following expression "( 8 + 6 ) * 2"
    Then its PREFIX notation is modulus(* (+ (8, 6), 2))
    And its INFIX notation is modulus(( ( 8 + 6 ) * 2 ))
    And its POSTFIX notation is modulus(((8, 6) +, 2) *)



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

  Scenario: Parsing a modulus operation with bars
    Given the following expression '| 3+4i |'
    Then its parsing is 'modulus(3+4i)'

  Scenario: Parsing a modulus operation with keyword
    Given the following expression 'modulus(3+4i)'
    Then its parsing is 'modulus(3+4i)'

  Scenario: Parsing a modulus operation in Infix notation
    Given the following expression '| (1+2+3) |'
    Then its parsing is 'modulus(( ( 1 + 2 ) + 3 ))'

  Scenario: Parsing a modulus operation in Prefix notation
    Given the following expression '| + (1 2 3) |'
    Then its parsing is 'modulus(+ (1, 2, 3))'

  Scenario: Parsing a modulus operation in Postfix notation
    Given the following expression '| ((1 2 3) +) |'
    Then its parsing is 'modulus((1, 2, 3) +)'

  Scenario: Parsing a cartesian operation
    Given the following expression '5+2i'
    Then its parsing is '5+2i'

  # Scenario: Parsing a polar operation
  #  Given the following expression '5.6569(cos(0.7854)+isin(0.7854))'
  #   Then its parsing is '5.6569(cos(0.7854)+isin(0.7854))'

  # Scenario: Parsing a exponential operation
  #  Given the following expression '5.6569exp(0.7854i)'
  #  Then its parsing is '5.6569exp(0.7854i)'

