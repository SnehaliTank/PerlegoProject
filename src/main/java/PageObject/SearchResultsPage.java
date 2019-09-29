package PageObject;

import Perlego.Utils;
import org.openqa.selenium.By;

public class SearchResultsPage extends Utils {

    private By _foundationsOfImageScienceBookImage = By.cssSelector("div.sc-jbKcbu.ktFaYM");
    private By _topResultText = By.cssSelector("div.sc-jMMfwr.iOgZEK");

    public void assertSearchResultPage(){
        Utils.assertTextOfElement("Top result", _topResultText);
    }

    public void scrollToAndClickFoundationsOfImageScienceBookImage(){
        Utils.scrollViewElement(_foundationsOfImageScienceBookImage);
        driver.findElement(_foundationsOfImageScienceBookImage).click();
    }
}
