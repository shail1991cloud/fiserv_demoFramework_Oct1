package com.steps;

import java.io.IOException;


import org.openqa.selenium.WebDriver;

import com.baselibrary.Baseclass;
import com.config.enums.Browsers;
import com.cucumber.listener.Reporter;
import com.dataproviderUtilities.ConfigFileReader;
import com.managersUtilities.Commonfunction;
import com.pagesPF.Loginpage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    WebDriver driver;
    Loginpage lpf;
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

        Commonfunction.getScreenShots(driver, scenario);

    }


    @After(order = 0)
    public void afterScenario() {
        Reporter.addScenarioLog("----Test is Completed----");
        driver.quit();
    }

}
