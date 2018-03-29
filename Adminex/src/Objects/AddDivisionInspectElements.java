package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Values.AddConstitutionValues;
import Values.AddDivisionValues;
/* author Gopi Kuncham
 * Sheet name-----Adddivision 
*TC_001
*TC_002
*TC_003
*TC_004
*/
public class AddDivisionInspectElements extends Browsercode {
static WebElement element;

static By admin=By.id(AddDivisionValues.admi);
static By adminuser=By.xpath(AddDivisionValues.adminuse);
static By adminpass=By.name(AddDivisionValues.adminpas);
static By adminlogin=By.xpath(AddDivisionValues.adminlogi);

static By adddivision=By.xpath(AddDivisionValues.adddivisio);
static By constitution=By.xpath(AddDivisionValues.constitutio);
static By division=By.name(AddDivisionValues.divisio);
static By firstname=By.name(AddDivisionValues.firstnam);
static By lastname=By.name(AddDivisionValues.lastnam);
static By username=By.name(AddDivisionValues.usernam);
static By password=By.name(AddDivisionValues.passwor);
static By email=By.name(AddDivisionValues.emai);
static By mobile=By.name(AddDivisionValues.mobil);
static By gender=By.name(AddDivisionValues.gende);
static By register=By.xpath(AddDivisionValues.registe);
static By logout=By.xpath(AddDivisionValues.logou);
static By loginpage=By.xpath(AddDivisionValues.loginpag);
public AddDivisionInspectElements(WebDriver driver)
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

public static WebElement adddivision()
{
element= driver.findElement(adddivision);
return element;
}
public static Select  constitution()
{
	Select s=new Select(driver.findElement(constitution));
return s;
}
public static WebElement division()
{
element=driver.findElement(division);
return element;
}
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
public static WebElement loginpage()
{
element=driver.findElement(loginpage);
return element;
}
}



