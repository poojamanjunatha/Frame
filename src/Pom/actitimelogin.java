package Pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;
	 
public class actitimelogin extends BasePage{
	 
		@FindBy(id="username")
		private WebElement username;
		@FindBy(name="pwd")
		private WebElement password;
		@FindBy(id="loginButton")
		private WebElement loginbutton;
		
		public actitimelogin(WebDriver driver2) { // create constructor
			super(driver2);
			//Initialing non static variables
			PageFactory.initElements(driver2, this); //select webDriver ,object for initial element
			
			}
		public void setusername(String un)
		{
			this.username.sendKeys(un);
		}
		
		public void setpassword(String pw)
		{
			this.password.sendKeys(pw);
		}
		
		public void clicklogin()
		{
			this.loginbutton.click();
		}

	}


