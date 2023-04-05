@ignore
Feature: Homepage

Scenario: User should be able to login

  Given I am on the homepage
  When I click sign in
  And I enter username
  And I enter password
  When I click the login button
  Then I should be logged in successfully