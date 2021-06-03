package com.steps;

import com.baselibrary.Baseclass;
import com.cucumber.listener.Reporter;
import com.dataproviderUtilities.ConfigFileReader;
import com.helperUtilities.Constant;
import com.helperUtilities.EnvSetUp;
import com.managersUtilities.Commonfunction;
import com.pagesPF.Project_Builderpage;
import com.pagesPF.Projectspage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class createProjectSteps extends Baseclass {
    Projectspage projectspage;
    Project_Builderpage projectBuilderpage;
    public ConfigFileReader configFileReader;
    //Logger log = LoggerHelper.getLogger(createProjectSteps.class);

    public createProjectSteps() {
        projectspage = PageFactory.initElements(driver, Projectspage.class);
        projectBuilderpage=PageFactory.initElements(driver,Project_Builderpage.class);
        configFileReader = new ConfigFileReader();

    }


    @When("^clicks on createProject tab$")
    public void clicksOnCreateProjectTab() {
        Commonfunction.waitForElementToAppear(driver, projectspage.createProjectButton);
        projectspage.createProjectButton.click();
        Reporter.addStepLog("--Details entered in ProjectSetUp Pop Up--");
        //log.info("User has clicked on ProjectSetUp Popup");
    }

    @When("^enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and select engine$")
    public void entersAndSelectEngine(String name, String description, String tag) throws InterruptedException {
        projectspage.enterDetailsIntoCreateProjectPopUp(name, description, tag);
        Commonfunction.submitDetails(projectspage.buttonCreateOnProjectSettingPopUp);
        Commonfunction.submitDetails(projectspage.buttonCreateOnProjectSettingPopUp);
        Reporter.addStepLog("--Details entered for Project--");
    }


    @Then("^created \"([^\"]*)\"is validated in project listing page$")
    public void createdIsValidatedInProjectListingPage(String projectName,String tag) throws InterruptedException {
        projectspage.validateProjectName(projectName,tag);
        Reporter.addStepLog("--Project with Name-->" + EnvSetUp.getDataKeyValue(Constant.ProjectName) + "--is validated on Project Listing page");

    }

    @Then("^all the fields on Project Setting up page are validated$")
    public void allTheFieldsOnProjectSettingUpPageAreValidated() {
        projectspage.validateAllFieldsOnProjectSettingPopUp();
        Reporter.addStepLog("--Fields on Project Setting PopUp are validated--");
    }

    @Then("^submit button is displaying disable$")
    public void submitButtonIsDisplayDisable()  {
        Assert.assertTrue(!projectspage.buttonCreateOnProjectSettingPopUp.isSelected());
        Reporter.addStepLog("--Submit button displays disable and Project is not created -");

    }

    @When("^enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" with empty description and select engine$")
    public void entersWithEmptyDescriptionAndSelectEngine(String name, String description, String tag) throws InterruptedException {
        projectspage.enterDetailsIntoCreateProjectPopUp(name, description, tag);
        Reporter.addStepLog("--Details entered for Project--");

    }

    @When("^enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and select engine and Cancel$")
    public void entersAndSelectEngineAndCancel(String name, String description, String tag) throws InterruptedException {
        projectspage.enterDetailsIntoCreateProjectPopUp(name, description, tag);
        Commonfunction.submitDetails(projectspage.buttonCancelOnProjectSettingPopUp);
        Reporter.addStepLog("--Details entered for Project and cancelled on Project Setting PopUp--");
    }

    @Then("^cancelled \"([^\"]*)\"is not validated in project listing page$")
    public void cancelledIsNotValidatedInProjectListingPage(String projectName) throws InterruptedException {
       projectspage.validateProjectNameNotOnProjectListingPage(projectName);
        Reporter.addStepLog("--Project is not present on ProjectListing Page--");

    }

    @When("^deletes the project$")
    public void deletesTheProject() throws InterruptedException {
       projectspage.deleteProjectOnProjectListingPage();
        Reporter.addStepLog("--Project is deleted on ProjectListing Page--");
    }

    @Then("^deleted \"([^\"]*)\" disappear from Project Listing Page$")
    public void deletedDisappearFromProjectListingPage(String projectName) throws Throwable {
        projectspage.validateProjectNameNotOnProjectListingPage(projectName);
        Reporter.addStepLog("--Project disappears from ProjectListing Page--");
    }

    @Then("^he should be able to delete all the Projects from Project Listing Page$")
    public void heShouldBeAbleToDeleteAllTheProjectsFromProjectListingPage() {
        projectspage.deleteAllProjectsOnProjectListingPage();
    }

    @Then("^created \"([^\"]*)\"is validated for details like status,tag,projectName,run button,run button,delete button etc.$")
    public void createdIsValidatedForDetailsLikeStatusTagProjectNameRunButtonRunButtonDeleteButton(String projectName) throws Throwable {
        projectspage.validateProjectRecord(projectName);
        projectspage.deleteProjectOnProjectListingPage();
    }

    @Then("^\"([^\"]*)\" and \"([^\"]*)\" is updated and validated$")
    public void andIsUpdatedAndValidated(String newTag, String description) throws Throwable {
        projectBuilderpage.editProjectDetailsOnProjectBuilder(newTag,description);
        Commonfunction.navigateBackward(driver);
        projectspage.validateProjectName(description,newTag);


    }

    @When("^enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" or edit existing project$")
    public void entersOrEditExistingProject(String projectName, String description, String tag)  {

    }

    @Then("^created \"([^\"]*)\" with \"([^\"]*)\"is validated in project listing page$")
    public void createdWithIsValidatedInProjectListingPage(String projectName, String tag) throws Throwable {
        projectspage.validateProjectName(projectName,tag);
        Reporter.addStepLog("--Project with Name-->" + EnvSetUp.getDataKeyValue(Constant.ProjectName) + "--is validated on Project Listing page");

    }

    @Then("^user is able to get Project Setting PopUp$")
    public void userIsAbleToGetProjectSettingPopUp() {
        projectspage.validateProjectSettingPopUp();
        Reporter.addStepLog("--Fields on Project Setting PopUp is present--");

    }

    @And("^searches the \"([^\"]*)\" with \"([^\"]*)\",\"([^\"]*)\"$")
    public void searchesTheWith(String project, String description, String tag) throws Throwable {

        projectspage.pickExistingProjectOrCreateNew(project,description,tag);

    }

    @Then("^\"([^\"]*)\" with \"([^\"]*)\"is validated in project listing page$")
    public void withIsValidatedInProjectListingPage(String project, String tag) throws Throwable {

    }

    @Then("^user is able to verify \"([^\"]*)\" on Project Listing page$")
    public void userIsAbleToVerifyOnProjectListingPage(String createProjectTab) throws Throwable {
        Commonfunction.getCustomisedWebElement(driver,projectspage.customisedCreateProjectTab,createProjectTab);
        Assert.assertTrue(Commonfunction.getCustomisedWebElement(driver,projectspage.customisedCreateProjectTab,createProjectTab).isDisplayed());

    }
}
