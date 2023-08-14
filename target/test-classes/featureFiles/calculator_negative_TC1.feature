@tag
Feature: Money borrow estimation Comparision Negative Case
  I want to use this template for my feature file

  @tag1
  #//Negative scenario
  Scenario: Money borrow estimation using power calculator
    Given User opens ANZ Bank website
    When User navigates to ANZ home loan calculator page 
    And User enters annual income (before tax)
    And User also enters annual other income (optional)
    And User enters his/her Monthly living expenses
    And User enters Other loan monthly repayments
    And User Total credit card limits
    Then Validate the borrow estimate calculation