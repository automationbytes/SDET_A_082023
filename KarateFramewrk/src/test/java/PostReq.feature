Feature: Post Request Example


  Background:
    * url 'http://webservice.toscacloud.com/rest'
    * header Authorization = 'Bearer 3af0a715-53f0-4bac-a2e3-a3e4301aecac'


  Scenario: New Post Request
    * def requestBody = { "Description": "Karate Framework",   "Name": "Karate Cafe"   }

    Given path '/api/Coffees_V2'
    And request requestBody
    When method POST
    Then status 200
    #And match response == requestBody
    And match response contains requestBody