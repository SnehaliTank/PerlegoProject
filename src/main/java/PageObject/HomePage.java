package PageObject;

import Perlego.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage extends Utils {

    private By _closeCookies = By.cssSelector("div.BZDdtrTgR1p16af6Qmcqk> div:nth-child(1) > div > div > div");
    private By _pageHeading = By.cssSelector("div:nth-child(1) > div > div > h1");
    private By _foundationsOfMathBook = By.cssSelector("[src*='thumbnail_9781506212456.jpg']");

    // locators for InformationSectionInBookPage.feature
    private By _searchIcon = By.cssSelector("div > i._2R0KMg9YZiuwyDXZ_SYmZK");
    private By _enterBookNametoSearch = By.id("searchInput");
    private By _foundationsOfImageScience = By.cssSelector("span._1yzJ6dPVG8crQzshAKqcaM");

    public void closeCookies(){
        driver.findElement(_closeCookies).click();
    }

    public void assertPageHeading(){
        Utils.assertTextOfElement("Learn anything, effortlessly",_pageHeading);
    }

    public void selectFoundationsOfMathsBook(){
        //Utils.scrollViewElement(_foundationsOfMathBook);

        try {
            // Scroll down to view displayed games
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,400)", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
        Utils.waitForElementDisplay(_foundationsOfMathBook,5);
        driver.findElement(_foundationsOfMathBook).click();
    }

//--------------------------------------------------------------------------------------

// Methods for InformationSectionIBookPage.feature/stepdef

    public void clickOnSearchIcon(){
        driver.findElement(_searchIcon).isDisplayed();
        driver.findElement(_searchIcon).click();
    }

    public void enterFoundationsOfImageScienceInSearch(){
        driver.findElement(_enterBookNametoSearch).sendKeys("Foundations of image science");
    }

    public void clickOnFoundationsOfImageScience(){
        driver.findElement(_foundationsOfImageScience).isDisplayed();
        driver.findElement(_foundationsOfImageScience).click();
    }
}
