package pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	
	public ContactCredentialspom contactCredentialspom;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	public ContactCredentialspom getContactCredentialspom()
	{
		//ContactCredentialspom contactCredentialspom = new ContactCredentialspom(driver);
		contactCredentialspom = new ContactCredentialspom(driver);
		return contactCredentialspom;
	}
	
	
	public RegisterPagepom getRegisterPagepom() 
	{
		RegisterPagepom registerPagepom = new RegisterPagepom(driver);
		return registerPagepom;
	}
	
	
}
