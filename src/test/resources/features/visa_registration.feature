Feature: verify visa registration feature

  @Regression
  Scenario Outline: Register users for visa using the provided data
    Given I am on the VISA registration form
    When I select my country "<fromCountry>" and to country "<toCountry>"
    And I enter my dob as "<dateOfBirth>"
    And I enter my name as "<firsName>" and "<lastName>"
    And I enter my contact details as "<email>" and "<phone>"
    And I enter comments as "<comments>"
    And I submit the form
    Then I should see the confirmation number

    Scenarios:
      | fromCountry      | toCountry                   | dateOfBirth | firsName | lastName  | email              | phone          | comments |
      | Isle of Man      | Mali                        | 2011-05-31  | Kraig    | Wiza      | Kraig@nobody.com   | 1-000-884-1373 | comment1 |
      | Lithuania        | Mexico                      | 2001-01-01  | Houston  | Kertzmann | Houston@nobody.com | 284.864.6580   |          |
      | Somalia          | Greece                      | 2004-07-02  | Ruthie   | Stamm     | Ruthie@nobody.com  | 1-209-813-9712 | comment2 |
      | Christmas Island | French Southern Territories | 2019-04-05  | Shonna   | Nolan     | Shonna@nobody.com  | (162) 387-0305 |          |