package Perlego;

import PageObject.HomePage;
import PageObject.FoundationsOfImageScienceBookPage;
import PageObject.ScienceSubjectPage;
import PageObject.SearchResultsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InformationSectionInBookPage {

    HomePage homePage = new HomePage();
    FoundationsOfImageScienceBookPage foundationsOfImageScienceBookPage = new FoundationsOfImageScienceBookPage();
    ScienceSubjectPage scienceSubjectPage = new ScienceSubjectPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @When("^User searches for a book$")
    public void user_searches_for_a_book() {
        homePage.clickOnSearchIcon();
        homePage.enterFoundationsOfImageScienceInSearch();
        homePage.clickOnFoundationsOfImageScience();
    }

    @When("^User navigates to search result page$")
    public void user_navigates_to_search_result_page() {
        searchResultsPage.assertSearchResultPage();
    }

    @When("^User clicks on the book link$")
    public void user_clicks_on_the_book_link() {
        searchResultsPage.scrollToAndClickFoundationsOfImageScienceBookImage();
    }

    @When("^User navigates to the book page$")
    public void user_navigates_to_the_book_page() {
        foundationsOfImageScienceBookPage.assertPageHeading();

    }

    @When("^User verifies the information section$")
    public void user_verifies_the_information_section() {
        foundationsOfImageScienceBookPage.scrollDownToInformationSection();
    }

    @When("^User clicks on the link provided next to subject$")
    public void user_clicks_on_the_link_provided_next_to_subject() {
        foundationsOfImageScienceBookPage.clickOnItAndScienceBookLink();
    }

    @Then("^User should be able to navigate to subject page$")
    public void user_should_be_able_to_navigate_to_subject_page() {
        scienceSubjectPage.assertPageTitle();
    }

}
