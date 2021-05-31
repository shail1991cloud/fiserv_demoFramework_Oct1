@CreateProject
Feature:Creation of Projects and validation of Project Setting Pop Up
  As a user I want to Create a Project,Validate the Project Setting Pop Up
  and validate the Project Listing Page with different fields

  #------Positive Scenarios------#

  @Smoke @Positive @Test1
  Scenario: user is able to validate Project Setting PopUp
    Given user is on DIL login page
    When  enter username and password
    And   clicks on createProject tab
    Then  all the fields on Project Setting up page are validated

  @Smoke @Positive @Test2
  Scenario Outline: user is able to Cancel a Project on Project Setting Pop up and should not be able to get same project in ProjectListing Page
    Given user is on DIL login page
    When  enter username and password
    And clicks on createProject tab
    When enters "<ProjectName>","<Description>","<Tag>" and select engine and Cancel
    Then created "<ProjectName>"is not validated in project listing page
    Examples:
      | ProjectName | Description      | Tag  |
      | DemoProject | CreatingPipeLine | Test |

  @Smoke @Positive @Test3
  Scenario Outline: user is able to create a Project and should be able to validate same in ProjectListing Page by using search functionality
    Given user is on DIL login page
    When  enter username and password
    And clicks on createProject tab
    When enters "<ProjectName>","<Description>","<Tag>" and select engine
    Then created "<ProjectName>" with "<Tag>"is validated in project listing page
    Examples:
      | ProjectName | Description      | Tag  |
      | DemoProject | CreatingPipeLine | Test |

  @Smoke @Positive @Test4
  Scenario Outline: user is able to validate details for project on project listing page
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When enters "<ProjectName>","<Description>","<Tag>" and select engine
    Then created "<ProjectName>"is validated for details like status,tag,projectName,run button,run button,delete button etc.
    Examples:
      | ProjectName | Description      | Tag  |
      | DemoProject | CreatingPipeLine | Test |

  @Smoke @Positive @Test5
  Scenario Outline: user is able to validate updated project on Project Listing page
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When enters "<ProjectName>","<Description>","<Tag>" and select engine
    And created "<ProjectName>" with "<Tag>"is validated in project listing page
    Then "<NewTag>" and "<Description>" is updated and validated
    Examples:
      | ProjectName | Description      | Tag  | NewTag  | Description     |
      | DemoProject | CreatingPipeLine | Test | TestTag | Updated Project |


    #-------Negative Scenarios-------#

  @Smoke @Negative @Test6
  Scenario Outline: user is not able to create Project when left mandatory field blank
    Given user is on DIL login page
    When  enter username and password
    And   clicks on createProject tab
    When enters "<ProjectName>","<Description>","<Tag>" with empty description and select engine
    Then submit button is displaying disable
    Examples:
      | ProjectName | Description | Tag  |
      | DemoProject |             | Test |

  @Smoke @Negative @Test7
  Scenario Outline: user is not able to find deleted project on ProjectListing Page
    Given user is on DIL login page
    When  enter username and password
    And clicks on createProject tab
    When enters "<ProjectName>","<Description>","<Tag>" and select engine
    Then created "<ProjectName>" with "<Tag>"is validated in project listing page
    When deletes the project
    Then created "<ProjectName>" disappear from Project Listing Page
    Examples:
      | ProjectName | Description      | Tag  |
      | DemoProject | CreatingPipeLine | Test |


    # Do not run it *****
  @SmokeInNotScope @Test8
  Scenario: user is able to delete all Projects from Project listing page
    Given user is on DIL login page
    When  enter username and password
    Then  he should be able to delete all the Projects from Project Listing Page


