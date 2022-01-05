Feature: Test google search functionality
  Scenario Outline: Check if google search navigates to search results
    Given Google browser is open
    When  User types the <searchKey>
    And Hits enter
    Then User finds result
    Examples:
    |searchKey| |result|
