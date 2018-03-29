package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Actions.Solvedproblems_Data;
import Objects.Browsercode;

public class Solvedinspects extends Browsercode{
	static WebElement element=null;
	static By click=By.id("ad");
	 static By username=By.name(Solvedproblems_Data.username); 
	 static By pass=By.name(Solvedproblems_Data.password);
	 static By login=By.xpath(Solvedproblems_Data.login);
	 static By viewproblem=By.xpath(Solvedproblems_Data.viewproblem);
	 static By division=By.xpath(Solvedproblems_Data.division);
	 static By constitution=By.xpath(Solvedproblems_Data.constitution);
	 static By solved=By.xpath(Solvedproblems_Data.solved);
	 static By select=By.xpath(Solvedproblems_Data.select);
	 static By delete=By.xpath(Solvedproblems_Data.delete);
	 
	 public Solvedinspects(WebDriver driver)
		{
			super();
		}
	
	 public static WebElement Click()                 
		{
			 element = driver.findElement(click);
			return element;
		}
	 public static WebElement Username()
		{
			element = driver.findElement(username);
			return element;
		}
	 public static WebElement Pass()
		{
			 element = driver.findElement(pass);
			return element;
		}
	 public static WebElement Login()
		{
			 element = driver.findElement(login);
			return element;
		}
	 public static WebElement Viewproblem()
		{
			 element = driver.findElement(viewproblem);
			return element;
		}
	 public static WebElement Division()
		{
			 element = driver.findElement(division);
			return element;
		}
	 public static WebElement Constitution()
		{
			 element = driver.findElement(constitution);
			return element;
		}
	 
	 public static WebElement Solved()
		{
			 element = driver.findElement(solved);
			return element;
		}
	 public static WebElement Select()
		{
			 element = driver.findElement(select);
			return element;
		}
	 public static WebElement Delete()
		{
			 element = driver.findElement(delete);
			return element;
		}
}
