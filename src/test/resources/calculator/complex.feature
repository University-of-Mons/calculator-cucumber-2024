Feature: Complex Numbers Example
  This feature provide a range af scenarios for feature Complex Numbers.


  Background:   Background:
    Given I initialise a calculator for Complex Numbers

  Scenario: Add two complex numbers
    Given A complex operator '+'
    When I have a complex number 3 + 4i
    And I have a complex number 5 + 6i
    Then I should get this complex number 8 + 10i

  Scenario: Subtract two complex numbers
    Given A complex operator '-'
    When I have a complex number 5 - 4i
    And I have a complex number 2 + 6i
    Then I should get this complex number 3 - 2i

  Scenario: Multiply two complex numbers
    Given A complex operator '*'
    When I have a complex number 0 + 4i
    And I have a complex number 5 + 0i
    Then I should get this complex number 0 + 20i

  Scenario: Divide two complex numbers
    Given A complex operator '/'
    When I have a complex number 0 + 4i
    And I have a complex number 5 + 0i
    Then I should get this complex number 0 + 0i

  Scenario: Modulus of a complex number
    Given A complex operator '||'
    When I have a complex number 3 + 4i
    Then I should get this number 5

  Scenario: Sqrt of a  number
    Given A complex operator 'sqrt'
    When I have a number 9
    Then I should get this number 3

  Scenario: Sqrt of a complex number
    Given A complex operator 'sqrt'
    When I have a number -1
    Then I should get this complex number 0 + 1i


