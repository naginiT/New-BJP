package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Values.indexValues;
/* author Gopi Kuncham
 * Sheet name-----Index
*TC_001
*TC_002
*
*/

public class IndexInspectElements  extends Browsercode {
	static WebElement element;

	static By loginpage=By.xpath(indexValues.loginpag);
	static By adminstrator=By.xpath(indexValues.adminstrato);
	static By constitution=By.xpath(indexValues.constitutio);
	static By division=By.xpath(indexValues.divisio);
	
	public IndexInspectElements(WebDriver driver)
	{
		super();
	}

	public static WebElement loginpage()
	{
		element= driver.findElement(loginpage);
	return element;
	}
	public static WebElement adminstrator()
	{
	element= driver.findElement(adminstrator);
	return element;
	}
	public static WebElement  constitution()
	{
	element=driver.findElement(constitution);
	return element;
	}
	public static WebElement division()
	{
	element=driver.findElement(division);
	return element;
	} 

}
