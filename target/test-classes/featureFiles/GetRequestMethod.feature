@tag
Feature: Trigger Get Request to obtain the list of all stations added to account

  @tag1
  Scenario: Trigger Get Request to obtain the list of all stations added to account
    Given Send a Get Request URL with API Key
    Then validate the list of stations with HTTP Response success status code

