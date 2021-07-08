$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/projects/CreateProject.feature");
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
  "name": "user is able to get Project Setting pop up while selects Create Project Tab",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateProject"
    },
    {
      "name": "@Reg"
    },
    {
      "name": "@Positive"
    },
    {
      "name": "@CRP-Test2"
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
  "name": "user is able to get Project Setting PopUp",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createProjectSteps.userIsAbleToGetProjectSettingPopUp()"
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
formatter.scenario({
  "name": "user is able to delete all Projects from Project listing page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateProject"
    },
    {
      "name": "@SmokeInNotScope"
    },
    {
      "name": "@Test11"
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
  "name": "he should be able to delete all the Projects from Project Listing Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.createProjectSteps.heShouldBeAbleToDeleteAllTheProjectsFromProjectListingPage()"
});
