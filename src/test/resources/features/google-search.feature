Feature: Test google search functionality
  Scenario: Check if google search navigates to search results
    Given Google browser is open
    When  User types the search keyword
    And Hits enter
    Then User navigates to search results
