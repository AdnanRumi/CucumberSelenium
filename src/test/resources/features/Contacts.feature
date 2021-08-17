@contacts
Feature: Contacts page

  Scenario: Default page number
    Given the user is on the login page
    When the user enters valid credentials for drivers
    Then the user navigates to "Customers" tab and "Contacts" module
    And the default page number should be 1


  Scenario: login as a given user
    Given the user is on the login page
    When the user logs in using the following credentials
      | username  | user11      |
      | password  | UserUser123 |
      | firstname | Jace     |
      | lastname  | Kassulke   |
    Then the user should be able to login
