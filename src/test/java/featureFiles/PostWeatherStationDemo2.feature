@tag
Feature: Successfully register weather station and verify HTTP response code is 201.
  I want to use this template for my feature file

  @tag1
  Scenario: Successfully register the weather station and verify HTTP response code 201
    Given Call a Post Method URL with API Key
    When the Header and Body Request Parameters are specified
    Then validate the HTTP Response status code

