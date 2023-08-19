Feature: A cucumber pom demo

  Scenario Outline: LoginA
    Given the user launches the NOPAdmin url
    Then the user verifies the logo
    When the user enters "<username>" in email webedit
    And the user enters "<password>" in password webedit
    Then the user clicks on login button

    Examples:
    |username|password|
    |vignesh |user123 |
    |krithiga|admin123|
    |satya   |13admin |

  @Regression
  Scenario Outline: Login regression
    Given the user launches the NOPAdmin url
    Then the user verifies the logo
    When the user enters "<username>" in email webedit
    And the user enters "<password>" in password webedit
    Then the user clicks on login button

    Examples:
      |username|password|
      |mahi |user123 |
      |virat|admin123|
      |sachin   |13admin |
