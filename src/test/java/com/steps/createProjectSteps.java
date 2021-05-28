package com.steps;

import com.baselibrary.Baseclass;
import com.cucumber.listener.Reporter;
import com.dataproviderUtilities.ConfigFileReader;
import com.helperUtilities.Constant;
import com.helperUtilities.EnvSetUp;
import com.managersUtilities.Commonfunction;
import com.pagesPF.Projectspage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class createProjectSteps extends Baseclass {
    Projectspage projectspage;
    public ConfigFileReader configFileReader;
    //Logger log = LoggerHelper.getLogger(createProjectSteps.class);

    public createProjectSteps() {
        projectspage = PageFactory.initElements(driver, Projectspage.class);
        configFileReader = new ConfigFileReader();

    }


    @When("^clicks on createProject tab$")
    public void clicksOnCreateProjectTab() {
        projectspage.enterDetailsInProjectSetting();
        Reporter.addStepLog("--Details entered in ProjectSetUp Pop Up--");
        //log.info("User has clicked on ProjectSetUp Popup");
    }

    @When("^enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and select engine$")
    public void entersAndSelectEngine(String name, String description, String tag) {
        projectspage.enterDetailsIntoCreateProjectPopUp(name, description, tag);
        Commonfunction.submitDetails(projectspage.buttonCreate);
        Reporter.addStepLog("--Details entered for Project--");
    }


    @Then("^created \"([^\"]*)\"is validated in project listing page$")
    public void createdIsValidatedInProjectListingPage(String projectName) throws InterruptedException {
        projectspage.validateProjectName(projectName);
        Reporter.addStepLog("--Project with Name-->" + EnvSetUp.getDataKeyValue(Constant.ProjectName) + "--is validated on Project Listing page");

    }

    @Then("^all the fields on Project Setting up page are validated$")
    public void allTheFieldsOnProjectSettingUpPageAreValidated() {
        projectspage.validateAllFieldsOnProjectSettingPopUp();
        Reporter.addStepLog("--Fields on Project Setting PopUp are validated--");
    }

    @Then("^submit button is displaying disable$")
    public void submitButtonIsDisplayDisable() throws InterruptedException {
        Assert.assertTrue(!projectspage.buttonCreate.isSelected());
        Reporter.addStepLog("--Submit button displays disable and Project is not created -");

    }

    @When("^enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" with empty description and select engine$")
    public void entersWithEmptyDescriptionAndSelectEngine(String name, String description, String tag) throws Throwable {
        projectspage.enterDetailsIntoCreateProjectPopUp(name, description, tag);
        Reporter.addStepLog("--Details entered for Project--");

    }

    @When("^enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and select engine and Cancel$")
    public void entersAndSelectEngineAndCancel(String name, String description, String tag) throws Throwable {
        projectspage.enterDetailsIntoCreateProjectPopUp(name, description, tag);
        Commonfunction.submitDetails(projectspage.buttonCancel);
        Reporter.addStepLog("--Details entered for Project and cancelled on Project Setting PopUp--");
    }

    @Then("^created \"([^\"]*)\"is not validated in project listing page$")
    public void createdIsNotValidatedInProjectListingPage(String projectName) throws InterruptedException {
       projectspage.validateProjectNameNotOnProjectListingPage(projectName);
        Reporter.addStepLog("--Project is not present on ProjectListing Page--");

    }

    @When("^deletes the project$")
    public void deletesTheProject() {
        projectspage.deleteProjectOnProjectListingPage();
        Reporter.addStepLog("--Project is deleted on ProjectListing Page--");
    }

    @Then("^created \"([^\"]*)\" disappear from Project Listing Page$")
    public void createdDisappearFromProjectListingPage(String projectName) throws Throwable {
        projectspage.validateProjectNameNotOnProjectListingPage(projectName);
        Reporter.addStepLog("--Project disappears from ProjectListing Page--");
    }

    @Then("^he should be able to delete all the Projects from Project Listing Page$")
    public void heShouldBeAbleToDeleteAllTheProjectsFromProjectListingPage() {
        projectspage.deleteAllProjectsOnProjectListingPage();
    }
}
