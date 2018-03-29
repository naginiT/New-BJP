package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Actions.Pendingproblems_Data;
import Objects.Browsercode;

public class Pendinginspects extends Browsercode {
	static WebElement element=null;
	static By click=By.id("ad");
	 static By username=By.name(Pendingproblems_Data.username); 
	 static By pass=By.name(Pendingproblems_Data.password);
	 static By login=By.xpath(Pendingproblems_Data.login);
	 static By viewproblem=By.xpath(Pendingproblems_Data.viewproblem);
	 static By division=By.xpath(Pendingproblems_Data.division);
	 static By constitution=By.xpath(Pendingproblems_Data.constitution);
	static By pending=By.xpath(Pendingproblems_Data.pending);
	static By update=By.xpath(Pendingproblems_Data.Update);
	
	public Pendinginspects(WebDriver driver)
	{
		super();
	}
	public static WebElement Click()
	{
		 element = driver.findElement(click);
		return element;
	}                                                               //  /html/body/div[4]/table/tbody/tr[1]/td[7]/a
	 public static WebElement Username()
		{
			element = driver.findElement(username);             ///html/body/div[4]/table/tbody/tr[2]/td[7]/a
			return element;
		}                                                       ///html/body/div[4]/table/tbody/tr[3]/td[7]/a
	 public static WebElement Pass()
		{                                                       ///html/body/div[4]/table/tbody/tr[1]/td[7]/a
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
	 public static WebElement Pending()
		{
			 element = driver.findElement(pending);
			return element;
		}
	 public static WebElement Update()
		{
			 element = driver.findElement(update);
			return element;
		}

}
