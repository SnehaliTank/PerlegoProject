package Perlego;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends Utils{

    LoadProp loadProp = new LoadProp();
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser(){
        browserSelector.setUpBrowser();
        driver.get(loadProp.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }

    @After
    public void tearDownBrowser(Scenario scenario){
        if (scenario.isFailed()) {
            Utils.screenShotCucumber(scenario);
        }
        driver.quit();
    }
}
