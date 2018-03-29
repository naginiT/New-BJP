package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Values.ViewProblemsValues;
/* author Gopi Kuncham
 * Sheet name-----viewproblems 
 * Sheet name-----Problems in each division 
*TC_001
*TC_002
*TC_003
*TC_004
*TC_005
*TC_006
*
*/
public class ViewProblemsInspect  extends Browsercode{
	
		static WebElement element;

		static By admin=By.id(ViewProblemsValues.admi);
		static By adminuser=By.xpath(ViewProblemsValues.adminuse);
		static By adminpass=By.name(ViewProblemsValues.adminpas);
		static By adminlogin=By.xpath(ViewProblemsValues.adminlogi);

		static By viewproblems=By.xpath(ViewProblemsValues.viewpro);
		static By kukatpally=By.xpath(ViewProblemsValues.kukatpall);
		static By manjeera=By.xpath(ViewProblemsValues.manjeer);
		static By pendingproblems=By.xpath(ViewProblemsValues.pendingproblem);
		static By logout=By.xpath(ViewProblemsValues.logou);
		public ViewProblemsInspect(WebDriver driver)
		{
			super();
		}

		public static WebElement admin()
		{
		element= driver.findElement(admin);
		return element;
		}
		public static WebElement adminuser()
		{
		element= driver.findElement(adminuser);
		return element;
		}
		public static WebElement  adminpass()
		{
		element=driver.findElement(adminpass);
		return element;
		}
		public static WebElement adminlogin()
		{
		element=driver.findElement(adminlogin);
		return element;
		}

		public static WebElement viewproblems()
		{
		element= driver.findElement(viewproblems);
		return element;
		}
		public static WebElement kukatpally()
		{
		element= driver.findElement(kukatpally);
		return element;
		}
		public static WebElement manjeera()
		{
		element=driver.findElement(manjeera);
		return element;
		}
		public static WebElement pendingproblems()
		{
		element=driver.findElement(pendingproblems);
		return element;
		}
		
		public static WebElement logout()
		{
		element=driver.findElement(logout);
		return element;
		}
		
		
	}


