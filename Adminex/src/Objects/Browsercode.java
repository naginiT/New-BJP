package Objects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Browsercode {
	
	
	
	public static  WebDriver driver;
	@BeforeTest
	public static void Browserc() throws AWTException
	{
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
