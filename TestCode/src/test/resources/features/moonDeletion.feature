Feature: Delete Moon

  Background:
    Given the user is on their account's home page
    When the user selects "Moon" from the drop down


  Scenario Outline:
    When the user types in a valid "<moon name>" into the "name for celestial body to be deleted" box
    When the user clicks the "Delete" button
    Then the table should refresh
    And the moon entry should be deleted

    Examples:
      |moon name                      |
      |Luna                           |



  Scenario Outline:
    When the user types in an invalid "<moon name>" into the "name for celestial body to be deleted" box
    When the user clicks the "Delete" button
    Then the user should receive an alert with the message "Invalid moon name"

    Examples:
      |moon name                      |
      |dog                            |