package com.steps;

import com.baselibrary.Baseclass;
import com.dataproviderUtilities.ConfigFileReader;
import com.helperUtilities.LoggerHelper;
import com.pagesPF.Functions_LeanPageObject;
import com.pagesPF.PipeLIne_ListingPage;
import com.pagesPF.Project_BuilderPage;
import com.pagesPF.ProjectsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

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

        log.info("User navigated to tab-->" + tabs);
    }

    @Then("^PipeLine listing page is validated for ProjectName,PipelineTag and \"([^\"]*)\"$")
    public void pipelineListingPageIsValidatedForAnd(String Message) throws Throwable {
        pipeLIne_listingPage.validateDetailsOnProjectListingPageWithNORecords(Message);
        log.info("Pipeline listing page is validated for message-->" + Message);

    }

    @Then("^PipeLine listing page is validated for created Pipeline$")
    public void pipelineListingPageIsValidatedForCreatedPipeline() throws InterruptedException {
        pipeLIne_listingPage.validatePipeLineRecord();
        log.info("Pipeline listing page is validated for  created Pipeline");


    }

    @And("^creates a \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void createsAWithAnd(String pipelineName, String description, String tag) throws Throwable {
        pipeLIne_listingPage.createPipeLine(pipelineName, description, tag);
        projectspage.navigateToProjectListing();
        log.info("Pipe line is created with name-->" + pipelineName);

    }


    @When("deletes pipeline")
    public void deletesPipeline() {

    }

    @Then("{string} should get disappeared")
    public void shouldGetDisappeared(String pipeLine) {

    }

    @And("creates a {string} with {string},{string},{string},{string},{string},{string} and {string}")
    public void createsAWithAnd(String Pipeline, String Description, String Tag,String ExecutionType,String PKey, String PValue, String SKey, String SValue) throws IOException, InterruptedException {
        pipeLIne_listingPage.createPipeLineWithKeyAndValues(Pipeline,Description,Tag,ExecutionType,PKey,PValue,SKey,SValue);
        log.info("PipeLines is created with-->"+Pipeline +"--"+Description+"--"+Tag+"--"+ExecutionType+"--"+PKey+PValue+"--"+SKey+SValue);
    }


    @Then("PipeLine properties is validated for {string},{string},{string},{string},{string},{string} and {string}")
    public void pipelinePropertiesIsValidatedForAnd(String Description, String Tag,String ExecutionType, String PKey, String PValue, String SKey, String SValue) throws InterruptedException {
        pipeLIne_listingPage.validatePipeLineProperties(Description,Tag,ExecutionType,PKey,PValue,SKey,SValue);
        log.info("PipeLines Properties is validated with details-->"+Description+"--"+Tag+"--"+ExecutionType+"--"+PKey+PValue+"--"+SKey+SValue);

    }
}
