Feature: Planet Add

  Background:
    Given the user is on their account's home page
    When  the user selects Planet from the drop down

  Scenario:
    Then  the user should have access to the correct input boxes for planets

  Scenario Outline:
    When  the user types in a valid "<planet name>" into the "Enter Planet Name" box
    And   optionally, when the user presses "Choose File" and attaches a JPEG or PNG
    When  the user clicks Submit Planet
    Then  the table should refresh
    Then  the planet should be added, with a visible picture if a file was provided



      #file type here?
    Examples:
      |planet name                      |
      |Mars                             |
      |A                                |
      |thisshouldbethirtycharachterss   |
      |jupiter                          |
      |NEPTUNE                          |
      |_m_e_r_c_u_r_y_                  |
      | v e n u s                       |
      |-u-r-a-n-u-s-                    |
      |1plu20                           |
      |E 4_r-tH                         |


  Scenario Outline:
    When the user types in an invalid "<planet name>" into the "Enter Planet Name" box
    When the user now clicks Submit Planet
    Then the user should receive an alert with the message "Invalid planet name"

    Examples:
      |planet name                      |
      |Luna                             |
      |                                 |
      |thisisoverthirtycharachtersssss  |
      |E!@#$%^&*()_+{}?/                |
