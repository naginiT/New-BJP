package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Action.Viewdivision_Data;

public class Viewdivisioninspects extends Browser {
	static WebElement element=null;
	static By click=By.linkText("Constitution");
	//static driver.findElement(By.linkText("Constitution")).click();
	 //static By Cli=By.id("cd");
	 static By username=By.name(Viewdivision_Data.username); 
	 static By pass=By.name(Viewdivision_Data.password);
	 static By login=By.xpath(Viewdivision_Data.login);
	 static By viewdivision=By.xpath(Viewdivision_Data.Viewdivision);
	 static By profile=By.xpath(Viewdivision_Data.profile);
	 static By logout=By.xpath(Viewdivision_Data.logout);
	 static By loginpage=By.xpath(Viewdivision_Data.loginpage);
	 public Viewdivisioninspects(WebDriver driver)
		{
			super();
		}
	 public static WebElement Click()
		{
			element= driver.findElement(click);
			return element;
		}
	 public static WebElement Username()
		{
			element= driver.findElement(username);
			return element;
		}
	 public static WebElement Pass()
		{
			element= driver.findElement(pass);
			return element;
		}
	 public static WebElement Login()
		{
			element= driver.findElement(login);
			return element;
		}
	 
	 public static WebElement Viewdivision()
		{
			element= driver.findElement(viewdivision);
			return element;
		}
	 public static WebElement Profile()
		{
			element= driver.findElement(profile);
			return element;
		}
	 public static WebElement Logout()
		{
			element= driver.findElement(logout);
			return element;
		}
	 public static WebElement Loginpage()
		{
			element= driver.findElement(loginpage);
			return element;
		}	

}
