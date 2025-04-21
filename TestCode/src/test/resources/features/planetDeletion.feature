Feature: Delete Planet

  Background:
    Given the user is on their account's home page
    When the user selects "Planet" from the drop down


  Scenario Outline:
    When the user types in a valid "<planet name>" into the "name for celestial body to be deleted" box
    When the user clicks the "Delete" button
    Then the table should refresh
    And the planet entry should be deleted

    Examples:
      |planet name                      |
      |Earth                            |



  Scenario Outline:
    When the user types in an invalid "<planet name>" into the "name for celestial body to be deleted" box
    When the user clicks the "Delete" button
    Then the user should receive an alert with the message "Invalid planet name"

    Examples:
      |planet name                      |
      |cat                              |