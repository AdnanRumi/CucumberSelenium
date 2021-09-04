
Feature: Account types
  @wip @smoke
  Scenario: Driver user
    Given the user is logged in as a "driver"
    When the user navigates to "Activities" tab and "Calendar Events" module
    Then the title should contain "Calendar Events - Activities"
  @wip @smoke
  Scenario: Sales manager user
    Given the user is logged in as a "sales manager"
    When the user navigates to "Customers" tab and "Accounts" module
    Then the title should contain "Accounts - CustomerS"
  @wip @smoke
  Scenario: Store manager
    Given the user is logged in as a "store manager"
    When the user navigates to "Customers" tab and "Contacts" module
    Then the title should contain "Contacts - Customers"

@wip2
  Scenario Outline: Different user types: <usertype>
    Given the user is logged in as a "<usertype>"
    When the user navigates to "<tab>" tab and "<module>" module
    Then the title should contain "<title>"
    Examples:
      | usertype      | tab        | module   | title                        |
      | driver        | Activities | Calendar | Calendar Events - Activities |
      | sales manager | Customers  | Accounts | Accounts - Customers         |
      | store manager | Customers  | Contacts | Contacts - Customers         |
