@CreatePipeLine
Feature:Creation and Field level validation of pipelines
  As a user I want to Create a Pipeline,Validate the PipelineListing Page
  and is able to validate individual pipelines for field level validation

  @Smoke @Reg @Positive @CP-Test1
  Scenario Outline: user is able to validate pipeline listing page when there is no pipeline created
    Given user is on DIL login page
    When  enter username and password
    And  clicks on createProject tab
    When creates project with "<ProjectName>","<Description>","<Tag>" and engine
    And  switches to "<Tab>"
    Then PipeLine listing page is validated for ProjectName,PipelineTag and "<Message>"
    Examples:
      | ProjectName | Description          | Tag           | Tab      | Message                                |
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | Overview | There is no pipelines in this proje |

  @Smoke @Reg @Positive @CP-Test2
  Scenario Outline: user is able to create pipeline and validate the same in Pipeline Listing page
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When creates project with "<ProjectName>","<Description>","<Tag>" and engine
    And  creates a "<Pipeline>" with "<Description>" and "<Tag>"
    Then PipeLine listing page is validated for created Pipeline

    Examples:
      | ProjectName | Description          | Tag           | Pipeline |
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | PipeLIne |