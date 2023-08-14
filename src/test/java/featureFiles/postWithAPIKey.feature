@tag
Feature: Validate Post Request with API Key

  @tag1
  Scenario: To validate Post API Request with key
    Given Call a Post Method Request Base URL with Key
    When Header and Body Request Parameters is specified
    Then validate Response status code
