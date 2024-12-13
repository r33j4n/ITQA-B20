Feature: Login to HRM

    Scenario: Successful login with valid credentials
        Given I am on the HRM login page
        When I enter admin as username
        And I enter admin123 as password
        Then I should be able to login