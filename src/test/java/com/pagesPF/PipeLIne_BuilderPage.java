package com.pagesPF;

import com.managersUtilities.CommonFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class PipeLIne_BuilderPage {

    WebDriver driver;
    public ProjectsPage projectspage;
    public Functions_LeanPageObject functions_leanPageObject;

    public PipeLIne_BuilderPage(WebDriver driver) {

        this.driver = driver;
        projectspage = PageFactory.initElements(driver, ProjectsPage.class);
        functions_leanPageObject = PageFactory.initElements(driver, Functions_LeanPageObject.class);
    }

    @FindBy(how = How.XPATH, using = "//*[text()='Name*']/following::input")
    WebElement enterSourceNameField;
    @FindBy(how = How.XPATH, using = "//*[text()='Select Type']")
    WebElement typeDropDown;
    @FindBy(how = How.XPATH, using = "//*[text()='File System ']")
    WebElement selectSource;
    String type="//*[text()='%s ']";
    String iconOnPipeLineBuilderPage="//*[text()='%s']";

    public void clickOnAddSourceORDestinationIcon(String icon) throws InterruptedException {
        CommonFunction.getCustomisedWebElement(driver,iconOnPipeLineBuilderPage,icon);
        CommonFunction.waitForElementToAppear(driver,CommonFunction.getCustomisedWebElement(driver,iconOnPipeLineBuilderPage,icon));
        CommonFunction.getCustomisedWebElement(driver,iconOnPipeLineBuilderPage,icon).click();
    }

    public void createSourceWithNoSchema(String sourceName,String typeToAdd) throws InterruptedException, IOException {
      CommonFunction.waitForElementToAppear(driver,enterSourceNameField);
      enterSourceNameField.sendKeys(sourceName);
      //CommonFunction.scrollOnElement(driver,typeDropDown);
      CommonFunction.scrollOnElement(driver,CommonFunction.getCustomisedWebElement(driver,type,typeToAdd));



    }







}


