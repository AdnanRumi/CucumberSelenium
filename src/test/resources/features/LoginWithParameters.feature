Feature: Login as different users

  Scenario: Login with different credentials
    Given the user is on the login page
    When the user enters "User11" and "UserUser123"
    Then the user should be able to login
    And the title should contain "Dashboard"

  Scenario: Login with different usertypes
    Given the user is on the login page
    When the user enters valid credentials as a "driver"
    Then the user should be able to login


  Scenario: Login with different usertypes/salesmanager
    Given the user is on the login page
    When the user enters valid credentials as a "salesmanager"
    Then the user should be able to login


  Scenario: Login with different usertypes/storemanager
    Given the user is on the login page
    When the user enters valid credentials as a "storemanager"
    Then the user should be able to login






