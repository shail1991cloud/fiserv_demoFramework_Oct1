package com.steps;

import com.baselibrary.Baseclass;
import com.dataproviderUtilities.ConfigFileReader;
import com.helperUtilities.LoggerHelper;
import com.managersUtilities.CommonFunction;
import com.pagesPF.DIL_loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class commonSteps extends Baseclass {
    DIL_loginpage dil_loginpage;
    public ConfigFileReader configFileReader;
    Logger log = LoggerHelper.getLogger(commonSteps.class);

    public commonSteps() {
        dil_loginpage = PageFactory.initElements(driver, DIL_loginpage.class);
        configFileReader = new ConfigFileReader();

    }


    @Given("^user is on DIL login page$")
    public void userIsOnDILLoginPage() {
        driver.get(configFileReader.getProperties().getProperty("dil_Url"));
        CommonFunction.maximiseBrowser(driver);
        log.info("--Browser Launched--and user is navigated to DIL Login Page");
    }


    @When("^enter username and password$")
    public void enterUsernameAndPassword() {
        dil_loginpage.loginToDIL();
        log.info("--user name and Password are entered--");

    }
}
