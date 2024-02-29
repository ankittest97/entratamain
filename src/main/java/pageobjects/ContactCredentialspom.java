package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactCredentialspom {
	
	public WebDriver driver;

	public ContactCredentialspom(WebDriver driver) //created a constructor which expects driver object
	{
		this.driver = driver;
	}
	
	
	By signin  = By.xpath("(//*[text()='Sign In'])[1]");
	By loginbtn = By.xpath("//*[@title='Resident Portal Login Button']");
	By websitebtn = By.xpath("//div[@class='start-button website-button']");
	By applicationbtn = By.xpath("//div[@class='start-button app-button']");
	By nametextbox = By.xpath("//input[@id='name']");
	By emailId = By.xpath("//input[@id='email']");
	By propertyName = By.xpath("//input[@id='property_name']");
	By propertyURL = By.xpath("//input[@id='property_url']");
	By category = By.xpath("//*[@id='category']");
	By messages = By.xpath("//*[@id='message']");
	By propertymanagerloginbtn = By.xpath("//*[@title='Client Login Button']");
	By Username = By.xpath("//*[@id='entrata-username']");
	By Password = By.xpath("//*[@id='entrata-username']");
	
	public void SignIn()
	{
		driver.findElement(signin).click();
		//testContextSetup.driver.findElement(By.xpath("(//*[text()='Sign In'])[1]")).click();
	}
	
	public void LoginBtn()
	{
		driver.findElement(loginbtn);
	}
	
	public void Websitebtn()
	{
		driver.findElement(websitebtn).click();
	}
	
	public void Applicationbtn()
	{
		driver.findElement(applicationbtn).click();
	}
	
	public void NameTextBox(String name)
	{
		driver.findElement(nametextbox).sendKeys(name);
	}
	
	public void Email(String email)
	{
		driver.findElement(emailId).sendKeys(email);
	}
	
	public void Propertyname(String propertyname)
	{
		driver.findElement(propertyName).sendKeys(propertyname);
	}
	
	
	public void PropertyUrl(String propertyUrl)
	{
		driver.findElement(propertyURL).sendKeys(propertyUrl);
	}
	
	
	public void Category()
	{
		driver.findElement(category).click();
		
		
	}
	

	public void Message(String message)
	{
		driver.findElement(messages).sendKeys(message);;
	}
	

	public void Propertymanagerloginbtn()
	{
		driver.findElement(propertymanagerloginbtn);
	}
	
	public void Username(String username)
	{
		driver.findElement(Username).sendKeys(username);
	}
	
	public void Password(String password)
	{
		driver.findElement(Password).sendKeys(password);
	}
	
	public String actualTitle()
	{
		return driver.getTitle();
	}
	
	public String residentPortalTitle()
	{
		return driver.getTitle();
	}
}
