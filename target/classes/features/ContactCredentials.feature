

Feature: ContactCredentials


  @Regression_TC_01
  Scenario Outline: Validate whether user is able to fill contact us form for website section 
	Given User is on Application Home Page "<TcNo>"
	When Application Page Tittle is Property Management Software "<TcNo>"
	Then user clicks on Sign In button "<TcNo>"
	Then user clicks on Residents Login button "<TcNo>"
	Then user is directed to Resident portal page "<TcNo>"
	Then user clicks on view the website button "<TcNo>"
	Then user fills the contact us form "<TcNo>" "<name>" "<email>" "<propertyname>" "<propertyURL>" "<category>" "<Message>"
	
Examples:
	|TcNo            | name          | email                 | propertyname | propertyURL     | category | Message   |
	|Regression_TC_01| standard_user | standarduser@gmail.com| testproperty  | testproperty.com | Design   | GoodDesign|
	
	
	@Regression_TC_02
  Scenario Outline: Validate whether user is able to fill contact us form for Application section
	Given User is on Application Home Page "<TcNo>"
	When Application Page Tittle is Property Management Software "<TcNo>"
	Then user clicks on Sign In button "<TcNo>"
	Then user clicks on Residents Login button "<TcNo>"
	Then user is directed to Resident portal page "<TcNo>"
	Then user clicks on view the App button "<TcNo>"
	Then user fills the contact us form "<TcNo>" "<name>" "<email>" "<property name>" "<property URL>" "<category>" "<Message>"
	
Examples:
	|TcNo            | name          | email                 | property name | property URL     | category | Message   |
	|Regression_TC_02| standard_user | standarduser@gmail.com| testproperty  | testproperty.com | Design   | GoodDesign|
	
	
	@Regression_TC_03
	Scenario Outline: Validate whether user is able to Register in base Camp page
	Given User is on Application Home Page "<TcNo>"
	Then user clicks on Sign In button "<TcNo>"
	Then user clicks on Property Manager LoginButton "<TcNo>"
	Then user enters username and password "<TcNo>" "<username>" "<password>" 
	
Examples:
	|TcNo             | username            | password   | 
	|Regression_TC_03| standard_user       |   standard | 