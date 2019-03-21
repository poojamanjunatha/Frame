package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;

import Pom.actitimelogin;
import Pom.enter_time;

public class LoginScript extends BaseTest{
@Test

public void loginscript() throws InterruptedException
{
	actitimelogin ob=new actitimelogin(driver);
	ob.setusername("admin");
	ob.setpassword("manager");
	ob.clicklogin();
	Thread.sleep(5000);
	System.out.println(driver.getTitle());
	ob.titlewait("actiTIME -  Enter Time-Track");
	enter_time ob1=new enter_time(driver);
	ob1.clickuser();
	
}
}
