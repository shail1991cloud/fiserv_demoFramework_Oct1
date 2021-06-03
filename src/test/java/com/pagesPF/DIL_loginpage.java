package com.pagesPF;

import com.dataproviderUtilities.ConfigFileReader;
import com.managersUtilities.CommonFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DIL_loginpage {

    WebDriver driver;
    public ConfigFileReader configFileReader;

    public DIL_loginpage(WebDriver driver) {
        this.driver = driver;
        configFileReader = new ConfigFileReader();

    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
    WebElement dilUserName;
    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
    WebElement dilPassword;
    @FindBy(how = How.XPATH, using = "//*[@value=\"Login\"]")
    WebElement loginBtn;

    public void loginToDIL() {
        CommonFunction.waitForElementToAppear(driver, dilUserName);
        dilUserName.sendKeys(configFileReader.getProperties().getProperty("dilUsrNm"));
        CommonFunction.waitForElementToAppear(driver, dilPassword);
        dilPassword.sendKeys(configFileReader.getProperties().getProperty("dilPwd"));
        CommonFunction.waitForElementToAppear(driver, loginBtn);
        loginBtn.click();


    }

}
