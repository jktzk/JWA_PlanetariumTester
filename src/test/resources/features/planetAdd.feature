Feature: Planet Add

  Background:
    Given the user is on their account's home page
    When  the user selects Planet from the drop down

  #happy path
  Scenario Outline:
    When  the user types in a "<planet name>" into the Enter Planet Name box
    #JPEG or PNG
    And   optionally, when the user presses Choose File and attaches a "<image>"
    When  the user clicks Submit Planet
    Then  the planet should be added, with a visible picture if a file was provided

    Examples:
      |planet name                      |image|
      |Neptune                          ||
      |A                                ||
      |thisshouldbethirtycharachterss   ||
      |jupiter                          ||
      |MARS                             ||
      |_m_e_r_c_u_r_y_                  ||
      | v e n u s                       ||
      |-u-r-a-n-u-s-                    ||
      |1plu20                           ||
      |E 4_r-tH                         ||
      |NewPlanet                        |C:\\Users\\Josh\\Desktop\\JWA_PlanetariumTester\\TestCode\\src\\test\\resources\\testImages\\testJPEG.jpg|
      |NewPlanet                        |C:\\Users\\Josh\\Desktop\JWA_PlanetariumTester\\TestCode\\src\\test\\resources\\testImages\\testPNG.png|


  #sad path
  Scenario Outline:
    When  the user types in a "<planet name>" into the Enter Planet Name box
    When the user clicks Submit Planet
    Then the user should receive an alert with "<message>"

    Examples:
      |planet name                      | message              |
      |Earth                            |Invalid planet name   |
      |                                 |Invalid planet name   |
      |thisisoverthirtycharachtersssss  |Invalid planet name   |
      |E!@#$%^&*()_+{}?/                |Invalid planet name   |


   Scenario Outline:
     When  the user types in a "<planet name>" into the Enter Planet Name box
    #not JPEG or PNG
     And   optionally, when the user presses Choose File and attaches a "<image>"
     When the user clicks Submit Planet
     Then the user should receive an alert with "<message>"
     Examples:
       |planet name                      |image                                                                                                    |message        |
       |NewPlanet                        |C:\\Users\\Josh\\Desktop\\JWA_PlanetariumTester\\TestCode\\src\\test\\resources\\testImages\\testBMP.bmp |Invalid file type|
       |NewPlanet                        |C:\\Users\\Josh\\Desktop\JWA_PlanetariumTester\\TestCode\\src\\test\\resources\\testImages\\testTIFF.tiff|Invalid file type|
       |NewPlanet                        |C:\\Users\\Josh\\Desktop\JWA_PlanetariumTester\\TestCode\\src\\test\\resources\\testImages\\testGIF.gif  |Invalid file type|