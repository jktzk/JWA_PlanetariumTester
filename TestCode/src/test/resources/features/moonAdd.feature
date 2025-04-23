Feature: Moon Add

  Background:
    Given the user is on their account's home page
    When  the user selects Moon from the drop down

  Scenario:
    Then  the user should have access to the correct input boxes for moons

  Scenario Outline:
    When  the user types in a "<moon name>" into the Enter Moon Name box
    When  the user types in a "<planet id>" into the Enter Orbited Planet ID box
    And   optionally, when the user presses Choose File and attaches a moon"<image>"
    When  the user clicks Submit Moon
    Then  the table should refresh
    Then  the moon should be added, with a visible picture if a file was provided



      #file type here?
    Examples:
      |moon name                           |planet id                      |image|
      |theMoon                             |1                              ||
      |theMoon                             |1                              |C:\\Users\\Josh\\Desktop\\JWA_PlanetariumTester\\TestCode\\src\\test\\resources\\testImages\\planetJPEG.jpg|
      |theMoon                             |1                              |C:\\Users\\Josh\\Desktop\\JWA_PlanetariumTester\\TestCode\\src\\test\\resources\\testImages\\planetPNG.png|


  Scenario Outline:
    When the user types in a "<moon name>" into the Enter Moon Name box
    When  the user types in a "1" into the Enter Orbited Planet ID box
    When the user clicks Submit Moon
    Then the user should receive an alert with the message "<message>"

    Examples:
      |moon name                        |message|
      |Luna                             |Invalid moon name|
      |                                 |Invalid moon name|
      |thisisoverthirtycharachtersssss  |Invalid moon name|
      |E!@#$%^&*()_+{}?/                |Invalid moon name|


  Scenario Outline:
    When the user types in a "<moon name>" into the Enter Moon Name box
    When the user types in a "<planet id>" into the Enter Orbited Planet ID box
    When the user clicks Submit Moon
    Then the user should receive an alert with the message "<message>"

    Examples:
      |moon name                        |planet id|message|
      |theMoon                          |2        |Invalid planet ID|