package Action;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.Inspect;
import Objects.Viewdivisioninspects;



/* Author--- Naga Prasad
 * 
 * Sheet Name--- View Divisions
 * 
 * Tc_001 --- 
 * Tc_002-----
 * 
 * 
 * 
 * 
 * 
 */

public class Viewdivision {
	static XSSFWorkbook wb;
    static XSSFSheet sh;
    static XSSFCell cell;
    
    public static void Logins() throws Exception{
    	
    	   
    	    
    	    
    	    File f=new File(Viewdivision_Data.sheet);
    		FileInputStream fi=new FileInputStream(f);
    		wb =new XSSFWorkbook(fi);
    		sh= wb.getSheetAt(27);
    		for(int i=1;i<=sh.getLastRowNum();i++)
    		{
    			try
    			{
    			 Viewdivisioninspects.Click().click();
    			cell =sh.getRow(i).getCell(1);
    			 Viewdivisioninspects.Username().sendKeys(cell.getStringCellValue());
    			cell =sh.getRow(i).getCell(2);
    			 Viewdivisioninspects.Pass().sendKeys(cell.getStringCellValue());
    			 Viewdivisioninspects.Login().click();
    			
    			Thread.sleep(5000);
    			 Viewdivisioninspects.Viewdivision().click();
    			 Thread.sleep(5000);
    			 Viewdivisioninspects.Profile().click();
    			 
    			 Viewdivisioninspects.Logout().click();

}
    			catch (Exception exp) {
    				 Viewdivisioninspects.Loginpage().click();
    				
    			}
    		}
    }
}
