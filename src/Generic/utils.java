package Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utils {
public static void photo(WebDriver driver)
{
TakesScreenshot t=(TakesScreenshot)driver;	
File src = t.getScreenshotAs(OutputType.FILE);
File dest = new File("./photo/photo1.png");
try
{
	FileUtils.copyFile(src, dest);
} 
catch(IOException e)
{
}

}
}
