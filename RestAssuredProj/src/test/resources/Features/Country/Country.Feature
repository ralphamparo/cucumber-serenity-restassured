Feature: Get information about countries via a RESTful API		  	
	Scenario Outline: Retrieve correct country info
    Given I provide a valid country name "<country>"
    When I send request to verify if "<country>"'s capital is "<capital>"
   
 Examples: Valid
  			|country|capital|
		  	|Norway |Oslo   |
  	
    
    