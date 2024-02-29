package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}

	public void SwitchWindowToChild()
	{
	Set<String> s1 = driver.getWindowHandles();  //we have two windows parent and child that will fall in s1 object
	//now we have to iterate this collection type to retrieve our windows
	Iterator<String> i1 = s1.iterator();
	// those two windows we are collecting in set collection type in 0 index we have parent and 1st we have child
String parentWindow = i1.next();
String childWindow = i1.next(); //here we are extracting child window
driver.switchTo().window(childWindow); //we have to provide window handle id here in argument
	}
//driver over here is coming from webdriver manager

public void ResidentLoginBtn()
{
	WebElement loginBtn = driver.findElement(By.xpath("//*[@title='Resident Portal Login Button']"));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();", loginBtn);
}

public void ClientLoginBtn()
{
	WebElement loginBtn = driver.findElement(By.xpath("//*[@title='Client Login Button']"));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();", loginBtn);
}


public void CloseBrowser()
{
	driver.close();
}

}
