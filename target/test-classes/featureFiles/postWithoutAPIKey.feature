@tag
Feature: Validate Post Request without Key

  @tag1
  Scenario: To validate Post API Request without key
    Given Call a Post Method Request Base URL without Key
    When Header and Body Request Parameters are specified
    Then validate the Response status code

