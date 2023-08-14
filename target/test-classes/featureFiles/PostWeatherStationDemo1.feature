@tag
Feature: Successfully register weather station and verify HTTP response code is 201.
  I want to use this template for my feature file

  @tag1
  Scenario: Successfully register weather station and verify HTTP response code 201
    Given Call Post Method Base URL with API Key
    When the Header and Body Request Parameters is specified
    Then validate HTTP Response status code

