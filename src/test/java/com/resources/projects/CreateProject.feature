@CreateProject
Feature:Creation of Projects and validation of Project Setting Pop Up
  As a user I want to Create a Project,Validate the Project Setting Pop Up
  and validate the Project Listing Page with different fields

  #------Positive Scenarios------#

  @Smoke @Positive @Test1
  Scenario: user is able to get Project Setting pop up while selects Create Project Tab
    Given user is on DIL login page
    When  enter username and password
    And   clicks on createProject tab
    Then  user is able to get Project Setting PopUp

  @Smoke @Positive @Test2
  Scenario: user is able to validate Project Setting PopUp
    Given user is on DIL login page
    When  enter username and password
    And   clicks on createProject tab
    Then  all the fields on Project Setting up page are validated

  @Smoke @Positive @Test3
  Scenario Outline: user is able to create a Project and should be able to validate same in ProjectListing Page
    Given user is on DIL login page
    When  enter username and password
    And   clicks on createProject tab
    When enters "<ProjectName>","<Description>","<Tag>" and select engine
    Then created "<ProjectName>" with "<Tag>"is validated in project listing page
    Examples:
      | ProjectName | Description      | Tag  |
      | Auto_Pro | CreatingPipeLine | Test |

  @Smoke @Positive @Test4
  Scenario Outline: user is able to validate details for project on project listing page
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When enters "<ProjectName>","<Description>","<Tag>" and select engine
    Then created "<ProjectName>"is validated for details like status,tag,projectName,run button,run button,delete button etc.
    Examples:
      | ProjectName | Description      | Tag  |
      | Auto-Test | CreatingPipeLine | Test |

  @Smoke @Positive @Test5
  Scenario Outline: user is able to Search Project on Project Listing by the use of Search Functionality
    Given user is on DIL login page
    When  enter username and password
    Then searches the "<ProjectName>" with "<Description>","<Tag>"
    Examples:
      | ProjectName | Description      | Tag  |
      | Auto-Pro | CreatingPipeLine | Test |

 @Smoke @Positive @Test6
  Scenario Outline: user is able to validate updated project on Project Listing page
   Given user is on DIL login page
   When enter username and password
   And  clicks on createProject tab
   When enters "<ProjectName>","<Description>","<Tag>" and select engine
   And  created "<ProjectName>" with "<Tag>"is validated in project listing page
   Then "<NewTag>" and "<Description>" is updated and validated
   Examples:
     | ProjectName | Description      | Tag  | NewTag  | Description     |
     | Auto-Pro_Test| CreatingPipeLine | Test | TestTag | Updated Project |


    #-------Negative Scenarios-------#

  @Smoke @Negative @Test7
  Scenario Outline: user is not able to create Project when left mandatory field blank
    Given user is on DIL login page
    When  enter username and password
    And   clicks on createProject tab
    When enters "<ProjectName>","<Description>","<Tag>" with empty description and select engine
    Then submit button is displaying disable
    Examples:
      | ProjectName | Description | Tag  |
      | Auto-DemoProject  |             | Test |

  @Smoke @Positive @Test8
  Scenario Outline: user should not be able to validate cancelled project in ProjectListing Page
    Given user is on DIL login page
    When  enter username and password
    And clicks on createProject tab
    When enters "<ProjectName>","<Description>","<Tag>" and select engine and Cancel
    Then cancelled "<ProjectName>"is not validated in project listing page
    Examples:
      | ProjectName | Description      | Tag  |
      | Auto-DemoProject | CreatingPipeLine | Test |

  @Smoke @Negative @Test9
  Scenario Outline: user is not able to find deleted project on ProjectListing Page
    Given user is on DIL login page
    When  enter username and password
    And clicks on createProject tab
    When enters "<ProjectName>","<Description>","<Tag>" and select engine
    Then created "<ProjectName>" with "<Tag>"is validated in project listing page
    When deletes the project
    Then deleted "<ProjectName>" disappear from Project Listing Page
    Examples:
      | ProjectName | Description      | Tag  |
      | Auto-DemoTestProject  | CreatingPipeLine | Test |


    # Do not run it *****
  @SmokeInNotScope @Test12
  Scenario: user is able to delete all Projects from Project listing page
    Given user is on DIL login page
    When  enter username and password
    Then  he should be able to delete all the Projects from Project Listing Page


