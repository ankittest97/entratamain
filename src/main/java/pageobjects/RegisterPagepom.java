package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPagepom {
	
	public WebDriver driver;

	public RegisterPagepom(WebDriver driver) //created a constructor which expects driver object
	{
		this.driver = driver;
	}
	
	
	By baseCampIcon = By.xpath("//*[text()='Base Camp']");
	By registerNowBtn = By.xpath("//*[@class='text-block-18']");
	By FirstName = By.xpath("//input[@aria-label='First Name']");
	By LastName = By.xpath("//input[@aria-label='Last Name']");
	By Company = By.xpath("//input[@aria-label='Company']");
	By Title = By.xpath("//input[@aria-label='Title']");
	By Emailaddress = By.xpath("//input[@aria-label='Email Address']");
	By Mobile = By.xpath("//input[@aria-label='Mobile']");
	
	
	public void BaseCampIcon() 
	{
		driver.findElement(baseCampIcon).click();
	}
	
	public void RegisterNowBtn()
	{
		driver.findElement(registerNowBtn).click();
	}
	
	public void FirstName(String firstname)
	{
		driver.findElement(FirstName).sendKeys(firstname);
	}
	
	
	public void LastName(String lastname)
	{
		driver.findElement(LastName).sendKeys(lastname);
	}

	public void Company(String company)
	{
		driver.findElement(Company).sendKeys(company);
	}

	public void Title(String title)
	{
		driver.findElement(Title).sendKeys(title);
	}

	public void Email(String email)
	{
		driver.findElement(Emailaddress).sendKeys(email);
	}

	public void Mobile(String mobile)
	{
		driver.findElement(Mobile).sendKeys(mobile);
	}


}
