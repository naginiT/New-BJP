package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Action.Viewproblems_Data;

public class Viewprobleminspects extends Browser {
	static WebElement element=null;
	static By click=By.linkText("Constitution");
	//static driver.findElement(By.linkText("Constitution")).click();
	 //static By Cli=By.id("cd");
	 static By username=By.name(Viewproblems_Data.username); 
	 static By pass=By.name(Viewproblems_Data.password);
	 static By login=By.xpath(Viewproblems_Data.login);
	 static By viewproblem=By.xpath(Viewproblems_Data.viewproblem);
	 static By problemsineachdivision=By.xpath(Viewproblems_Data.problemsineachdivision);
	 static By logout=By.xpath(Viewproblems_Data.logout);
	 static By loginpage=By.xpath(Viewproblems_Data.loginpage);
	 public Viewprobleminspects(WebDriver driver)
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
