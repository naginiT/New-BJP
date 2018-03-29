package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Action.Viewprofile_Data;

public class Viewprofileinspects extends Browserc{
	static WebElement element=null;
	static By Cli=By.id(Viewprofile_Data.id);
	 static By username=By.name(Viewprofile_Data.username); 
	 static By pass=By.name(Viewprofile_Data.password);
	 static By logi=By.xpath(Viewprofile_Data.login);
	 static By Viewprofile=By.xpath(Viewprofile_Data.viewprofile);
		static By Cname=By.name(Viewprofile_Data.cname);
		static By Clname=By.name(Viewprofile_Data.lname);
		static By Cusername=By.name(Viewprofile_Data.cusername);
		static By Cpassword=By.name(Viewprofile_Data.cpass);
		static By Cemail=By.name(Viewprofile_Data.email);
		static By Cmobile=By.name(Viewprofile_Data.mobile);
		static By Cupdate=By.xpath(Viewprofile_Data.update);
		static By Cgender=By.name(Viewprofile_Data.gender);
		public Viewprofileinspects(WebDriver driver)
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
			public static WebElement  profile()
			{
				element= driver.findElement(Viewprofile);
				return element;
			}
			 public static WebElement  Coname()
				{
					element= driver.findElement(Cname);
					return element;
				}
			 public static WebElement  Colname()
				{
					element= driver.findElement(Clname);
					return element;
				}
			 public static WebElement  Cousername()
				{
					element= driver.findElement(Cusername);
					return element;
				}
			 public static WebElement  Copassword()
				{
					element= driver.findElement(Cpassword);
					return element;
				}
			 public static WebElement  Coemail()
				{
					element= driver.findElement(Cemail);
					return element;
				}
			 public static WebElement  Comobile()
				{
					element= driver.findElement(Cmobile);
					return element;
				}
			 public static Select Cogender()
				{
					Select select=new Select(driver.findElement(Cgender));
					return select;
				}
			 public static WebElement Coupdate()
				{
					element= driver.findElement(Cupdate);
					return element;
				}
				

}
