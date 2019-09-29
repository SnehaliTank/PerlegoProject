$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/Features/AddToReadingList.feature");
formatter.feature({
  "line": 3,
  "name": "Add to Reading list functionality in Book page",
  "description": "\r\nAs a User\r\nI want to be able to verify the reading list functionality without being logged in\r\nSo that I can navigate to the login page",
  "id": "add-to-reading-list-functionality-in-book-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 11954504000,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AddToReadingList.user_is_on_homepage()"
});
formatter.result({
  "duration": 1249346500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify not logged in user is able to navigate to login page via add to reading list link",
  "description": "",
  "id": "add-to-reading-list-functionality-in-book-page;verify-not-logged-in-user-is-able-to-navigate-to-login-page-via-add-to-reading-list-link",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User clicks on a book",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User navigates to book page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User clicks on add to reading list link",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should be able to navigate to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToReadingList.user_clicks_on_a_book()"
});
formatter.result({
  "duration": 1133548700,
  "status": "passed"
});
formatter.match({
  "location": "AddToReadingList.user_navigates_to_book_page()"
});
formatter.result({
  "duration": 3462199600,
  "status": "passed"
});
formatter.match({
  "location": "AddToReadingList.user_clicks_on_add_to_reading_list_link()"
});
formatter.result({
  "duration": 2247631800,
  "status": "passed"
});
formatter.match({
  "location": "AddToReadingList.user_should_be_able_to_navigate_to_login_page()"
});
formatter.result({
  "duration": 561407600,
  "status": "passed"
});
formatter.after({
  "duration": 800672000,
  "status": "passed"
});
formatter.uri("src/test/Resources/Features/InformationSectionInBookPage.feature");
formatter.feature({
  "line": 3,
  "name": "Information section of book page in order to navigate to subject page",
  "description": "\r\nAs a User\r\nI want to check the contents of Information section of book page\r\nSo that I can navigate to the subject page",
  "id": "information-section-of-book-page-in-order-to-navigate-to-subject-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 7812244300,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AddToReadingList.user_is_on_homepage()"
});
formatter.result({
  "duration": 833231000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify user is able to navigate to subject page via the book page",
  "description": "",
  "id": "information-section-of-book-page-in-order-to-navigate-to-subject-page;verify-user-is-able-to-navigate-to-subject-page-via-the-book-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User searches for a book",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User navigates to search result page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User clicks on the book link",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User navigates to the book page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User verifies the information section",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User clicks on the link provided next to subject",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User should be able to navigate to subject page",
  "keyword": "Then "
});
formatter.match({
  "location": "InformationSectionInBookPage.user_searches_for_a_book()"
});
formatter.result({
  "duration": 6339922200,
  "status": "passed"
});
formatter.match({
  "location": "InformationSectionInBookPage.user_navigates_to_search_result_page()"
});
formatter.result({
  "duration": 356157700,
  "status": "passed"
});
formatter.match({
  "location": "InformationSectionInBookPage.user_clicks_on_the_book_link()"
});
formatter.result({
  "duration": 2813213500,
  "status": "passed"
});
formatter.match({
  "location": "InformationSectionInBookPage.user_navigates_to_the_book_page()"
});
formatter.result({
  "duration": 225899200,
  "status": "passed"
});
formatter.match({
  "location": "InformationSectionInBookPage.user_verifies_the_information_section()"
});
formatter.result({
  "duration": 567331500,
  "status": "passed"
});
formatter.match({
  "location": "InformationSectionInBookPage.user_clicks_on_the_link_provided_next_to_subject()"
});
formatter.result({
  "duration": 3614190000,
  "status": "passed"
});
formatter.match({
  "location": "InformationSectionInBookPage.user_should_be_able_to_navigate_to_subject_page()"
});
formatter.result({
  "duration": 91907500,
  "status": "passed"
});
formatter.after({
  "duration": 819596300,
  "status": "passed"
});
});