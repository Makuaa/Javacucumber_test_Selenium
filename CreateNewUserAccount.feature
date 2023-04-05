Feature: New user

  Background: Common steps
    Given I am on the landing screen
    When I click the create account link

  Scenario: Verify that new user can create account

    #Given I am on the home screen
    #And I click the link to create account
    And I enter first name
    And I enter last name
    And I sign up for news letter
    And I enter email
    And I enter new user password
    And I confirm password
    When I click the create account button
    Then my account should be created succesfully