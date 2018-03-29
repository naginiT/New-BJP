package Objects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Browser {
	public static  WebDriver driver;
	public static void Browserc() throws AWTException
	{
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\cubic\\Desktop\\Nageshwari\\drivers\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
	    driver.get("http://localhost:8082/bjpwar/");
	    
		  
	
	}
	@AfterTest
	public static void Close()
	{
		driver.close();
	}



}
