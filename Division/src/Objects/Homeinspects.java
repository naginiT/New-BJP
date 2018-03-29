package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Action.Home_Data;

public class Homeinspects extends Browserc {
	static WebElement element=null;
	// static By Cli=By.cssSelector("#dd > a"); 
	 static By Cli=By.id(Home_Data.id);
	/* static By username=By.name(Home_Data.username); 
	 static By pass=By.name(Home_Data.password);
	 static By logi=By.xpath(Home_Data.login);
	 static By Home=By.xpath(Home_Data.home);*/
	 static By username=By.name("username"); 
	 static By pass=By.name("password");
	 static By logi=By.xpath("//*[@id=\"login\"]/form/button");
	 static By Home=By.xpath("//*[@id=\\\"link-effect-2\\\"]/ul/li[1]/a\"");
	 public Homeinspects(WebDriver driver)
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
			
			 public static WebElement  home()
				{
					element= driver.findElement(Home);
					return element;
				}

}
