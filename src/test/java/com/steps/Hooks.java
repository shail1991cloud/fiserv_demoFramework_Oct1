package com.steps;

import com.baselibrary.Baseclass;
import com.config.enums.Browsers;
import com.cucumber.listener.Reporter;
import com.dataproviderUtilities.ConfigFileReader;
import com.managersUtilities.CommonFunction;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {

    WebDriver driver;
    public ConfigFileReader configFileReader;


    public Hooks() {
        driver = Baseclass.selectBrowser(Browsers.CHROME.name());
        configFileReader = new ConfigFileReader();

    }

    @Before
    public void beforeScenario(Scenario scenario) {
        Reporter.assignAuthor("Shailendra Parihar");


    }

    @After(order = 1)
    public void afterScenario(Scenario scenario) throws IOException {

        CommonFunction.getScreenShots(driver, scenario);

    }


    @After(order = 0)
    public void afterScenario() {
        Reporter.addScenarioLog("----Test is Completed----");
        driver.quit();
    }

}
