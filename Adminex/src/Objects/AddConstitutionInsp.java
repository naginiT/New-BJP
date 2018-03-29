package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Values.AddConstitutionValues;
/* author Gopi Kuncham
 * Sheet name-----AddConstitution 
*TC_001
*TC_002
*TC_003
*TC_004
*TC_005
*TC_006
*TC_007
*TC_008
*
*/
public class AddConstitutionInsp extends Browsercode{
	static WebElement element;

	static By admin=By.id(AddConstitutionValues.admi);
	static By adminuser=By.xpath(AddConstitutionValues.adminuse);
	static By adminpass=By.name(AddConstitutionValues.adminpas);
	static By adminlogin=By.xpath(AddConstitutionValues.adminlogi);

	static By addconstitution=By.xpath(AddConstitutionValues.addconstitutio);
	static By constitution=By.xpath(AddConstitutionValues.constitutio);
	//static By division=By.name("divisionname");
	static By firstname=By.name(AddConstitutionValues.firstnam);
	static By lastname=By.name(AddConstitutionValues.lastnam);
	static By username=By.name(AddConstitutionValues.usernam);
	static By password=By.name(AddConstitutionValues.passwor);
	static By email=By.name(AddConstitutionValues.emai);
	static By mobile=By.name(AddConstitutionValues.mobil);
	static By gender=By.xpath(AddConstitutionValues.gende);
	static By register=By.xpath(AddConstitutionValues.registe);
	static By logout=By.xpath(AddConstitutionValues.logou);
	public AddConstitutionInsp(WebDriver driver)
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

	public static WebElement addconstitution()
	{
	element= driver.findElement(addconstitution);
	return element;
	}
	public static WebElement  constitution()
	{
	element=driver.findElement(constitution);
	return element;
	}
	/*public static WebElement division()
	{
	element=driver.findElement(division);
	return element;
	}*/
	public static WebElement firstname()
	{
	element=driver.findElement(firstname);
	return element;
	}
	public static WebElement lastname()
	{
	element=driver.findElement(lastname);
	return element;
	}
	public static WebElement username()
	{
	element=driver.findElement(username);
	return element;
	}
	public static WebElement password()
	{
	element=driver.findElement(password);
	return element;
	}
	public static WebElement email()
	{
	element=driver.findElement(email);
	return element;
	}
	public static WebElement mobile()
	{
	element=driver.findElement(mobile);
	return element;
	}
	public static Select gender()
	{
		Select s=new Select(element=driver.findElement(gender));
	    return s;
	}
	public static WebElement register()
	{
	element=driver.findElement(register);
	return element;
	}
	public static WebElement logout()
	{
	element=driver.findElement(logout);
	return element;
	}
}
