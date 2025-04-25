Feature: User Registration

  Background:
    Given  the user is on the login page
    When   the user clicks the register link


  # Happy Path Scenario
  Scenario Outline: Valid credential data should allow for registering with the Planetarium

    When    the user provides username "<username>" for registration
    And     the user provides password "<password>" for registration
    When    user clicks the create button
    Then    an alert should appear saying "<message>"
    And     the user should be redirected to the login page

    Examples:
      |username                             |password                             |message                     |
      |Robin                                |bObb1                                |Account created successfully|
      |bobby                                |bObb1                                |Account created successfully|
      |thisshouldbethirtycharachterts       |bObb1                                |Account created successfully|
      |Ro_3-5                               |bObb1                                |Account created successfully|
      |Robin                                |Thisshouldbethirtycharcters3         |Account created successfully|
      |Robin                                |bobb-1                              |Account created successfully|
      |Robin                                |bob_b1                              |Account created successfully|
      |Robin                                |bob_b-1                              |Account created successfully|



  # Sad Path Scenario
  Scenario Outline: Invalid credential data should not allow for registering with the Planetarium
    When    the user provides username "<username>" for registration
    And     the user provides password "<password>" for registration
    When    user clicks the create button
    Then    an alert should appear saying "<message>"
    And     the user should remain on the register page


    Examples:
      |username                                     |password                                   |message         |
      |Batman                                      |bObb1                                       |Invalid username|
      |bobb                                        |bObb1                                       |Invalid username|
      |thisisoverthirtycharachtersssss             |bObb1                                       |Invalid username|
      |Robin>!@#?$%                                |bObb1                                       |Invalid username|
      |_Robin                                      |bObb1                                       |Invalid username|
      |3Robin                                      |bObb1                                       |Invalid username|
      |Robin                                       |Bob3                                        |Invalid password|
      |Robin                                       |ThisisoverthirtyCharacters3ss3              |Invalid password|
      |Robin                                       |bobby                                       |Invalid password|
      |Robin                                       |BOBBY                                       |Invalid password|
      |Robin                                       |bobb3                                       |Invalid password|
      |Robin                                       |BOBB3                                       |Invalid password|
      |Robin                                       |Bobb3!@%!@?$                                |Invalid password|
      |Robin                                       |3obbY                                       |Invalid password|
