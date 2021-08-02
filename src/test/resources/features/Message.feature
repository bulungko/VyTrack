Feature: 2. As a user, I should be able to send message

  Background: Given user is on home page

  Scenario: Verify users can send message by clicking ""MESSAGE"" tab
    When user click message tab
    When user write the message and clicking tab
    Then user can see message is displayed as expected


  Scenario: Verify users can cancel message.
    When user click message tab
    Then user can cancel message


  @wip
  Scenario: Verify users can attach link by clicking on the link icon."
    When user click message tab
    When user click attach link icon and attach link
    Then user can click the link that lead to link page