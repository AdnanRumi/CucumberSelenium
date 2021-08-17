@login
Feature: Users should be able to login

  Background:
    Given the user is on the login page

   @driver
  Scenario: Login as a driver

    When the user enters valid credentials for drivers
    Then the user should be able to login

  Scenario: Login as a salesmanager

    When the user enters valid credentials for salesmanagers
    Then the user should be able to login

  Scenario: Login as a storemanager

    When the user enters valid credentials for storemanagers
    Then the user should be able to login


