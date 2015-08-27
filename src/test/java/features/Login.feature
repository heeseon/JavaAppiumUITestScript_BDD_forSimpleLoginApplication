Feature: Valid Login


  Scenario: Passing valid credentials and log in into the application
    Given I am on the landing page
    When I enter id as "domich" 
    When I enter password as "1234"
    When I click login button
    Then I should see the success message "Logined"
