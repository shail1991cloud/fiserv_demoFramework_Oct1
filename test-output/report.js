$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/projects/SearchEngineFunctionality.feature");
formatter.feature({
  "name": "To search an item and validate first visible result on Search Engines",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User is able to search a term and verify the first result on Search engine",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "user launches \"\u003curl\u003e\" for SearchEngine",
  "keyword": "Given "
});
formatter.step({
  "name": "enters \"\u003cTerm\u003e\" to \"\u003cSearchEngine\u003e\" search  box",
  "keyword": "When "
});
formatter.step({
  "name": "\"\u003cFirstItemInSearchResult\u003e\" should be validated in Search result for \"\u003cSearchEngine\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SearchEngine",
        "url",
        "Term",
        "FirstItemInSearchResult"
      ]
    },
    {
      "cells": [
        "Google",
        "https://www.google.com/",
        "Fiserv",
        "Fiserv: Financial Services Technology, Mobile Banking ..."
      ]
    },
    {
      "cells": [
        "Bing",
        "https://www.bing.com/",
        "Clover Network Wiki",
        "Clover Network - Wikipedia"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User is able to search a term and verify the first result on Search engine",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Reg"
    }
  ]
});
formatter.write("--Starting the Execution--");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches \"https://www.google.com/\" for SearchEngine",
  "keyword": "Given "
});
formatter.match({
  "location": "com.steps.seachEngine_Steps.userLaunchesFor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters \"Fiserv\" to \"Google\" search  box",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.seachEngine_Steps.entersToSearchBox(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Fiserv: Financial Services Technology, Mobile Banking ...\" should be validated in Search result for \"Google\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.seachEngine_Steps.shouldBeValidatedInSearchResultFor(java.lang.String,java.lang.String)"
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
  "name": "User is able to search a term and verify the first result on Search engine",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Reg"
    }
  ]
});
formatter.write("--Starting the Execution--");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches \"https://www.bing.com/\" for SearchEngine",
  "keyword": "Given "
});
formatter.match({
  "location": "com.steps.seachEngine_Steps.userLaunchesFor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters \"Clover Network Wiki\" to \"Bing\" search  box",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.seachEngine_Steps.entersToSearchBox(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Clover Network - Wikipedia\" should be validated in Search result for \"Bing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.seachEngine_Steps.shouldBeValidatedInSearchResultFor(java.lang.String,java.lang.String)"
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