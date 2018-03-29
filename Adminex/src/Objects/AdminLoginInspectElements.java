package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Values.AdminLoginValues;
/* author Gopi Kuncham 
 * Sheet name-----Admin Login Form
 * Sheet name-----Home
*TC_001
*TC_002
*TC_003
*TC_004
*TC_005
*TC_006
*
*/
public class AdminLoginInspectElements extends Browsercode{
	static WebElement element;

	static By admin=By.id(AdminLoginValues.admi);
	static By adminuser=By.xpath(AdminLoginValues.adminuse);
	static By adminpass=By.name(AdminLoginValues.adminpas);
	static By adminlogin=By.xpath(AdminLoginValues.adminlogi);
	static By adminlogout=By.xpath(AdminLoginValues.logou);
	static By addconstitution=By.xpath(AdminLoginValues.addcon);
	public AdminLoginInspectElements(WebDriver driver)
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
	public static WebElement adminlogout()
	{
	element=driver.findElement(adminlogout);
	return element;
	}
	public static WebElement addconstitution()
	{
	element=driver.findElement(addconstitution);
	return element;
	}

}
