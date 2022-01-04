Feature: Validate login functionality
  Scenario: Login is Successful with valid credentials
    Given User is in the login page
    When User enters username and password
    And Clicks on login button
    Then User is navigated to home page