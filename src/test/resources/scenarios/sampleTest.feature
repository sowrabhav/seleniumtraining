# Created by baba at 17/04/25
Feature: Saucelabs application login functionality
  # Sauce labs application login functionality testing with multiple user and usertypes

#  @manual
#  Scenario: Validate login functionality with valid credentials
#    And I am on the login page
#    Given I enter valid username and password
#    Then I click on login button
#    When I should be redirected to the home page

  Background: Initialize the webdriver
    Given Initialize the webdriver
    Then I Navigate to Sauce Labs application "https://www.saucedemo.com/"

  @smoke
  Scenario: Validate login functionality with valid credentials
    Then I enter username ${username}
    |standard_user|
    |locked_out_user|
    |problem_user|
    |performance_glitch_user|
    Then I enter password "c2VjcmV0X3NhdWNl"
    When I click on the login button
    And I Quit the webdriver

#  @smoke
#  Scenario Outline: Validate login functionality with all valid users credentials
#    Given Initialize the webdriver
#    Then I Navigate to Sauce Labs application "https://www.saucedemo.com/"
#    Then I enter username ${username}
#    And I enter password ${password}
#    Then I click on the login button
#    And I Quit the webdriver
#    Examples:
#      | username         | password          |
#      | standard_user    | c2VjcmV0X3NhdWNl  |
#      | locked_out_user  | c2VjcmV0X3NhdWNl  |
#      | problem_user     | c2VjcmV0X3NhdWNl  |
#      | performance_glitch_user | c2VjcmV0X3NhdWNl  |
