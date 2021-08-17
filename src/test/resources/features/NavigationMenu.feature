@navigation
Feature: Sales managers should be able to navigate to pages using the top menu

  @salesmanager
  Scenario: Navigating to Vehicles
    Given the user logs in as salesmanager
    When the user navigates to Fleet tab and Vehicles menu
    Then the user should be able to see Vehicles as the page title

  @salesmanager
  Scenario: Navigating to Campaigns
    Given the user logs in as salesmanager
    When the user navigates to Marketing tab and Campaigns menu
    Then the user should be able to see Campaigns as the page title

  @salesmanager
  Scenario: Navigating to Calendar Events
    Given the user logs in as salesmanager
    When the user navigates to Activities tab and Calendar Events menu
    Then the user should be able to see Calendar Events as the page title

  @tabOptions
  Scenario: Navigating to different pages
    Given the user is on the login page
    When the user enters valid credentials as a "driver"
    Then the user should be able to login
    And the user should see the following options
      | Fleet      |
      | Customers   |
      | Activities |
      | System     |



