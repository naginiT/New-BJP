/*package Action;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Inspect.Inspect;

public class Login {
	static XSSFWorkbook wb;
    static XSSFSheet sh;
    static XSSFCell cell;
    public static void Logins() throws Exception{
    	Thread.sleep(5000);
    	    Inspect.Click().click();
    		Inspect.Username().sendKeys("abc");
    		Inspect.Pass().sendKeys("abc");
    		Thread.sleep(5000);
    		Inspect.Login().click();
    		Inspect.Home().click();
    		Inspect.Viewdivision().click();
    		Inspect.Profile().click();
    		Inspect.Viewproblem().click();
    		Inspect.Problemsineachdivision().click();
    		Inspect.Logout().click();

}
}
*/

package Action;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.Inspect;



/* Author--- Naga Prasad
 * 
 * Sheet Name--- Constitution Login Form 
 * 
 * Tc_001 --- 
 * Tc_002 --- 
 * Tc_003 --- 
 * Tc_004 --- 
 * Tc_005 --- 
 * Tc_006 --- 
 * 
 * 
 * 
 * 
 */

public class Login {
	static XSSFWorkbook wb;
    static XSSFSheet sh;
    static XSSFCell cell;
    
    public static void Logins() throws Exception{
    	
    	   
    	    
    	    
    	    File f=new File("E:\\BJP Excel1.xlsx");
    		FileInputStream fi=new FileInputStream(f);
    		wb =new XSSFWorkbook(fi);
    		sh= wb.getSheetAt(27);
    		for(int i=1;i<=sh.getLastRowNum();i++)
    		{
    			try
    			{
    			 Inspect.Click().click();
    			cell =sh.getRow(i).getCell(1);
    			Inspect.Username().sendKeys(cell.getStringCellValue());
    			cell =sh.getRow(i).getCell(2);
    			Inspect.Pass().sendKeys(cell.getStringCellValue());
    			Inspect.Login().click();
    			Inspect.Home().click();
    			Thread.sleep(5000);
        		Inspect.Viewdivision().click();
        		Inspect.Profile().click();
        		Thread.sleep(5000);
        		Inspect.Viewproblem().click();
        		Inspect.Problemsineachdivision().click();
        		Thread.sleep(5000);
        		Inspect.Logout().click();
    		}
    			catch (Exception exp) {
    				Inspect.Loginpage().click();
    				
    			}
    		    
    		
    		/*Inspect.Username().sendKeys("abc");
    		Inspect.Pass().sendKeys("abc");
    		Thread.sleep(5000);
    		Inspect.Login().click();*/
    		

}
    }
}

