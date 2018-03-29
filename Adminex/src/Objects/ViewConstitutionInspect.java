package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Values.ViewConstitutionValues;
/* author Gopi Kuncham
 * Sheet name-----Viewconstitution  
*TC_001
*TC_002
*TC_003
*TC_004
*/
public class ViewConstitutionInspect extends Browsercode {
	static WebElement element;

	static By admin=By.id(ViewConstitutionValues.admi);
	static By adminuser=By.xpath(ViewConstitutionValues.adminuse);
	static By adminpass=By.name(ViewConstitutionValues.adminpas);
	static By adminlogin=By.xpath(ViewConstitutionValues.adminlogi);

	static By viewconstitution=By.xpath(ViewConstitutionValues.viewconstitutio);
	static By kukatpally=By.xpath(ViewConstitutionValues.kukatpall);
	static By manjeera=By.xpath(ViewConstitutionValues.manjeer);
	static By delete=By.xpath(ViewConstitutionValues.delet);
	static By logout=By.xpath(ViewConstitutionValues.logou);
	public ViewConstitutionInspect(WebDriver driver)
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

	public static WebElement viewconstitution()
	{
	element= driver.findElement(viewconstitution);
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
	public static WebElement delete()
	{
	element=driver.findElement(delete);
	return element;
	}
	
	public static WebElement logout()
	{
	element=driver.findElement(logout);
	return element;
	}
	
	
}
