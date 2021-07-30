Feature: As a user, I should be able to login to the app

@wip
  Scenario Outline:

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
     # | hr42@cybertekschool.com        | UserUser |










