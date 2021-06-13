package com.steps;

import com.baselibrary.Baseclass;
import com.dataproviderUtilities.ConfigFileReader;
import com.helperUtilities.Constant;
import com.helperUtilities.EnvSetUp;
import com.helperUtilities.LoggerHelper;
import com.managersUtilities.CommonFunction;
import com.pagesPF.Project_BuilderPage;
import com.pagesPF.ProjectsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class createProjectSteps extends Baseclass {
    ProjectsPage projectspage;
    Project_BuilderPage projectBuilderpage;
    public ConfigFileReader configFileReader;
    Logger log = LoggerHelper.getLogger(createProjectSteps.class);

    public createProjectSteps() {
        projectspage = PageFactory.initElements(driver, ProjectsPage.class);
        projectBuilderpage = PageFactory.initElements(driver, Project_BuilderPage.class);
        configFileReader = new ConfigFileReader();

    }


    @When("^clicks on createProject tab$")
    public void clicksOnCreateProjectTab() {
        CommonFunction.waitForElementToAppear(driver, projectspage.createProjectButton);
        projectspage.createProjectButton.click();
        log.info("User has clicked on ProjectSetUp Popup");
    }

    @When("^creates project with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and engine$")
    public void entersAndSelectEngine(String name, String description, String tag) throws InterruptedException {
        projectspage.enterDetailsIntoCreateProjectPopUp(name, description, tag);
        CommonFunction.submitDetails(projectspage.buttonCreateOnProjectSettingPopUp);
      CommonFunction.submitDetails(projectspage.buttonCreateOnProjectSettingPopUp);
        log.info("--Details entered for Project With--->" + name + "," + description + " and " + tag);

    }


    @Then("^created \"([^\"]*)\"is validated in project listing page$")
    public void createdIsValidatedInProjectListingPage(String projectName, String tag) throws InterruptedException {
        projectspage.validateProjectName(projectName, tag);
        log.info("--Project with Name-->" + EnvSetUp.getDataKeyValue(Constant.ProjectName) + "--is validated on Project Listing page");

    }

    @Then("^all the fields on Project Setting up page are validated$")
    public void allTheFieldsOnProjectSettingUpPageAreValidated() {
        projectspage.validateAllFieldsOnProjectSettingPopUp();
        log.info("--Fields on Project Setting PopUp are validated--");

    }

    @Then("^submit button is displaying disable$")
    public void submitButtonIsDisplayDisable() {
        Assert.assertTrue(!projectspage.buttonCreateOnProjectSettingPopUp.isSelected());
        log.info("--Submit button displays disable and Project is not created -");

    }

    @When("^enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" with empty description and select engine$")
    public void entersWithEmptyDescriptionAndSelectEngine(String name, String description, String tag) throws InterruptedException {
        projectspage.enterDetailsIntoCreateProjectPopUp(name, description, tag);
        log.info("--Details entered for Project-->" + name + "," + description + "," + tag);

    }

    @When("^enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and select engine and Cancel$")
    public void entersAndSelectEngineAndCancel(String name, String description, String tag) throws InterruptedException {
        projectspage.enterDetailsIntoCreateProjectPopUp(name, description, tag);
        CommonFunction.submitDetails(projectspage.buttonCancelOnProjectSettingPopUp);
        log.info("--Details entered for Project and cancelled on Project Setting PopUp--");

    }

    @Then("^cancelled \"([^\"]*)\"is not validated in project listing page$")
    public void cancelledIsNotValidatedInProjectListingPage(String projectName) throws InterruptedException {
        projectspage.validateProjectNameNotOnProjectListingPage(projectName);
        log.info("--Project is not present on ProjectListing Page with name-->" + projectName);

    }

    @When("^deletes the project$")
    public void deletesTheProject() throws InterruptedException {
        projectspage.deleteProjectOnProjectListingPage();
        log.info("--Project is deleted on ProjectListing Page--");

    }


    @Then("^deleted \"([^\"]*)\" disappear from Project Listing Page$")
    public void deletedDisappearFromProjectListingPage(String projectName) throws Throwable {
        projectspage.validateProjectNameNotOnProjectListingPage(projectName);
        log.info("--Project disappears from ProjectListing Page with name-->" + projectName);

    }

    @Then("^he should be able to delete all the Projects from Project Listing Page$")
    public void heShouldBeAbleToDeleteAllTheProjectsFromProjectListingPage() {
        projectspage.deleteAllProjectsOnProjectListingPage();
        log.info("All the projrcts are deleted");

    }

    @Then("^created \"([^\"]*)\"is validated for details like status,tag,projectName,run button,run button,delete button etc.$")
    public void createdIsValidatedForDetailsLikeStatusTagProjectNameRunButtonRunButtonDeleteButton(String projectName) throws Throwable {
        projectspage.validateProjectRecord(projectName);
        projectspage.deleteProjectOnProjectListingPage();
        log.info("--Project with Name-->" + EnvSetUp.getDataKeyValue(Constant.ProjectName) + "--is validated on Project Listing page");

    }

    @Then("^\"([^\"]*)\" and \"([^\"]*)\" is updated and validated$")
    public void andIsUpdatedAndValidated(String newTag, String description) throws Throwable {
        projectBuilderpage.editProjectDetailsOnProjectBuilder(newTag, description);
        CommonFunction.navigateBackward(driver);
        projectspage.validateProjectName(description, newTag);
        log.info("--Project with -->" + newTag + "--is validated on Project Listing page");


    }


    @Then("^created \"([^\"]*)\" with \"([^\"]*)\"is validated in project listing page$")
    public void createdWithIsValidatedInProjectListingPage(String projectName, String tag) throws Throwable {
        projectspage.validateProjectName(projectName, tag);
        log.info("--Project with Name-->" + EnvSetUp.getDataKeyValue(Constant.ProjectName) + "--is validated on Project Listing page");

    }

    @Then("^user is able to get Project Setting PopUp$")
    public void userIsAbleToGetProjectSettingPopUp() {
        projectspage.validateProjectSettingPopUp();
        log.info("--Fields on Project Setting PopUp is present--");

    }

    @And("^searches the \"([^\"]*)\" with \"([^\"]*)\",\"([^\"]*)\"$")
    public void searchesTheWith(String project, String description, String tag) throws Throwable {

        projectspage.pickExistingProjectOrCreateNew(project, description, tag);
        log.info("Record with -->" + project + "," + description + "--is picked");

    }


    @Then("^user is able to verify \"([^\"]*)\" on Project Listing page$")
    public void userIsAbleToVerifyOnProjectListingPage(String createProjectTab) throws Throwable {
        CommonFunction.getCustomisedWebElement(driver, projectspage.customisedCreateProjectTab, createProjectTab);
        Assert.assertTrue(CommonFunction.getCustomisedWebElement(driver, projectspage.customisedCreateProjectTab, createProjectTab).isDisplayed());
        log.info("Varification of-->" + createProjectTab + "--is done");

    }


}
