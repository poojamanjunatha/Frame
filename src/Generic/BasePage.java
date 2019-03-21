package Generic;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver3;
	public BasePage(WebDriver d){
		this.driver3=d;
	}
	public void titlewait (String expectedtitle)
	{
		
		WebDriverWait wait= new WebDriverWait (driver3,10);
		try{
			
			wait.until(ExpectedConditions.titleIs(expectedtitle));
			Reporter.log("title is matching ", true);//log(string,booleanTo stdout)
		}
		catch(Exception e) {
			Reporter.log("title is not matching", true);
			Assert.fail();
			
		}	
	}
	public void elementvisibility(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver3,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is visible",true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not visible",true);
			Assert.fail();
		}
	}
}
