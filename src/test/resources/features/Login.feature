Feature: As a user, I should be able to login to the app


  Scenario: User access tp "FORGOT YOUR PASSWORD?" link page
    Given  user is on login page
    When user click FORGOT YOUR PASSWORD? button
    Then user can see Get Password as title


  Scenario: "Remember me on this computer" option functionality

    Then user can click Remember me on this computer option


  Scenario: Login with incorrect credentials

    Given user is on login page
    When users login with  invalid username and password
      | username | hr42@cybertekschool.com |
      | password | userUser                |
    Then users cannot login

  @smoke
  Scenario Outline: Login functionality with valid credentials

    Given user is on login page
    When As all users enter "<username>" and "<password>"
    Then user should see "<username>" on the profile

    Examples:
      | username                       | password |
      | helpdesk41@cybertekschool.com  | UserUser |
      | helpdesk42@cybertekschool.com  | UserUser |
      | marketing41@cybertekschool.com | UserUser |
      | marketing42@cybertekschool.com | UserUser |
      | hr41@cybertekschool.com        | UserUser |











