Feature: Facebook Functionality Testing

  Scenario Outline: Facebook Login Credentials Testing
    Given user is on facebook login page
    When user should enter the "<username>" and "<password>"
    And user should click the login button
    Then user should verify te success message

    Examples: 
      | username | password |
      | Ajith    | Ak2345   |
      | Ak       | Ak@123   |
