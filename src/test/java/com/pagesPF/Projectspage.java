package com.pagesPF;

import com.cucumber.listener.Reporter;
import com.helperUtilities.Constant;
import com.helperUtilities.DatesHelper;
import com.helperUtilities.EnvSetUp;
import com.managersUtilities.Commonfunction;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


public class Projectspage {

	WebDriver driver;
	public Projectspage(WebDriver driver)
	{
	this.driver=driver;
	} 
	@FindBy(how=How.XPATH ,using = "//*[@id=\"create-project-btn\"]")
	WebElement createProjectButton;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"input-text-field0\"]")
	WebElement projectNameTextField;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"input-textarea0\"]")
	WebElement projectDescriptionTextField;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"input-text-field1\"]")
	WebElement projectTag;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"input-dropdown0\"]")
	WebElement dropDown;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"create-btn\"]")
	public WebElement buttonCreate;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"cancel-btn\"]")
	public WebElement buttonCancel;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"app\"]//p[3]/button")
	WebElement deleteButtonOnProjectListingPage;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"app\"]//p[3]/button")
	List<WebElement> deleteButtonsOnProjectListingPage;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"app\"]//div[2]/div/div/div[1]/div[1]/div[1]")
	WebElement project_Name;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"app\"]/div/div[1]/div[2]/div/div/scale-modal/scale-button[2]")
	WebElement deleteButtonOnDeleteProjectPopUp;

	@FindBy(how=How.XPATH ,using = "//*[@placeholder=\"Search\"]")
	WebElement searchBoxOnProjectListingPage;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"projectName\"]")
	WebElement createdProjectOnProjectListingPage;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"projectName\"]")
	WebElement projectStatusOnProjecListingPage;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"projectTag\"]")
	WebElement projectTagOnProjecListingPage;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"engineId\"]/p/span")
	WebElement projectEngineOnProjecListingPage;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"app\"]//div[5]//p[1]")
	WebElement projectRunOnProjecListingPage;

	@FindBy(how=How.XPATH ,using = "//*[@id=\"app\"]//div[5]//p[2]")
	WebElement projectCopyOnProjecListingPage;




	@FindBy(how=How.XPATH ,using = "//*[@id=\"projectName\"]")
	List<WebElement> createdProjectsOnProjectListingPage;

	
	public void enterDetailsInProjectSetting()
	{
		Commonfunction.waitForElementToAppear(driver,createProjectButton);
		createProjectButton.click();
	}

	public void validateAllFieldsOnProjectSettingPopUp()
	{
		Commonfunction.waitForElementToAppear(driver,projectNameTextField);
		Assert.assertTrue(projectNameTextField.isDisplayed());
		Commonfunction.waitForElementToAppear(driver,projectTag);
		Assert.assertTrue(projectTag.isDisplayed());
		Commonfunction.waitForElementToAppear(driver,dropDown);
		Commonfunction.scrollToElement(driver,dropDown);
		Assert.assertTrue(dropDown.isDisplayed());
		Assert.assertTrue(buttonCreate.isDisplayed());
		Assert.assertTrue(buttonCancel.isDisplayed());

	}

	public void enterDetailsIntoCreateProjectPopUp(String name,String description,String tag)
	{
		Commonfunction.waitForElementToAppear(driver,projectNameTextField);
		String uniqueProjectName=name+ DatesHelper.getTodayDateWithHMS();
		EnvSetUp.setDataValue(Constant.ProjectName,uniqueProjectName);
		projectNameTextField.sendKeys(uniqueProjectName);
		projectDescriptionTextField.sendKeys(description);
		Commonfunction.waitForElementToAppear(driver,projectTag);
		projectTag.sendKeys(tag);
		projectTag.sendKeys(Keys.ENTER);
		Commonfunction.waitForElementToAppear(driver,dropDown);
		Commonfunction.scrollToElement(driver,dropDown);
		Commonfunction.selectFromDropDownWithValue(dropDown,"1");



	}

	public void validateProjectName(String projectName) throws InterruptedException {
		driver.navigate().refresh();
		Commonfunction.waitForSomeTime();
		Commonfunction.waitForElementToAppear(driver,searchBoxOnProjectListingPage);
		searchBoxOnProjectListingPage.sendKeys(EnvSetUp.getDataKeyValue(Constant.ProjectName));
		Commonfunction.waitForSomeTime();
		Assert.assertTrue(createdProjectOnProjectListingPage.isDisplayed());

	}

	public void validateProjectNameNotOnProjectListingPage(String projectName) throws InterruptedException {
		driver.navigate().refresh();
		Commonfunction.waitForSomeTime();
		Commonfunction.waitForElementToAppear(driver,searchBoxOnProjectListingPage);
		searchBoxOnProjectListingPage.sendKeys(EnvSetUp.getDataKeyValue(Constant.ProjectName));
		Commonfunction.waitForSomeTime();
		validatePresenceOfElement();

	}
	public void validatePresenceOfElement()
	{
		if(createdProjectsOnProjectListingPage.size()>0)
		{
			Assert.fail("Project is Present on Project Listing page");
		}
		else
		{
			Reporter.addStepLog("Element is not present on Project listing page");
		}
	}

	public void deleteProjectOnProjectListingPage()
	{
		Commonfunction.waitForElementToAppear(driver,deleteButtonOnProjectListingPage);
		deleteButtonOnProjectListingPage.click();
		Commonfunction.waitForElementToAppear(driver,deleteButtonOnDeleteProjectPopUp);
		deleteButtonOnDeleteProjectPopUp.click();
	}

	public void deleteAllProjectsOnProjectListingPage() {
		Commonfunction.waitForElementToAppear(driver,createProjectButton);
		System.out.println(deleteButtonsOnProjectListingPage.size());

		for(int i=1;i<=deleteButtonsOnProjectListingPage.size();i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			deleteButtonsOnProjectListingPage.get(i).click();
			Commonfunction.waitForElementToAppear(driver,deleteButtonOnDeleteProjectPopUp);
			deleteButtonOnDeleteProjectPopUp.click();

		}
	}

}
