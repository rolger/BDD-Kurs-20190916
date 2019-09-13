Feature: Converting illegal numbers 

Scenario: Converting a negative number
	Given the number -1
	When I convert it
	Then a failure is expected.

Scenario: Converting not a number
	Given the number "abc"
	When I convert it
	Then a failure is expected.

Scenario: Converting to huge number
	Given the number 500000000
	When I convert it
	Then a failure is expected.
