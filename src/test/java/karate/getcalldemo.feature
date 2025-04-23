@debug
Feature: Get the details of User 2

  Background: Set Url
    * url 'https://reqres.in/api'

  Scenario: Get the details of user 2
    Given path 'users/2', 2
    And request {}
    When method get
    Then status 200


  Scenario: Create a Person
    Given path 'users'
    And request 
    """
    { 
    "name": "morpheus", 
    "job": "leader" }
     """
    When method post
    Then status 201
    And match response == "#object"
    And match response.name == "morpheus"
    And match response.job == "leader"
    And match response.id == #regex [0-9]+
#    And match response.createdAt == "#regex '[0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{3}Z'"
