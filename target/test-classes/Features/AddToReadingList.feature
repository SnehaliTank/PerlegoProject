@regression

Feature: Add to Reading list functionality in Book page

  As a User
  I want to be able to verify the reading list functionality without being logged in
  So that I can navigate to the login page

  Background:
    Given User is on homepage

    @smoke
    Scenario: Verify not logged in user is able to navigate to login page via add to reading list link

      When User clicks on a book
      And User navigates to book page
      And User clicks on add to reading list link
      Then User should be able to navigate to login page
