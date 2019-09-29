package PageObject;

import Perlego.Utils;
import org.openqa.selenium.By;

public class FoundationsOfImageScienceBookPage extends Utils {

    private By _pageHeading = By.cssSelector(" div:nth-child(3) > div.sc-FQuPU.AjUmi > header > h1");
    private By _informationSectionHeading = By.cssSelector("div.sc-drKuOJ.jwrAdY");
    private By _scienceLink = By.cssSelector("div:nth-child(2) > div:nth-child(1) > a");

    public void assertPageHeading(){
        Utils.assertTextOfElement("Foundations of Image Science", _pageHeading);
    }

    public void scrollDownToInformationSection(){
        Utils.scrollViewElement(_informationSectionHeading);
    }

    public void verifySubjectComponentinInformationSection(){
        Utils.assertTextOfElement("Science", _scienceLink);
    }

    public void clickOnItAndScienceBookLink(){
        driver.findElement(_scienceLink).click();
    }
}
