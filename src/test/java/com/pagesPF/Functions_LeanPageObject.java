package com.pagesPF;

import com.cucumber.listener.Reporter;
import com.dataproviderUtilities.ConfigFileReader;
import com.helperUtilities.Constant;
import com.helperUtilities.DatesHelper;
import com.helperUtilities.EnvSetUp;
import com.helperUtilities.LoggerHelper;
import com.managersUtilities.CommonFunction;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Functions_LeanPageObject {

    WebDriver driver;
    public ConfigFileReader configFileReader;
    Logger log = LoggerHelper.getLogger(DIL_loginpage.class);

    public Functions_LeanPageObject(WebDriver driver) {
        this.driver = driver;
        configFileReader = new ConfigFileReader();

    }
    public final String pages="//*[contains(text(),'%s ')]";
    public final String customisedCreateProjectRecord="//*[text()=' %s ']";
    public final String projectNameOnProjectBuilderORListingPage="//*[contains(text(),' %s ')]";


    public void switchBetweenPages(String pageName) throws InterruptedException {
        CommonFunction.getCustomisedWebElement(driver,pages,pageName).click();
        log.info("User is switched to-->"+pageName);
        Reporter.addStepLog("User is switched to-->"+pageName);

    }
    public void fetchProjectsRecordsOnProjectListingPage(String projectName) throws InterruptedException {
        CommonFunction.getCustomisedWebElement(driver,customisedCreateProjectRecord,projectName);

    }
    public WebElement fetchProjectNameOnProjectListingORBuilderPage() throws InterruptedException {
        return CommonFunction.getCustomisedWebElement(driver,projectNameOnProjectBuilderORListingPage,EnvSetUp.getDataKeyValue(Constant.ProjectName));

    }
    public String generateAUniqueRecord(String record)
    {
        String uniqueRecord = CommonFunction.generateRandomString(5) + record+ DatesHelper.getTodayDateWithSeconds();

        return uniqueRecord;
    }
}
