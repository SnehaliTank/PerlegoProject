package Perlego;

import PageObject.GmatFoundationOfMath;
import PageObject.HomePage;
import PageObject.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToReadingList {

    HomePage homePage = new HomePage();
    GmatFoundationOfMath gmatFoundationOfMath = new GmatFoundationOfMath();
    LoginPage loginPage = new LoginPage();

    @Given("^User is on homepage$")
    public void user_is_on_homepage()  {
        homePage.closeCookies();
        homePage.assertPageHeading();
    }

    @When("^User clicks on a book$")
    public void user_clicks_on_a_book() {
        homePage.selectFoundationsOfMathsBook();
    }

    @When("^User navigates to book page$")
    public void user_navigates_to_book_page()
    {
        gmatFoundationOfMath.switchToBookPageTab();
        gmatFoundationOfMath.assertGmatFoundationOfMathPage();
    }

    @When("^User clicks on add to reading list link$")
    public void user_clicks_on_add_to_reading_list_link() {
        gmatFoundationOfMath.clickOnAddToReadingList();
        gmatFoundationOfMath.switchToLoginPage();
    }

    @Then("^User should be able to navigate to login page$")
    public void user_should_be_able_to_navigate_to_login_page() {
        loginPage.assertLoginPageSubHeading();
    }
}
