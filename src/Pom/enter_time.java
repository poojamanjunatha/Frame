package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;
public class enter_time extends BasePage{
	
	
		public enter_time(WebDriver d)
		{
		super(d);
		PageFactory.initElements(d, this);
		}
		@FindBy(id="logoutLink")
		private WebElement logout;
		@FindBy(xpath="//a[@class=\"content users\"]")
		private WebElement users;
		
		
	public void clicklogout()
	{
		this.logout.click();
	}
	public void clickuser()
	{
		this.elementvisibility(this.users); //element visibility is in BasePage
		this.users.click();
	}
	}



