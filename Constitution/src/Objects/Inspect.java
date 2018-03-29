package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inspect extends Browser {
	static WebElement element=null;
	static By click=By.linkText("Constitution");
	//static driver.findElement(By.linkText("Constitution")).click();
	 //static By Cli=By.id("cd");
	 static By username=By.name("username"); 
	 static By pass=By.name("password");
	 static By login=By.xpath("//*[@id=\"login\"]/form/button");
	 static By home=By.xpath("//*[@id=\"link-effect-2\"]/ul/li[1]/a");
	 static By viewdivision=By.xpath("//*[@id=\"link-effect-2\"]/ul/li[2]/a");
	 static By profile=By.xpath("/html/body/div[4]/div/div/ul/li/a");
	 static By viewproblem=By.xpath("//*[@id=\"link-effect-2\"]/ul/li[3]/a");
	 static By problemsineachdivision=By.xpath("/html/body/div[4]/div/div/ul/li/a");
	 static By logout=By.xpath("//*[@id=\"link-effect-2\"]/ul/li[4]/a");
	 static By loginpage=By.xpath("//*[@id=\"link-effect-2\"]/ul/li/a");
	 public Inspect(WebDriver driver)
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
	 public static WebElement Home()
		{
			element= driver.findElement(home);
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
	 public static WebElement Viewproblem()
		{
			element= driver.findElement(viewproblem);
			return element;
		}
	 public static WebElement Problemsineachdivision()
		{
			element= driver.findElement(problemsineachdivision);
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
