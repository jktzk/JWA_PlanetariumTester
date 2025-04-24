Feature: Delete Moon

  Background:
    Given the  user is on their account's  home page



  Scenario Outline:
    When the user selects moon from drop down
    When the  user types in "<moon name>" into the deletion box
    When the  user clicks the Delete button
    And the moon entry should be deleted

    Examples:
      |moon name                      |
      |Luna                            |

    #parent moon
  Scenario Outline:
    When the user selects  planet from drop down
    When the  user types in "<planet name>" into the deletion box
    When the  user clicks the Delete button
    And the moon entry should be deleted

    Examples:
      |planet name                      |
      |Earth                            |



  Scenario Outline:
    When the user selects moon from drop down
    When the  user types in "<moon name>" into the deletion box
    When the  user clicks the Delete button
    Then the  user should receive an alert with the message  "<message>"

    Examples:
      |moon name                        |message            |
      |dog                              |Invalid moon name  |
      #tests if you can delete other users moon
      |Titan                            |Invalid moon name  |


