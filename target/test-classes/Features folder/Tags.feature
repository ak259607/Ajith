Feature: Facebook Functionality Testing

  

  @reg
  Scenario: Facebook Login Credentials Testing
    Given user is on facebook logintwo page
    When user should enter the usernametwo and password
    And user should click the login buttontwo

  @reg
  Scenario: Facebook Login Credentials Testing
    Given user is on facebook loginthree page
    When user should enter the usernamethree and password
    And user should click the login buttonthree

  @smoke
  Scenario: Facebook Login Credentials Testing
    Given user is on facebook loginfour page
    When user should enter the usernamefour and password
    And user should click the login buttonfour
