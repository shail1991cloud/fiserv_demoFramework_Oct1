package com.steps;

import com.baselibrary.Baseclass;
import com.cucumber.listener.Reporter;
import com.dataproviderUtilities.ConfigFileReader;
import com.managersUtilities.Commonfunction;
import com.pagesPF.DIL_loginpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class commonSteps extends Baseclass {
    DIL_loginpage dil_loginpage;
    public ConfigFileReader configFileReader;
    // Logger log = LoggerHelper.getLogger(commonSteps.class);

    public commonSteps() {
        dil_loginpage = PageFactory.initElements(driver, DIL_loginpage.class);
        configFileReader = new ConfigFileReader();

    }


    @Given("^user is on DIL login page$")
    public void userIsOnDILLoginPage() {
        driver.get(configFileReader.getProperties().getProperty("website"));
        Commonfunction.maximiseBrowser(driver);
        Reporter.addScenarioLog("Browser Launched");
        Reporter.addStepLog("--Navigated to URL--");
    }


    @When("^enter username and password$")
    public void enterUsernameAndPassword() {
        dil_loginpage.loginToDIL();
        Reporter.addStepLog("--UserName and Password Entered--");
    }
}
