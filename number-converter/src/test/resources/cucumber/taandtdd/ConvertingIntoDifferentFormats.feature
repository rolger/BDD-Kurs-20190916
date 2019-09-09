Feature: Converting numbers into different formats 

Scenario: Converting a decimal number
	Given a list of numbers
	|0       |
	|23467   |
	|49999999|

	When I convert it to a decimal

	Then the result is:
	|0       |	
	|23467   |
	|49999999|

Scenario: Converting a binary number
	Given a list of numbers
	|0       |
	|1       |
	|23467   |
	|49999999|

	When I convert it a binary

	Then the result is:
	|0                         |
	|1                         |
	|101101110101011           |	
	|10111110101111000001111111|
	
Scenario: Converting a hexadecimal number
	Given a list of numbers
	|0       |
	|1       |
	|23467   |
	|49999999|

	When I convert it a hexadecimal

	Then the result is:
	|0      |
	|1      |
	|5BAB   |	
	|2FAF07F|
	
