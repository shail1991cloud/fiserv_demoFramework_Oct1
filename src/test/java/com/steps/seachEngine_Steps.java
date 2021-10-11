package com.steps;

import com.baselibrary.Baseclass;
import com.helperUtilities.LoggerHelper;
import com.pagesPF.CommonPageFunctions;
import com.pagesPF.SearchEngine_Google;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class seachEngine_Steps extends Baseclass {
    public SearchEngine_Google searchResultsOnGoogle;
    public CommonPageFunctions commonPageFunctions;

    Logger log = LoggerHelper.getLogger(seachEngine_Steps.class);


    public seachEngine_Steps() {
        searchResultsOnGoogle = PageFactory.initElements(driver, SearchEngine_Google.class);
        commonPageFunctions = PageFactory.initElements(driver, CommonPageFunctions.class);

    }

    @Given("user launches {string} for SearchEngine")
    public void userLaunchesFor(String url) throws InterruptedException {
        commonPageFunctions.enterUrl(url);
        log.info("url is launched--->" + url);
    }

    @When("enters {string} to {string} search  box")
    public void entersToSearchBox(String term, String searchEngine) throws InterruptedException {
                searchResultsOnGoogle.searchItemOnGoogle(term);
                log.info("Term is entered to get first Item-->" + term + " " + "on-" + searchEngine);

        }


    @Then("{string} should be validated in Search result for {string}")
    public void shouldBeValidatedInSearchResultFor(String firstItemInSearchResult, String searchEngine) throws InterruptedException {
        {
            searchResultsOnGoogle.validateFirstItemOnGoogle(firstItemInSearchResult);
                log.info("First Item is validated on -->" + searchEngine + " " + "having value-->" + firstItemInSearchResult);

        }

    }
}


