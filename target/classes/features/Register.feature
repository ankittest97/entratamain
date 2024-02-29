Feature: BaseCampRegister


  @Regression_TC_1.1
  Scenario Outline: Validate whether user is able to Register in base Camp page
	Given User is on Application Home Page "<TcNo>"
	Then user clicks on Base Camp icon "<TcNo>"
	When user is on Base Camp Home page "<TcNo>"
	Then user clicks on Register now icon "<TcNo>"
	Then user provides necessary info in personal info section "<TcNo>" "<firstname>" "<lastname>" "<company>" "<title>" "<email>" "<mobile>"
	
Examples:
	|TcNo             | firstname          | lastname   | company       |title  | email                    | mobile   | 
	|Regression_TC_1.1| standard_user       |   standard | testproperty |ABC    | standarduser@gmail.com   | 987456321  |  
	
	
	
	