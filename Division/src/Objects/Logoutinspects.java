package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Action.Logout_Data;

public class Logoutinspects extends Browserc {
	static WebElement element=null;
	// static By Cli=By.cssSelector("#dd > a"); 
	 static By Cli=By.id(Logout_Data.id);
	 static By username=By.name(Logout_Data.username); 
	 static By pass=By.name(Logout_Data.password);
	 static By logi=By.xpath(Logout_Data.login);
	 static By Logot=By.xpath(Logout_Data.logout);
	 public Logoutinspects(WebDriver driver)
		{
			super();
		}
	 public static WebElement  Clik()
		{
			element= driver.findElement(Cli);
			return element;
		}
			
			public static WebElement  User()
			{
				element=driver.findElement(username);
				return element;
			}
			public static WebElement pass()
			{
				element=driver.findElement(pass);
				return element;
			}
				
			public static WebElement login()
			{
				element=driver.findElement(logi);
				return element;
			}
			public static WebElement  logot()
			{
				element= driver.findElement(Logot);
				return element;
			}

}
