Feature: API Testing with Karate

  Background:
    * url baseUrl
    * header Content-Type = 'application/json'

  Scenario: Get all posts
    Given path 'posts'
    When method GET
    Then status 200
    And match response[0].id == 1

  Scenario: Create a new post
    Given path 'posts'
    And request { title: 'foo', body: 'bar', userId: 1 }
    When method POST
    Then status 201
    And match response.title == 'foo'

  Scenario: Update a post
    Given path 'posts', 1
    And request { title: 'updated title' }
    When method PUT
    Then status 200
    And match response.title == 'updated title'

  Scenario: Delete a post
    Given path 'posts', 1
    When method DELETE
    Then status 200