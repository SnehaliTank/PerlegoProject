package Perlego;

import cucumber.api.Scenario;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.sun.deploy.cache.Cache.copyFile;

public class Utils extends BasePage{

    //Resuable method for click
    public static void clickElementBy(By by)
    {
        driver.findElement(by).click();
    }

    public static void assertURL(String expected)
    {
        try {
            String URL = driver.getCurrentUrl();
            Assert.assertEquals(URL, expected);
            System.out.println("Expected Result : " + expected);
            System.out.println("Actual Result : " + URL);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //Method used for scroll to view element
    public static void scrollViewElement(By by) {
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(by);
        je.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // Reusable method to assert text of element
    public static void assertTextOfElement(String expected, By by) {
        try {
            String actual = driver.findElement(by).getText();
            Assert.assertEquals(expected, actual);
        } catch (NoSuchElementException e) {
            System.out.println("Invalid Locator OR Element or Text in element is not present: " + by);
            throw (e);
        }
    }

    // Reusable method for Explicit wait for element to be displayed/visible
    public static void waitForElementDisplay(By by, int time) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (NoSuchElementException e) {
            System.out.println("Invalid Locator OR Element is not present within the given wait time: " + by);
            throw (e);
        }
    }

    //Method for date short
    public static String shortDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("mmddyyyyHHmmss");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        return date1;
    }

    public static void screenShotCucumber(Scenario scenario){
        {
            String screenshotName = scenario.getName().replaceAll(".,:;?!", "") + shortDate() + ".png";
            try {
                //This takes a screenshot from the driver at save it to the location
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                //Building up the destination path for the screenshot to save
                //Also make sure to create a folder 'Screenshots' within the cucumber-report folder
                File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/extent-reports/screenshots/" + screenshotName);
                //Copy taken sceenshot from source location to destination location
                copyFile(sourcePath, destinationPath);
                scenario.write("!!!!!!....Scenario Failed....!!!!Please see attached screenshot for the error/issue");
                //attach the screenshot to our report
                scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
