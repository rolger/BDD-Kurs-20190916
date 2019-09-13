Feature: Converting Roman numbers into decimals 

Scenario: Converting a decimal number
	Given a list of numbers
    |1	    |    
    |2	    |
    |3	    |
    |4	    |
    |5	    |
    |6	    |
    |7	    |
    |8	    |
    |9	    |
    |10	    |
    |20	    |
    |30	    |
    |40	    |
    |50	    |
    |60	    |
    |70	    |
    |80	    |
    |90	    |
    |100	|
    |200	|       
    |300	| 
    |330	| 
    |400	| 
    |440	| 
    |500	| 
    |550	| 
    |600	| 
    |660	| 
    |700	| 
    |770	| 
    |800	| 
    |880	| 
    |900	| 
    |990	| 
    |1000	| 
    |2000	| 
    |3000	| 
    |3999	|

	When I convert it to a Roman

	Then the result is:
	|I                      |
	|II                     |
	|III                    |
	|IV                     |
	|V                      |
	|VI                     |
	|VII                    |
	|VIII                   |
	|IX                     |
	|X                      |
	|XX                     |
	|XXX                    |
	|XL                     |
	|L                      |
	|LX                     |
	|LXX                    |
	|LXXX                   |
	|XC                     |
	|C                      |
	|CC                     |
	|CCC                    |
	|CCCXXX                 |
	|CD                     |
	|CDXL                   |
	|D                      |
	|DL                     |
	|DC                     |
	|DCLX                   |
	|DCC                    |
	|DCCLXX                 |
	|DCCC                   |
	|DCCCLXXX               |
	|CM                     |
	|CMXC                   |
	|M                      |
	|MM                     |
	|MMM                    |
	|MMMCMXCIX              |