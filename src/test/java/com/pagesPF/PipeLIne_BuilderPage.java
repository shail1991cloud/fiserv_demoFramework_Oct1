package com.pagesPF;

import com.managersUtilities.CommonFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class PipeLIne_BuilderPage {

    public ProjectsPage projectspage;
    WebDriver driver;

    public Functions_LeanPageObject functions_leanPageObject;
    @FindBy(how = How.XPATH, using = "//*[text()='Name*']/following::input")
    public WebElement enterSourceNameField;
    @FindBy(how = How.XPATH, using = "//scale-text-field[@label=\"Name*\"]//input[@type=\"text\"]")
    public WebElement enterTransformationName;
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
    @FindBy(how = How.XPATH, using = "//*[text()=' Transformation ']")
    public WebElement selectTransformation;
    @FindBy(how = How.XPATH, using = "//scale-accordion[@expanded=\"true\"]//scale-button[@variant=\"secondary\"][normalize-space()=\"+ Add Column\"]")
    public WebElement selectAddColumn;
    @FindBy(how = How.XPATH, using = "//scale-button[normalize-space()=\"Add\"]")
    public WebElement selectAddButton;
    @FindBy(how = How.XPATH, using = "//*[text()=' Delete ']")
    public WebElement deleteButtonOnDeleteSourcePopUp;
    public String categoryToSelect = "//*[text()='%s ']";
    public String transformationTypeToSelect = "//*[text()='%s ']";
    public String columnOptionToSelect = "//scale-accordion[@expanded=\"true\"]//option[normalize-space()=\"%s\"]";
    public String type = "//*[text()='%s ']";
    public String connection = "//*[text()='%s ']";
    public String fileType = "//*[text()='%s ']";
    public String schemaSource = "//*[text()='%s ']";
    public String manualSchemaConnection = "//*[text()='%s ']";
    public String deleteRecord = "//*[text()=' %s ']";
    public String sourceName = "//*[@title='%s']";
    public String transformation = "//*[@title='%s']";
    public String iconOnPipeLineBuilderPage = "//*[text()='%s']";



    public PipeLIne_BuilderPage(WebDriver driver) {

        this.driver = driver;
        projectspage = PageFactory.initElements(driver, ProjectsPage.class);
        functions_leanPageObject = PageFactory.initElements(driver, Functions_LeanPageObject.class);
    }

    public void clickOnAddSourceORDestinationIcon(String icon) throws InterruptedException {
        CommonFunction.getCustomisedWebElement(driver, iconOnPipeLineBuilderPage, icon);
        CommonFunction.waitForElementToAppear(driver, CommonFunction.getCustomisedWebElement(driver, iconOnPipeLineBuilderPage, icon));
        CommonFunction.getCustomisedWebElement(driver, iconOnPipeLineBuilderPage, icon).click();
    }

    public void createSourceWithFile(String sourceName, String typeToAdd, String connectionToAdd, String fileTypeToAdd, String filepath, String colSeparator, String schemaSourceToAdd, String manualSchema) throws InterruptedException, IOException {
        CommonFunction.waitForElementToAppear(driver, enterSourceNameField);
        enterSourceNameField.sendKeys(sourceName);
        CommonFunction.scrollOnElement(driver, CommonFunction.getCustomisedWebElement(driver, type, typeToAdd));
        CommonFunction.scrollOnElement(driver, CommonFunction.getCustomisedWebElement(driver, connection, connectionToAdd));
        CommonFunction.scrollOnElement(driver, CommonFunction.getCustomisedWebElement(driver, fileType, fileTypeToAdd));
        CommonFunction.waitForElementToAppear(driver, filePath);
        CommonFunction.scrollToElement(driver, filePath);
        filePath.sendKeys(filepath);
        CommonFunction.waitForElementToAppear(driver, columnSeparator);
        columnSeparator.sendKeys(colSeparator);
        CommonFunction.scrollOnElement(driver, CommonFunction.getCustomisedWebElement(driver, schemaSource, schemaSourceToAdd));
        selectManualSchema(manualSchema);
        CommonFunction.waitForElementToAppear(driver, buttonAdd);
        buttonAdd.click();
        CommonFunction.waitForSomeTime();
        CommonFunction.scrollToElement(driver, status);
    }

    public void selectManualSchema(String schemaName) throws InterruptedException, IOException {
        try {
            if (manualSchema.isDisplayed()) {
                CommonFunction.scrollOnElement(driver, CommonFunction.getCustomisedWebElement(driver, manualSchemaConnection, schemaName));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createTransformation(String transformationName, String category, String transformationType, String columnValue) throws InterruptedException, IOException {
        CommonFunction.waitForElementToAppear(driver, addButtonOnSource);
        addButtonOnSource.click();
        CommonFunction.waitForElementToAppear(driver, selectTransformation);
        selectTransformation.click();
        CommonFunction.waitForElementToAppear(driver, enterTransformationName);
        enterTransformationName.sendKeys(transformationName);
        CommonFunction.waitForElementToAppear(driver, CommonFunction.getCustomisedWebElement(driver, categoryToSelect, category));
        CommonFunction.getCustomisedWebElement(driver, categoryToSelect, category).click();
        CommonFunction.waitForElementToAppear(driver, CommonFunction.getCustomisedWebElement(driver, transformationTypeToSelect, transformationType));
        CommonFunction.getCustomisedWebElement(driver, transformationTypeToSelect, transformationType).click();
        CommonFunction.scrollOnElement(driver, CommonFunction.getCustomisedWebElement(driver, columnOptionToSelect, columnValue));
        selectAddColumn.click();
        CommonFunction.scrollToElement(driver, selectAddButton);
        CommonFunction.waitForElementToAppear(driver, selectAddButton);
        selectAddButton.click();
        CommonFunction.waitForSomeTime();
        CommonFunction.scrollToElement(driver, status);

    }

    public void addDestination()
    {

    }


}


