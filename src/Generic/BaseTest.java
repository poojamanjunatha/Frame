package Generic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
public abstract class BaseTest implements AutoConstant {
static 
{
	System.setProperty(chromekey, chromevalue);
	System.setProperty(geckokey, geckovalue);
}
public WebDriver driver ;
@Parameters("browser")//for parallel execution
@BeforeMethod(alwaysRun=true)
public void precondition(String brow )
{
	if(brow.equals("chrome"))// for parallel exe
	driver = new ChromeDriver();
	else
	driver=new FirefoxDriver();// for parallel exe
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
}
@AfterMethod(alwaysRun=true)
public void postcondition(ITestResult res)
{
	int status= res.getStatus();
	if(status==2)
		utils.photo(driver);
		String name = res.getMethod().getMethodName();
		System.out.println(name);
	
	//System.out.println(status);
	driver.close();
}
}