Feature: Account Secure

  Scenario Outline:
    Given the user begins on the login page
    When the registered user "<user>" signs in with their "<password>"
    Then User planets and moons should be visible for user "<ID>" and a greeting should be present for the user
    Examples:
      |user                                     |password          |ID  |
      |Batman                                   |Iamthenight1939   |1   |
      |Superman                                 |Iamop1938         |2   |


  Scenario:
    Given the user is on the login page
    When the user directly inputs the url for the planetarium homepage without logging in "http://localhost:8080/planetarium"
    Then the user should stay on the login page


  Scenario Outline:
    Given the user is on the login page
    When the user directly inputs the url for the planetarium homepage without logging in "http://localhost:8080/planetarium"
    When the user selects moon from drop down
    When the  user types in "<moon name>" into the deletion box
    When the  user clicks the Delete button
    Then the user should receive an alert with the message  "<message>"

    Examples:
      |moon name                      |message |
      |Luna                            |Invalid moon name  |

  Scenario Outline:
    Given the user is on the login page
    When the user directly inputs the url for the planetarium homepage without logging in "http://localhost:8080/planetarium"
    When the user selects Planet from drop down
    When the user types in "<planet name>" into the deletion box
    When the user clicks the Delete button
    Then the user should receive an alert with the message  "<message>"

    Examples:
      |planet name                      |message            |
      |Earth                            |Invalid planet name|