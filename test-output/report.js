$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/projects/CreatePipeLine.feature");
formatter.feature({
  "name": "Creation and Field level validation of pipelines",
  "description": "  As a user I want to Create a Pipeline,Validate the PipelineListing Page\n  and is able to validate individual pipelines for field level validation",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CreatePipeLine"
    }
  ]
});
formatter.scenarioOutline({
  "name": "user is able to delete pipeline and validate the same in Pipeline Listing page",
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
      "name": "@CP-Test3"
    },
    {
      "name": "@TC4"
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
  "name": "creates a \"\u003cPipeline\u003e\" with \"\u003cDescription\u003e\" and \"\u003cTag\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "deletes pipeline",
  "keyword": "When "
});
formatter.step({
  "name": "\"\u003cPipeline\u003e\" should get disappeared",
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
        "Pipeline"
      ]
    },
    {
      "cells": [
        "AutoDIL",
        "ProjectForAutomation",
        "Test_Pipeline",
        "PipeLIne"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user is able to delete pipeline and validate the same in Pipeline Listing page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreatePipeLine"
    },
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
      "name": "@CP-Test3"
    },
    {
      "name": "@TC4"
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
  "name": "creates project with \"AutoDIL\",\"ProjectForAutomation\",\"Test_Pipeline\" and engine",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.createProjectSteps.entersAndSelectEngine(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "creates a \"PipeLIne\" with \"ProjectForAutomation\" and \"Test_Pipeline\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.steps.createPipeLineSteps.createsAWithAnd(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "deletes pipeline",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.createPipeLineSteps.deletesPipeline()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"PipeLIne\" should get disappeared",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createPipeLineSteps.shouldGetDisappeared(java.lang.String)"
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