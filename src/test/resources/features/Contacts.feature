
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
@wip @db
  Scenario: Contacts test with email
    Given the user logged in as "sales manager"
#    And the user enters valid credentials for salesmanagers
    And the user navigates to "Customers" tab and "Contacts" module
    When the user clicks "mbrackstone9@example.com" from contacts
    Then the information for "mbrackstone9@example.com" should be matching one in the DB

#  Scenario: Contacts with db2

#    Given the user logged in as "sales manager"
#    And the user navigates to "Customers" "Contacts"
#    When the user clicks the "mbrackstone9@example.com" from contacts
#    Then the information should be same with database

