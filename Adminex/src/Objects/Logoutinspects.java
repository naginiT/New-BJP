package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Actions.Logout_data;
import Objects.Browsercode;

public class Logoutinspects extends Browsercode {
	static WebElement element=null;
	static By click=By.id(Logout_data.id);
	 static By username=By.name(Logout_data.username); 
	 static By pass=By.name(Logout_data.password);
	 static By login=By.xpath(Logout_data.login);
	static By logout=By.xpath(Logout_data.logout);
	static By log=By.xpath(Logout_data.loginpage);
	public Logoutinspects(WebDriver driver)
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
 
 public static WebElement Logout()
	{
		 element = driver.findElement(logout);
		return element;
	}
 public static WebElement Log()
	{
		 element = driver.findElement(log);
		return element;
	}

}
