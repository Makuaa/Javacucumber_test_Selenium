@ignore
Feature: Login
  Background: Common
    Given I am on the home page
    When I click the sign in link

  Scenario Outline: Validate error messages for each invalid login scenarios

    #Given I am on the landing page
    #And I click sign In
    When I enter my "<username>"
    And I click my "<password>"
    When I press the login button
    Then I should get the correct "<error Message>"

    Examples:
       |username                       |password                     |error Message                                                                                                 |
       |davidzoe@gmail.com             |Testing123                   |Incorrect CAPTCHA  |
       |david@gmail.com                |Testing123!                  |Incorrect CAPTCHA  |
       #|                               |Testing123!                  |This is a required field.                                                                                     |
       #|davidzoe@gmail.com             |                             |This is a required field.                                                                                     |