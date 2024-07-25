#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Add Employee

  @tag1
  Scenario: Add a new employee to OrangeHRM
    Given Browser to be open
    Then Enter appication URL
    When Home page opened validate home page title
    Then Enter user name
    And Enter password
    Then Hit on login button
    When After login click on add button
    Then Clear the code and enter new code
    And Enter last name
    Then Enter first name
    And Enter middle name
    Then Enter nick name
    And Click on photo choose file
    When After navigated to files select employee photo
    Then Click on enter
    And Click on save button
