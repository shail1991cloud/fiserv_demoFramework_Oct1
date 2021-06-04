package com.pagesPF;

import com.helperUtilities.Constant;
import com.helperUtilities.DatesHelper;
import com.helperUtilities.EnvSetUp;
import com.managersUtilities.CommonFunction;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class PipeLIne_ListingPage {

    WebDriver driver;
    public ProjectsPage projectspage;
    public Functions_LeanPageObject functions_leanPageObject;
    public PipeLIne_ListingPage(WebDriver driver) {

        this.driver = driver;
        projectspage = PageFactory.initElements(driver, ProjectsPage.class);
        functions_leanPageObject=PageFactory.initElements(driver, Functions_LeanPageObject.class);
    }

    String tSystemsJSPath="return document.querySelector(\"#header\").shadowRoot.querySelector(\"div > scale-app-header > header > div > div > div.header__brand-branding > app-logo > a > svg > g > g > path:nth-child(2)\")";

    String labelDIJSPath="document.querySelector(\"#header\").shadowRoot.querySelector(\"div > scale-app-header > header > div > div > div.header__brand-sector > ul > li\")";

    String noPipeLIneText="//*[text()=\" %s \"]";
    private final String recordPipeLine ="//*[text()=' %s ']";




    @FindBy(how = How.XPATH, using = "//*[text()='Pipelines']")
    WebElement tagPipeLineOnProjectListingPage;
    @FindBy(how = How.XPATH, using = "//*[contains(@id,'input-text-')]")
    WebElement textFieldPipeLineName;
    @FindBy(how = How.XPATH, using = "//*[contains(@id,'input-textarea')]")
    WebElement textFieldDescription;
    @FindBy(how = How.XPATH, using = "//*[@placeholder=\"Add tags to categorize pipeline\"]")
    WebElement textFieldTag;
    @FindBy(how = How.XPATH, using = "//*[text()=\" Create Pipeline\"]")
    WebElement createPipelineIcon;
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]//scale-button[2]")
    WebElement buttonCreatePipeline;


    public void validateDetailsOnProjectListingPageWithNORecords(String message) throws InterruptedException {
        Assert.assertTrue(functions_leanPageObject.fetchProjectNameOnProjectListingORBuilderPage().isDisplayed());
        Assert.assertTrue(tagPipeLineOnProjectListingPage.isDisplayed());
        Assert.assertTrue(CommonFunction.getCustomisedWebElement(driver,noPipeLIneText,message).isDisplayed());
    }
    public void createPipeLine(String piplineName,String description,String tag) throws InterruptedException {
        CommonFunction.waitForElementToAppear(driver,createPipelineIcon);
        createPipelineIcon.click();
        String uniquePipeLineName = CommonFunction.generateRandomString(5) + piplineName+ DatesHelper.getTodayDateWithSeconds();
        CommonFunction.waitForElementToAppear(driver,textFieldPipeLineName);
        textFieldPipeLineName.sendKeys(uniquePipeLineName);
        EnvSetUp.setDataValue(Constant.PipeLineName, uniquePipeLineName);
        CommonFunction.waitForElementToAppear(driver,textFieldDescription);
        textFieldDescription.sendKeys(description);
        textFieldTag.sendKeys(tag,Keys.ENTER);
        CommonFunction.scrollToElement(driver,buttonCreatePipeline);
         buttonCreatePipeline.click();

    }
    public void validatePipeLineRecord() throws InterruptedException {
        Assert.assertTrue(CommonFunction.getCustomisedWebElement(driver,recordPipeLine,EnvSetUp.getDataKeyValue(Constant.PipeLineName)).isDisplayed());
    }





}


