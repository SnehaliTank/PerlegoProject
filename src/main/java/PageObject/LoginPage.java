package PageObject;

import Perlego.Utils;
import org.openqa.selenium.By;

public class LoginPage extends Utils {

    private By _subHeadingLoginText = By.cssSelector("span._3pDWfAwjkpLmOD4K1y_5qD");
    private By _subHeadinglearningText = By.xpath("//span[contains(text(),'to continue learning')]");

    public void assertLoginPageSubHeading(){
        Utils.waitForElementDisplay(_subHeadingLoginText,7);
        Utils.assertTextOfElement("Log in", _subHeadingLoginText);
        Utils.assertTextOfElement("to continue learning", _subHeadinglearningText);
    }
}
