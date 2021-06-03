package com.pagesPF;

import com.managersUtilities.Commonfunction;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Project_Builderpage {

    WebDriver driver;
    public Projectspage projectspage;

    public Project_Builderpage(WebDriver driver) {

        this.driver = driver;
        projectspage = PageFactory.initElements(driver, Projectspage.class);

    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]//scale-icon-action-edit")
    WebElement editProjectToolTipOnProjectBuilder;

    @FindBy(how = How.XPATH, using = "//*[@aria-keyshortcuts='Delete']")
    WebElement deleteTagToolTipOnProjectBuilderPage;

    @FindBy(how = How.XPATH, using = "//*[@placeholder='Create new tag']")
    WebElement textFieldTagName;

    @FindBy(how = How.XPATH, using = "//*[text()='Save']")
    WebElement buttonSaveOnProjectBuilderPage;

    public void editProjectDetailsOnProjectBuilder(String tagName, String Description) throws InterruptedException {
        Commonfunction.waitForElementToAppear(driver, projectspage.existingProjectOnProjectListingPage);
        projectspage.existingProjectOnProjectListingPage.click();
        Commonfunction.clickByHoveringMouse(driver, editProjectToolTipOnProjectBuilder);
        Commonfunction.clickByHoveringMouse(driver, deleteTagToolTipOnProjectBuilderPage);
        textFieldTagName.sendKeys(Keys.ENTER);
        textFieldTagName.sendKeys(tagName);
        textFieldTagName.sendKeys(Keys.ENTER);
        Commonfunction.scrollToElement(driver, buttonSaveOnProjectBuilderPage);
        Commonfunction.waitForElementToAppear(driver, buttonSaveOnProjectBuilderPage);
        buttonSaveOnProjectBuilderPage.click();

    }


    public void validateEditedRecord() {

    }


}


