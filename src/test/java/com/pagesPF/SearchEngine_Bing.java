package com.pagesPF;

import com.dataproviderUtilities.ConfigFileReader;
import com.managersUtilities.CommonFunction;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SearchEngine_Bing {
    WebDriver driver;
    public ConfigFileReader configFileReader;
    public final String searchItemOnBing = "//h2/a[text()='%s']";
    @FindBy(how = How.XPATH, using = "//input[@name=\"q\"]")
    WebElement searchBoxOnBingPage;



    public SearchEngine_Bing(WebDriver driver) {
        this.driver = driver;
        configFileReader = new ConfigFileReader();
    }


    public void searchItemOnBing(String item) throws InterruptedException {
        CommonFunction.waitForElementToAppear(driver,searchBoxOnBingPage);
        searchBoxOnBingPage.sendKeys(item);
        searchBoxOnBingPage.sendKeys(Keys.ENTER);
    }

    public void validateFirstItemOnBing(String itemValueToAdd) throws InterruptedException {
        CommonFunction.waitForElementToAppear(driver,CommonFunction.getCustomisedWebElement(driver,searchItemOnBing,itemValueToAdd));
        Assert.assertTrue(CommonFunction.getCustomisedWebElement(driver,searchItemOnBing,itemValueToAdd).isDisplayed());
    }



}
