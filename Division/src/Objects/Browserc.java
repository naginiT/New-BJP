package Objects;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Browserc extends Browser_Data {
	public static  WebDriver driver;
	public static void Browsercode() throws AWTException
	{
		/*System.setProperty("webdriver.chrome.driver","E:\\Selenium Files\\jars\\chromedriver.exe");
	     driver=new ChromeDriver();*/
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\cubic\\Desktop\\Nageshwari\\drivers\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
	    driver.get(Browser_Data.link);
	     
	   
		  
	
	}
	@AfterTest
	public static void Close()
	{
		driver.close();
	}


}
