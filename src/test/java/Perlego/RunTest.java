package Perlego;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@sanity, @smoke, @regression", dryRun = false, monochrome = true,
        plugin = {"pretty","html:target/cucumber-reports"} )

public class RunTest {
}
