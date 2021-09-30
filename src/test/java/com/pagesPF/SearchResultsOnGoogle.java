package com.pagesPF;

import com.dataproviderUtilities.ConfigFileReader;
import com.managersUtilities.CommonFunction;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SearchResultsOnGoogle {
    WebDriver driver;
    public ConfigFileReader configFileReader;
    public final String customisedSearchResult = "//*[text()='%s']";
    @FindBy(how = How.XPATH, using = "//*[@title='Search']")
    WebElement searchBoxOnGooglePage;



    public SearchResultsOnGoogle(WebDriver driver) {
        this.driver = driver;
        configFileReader = new ConfigFileReader();
    }


    public void searchItem(String item ) throws InterruptedException {

        CommonFunction.waitForElementToAppear(driver,searchBoxOnGooglePage);
        searchBoxOnGooglePage.sendKeys(item);
        searchBoxOnGooglePage.sendKeys(Keys.ENTER);

    }

    public void validateResult(String resultToAdd ) throws InterruptedException {


        CommonFunction.waitForElementToAppear(driver,CommonFunction.getCustomisedWebElement(driver,customisedSearchResult,resultToAdd));
        Assert.assertTrue(CommonFunction.getCustomisedWebElement(driver,customisedSearchResult,resultToAdd).isDisplayed());

    }
    public void enterUrl(String url ) throws InterruptedException {

        driver.get(url);
        CommonFunction.deleteAllCookies(driver);
        CommonFunction.maximiseBrowser(driver);

    }


}
