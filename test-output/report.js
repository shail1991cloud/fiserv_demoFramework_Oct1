$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/projects/CreateSourceAndDestination.feature");
formatter.feature({
  "name": "Creation of Sources and Destination",
  "description": "  As a user I want to Create a Source and Destination,Validate Source and Destination attributes",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CreateSourceAndDestination"
    }
  ]
});
formatter.scenarioOutline({
  "name": "user is able to create source for ManualSchema",
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
      "name": "@CSource-Test2"
    },
    {
      "name": "@TC15"
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
  "name": "creates a \"\u003cPipeline\u003e\" having \"\u003cDescription\u003e\" and \"\u003cTag\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "clicks on \"\u003cIcon\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enters \"\u003cName\u003e\",\"\u003cType\u003e\",\"\u003cconnection\u003e\",\"\u003cfileType\u003e\",\"\u003cFilePath\u003e\",\"\u003cSeparator\u003e\",\"\u003csourceSchema\u003e\",\"\u003cSchemaValue\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Source should get created with \"\u003cName\u003e\"",
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
        "Pipeline",
        "Icon",
        "Name",
        "Type",
        "connection",
        "fileType",
        "FilePath",
        "Separator",
        "sourceSchema",
        "SchemaValue"
      ]
    },
    {
      "cells": [
        "AutoDIL",
        "ProjectForAutomation",
        "Test_Pipeline",
        "PipeLIne",
        "Add a Source",
        "DemoSource",
        "File System",
        "AUTOMATION_DONOTDELETE",
        "CSV",
        ".csv",
        ",",
        "Manual Schema",
        "H_JSON"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user is able to create source for ManualSchema",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreateSourceAndDestination"
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
      "name": "@CSource-Test2"
    },
    {
      "name": "@TC15"
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
  "name": "creates a \"PipeLIne\" having \"ProjectForAutomation\" and \"Test_Pipeline\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.steps.createSourceAndDestination.createsAHavingAnd(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on \"Add a Source\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.steps.createSourceAndDestination.clicksOn(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enters \"DemoSource\",\"File System\",\"AUTOMATION_DONOTDELETE\",\"CSV\",\".csv\",\",\",\"Manual Schema\",\"H_JSON\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.createSourceAndDestination.enters(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Source should get created with \"DemoSource\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createSourceAndDestination.sourceShouldGetCreatedWith(java.lang.String)"
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