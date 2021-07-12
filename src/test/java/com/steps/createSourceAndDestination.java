package com.steps;

import com.baselibrary.Baseclass;
import com.dataproviderUtilities.ConfigFileReader;
import com.helperUtilities.LoggerHelper;
import com.managersUtilities.CommonFunction;
import com.pagesPF.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class createSourceAndDestination extends Baseclass {
    ProjectsPage projectspage;
    Project_BuilderPage projectBuilderpage;
    public ConfigFileReader configFileReader;
    Functions_LeanPageObject functions_leanPageObject;
    PipeLIne_ListingPage pipeLIne_listingPage;
    PipeLIne_BuilderPage pipeLIne_builderPage;
    Logger log = LoggerHelper.getLogger(createSourceAndDestination.class);

    public createSourceAndDestination() {
        projectspage = PageFactory.initElements(driver, ProjectsPage.class);
        projectBuilderpage = PageFactory.initElements(driver, Project_BuilderPage.class);
        functions_leanPageObject = PageFactory.initElements(driver, Functions_LeanPageObject.class);
        pipeLIne_listingPage = PageFactory.initElements(driver, PipeLIne_ListingPage.class);
        pipeLIne_builderPage=PageFactory.initElements(driver, PipeLIne_BuilderPage.class);
        configFileReader = new ConfigFileReader();

    }
    @And("creates a {string} having {string} and {string}")
    public void createsAHavingAnd(String pipelineName, String description, String tag) throws InterruptedException, IOException {
        pipeLIne_listingPage.createPipeLine(pipelineName, description, tag);
        log.info("Pipe line is created with name-->" + pipelineName);

    }


    @And("clicks on {string}")
    public void clicksOn(String Icon) throws InterruptedException {
        pipeLIne_builderPage.clickOnAddSourceORDestinationIcon(Icon);
        log.info("Icon is clicked-->" + Icon);

    }



    @When("Enters {string},{string},{string},{string},{string},{string},{string}")
    public void enters(String Name, String type, String connection, String fileType, String filePath, String separator, String schemaSource) throws IOException, InterruptedException {
        pipeLIne_builderPage.createSourceWithNoSchema(Name,type,connection,fileType,filePath,separator,schemaSource);
        log.info("Details entered-->" + filePath+"--"+connection);

    }

    @Then("Source should get created with {string}")
    public void sourceShouldGetCreatedWith(String sourceName) throws InterruptedException {
        Assert.assertTrue(CommonFunction.getCustomisedWebElement(driver,pipeLIne_builderPage.sourceName,sourceName).isDisplayed());
        log.info("DRecord validated-->" + sourceName);

    }
}