package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Pom.actitimelogin;
import Pom.enter_time;

public class users extends BaseTest {

	@Test
	public void test3() throws InterruptedException
	{
		//object for pom class of actiTIME_login
		actitimelogin ob=new actitimelogin(driver);
		ob.setusername("admin");
		ob.setpassword("manager");
		ob.clicklogin();
		ob.titlewait("actiTIME - Enter Time-Track");
		
		//object for pom class of homepage
		enter_time ob2=new enter_time(driver);
		ob2.clickuser();
		
		
	}
}
