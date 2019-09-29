package PageObject;

import Perlego.Utils;
import org.openqa.selenium.By;

public class ScienceSubjectPage extends Utils {

    private By _pageHeading = By.cssSelector("h1.banner__header--title.text--heading");

    public void assertPageTitle() {
        Utils.assertTextOfElement("Science", _pageHeading);
    }
}
