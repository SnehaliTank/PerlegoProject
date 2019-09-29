@regression

Feature: Information section of book page in order to navigate to subject page

  As a User
  I want to check the contents of Information section of book page
  So that I can navigate to the subject page

  Background:
    Given User is on homepage

    @sanity
  Scenario: Verify user is able to navigate to subject page via the book page
    When User searches for a book
    And User navigates to search result page
    And User clicks on the book link
    And User navigates to the book page
    And User verifies the information section
    And User clicks on the link provided next to subject
    Then User should be able to navigate to subject page