Feature: Library app login feature
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin
  #this is how you comment in feature file

  @wip
  Scenario: Login as librarian
    Given user is on the login page
    When user enters librarian username
    And user enter librarian password
    Then user should see dashboard

  #Scenario:  Login as student

