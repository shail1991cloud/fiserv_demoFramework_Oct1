package com.steps;

import com.baselibrary.Baseclass;
import com.callsapi.RestFunctions;
import com.dataproviderUtilities.ConfigFileReader;
import com.helperUtilities.LoggerHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import org.apache.log4j.Logger;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class apiSteps extends Baseclass {

    public ConfigFileReader configFileReader;
    public RestFunctions restFunctions;
    private static String jsonString;
    private static String bookId;
    Logger log = LoggerHelper.getLogger(apiSteps.class);

    public apiSteps() {
        configFileReader = new ConfigFileReader();
        restFunctions =new RestFunctions();

    }

    @Given("user is access api with {string} and {string} with {string}")
    public void userIsAccessApiWithAndWith(String username, String password, String path) {
        restFunctions.authenticateUser(username,password,path);
        log.info("User Enters -->"+username +"and"+ password);
    }

    @Then("user should get validated with {string}")
    public void userShouldGetValidatedWith(String code) {
        Assert.assertEquals(restFunctions.response.getStatusCode(),Integer.parseInt(code));
        log.info("User is authenticated with Code-->"+code);
    }

    @And("searches for records with {string}")
    public void searchesForRecordsWith(String parameter) {
        restFunctions.getMethodRESTAPIWithPath(parameter);
        log.info("User searches record");
    }

    @Then("records size with {string} validated")
    public void recordsSizeWithValidated(String code) {
        log.info("User is authenticated with Code-->"+code);
    }

    @Then("records size with {string} validated with {string}")
    public void recordsSizeWithValidatedWith(String code, String parameter) {
        Assert.assertEquals(restFunctions.getMethodRESTAPIWithPath(parameter).getStatusCode(),Integer.parseInt(code));
        jsonString = restFunctions.getMethodRESTAPIWithPath(parameter).asString();
        List<Map<String, String>> books = JsonPath.from(jsonString).get("books");
        Assert.assertTrue(books.size() > 0);
        bookId = books.get(0).get("isbn");
        log.info("record is validate with status-->"+code+"and-->"+books.size());

    }
}
