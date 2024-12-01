Feature: Library System API Testing

  Scenario: Validate GET API to fetch all books
    Given the API base URL is "http://localhost:7081"
    When I send a GET request to "/api/books" as "admin" with password "password"
    Then the response status should be 200
    And the response should contain a list of books