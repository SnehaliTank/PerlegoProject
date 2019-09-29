package Perlego;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends Utils{

    LoadProp loadProp = new LoadProp();

    public void setUpBrowser()
    {
        String browser = loadProp.getProperty("browser");

        if(browser.equalsIgnoreCase("chrome"))
        {
            //set path to chromedriver.exe
            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDrivers\\chromedriver1.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("-incognito");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        } else if(browser.equalsIgnoreCase("firefox")){
            //define path to geckodriver.exe
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().fullscreen();
        } else if(browser.equalsIgnoreCase("ie")){
            //define path to Edge.exe
            System.setProperty("webdriver.ie.driver","src/test/Resources/BrowserDrivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().window().fullscreen();
        }
        else
        {
            System.out.println("Browser not found");
        }
    }
}
