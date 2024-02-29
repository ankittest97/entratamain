package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import pageobjects.ContactCredentialspom;
import pageobjects.RegisterPagepom;
import utils.TestContextSetup;

public class ContactCredentialsStepDefinition  {

public WebDriver driver;
TestContextSetup testContextSetup;
public ContactCredentialspom contactCredentialspom;

public ContactCredentialsStepDefinition(TestContextSetup testContextSetup) // here we are just passing the instance of testcontext setup
{
	//this constructor method is automatically called when we create object of this class
	//the constructor should have parameter i.e utils class instance
	// idea here is attaching driver with testcontextsetup
	this.testContextSetup = testContextSetup;
	
}
	
	@Given("^User is on Application Home Page \"([^\"]*)\"$")
	public void user_is_on_Application_Home_Page(String arg1) 
 {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
		//testContextSetup.driver = new ChromeDriver();
		//testContextSetup.driver.manage().window().maximize();
		//testContextSetup.driver.get("https://www.entrata.com/");
		//testContextSetup.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	@When("^Application Page Tittle is Property Management Software \"([^\"]*)\"$")
	public void application_Page_Tittle_is_Property_Management_Software(String arg1) 
 {
		
//		WebDriverWait wait = new WebDriverWait(testContextSetup.driver , 30);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Sign In'])[1]")));
//		String actualTitle = testContextSetup.driver.getTitle();
		ContactCredentialspom contactCredentialspom = testContextSetup.pageObjectManager.getContactCredentialspom();
		String actualTitle = contactCredentialspom.actualTitle();
	    String expectedTitle = "Property Management Software | Entrata";
	    Assert.assertEquals(expectedTitle, actualTitle);

	}
	
	@Then("^user clicks on Sign In button \"([^\"]*)\"$")
	public void user_clicks_on_Sign_In_button(String arg1) throws Throwable {
		//testContextSetup.driver.findElement(By.xpath("(//*[text()='Sign In'])[1]")).click();
		//ContactCredentialspom contactCredentialspom = new ContactCredentialspom(testContextSetup.driver);
		ContactCredentialspom contactCredentialspom = testContextSetup.pageObjectManager.getContactCredentialspom();
		contactCredentialspom.SignIn();
		
	}

	@Then("^user clicks on Residents Login button \"([^\"]*)\"$")
	public void user_clicks_on_Residents_Login_button(String arg1) throws Throwable {
	    /*
	    WebElement loginBtn = testContextSetup.driver.findElement(By.xpath("//*[@title='Resident Portal Login Button']"));
	    JavascriptExecutor js = (JavascriptExecutor) testContextSetup.driver;
	    js.executeScript("arguments[0].click();", loginBtn);
	    */
	    testContextSetup.genericUtils.ResidentLoginBtn();
	}

	@Then("^user is directed to Resident portal page \"([^\"]*)\"$")
	public void user_is_directed_to_Resident_portal_page(String arg1)  {
		//String actualTitle = testContextSetup.driver.getTitle();
		ContactCredentialspom contactCredentialspom = testContextSetup.pageObjectManager.getContactCredentialspom();
		String actualTitle = contactCredentialspom.residentPortalTitle();
	    String expectedTitle = "Welcome to the Resident Portal App";
	    Assert.assertEquals(expectedTitle, actualTitle);
	  
	}


	@Then("^user clicks on view the website button \"([^\"]*)\"$")
	public void user_clicks_on_view_the_website_button(String arg1)  {
		//testContextSetup.driver.findElement(By.xpath("//div[@class='start-button website-button']")).click();
		//ContactCredentialspom contactCredentialspom = new ContactCredentialspom(testContextSetup.driver);
		ContactCredentialspom contactCredentialspom = testContextSetup.pageObjectManager.getContactCredentialspom();
		contactCredentialspom.Websitebtn();
	}

	

	@Then("^user clicks on view the App button \"([^\"]*)\"$")
	public void user_clicks_on_view_the_App_button(String arg1)  {
		
		//testContextSetup.driver.findElement(By.xpath("//div[@class='start-button app-button']")).click();
		//ContactCredentialspom contactCredentialspom = new ContactCredentialspom(testContextSetup.driver);
		ContactCredentialspom contactCredentialspom = testContextSetup.pageObjectManager.getContactCredentialspom();
		contactCredentialspom.Applicationbtn();
		
	}

	@Then("^user fills the contact us form \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_fills_the_contact_us_form(String TcNo, String name, String email, String propertyname, String propertyUrl, String category, String message)  {
		//ContactCredentialspom contactCredentialspom = new ContactCredentialspom(testContextSetup.driver);
		ContactCredentialspom contactCredentialspom = testContextSetup.pageObjectManager.getContactCredentialspom();
		contactCredentialspom.NameTextBox(name);
		contactCredentialspom.Email(email);
		contactCredentialspom.Propertyname(propertyname);
		contactCredentialspom.PropertyUrl(propertyUrl);
		contactCredentialspom.Category();
		
		//testContextSetup.driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		//testContextSetup.driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		//testContextSetup.driver.findElement(By.xpath("//input[@id='property_name']")).sendKeys(propertyname);
		//testContextSetup.driver.findElement(By.xpath("//input[@id='property_url']")).sendKeys(propertyUrl);
		//testContextSetup.driver.findElement(By.xpath("//*[@id='category']")).click();
		
		/*
		WebElement Category = testContextSetup.driver.findElement(By.xpath("//*[@id='category']"));
		Select required = new Select(Category);
		required.selectByIndex(2);
		
		*/
		
		//testContextSetup.driver.findElement(By.xpath("//*[@id='message']")).sendKeys(message);
		contactCredentialspom.Message(message);
		testContextSetup.genericUtils.CloseBrowser();
	}

	@Then("^user clicks on Property Manager LoginButton \"([^\"]*)\"$")
	public void user_clicks_on_Property_Manager_LoginButton(String arg1)  {
		/*
		WebElement loginBtn = testContextSetup.driver.findElement(By.xpath("//*[@title='Client Login Button']"));
	    JavascriptExecutor js = (JavascriptExecutor) testContextSetup.driver;
	    js.executeScript("arguments[0].click();", loginBtn);
	    */
		
		  testContextSetup.genericUtils.ClientLoginBtn();
		
	    
	}

	@Then("^user enters username and password \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enters_username_and_password(String arg1, String username, String password)  {
		//testContextSetup.driver.findElement(By.xpath("//*[@id='entrata-username']")).sendKeys(username);
		//testContextSetup.driver.findElement(By.xpath("//*[@id='entrata-password']")).sendKeys(password);
		//ContactCredentialspom contactCredentialspom = new ContactCredentialspom(testContextSetup.driver);
		ContactCredentialspom contactCredentialspom = testContextSetup.pageObjectManager.getContactCredentialspom();
		contactCredentialspom.Username(username);
		contactCredentialspom.Password(password);
		//testContextSetup.driver.close();
		testContextSetup.genericUtils.CloseBrowser();
		
		
		//invokePersonalInfo(TcNo,  firstname,  lastname,  company,  title ,   email,  mobile);
	}

	     


	
}
