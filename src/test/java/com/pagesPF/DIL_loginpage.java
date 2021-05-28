package com.pagesPF;

import com.dataproviderUtilities.ConfigFileReader;
import com.managersUtilities.Commonfunction;
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

    @FindBy(how = How.XPATH, using = "//input[@id=\"username\"]")
    WebElement dilUserName;
    @FindBy(how = How.XPATH, using = "//input[@id=\"password\"]")
    WebElement dilPassword;
    @FindBy(how = How.XPATH, using = "//*[@value=\"Login\"]")
    WebElement login;

    public void loginToDIL() {
        Commonfunction.waitForElementToAppear(driver, dilUserName);
        dilUserName.sendKeys(configFileReader.getProperties().getProperty("dilUserName"));
        Commonfunction.waitForElementToAppear(driver, dilPassword);
        dilPassword.sendKeys(configFileReader.getProperties().getProperty("dilPassword"));
        Commonfunction.waitForElementToAppear(driver, login);
        login.click();


    }

}
