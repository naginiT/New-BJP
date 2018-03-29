package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Action.Viewproblems_Data;

public class Viewprobleminspects extends Browserc {
	static WebElement element=null;
	// static By Cli=By.cssSelector("#dd > a"); 
	 static By Cli=By.id( Viewproblems_Data.id);
	 static By username=By.name( Viewproblems_Data.username); 
	 static By pass=By.name( Viewproblems_Data.password);
	 static By logi=By.xpath( Viewproblems_Data.login);
	 static By View=By.xpath( Viewproblems_Data.view);
	 public Viewprobleminspects(WebDriver driver)
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
			public static WebElement  viewp()
			{
				element= driver.findElement(View);
				return element;
			}

}
