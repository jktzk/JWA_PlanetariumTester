Feature: Moon Add

  Background:
    Given the user is on their account's home page
    When  the user selects Moon from the drop down

  Scenario:
    Then  the user should have access to the correct input boxes for moons

  Scenario Outline:
    When  the user types in a "<moon name>" into the "Enter Moon Name" box
    When  the user types in a "<planet id>" into the "Enter Orbited Planet Id" box
    And   optionally, when the user presses "Choose File" and attaches a JPEG or PNG
    When  the user clicks Submit Moon
    Then  the table should refresh
    Then  the moon should be added, with a visible picture if a file was provided



      #file type here?
    Examples:
      |moon name                           |planet id                      |
      |theMoon                             |Luna                           |


  Scenario Outline:
    When the user types in a "<moon name>" into the "Enter Moon Name" box
    When the user now clicks Submit Moon
    Then the user should receive an alert with the message "Invalid moon name"

    Examples:
      |moon name                        |
      |Luna                             |
      |                                 |
      |thisisoverthirtycharachtersssss  |
      |E!@#$%^&*()_+{}?/                |


  Scenario Outline:
    When the user types in a "<moon name>" into the "Enter Moon Name" box
    When the user types in a "<planet id>" into the "Enter Orbited Planet Id" box
    When the user clicks on "Submit Moon"
    Then the user should receive an alert with the message "Invalid planet ID"

    Examples:
      |moon name                        |planet id|
      |theMoon                          |abc      |