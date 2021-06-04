package com.steps;

import com.baselibrary.Baseclass;
import com.dataproviderUtilities.ConfigFileReader;
import com.pagesPF.Functions_LeanPageObject;
import com.pagesPF.PipeLIne_ListingPage;
import com.pagesPF.Project_BuilderPage;
import com.pagesPF.ProjectsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class createPipeLineSteps extends Baseclass {
    ProjectsPage projectspage;
    Project_BuilderPage projectBuilderpage;
    public ConfigFileReader configFileReader;
    Functions_LeanPageObject functions_leanPageObject;
    PipeLIne_ListingPage pipeLIne_listingPage;
    //Logger log = LoggerHelper.getLogger(createProjectSteps.class);

    public createPipeLineSteps() {
        projectspage = PageFactory.initElements(driver, ProjectsPage.class);
        projectBuilderpage=PageFactory.initElements(driver, Project_BuilderPage.class);
        functions_leanPageObject=PageFactory.initElements(driver, Functions_LeanPageObject.class);
        pipeLIne_listingPage =PageFactory.initElements(driver, PipeLIne_ListingPage.class);
        configFileReader = new ConfigFileReader();

    }

    @And("^switches to \"([^\"]*)\"$")
    public void switchesTo(String tabs) throws Throwable {
       functions_leanPageObject.switchBetweenPages(tabs);
    }

    @Then("^PipeLine listing page is validated for ProjectName,PipelineTag and \"([^\"]*)\"$")
    public void pipelineListingPageIsValidatedForAnd(String Message) throws Throwable {
       pipeLIne_listingPage.validateDetailsOnProjectListingPageWithNORecords(Message);
    }


    @And("^creates a \"([^\"]*)\" with \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
    public void createsAWithAnd(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^PipeLine listing page is validated for created Pipeline$")
    public void pipelineListingPageIsValidatedForCreatedPipeline() throws InterruptedException {
     pipeLIne_listingPage.validatePipeLineRecord();
    }

    @And("^creates a \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void createsAWithAnd(String pipelineName, String description, String tag) throws Throwable {
       pipeLIne_listingPage.createPipeLine(pipelineName,description,tag);
       projectspage.navigateToProjectListing();
    }
}
