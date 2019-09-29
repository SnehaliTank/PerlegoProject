package PageObject;

import Perlego.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;

public class GmatFoundationOfMath extends Utils
{
    private By _addToReadingList = By.cssSelector("[class='sc-gFaPwZ bIEKrx']");
    private By _assertBookPageHeading = By.xpath("(//h1[contains(text(),'GMAT Foundations of Math')])[2]");


    public void switchToBookPageTab(){
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
    public void assertGmatFoundationOfMathPage()
    {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(_assertBookPageHeading));
        Assert.assertEquals(driver.findElement(By.xpath("(//h1[contains(text(),'GMAT Foundations of Math')])[2]")).getText(),"GMAT Foundations of Math");
    }

    public void clickOnAddToReadingList() {

        try {
            // Scroll down to view displayed add to reading list
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,700)", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(_addToReadingList));

        Utils.clickElementBy(_addToReadingList);
    }

    public void switchToLoginPage(){
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}
