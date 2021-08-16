$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/projects/ProjectsApiCalls.feature");
formatter.feature({
  "name": "To validate created Project with backend API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "user is able to create a Project and is able to validate it in backend Api",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Reg"
    },
    {
      "name": "@Positive"
    },
    {
      "name": "@PBE-API-Test1"
    },
    {
      "name": "@TC23"
    }
  ]
});
formatter.step({
  "name": "user is on DIL login page",
  "keyword": "Given "
});
formatter.step({
  "name": "enter username and password",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on createProject tab",
  "keyword": "And "
});
formatter.step({
  "name": "creates project with \"\u003cProjectName\u003e\",\"\u003cDescription\u003e\",\"\u003cTag\u003e\" and engine",
  "keyword": "When "
});
formatter.step({
  "name": "authenticated for backend api with \"\u003cclientId\u003e\",\"\u003cclientSecret\u003e\",\"\u003cpassWord\u003e\",\"\u003cuserName\u003e\" and \"\u003cpathParam\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "fetches the response with \"\u003cjsonPath\u003e\" to get \"\u003cbearerToken\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should be able to use \"\u003cQueryParam\u003e\" to validate project on \"\u003cBackendApiPath\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ProjectName",
        "Description",
        "Tag",
        "QueryParam",
        "BackendApiPath",
        "clientId",
        "clientSecret",
        "passWord",
        "userName",
        "pathParam",
        "jsonPath",
        "bearerToken"
      ]
    },
    {
      "cells": [
        "Auto_Pro",
        "CreatingPipeLine",
        "Test",
        "projectName",
        "/projects",
        "dil-ui",
        "ovrzCm54Zu+q2SuJIhaOnA\u003d\u003d",
        "Lp4,mLd:",
        "parihars",
        "/authservice/login",
        "tokenDetails",
        "access_token"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user is able to create a Project and is able to validate it in backend Api",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Reg"
    },
    {
      "name": "@Positive"
    },
    {
      "name": "@PBE-API-Test1"
    },
    {
      "name": "@TC23"
    }
  ]
});
formatter.write("--Starting the Execution--");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on DIL login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.steps.commonSteps.userIsOnDILLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.commonSteps.enterUsernameAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on createProject tab",
  "keyword": "And "
});
formatter.match({
  "location": "com.steps.createProjectSteps.clicksOnCreateProjectTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "creates project with \"Auto_Pro\",\"CreatingPipeLine\",\"Test\" and engine",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.createProjectSteps.entersAndSelectEngine(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "authenticated for backend api with \"dil-ui\",\"ovrzCm54Zu+q2SuJIhaOnA\u003d\u003d\",\"Lp4,mLd:\",\"parihars\" and \"/authservice/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.apiSteps.authenticatedForBackendApiWithAnd(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fetches the response with \"tokenDetails\" to get \"access_token\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.steps.apiSteps.fetchesTheResponseWithToGet(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to use \"projectName\" to validate project on \"/projects\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.apiSteps.userShouldBeAbleToUseToValidateProjectOn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.write("---Closing the Browser---");
formatter.after({
  "status": "passed"
});
});