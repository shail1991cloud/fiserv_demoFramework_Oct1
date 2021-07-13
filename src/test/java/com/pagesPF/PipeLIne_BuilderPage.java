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
   public WebElement enterSourceNameField;
    @FindBy(how = How.XPATH, using = "//*[text()=\"File path*\"]/following::input[@maxlength='200']")
   public WebElement filePath;
    @FindBy(how = How.XPATH, using = "//*[text()=\"Column seperator*\"]/following::input[1]")
   public WebElement columnSeparator;
    @FindBy(how = How.XPATH, using = "//*[text()=\"Add \"]")
   public WebElement buttonAdd;
    @FindBy(how = How.XPATH, using = "//*[text()=\"Status\"]")
   public WebElement status;
    @FindBy(how = How.XPATH, using = "//*[@id=\"base-layout-sidebar\"]//div[2]//div//scale-dropdown[3]/div")
   public WebElement manualSchema;
    @FindBy(how = How.XPATH, using = "//*[text()=' + ']")
   public WebElement addButtonOnSource;
    @FindBy(how = How.XPATH, using = "//*[text()=' Destination ']")
    public WebElement selectDestination;
    @FindBy(how = How.XPATH, using = "//*[text()=' Delete ']")
    public WebElement deleteButtonOnDeleteSourcePopUp;


    String type="//*[text()='%s ']";
    String connection="//*[text()='%s ']";
    String fileType="//*[text()='%s ']";
    String schemaSource="//*[text()='%s ']";
    String manualSchemaConnection="//*[text()='%s ']";
    String deleteSourceORDestORTransformation="//*[text()=' %s ']";
    public String sourceName="//*[@title='%s']";

    String iconOnPipeLineBuilderPage="//*[text()='%s']";

    public void clickOnAddSourceORDestinationIcon(String icon) throws InterruptedException {
        CommonFunction.getCustomisedWebElement(driver,iconOnPipeLineBuilderPage,icon);
        CommonFunction.waitForElementToAppear(driver,CommonFunction.getCustomisedWebElement(driver,iconOnPipeLineBuilderPage,icon));
        CommonFunction.getCustomisedWebElement(driver,iconOnPipeLineBuilderPage,icon).click();
    }

    public void createSource(String sourceName, String typeToAdd, String connectionToAdd, String fileTypeToAdd, String filepath, String colSeparator, String schemaSourceToAdd,String manualSchema) throws InterruptedException, IOException {
        CommonFunction.waitForElementToAppear(driver,enterSourceNameField);
        enterSourceNameField.sendKeys(sourceName);
        CommonFunction.scrollOnElement(driver,CommonFunction.getCustomisedWebElement(driver,type,typeToAdd));
        CommonFunction.scrollOnElement(driver,CommonFunction.getCustomisedWebElement(driver,connection,connectionToAdd));
        CommonFunction.scrollOnElement(driver,CommonFunction.getCustomisedWebElement(driver,fileType,fileTypeToAdd));
        CommonFunction.waitForElementToAppear(driver,filePath);
        CommonFunction.scrollToElement(driver,filePath);
        filePath.sendKeys(filepath);
        CommonFunction.waitForElementToAppear(driver,columnSeparator);
        columnSeparator.sendKeys(colSeparator);
        CommonFunction.scrollOnElement(driver,CommonFunction.getCustomisedWebElement(driver,schemaSource,schemaSourceToAdd));
        selectManualSchema(manualSchema);
        CommonFunction.waitForElementToAppear(driver,buttonAdd);
        buttonAdd.click();
        CommonFunction.waitForSomeTime();
        CommonFunction.scrollToElement(driver,status);
    }
   public void selectManualSchema(String schemaName) throws InterruptedException, IOException {
      try {
          if(manualSchema.isDisplayed())
          {
              CommonFunction.scrollOnElement(driver,CommonFunction.getCustomisedWebElement(driver,manualSchemaConnection,schemaName));
          }
      } catch (Exception e) {
          e.printStackTrace();
      }
   }






}


