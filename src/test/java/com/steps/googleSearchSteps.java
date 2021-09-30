package com.steps;

import com.baselibrary.Baseclass;
import com.helperUtilities.LoggerHelper;
import com.pagesPF.SearchResultsOnGoogle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class googleSearchSteps extends Baseclass {
    public SearchResultsOnGoogle searchResultsOnGoogle;

    Logger log = LoggerHelper.getLogger(googleSearchSteps.class);


    public googleSearchSteps() {
        searchResultsOnGoogle = PageFactory.initElements(driver, SearchResultsOnGoogle.class);


    }

    @When("enters {string} to Google Search box")
    public void entersToGoogleSearchBox(String item) throws InterruptedException {

        searchResultsOnGoogle.searchItem(item);
    }

    @Then("{string} should be validated in Search result")
    public void shouldBeValidatedInSearchResult(String description) throws InterruptedException {
        searchResultsOnGoogle.validateResult(description);
    }


    @Given("user passes {string} and {string} navigates to Google page")
    public void userPassesAndNavigatesToGooglePage(String url, String Item) throws InterruptedException {
        String Value = Item;
        switch (Value) {
            case "Fiserv":
                searchResultsOnGoogle.enterUrl(url);
            case "Shailendra":
                searchResultsOnGoogle.enterUrl(url);
        }
    }
}
