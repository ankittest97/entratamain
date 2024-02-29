package stepDefinition;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageobjects.ContactCredentialspom;
import pageobjects.PageObjectManager;
import pageobjects.RegisterPagepom;
import utils.TestContextSetup;

public class RegisterStepDefinition {

	//public WebDriver driver;
	
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;

	public RegisterStepDefinition(TestContextSetup testContextSetup) // here we are just passing the instance of testcontext setup
	{
		//this constructor method is automatically called when we create object of this class
		//the constructor should have parameter i.e utils class instance
		// idea here is attaching driver with testcontextsetup
		this.testContextSetup = testContextSetup;
		
	}
	
	@Then("^user clicks on Base Camp icon \"([^\"]*)\"$")
	public void user_clicks_on_Base_Camp_icon(String arg1)  {
		
		//testContextSetup.driver.findElement(By.xpath("//*[text()='Base Camp']")).click();
		
		//pageObjectManager = new PageObjectManager(testContextSetup.driver);
//we have commented the above line because in pageobjectmanager we have already pageobjectmanager ready
		//RegisterPagepom registerPagepom = pageObjectManager.getRegisterPagepom();
		
		RegisterPagepom registerPagepom = testContextSetup.pageObjectManager.getRegisterPagepom();
		
		//RegisterPagepom registerPagepom = new RegisterPagepom(testContextSetup.driver);
		registerPagepom.BaseCampIcon();
	}

	@When("^user is on Base Camp Home page \"([^\"]*)\"$")
	public void user_is_on_Base_Camp_Home_page(String arg1)  {
		/*
		//since on clicking on basecamp it opens on new window
				Set<String> s1 = testContextSetup.driver.getWindowHandles();  //we have two windows parent and child that will fall in s1 object
				//now we have to iterate this collection type to retrieve our windows
				Iterator<String> i1 = s1.iterator();
				// those two windows we are collecting in set collection type in 0 index we have parent and 1st we have child
			String parentWindow = i1.next();
			String childWindow = i1.next(); //here we are extracting child window
			testContextSetup.driver.switchTo().window(childWindow); //we have to provide window handle id here in argument
		*/
			testContextSetup.genericUtils.SwitchWindowToChild();
			
		String actualTitle = testContextSetup.driver.getTitle();
	    String expectedTitle = "Base Camp 2024 | Entrata";
	    Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("^user clicks on Register now icon \"([^\"]*)\"$")
	public void user_clicks_on_Register_now_icon(String arg1)  {
	   
		//testContextSetup.driver.findElement(By.xpath("//*[@class='text-block-18']")).click();
		//RegisterPagepom registerPagepom = new RegisterPagepom(testContextSetup.driver);
		RegisterPagepom registerPagepom = testContextSetup.pageObjectManager.getRegisterPagepom();
		registerPagepom.RegisterNowBtn();
	
	}

	@Then("^user provides necessary info in personal info section \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_provides_necessary_info_in_personal_info_section(String TcNo, String firstname, String lastname, String company, String title ,  String email, String mobile)  {
	    
		invokePersonalInfo(TcNo,  firstname,  lastname,  company,  title ,   email,  mobile);
		//testContextSetup.driver.close();
		testContextSetup.genericUtils.CloseBrowser();
		
	}
	
	public void invokePersonalInfo(String TcNo, String firstname, String lastname, String company, String title ,  String email, String mobile)
	
	{
		//testContextSetup.driver.findElement(By.xpath("//input[@aria-label='First Name']")).sendKeys(firstname);
		//testContextSetup.driver.findElement(By.xpath("//input[@aria-label='Last Name']")).sendKeys(lastname);
		//testContextSetup.driver.findElement(By.xpath("//input[@aria-label='Company']")).sendKeys(company);
		//testContextSetup.driver.findElement(By.xpath("//input[@aria-label='Title']")).sendKeys(title);
		//testContextSetup.driver.findElement(By.xpath("//input[@aria-label='Email Address']")).sendKeys(email);
		//testContextSetup.driver.findElement(By.xpath("//input[@aria-label='Mobile']")).sendKeys(mobile);
		//RegisterPagepom registerPagepom = new RegisterPagepom(testContextSetup.driver);
		RegisterPagepom registerPagepom = testContextSetup.pageObjectManager.getRegisterPagepom();
		registerPagepom.FirstName(firstname);
		registerPagepom.LastName(lastname);
		registerPagepom.Company(company);
		registerPagepom.Title(title);
		registerPagepom.Email(email);
		registerPagepom.Mobile(mobile);
	
	}
	
	
}
