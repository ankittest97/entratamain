package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobjects.PageObjectManager;

//Here in this class what are the variables and properties you are going to share with 
// another step definition file

public class TestContextSetup {

	//something what is defined in one step definition file is to be shared to another step def file
	
	public WebDriver driver;		//global variable
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
		
	}
	
	
}
