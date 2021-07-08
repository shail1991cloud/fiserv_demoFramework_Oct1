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
  "name": "user is able to validate pipeline listing page when there is no pipeline created",
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
      "name": "@CP-Test1"
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
  "name": "switches to \"\u003cTab\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "PipeLine listing page is validated for ProjectName,PipelineTag and \"\u003cMessage\u003e\"",
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
        "Tab",
        "Message"
      ]
    },
    {
      "cells": [
        "AutoDIL",
        "ProjectForAutomation",
        "Test_Pipeline",
        "Overview",
        "There is no pipelines in this proje"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user is able to validate pipeline listing page when there is no pipeline created",
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
      "name": "@CP-Test1"
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
  "name": "switches to \"Overview\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.steps.createPipeLineSteps.switchesTo(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "PipeLine listing page is validated for ProjectName,PipelineTag and \"There is no pipelines in this proje\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createPipeLineSteps.pipelineListingPageIsValidatedForAnd(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[text()\u003d\" There is no pipelines in this proje \"]\"}\n  (Session info: chrome\u003d90.0.4430.212)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027pihu-Latitude-5400\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.8.0-55-generic\u0027, java.version: \u002711.0.11\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.212, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: /tmp/.com.google.Chrome.xhrdsn}, goog:chromeOptions: {debuggerAddress: localhost:43943}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 94daf8dfac643fd2541c22f6a86d265d\n*** Element info: {Using\u003dxpath, value\u003d//*[text()\u003d\" There is no pipelines in this proje \"]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat com.managersUtilities.CommonFunction.getCustomisedWebElement(CommonFunction.java:173)\n\tat com.pagesPF.PipeLIne_ListingPage.validateDetailsOnProjectListingPageWithNORecords(PipeLIne_ListingPage.java:59)\n\tat com.steps.createPipeLineSteps.pipelineListingPageIsValidatedForAnd(createPipeLineSteps.java:41)\n\tat ✽.PipeLine listing page is validated for ProjectName,PipelineTag and \"There is no pipelines in this proje\"(file:///home/pihu/dil_automation/src/test/resources/features/projects/CreatePipeLine.feature:13)\n",
  "status": "failed"
});
formatter.write("this is my failure message");
formatter.embedding("image/png", "embedded0.png", "user_is_able_to_validate_pipeline_listing_page_when_there_is_no_pipeline_created");
formatter.after({
  "status": "passed"
});
formatter.write("---Closing the Browser---");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "user is able to create pipeline and validate the same in Pipeline Listing page",
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
      "name": "@CP-Test2"
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
  "name": "PipeLine listing page is validated for created Pipeline",
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
  "name": "user is able to create pipeline and validate the same in Pipeline Listing page",
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
      "name": "@CP-Test2"
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
  "name": "PipeLine listing page is validated for created Pipeline",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createPipeLineSteps.pipelineListingPageIsValidatedForCreatedPipeline()"
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
formatter.uri("file:src/test/resources/features/projects/CreateProject.feature");
formatter.feature({
  "name": "Creation of Projects and validation of Project Setting Pop Up",
  "description": "  As a user I want to Create a Project,Validate the Project Setting Pop Up\n  and validate the Project Listing Page with different fields",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CreateProject"
    }
  ]
});
formatter.scenarioOutline({
  "name": "user is able to get Create Project Tab on Project Listing page",
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
      "name": "@CRP-Test1"
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
  "name": "user is able to verify \"\u003cCreate Project Tab\u003e\" on Project Listing page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Create Project Tab"
      ]
    },
    {
      "cells": [
        "Create Project"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user is able to get Create Project Tab on Project Listing page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreateProject"
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
      "name": "@CRP-Test1"
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
  "name": "user is able to verify \"Create Project\" on Project Listing page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createProjectSteps.userIsAbleToVerifyOnProjectListingPage(java.lang.String)"
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
formatter.scenario({
  "name": "user is able to validate Project Setting PopUp",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateProject"
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
      "name": "@CRP-Test3"
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
  "name": "all the fields on Project Setting up page are validated",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createProjectSteps.allTheFieldsOnProjectSettingUpPageAreValidated()"
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
formatter.scenarioOutline({
  "name": "user is able to create a Project and is able to validate it in ProjectListing Page",
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
      "name": "@CRP-Test4"
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
  "name": "created \"\u003cProjectName\u003e\" with \"\u003cTag\u003e\"is validated in project listing page",
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
        "Tag"
      ]
    },
    {
      "cells": [
        "Auto_Pro",
        "CreatingPipeLine",
        "Test"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user is able to create a Project and is able to validate it in ProjectListing Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreateProject"
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
      "name": "@CRP-Test4"
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
  "name": "created \"Auto_Pro\" with \"Test\"is validated in project listing page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createProjectSteps.createdWithIsValidatedInProjectListingPage(java.lang.String,java.lang.String)"
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
formatter.scenarioOutline({
  "name": "user is able to validate details for project on project listing page",
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
      "name": "@CRP-Test5"
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
  "name": "searches the \"\u003cProjectName\u003e\" with \"\u003cDescription\u003e\",\"\u003cTag\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "created \"\u003cProjectName\u003e\"is validated for details like status,tag,projectName,run button,run button,delete button etc.",
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
        "Tag"
      ]
    },
    {
      "cells": [
        "Auto-Test",
        "CreatingPipeLine",
        "Test"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user is able to validate details for project on project listing page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreateProject"
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
      "name": "@CRP-Test5"
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
  "name": "searches the \"Auto-Test\" with \"CreatingPipeLine\",\"Test\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.steps.createProjectSteps.searchesTheWith(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "created \"Auto-Test\"is validated for details like status,tag,projectName,run button,run button,delete button etc.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createProjectSteps.createdIsValidatedForDetailsLikeStatusTagProjectNameRunButtonRunButtonDeleteButton(java.lang.String)"
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
formatter.scenarioOutline({
  "name": "user is able to Search Project on Project Listing by the use of Search Functionality",
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
      "name": "@CRP-Test6"
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
  "name": "searches the \"\u003cProjectName\u003e\" with \"\u003cDescription\u003e\",\"\u003cTag\u003e\"",
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
        "Tag"
      ]
    },
    {
      "cells": [
        "Auto-Pro",
        "CreatingPipeLine",
        "Test"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user is able to Search Project on Project Listing by the use of Search Functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreateProject"
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
      "name": "@CRP-Test6"
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
  "name": "searches the \"Auto-Pro\" with \"CreatingPipeLine\",\"Test\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createProjectSteps.searchesTheWith(java.lang.String,java.lang.String,java.lang.String)"
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
formatter.scenarioOutline({
  "name": "user is able to validate updated project on Project Listing page",
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
      "name": "@CRP-Test7"
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
  "name": "created \"\u003cProjectName\u003e\" with \"\u003cTag\u003e\"is validated in project listing page",
  "keyword": "And "
});
formatter.step({
  "name": "\"\u003cNewTag\u003e\" and \"\u003cDescription\u003e\" is updated and validated",
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
        "NewTag",
        "Description"
      ]
    },
    {
      "cells": [
        "Auto-Pro_Test",
        "CreatingPipeLine",
        "Test",
        "TestTag",
        "Updated Project"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user is able to validate updated project on Project Listing page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreateProject"
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
      "name": "@CRP-Test7"
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
  "name": "creates project with \"Auto-Pro_Test\",\"CreatingPipeLine\",\"Test\" and engine",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.createProjectSteps.entersAndSelectEngine(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "created \"Auto-Pro_Test\" with \"Test\"is validated in project listing page",
  "keyword": "And "
});
formatter.match({
  "location": "com.steps.createProjectSteps.createdWithIsValidatedInProjectListingPage(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"TestTag\" and \"CreatingPipeLine\" is updated and validated",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createProjectSteps.andIsUpdatedAndValidated(java.lang.String,java.lang.String)"
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
formatter.scenarioOutline({
  "name": "user is not able to create Project when left mandatory field blank",
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
      "name": "@Negative"
    },
    {
      "name": "@CRP-Test8"
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
  "name": "submit button is displaying disable",
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
        "Tag"
      ]
    },
    {
      "cells": [
        "Auto-DemoProject",
        "",
        "Test"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user is not able to create Project when left mandatory field blank",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreateProject"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Reg"
    },
    {
      "name": "@Negative"
    },
    {
      "name": "@CRP-Test8"
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
  "name": "creates project with \"Auto-DemoProject\",\"\",\"Test\" and engine",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.createProjectSteps.entersAndSelectEngine(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submit button is displaying disable",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createProjectSteps.submitButtonIsDisplayDisable()"
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
formatter.scenarioOutline({
  "name": "user should not be able to validate cancelled project in ProjectListing Page",
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
      "name": "@Negative"
    },
    {
      "name": "@CRP-Test9"
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
  "name": "enters \"\u003cProjectName\u003e\",\"\u003cDescription\u003e\",\"\u003cTag\u003e\" and select engine and Cancel",
  "keyword": "When "
});
formatter.step({
  "name": "cancelled \"\u003cProjectName\u003e\"is not validated in project listing page",
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
        "Tag"
      ]
    },
    {
      "cells": [
        "Auto-DemoProject",
        "CreatingPipeLine",
        "Test"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user should not be able to validate cancelled project in ProjectListing Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreateProject"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Reg"
    },
    {
      "name": "@Negative"
    },
    {
      "name": "@CRP-Test9"
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
  "name": "enters \"Auto-DemoProject\",\"CreatingPipeLine\",\"Test\" and select engine and Cancel",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.createProjectSteps.entersAndSelectEngineAndCancel(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cancelled \"Auto-DemoProject\"is not validated in project listing page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createProjectSteps.cancelledIsNotValidatedInProjectListingPage(java.lang.String)"
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
formatter.scenarioOutline({
  "name": "user is not able to find deleted project on ProjectListing Page",
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
      "name": "@Negative"
    },
    {
      "name": "@CRP-Test10"
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
  "name": "created \"\u003cProjectName\u003e\" with \"\u003cTag\u003e\"is validated in project listing page",
  "keyword": "Then "
});
formatter.step({
  "name": "deletes the project",
  "keyword": "When "
});
formatter.step({
  "name": "deleted \"\u003cProjectName\u003e\" disappear from Project Listing Page",
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
        "Tag"
      ]
    },
    {
      "cells": [
        "Auto-DemoTestProject",
        "CreatingPipeLine",
        "Test"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user is not able to find deleted project on ProjectListing Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreateProject"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Reg"
    },
    {
      "name": "@Negative"
    },
    {
      "name": "@CRP-Test10"
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
  "name": "creates project with \"Auto-DemoTestProject\",\"CreatingPipeLine\",\"Test\" and engine",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.createProjectSteps.entersAndSelectEngine(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "created \"Auto-DemoTestProject\" with \"Test\"is validated in project listing page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createProjectSteps.createdWithIsValidatedInProjectListingPage(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "deletes the project",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.createProjectSteps.deletesTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "deleted \"Auto-DemoTestProject\" disappear from Project Listing Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createProjectSteps.deletedDisappearFromProjectListingPage(java.lang.String)"
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
formatter.uri("file:src/test/resources/features/projects/ProjectsApiCalls.feature");
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