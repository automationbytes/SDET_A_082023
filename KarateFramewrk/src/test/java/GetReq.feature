Feature: Testing Coffee API

  Background:
    * url 'http://webservice.toscacloud.com/rest'
    * header Authorization = 'Bearer 3af0a715-53f0-4bac-a2e3-a3e4301aecac'

  Scenario: Get Coffee Details

    Given path '/api/Coffees_V2'
    When method GET
    Then status 200
    #And match response == { id: '#notnull', name: '#notnull' }
