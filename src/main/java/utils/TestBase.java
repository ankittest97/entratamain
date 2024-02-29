package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis  = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url  = prop.getProperty("QAUrl");
		if(driver==null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
			}
			
			
	    driver.manage().window().maximize();
		//driver.get("https://www.entrata.com/");
	    driver.get(url);
		}
		
		return driver;  //this driver whosoever wants will call WebDriverManager method
		//who wants this driver variable-all our page objects
		
	}
}
