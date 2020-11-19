Feature:  Google Search feature

  @Smoke
  Scenario Outline: I want to search on google search
    Given I am on the google page
    When I enter "<keyword>" as a keyword
    Then I should be on the search result page
    And I should see at least <resultCount> results

    Examples:
      | keyword  | resultCount |
      | Selenium | 2           |
      | Java     | 5           |
      | Spring   | 7           |
      | Golang   | 6          |

