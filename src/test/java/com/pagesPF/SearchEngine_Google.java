package com.pagesPF;

import com.dataproviderUtilities.ConfigFileReader;
import com.managersUtilities.CommonFunction;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SearchEngine_Google {
    WebDriver driver;
    public ConfigFileReader configFileReader;
    public final String searchItemOnGoogle = "//*[text()='%s']";
    @FindBy(how = How.XPATH, using = "//*[@title='Search']")
    WebElement searchBoxOnGooglePage;



    public SearchEngine_Google(WebDriver driver) {
        this.driver = driver;
        configFileReader = new ConfigFileReader();
    }


    public void searchItemOnGoogle(String item ) throws InterruptedException {

        CommonFunction.waitForElementToAppear(driver,searchBoxOnGooglePage);
        searchBoxOnGooglePage.sendKeys(item);
        searchBoxOnGooglePage.sendKeys(Keys.ENTER);

    }

    public void validateFirstItemOnGoogle(String itemValueToAdd ) throws InterruptedException {


        CommonFunction.waitForElementToAppear(driver,CommonFunction.getCustomisedWebElement(driver,searchItemOnGoogle,itemValueToAdd));
        Assert.assertTrue(CommonFunction.getCustomisedWebElement(driver,searchItemOnGoogle,itemValueToAdd).isDisplayed());

    }



}
