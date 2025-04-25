Feature: Moon Add

  Background:
    Given the user is on their account's home page
    When  the user selects Moon from the drop down

  #happy path
  Scenario Outline:
    When  the user types in a "<moon name>" into the Enter Moon Name box
    When  the user types in a "<planet id>" into the Enter Orbited Planet ID box
    And   optionally, when the user presses Choose File and attaches a moon"<image>"
    When  the user clicks Submit Moon
    Then  the moon should be added, with a visible picture if a file was provided

    Examples:
      |moon name                           |planet id                      |image|
      |theMoon                             |1                              ||
      |A                                   |1                              ||
      |thisshouldbethirtycharachterss      |1                              ||
      |deimos                              |1                              ||
      |PHOBOS                              |1                              ||
      |_e_u_r_o_p_a_                       |1                              ||
      | t i t a n                          |1                              ||
      |-c-a-l-l-i-s-t-o-                   |1                              ||
      |1tr1t0n                             |1                              ||
      |ch4 R-0_N                           |1                              ||
      |theMoon                             |1                              |C:\\Users\\Josh\\Desktop\\JWA_PlanetariumTester\\TestCode\\src\\test\\resources\\testImages\\testJPEG.jpg|
      |theMoon                             |1                              |C:\\Users\\Josh\\Desktop\\JWA_PlanetariumTester\\TestCode\\src\\test\\resources\\testImages\\testPNG.png|

  #sad path
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


  Scenario Outline:
    When  the user types in a "<moon name>" into the Enter Moon Name box
    When the user types in a "<planet id>" into the Enter Orbited Planet ID box
    #not JPEG or PNG
    And   optionally, when the user presses Choose File and attaches a moon"<image>"
    When the user clicks Submit Moon
    Then the user should receive an alert with "<message>"
    Examples:
      |moon name                        |planet id|image                                                                                                    |message          |
      |NewPlanet                        |1        |C:\\Users\\Josh\\Desktop\\JWA_PlanetariumTester\\TestCode\\src\\test\\resources\\testImages\\testBMP.bmp |Invalid file type|
      |NewPlanet                        |1        |C:\\Users\\Josh\\Desktop\JWA_PlanetariumTester\\TestCode\\src\\test\\resources\\testImages\\testTIFF.tiff|Invalid file type|
      |NewPlanet                        |1        |C:\\Users\\Josh\\Desktop\JWA_PlanetariumTester\\TestCode\\src\\test\\resources\\testImages\\testGIF.gif  |Invalid file type|