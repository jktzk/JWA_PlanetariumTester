Feature: User Login

  Background:
    Given the user is on the login page


  #Scenario: Passwords should be obscured
   # When  the user types into the password box
    #Then  their password should remain obscured while typing

  Scenario Outline: Correct credentials should permit login
    When    the user provides a username "<username>" for login
    And     the user provides a password "<password>" for login
    And     the user clicks the log button
    Then    the user should arrive to their account's home page

    Examples:
      |username                              |password          |
      |Batman                                |Iamthenight1939   |


  Scenario Outline: Incorrect credentials should prevent login
    When    the user provides a username "<username>" for login
    And     the user provides a password "<password>" for login
    When    the user clicks the log button
    Then    the user should receive an alert saying "<message>"
    And     the user should remain on the login page

    Examples:
      |username                              |password           |message                     |
      |batdude                               |Iarethenight1939   |Invalid Credentials         |