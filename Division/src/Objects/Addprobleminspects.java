package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Action.Addproblem_Data;

public class Addprobleminspects extends Browserc {
	static WebElement element=null;
	// static By Cli=By.cssSelector("#dd > a"); 
	 static By Cli=By.id( Addproblem_Data.id);
	 static By username=By.name( Addproblem_Data.username); 
	 static By pass=By.name( Addproblem_Data.password);
	 static By logi=By.xpath( Addproblem_Data.login);
	 static By Home=By.xpath( Addproblem_Data.home);
	 static By add=By.xpath( Addproblem_Data.add);
	 static By Problemtype=By.id( Addproblem_Data.problemtype);
	 static By Problemarea=By.name( Addproblem_Data.problemarea);
	 static By message=By.name( Addproblem_Data.message);
	 static By name=By.name( Addproblem_Data.name);
	 static By mobile=By.name( Addproblem_Data.mobile);
	 static By register=By.xpath( Addproblem_Data.register);
	 static By country=By.xpath("//*[@id=\"input-country\"]");
	 static By region=By.xpath("//*[@id=\"input-zone\"]");
	 static By in=By.name("agree");
	 static By submit=By.name("Continue");
	 public Addprobleminspects(WebDriver driver)
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
					
			public static WebElement addpro()
			{
				element=driver.findElement(add);
				return element;
			}
			public static Select Type()
			{
				Select select=new Select(driver.findElement(Problemtype));
				return select;
			}
			public static WebElement  area()
			{
				element= driver.findElement(Problemarea);
				return element;
			}
			public static WebElement  msg()
			{
				element= driver.findElement(message);
				return element;
			}
			
			public static WebElement  nme()
			{
				element= driver.findElement(name);
				return element;
			}
			public static WebElement  mbl()
			{
				element= driver.findElement(mobile);
				return element;
			}
			public static WebElement  reg()
			{
				element= driver.findElement(register);
				return element;
			}
			public static WebElement  Country()
			{
				element= driver.findElement(country);
				return element;
			}
			public static WebElement Region()
			{
				element= driver.findElement(region);
				return element;
			}
			public static WebElement In()
			{
				element= driver.findElement(in);
				return element;
			}
			public static WebElement Submit()
			{
				element= driver.findElement(submit);
				return element;
			}
			
}
