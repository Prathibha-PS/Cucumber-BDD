@tag
Feature: Money borrow estimation Comparision Positive Case
  I want to use this template for my feature file

  @tag1
  #//Positive scenario
  Scenario: Money borrow estimation using power calculator
    Given User opens ANZ Bank website page
    When User navigates to home loan calculator page 
    And User enters the annual income
    And User also enters the annual other income
    And User enters Monthly living expenses
    And User enters also Other loan monthly repayments
    And User gives Total credit card limits
    Then Validate borrow estimate calculation amount