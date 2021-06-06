package com.steps;

import com.baselibrary.Baseclass;
import com.cucumber.listener.Reporter;
import com.dataproviderUtilities.ConfigFileReader;
import com.helperUtilities.LoggerHelper;
import com.pagesPF.Functions_LeanPageObject;
import com.pagesPF.PipeLIne_ListingPage;
import com.pagesPF.Project_BuilderPage;
import com.pagesPF.ProjectsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class createPipeLineSteps extends Baseclass {
    ProjectsPage projectspage;
    Project_BuilderPage projectBuilderpage;
    public ConfigFileReader configFileReader;
    Functions_LeanPageObject functions_leanPageObject;
    PipeLIne_ListingPage pipeLIne_listingPage;
    Logger log = LoggerHelper.getLogger(createProjectSteps.class);

    public createPipeLineSteps() {
        projectspage = PageFactory.initElements(driver, ProjectsPage.class);
        projectBuilderpage = PageFactory.initElements(driver, Project_BuilderPage.class);
        functions_leanPageObject = PageFactory.initElements(driver, Functions_LeanPageObject.class);
        pipeLIne_listingPage = PageFactory.initElements(driver, PipeLIne_ListingPage.class);
        configFileReader = new ConfigFileReader();

    }

    @And("^switches to \"([^\"]*)\"$")
    public void switchesTo(String tabs) throws Throwable {
        functions_leanPageObject.switchBetweenPages(tabs);
        Reporter.addStepLog("User navigated to tab-->" + tabs);
        log.info("User navigated to tab-->" + tabs);
    }

    @Then("^PipeLine listing page is validated for ProjectName,PipelineTag and \"([^\"]*)\"$")
    public void pipelineListingPageIsValidatedForAnd(String Message) throws Throwable {
        pipeLIne_listingPage.validateDetailsOnProjectListingPageWithNORecords(Message);
        Reporter.addStepLog("Pipeline listing page is validated for message-->" + Message);
        log.info("Pipeline listing page is validated for message-->" + Message);

    }

    @Then("^PipeLine listing page is validated for created Pipeline$")
    public void pipelineListingPageIsValidatedForCreatedPipeline() throws InterruptedException {
        pipeLIne_listingPage.validatePipeLineRecord();
        Reporter.addStepLog("Pipeline listing page is validated for message created Pipeline");
        log.info("Pipeline listing page is validated for message created Pipeline");


    }

    @And("^creates a \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void createsAWithAnd(String pipelineName, String description, String tag) throws Throwable {
        pipeLIne_listingPage.createPipeLine(pipelineName, description, tag);
        projectspage.navigateToProjectListing();
        Reporter.addStepLog("Pipe line is created with name-->" + pipelineName);
        log.info("Pipe line is created with name-->" + pipelineName);

    }
}
