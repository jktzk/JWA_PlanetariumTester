Feature: Delete Planet

  Background:
    Given the user is on their account's  home page
    When the user selects Planet from drop down


  Scenario Outline:
    When the user types in "<planet name>" into the deletion box
    When the user clicks the Delete button
    And the planet entry should be deleted

    Examples:
      |planet name                      |
      |Earth                            |



  Scenario Outline:
    When the user types in "<planet name>" into the deletion box
    When the user clicks the Delete button
    Then the user should receive an alert with the message  "<message>"

    Examples:
      |planet name                      |message            |
      |cat                              |Invalid planet name|
       #tests if you can delete other users planet
      |Mars                             |Invalid planet name|