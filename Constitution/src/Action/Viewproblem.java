package Action;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.Inspect;
import Objects.Viewprobleminspects;





/* Author--- Naga Prasad
 * 
 * Sheet Name--- View Problem
 * 
 * Tc_001 --- 
 * 
 * 
 * 
 * 
 * 
 */


public class Viewproblem extends Viewproblems_Data {
	static XSSFWorkbook wb;
    static XSSFSheet sh;
    static XSSFCell cell;
    
    public static void Logins() throws Exception{
    	
    	   
    	    
    	    
    	    File f=new File(Viewproblems_Data.sheet);
    		FileInputStream fi=new FileInputStream(f);
    		wb =new XSSFWorkbook(fi);
    		sh= wb.getSheetAt(Viewproblems_Data.sheetno);
    		for(int i=1;i<=sh.getLastRowNum();i++)
    		{
    			try
    			{
    			 Viewprobleminspects.Click().click();
    			cell =sh.getRow(i).getCell(Viewproblems_Data.Num1);
    			Viewprobleminspects.Username().sendKeys(cell.getStringCellValue());
    			cell =sh.getRow(i).getCell(Viewproblems_Data.Num2);
    			Viewprobleminspects.Pass().sendKeys(cell.getStringCellValue());
    			Viewprobleminspects.Login().click();
    			Viewprobleminspects.Viewproblem().click();
    			Viewprobleminspects.Problemsineachdivision().click();
        		Thread.sleep(5000);
        		Viewprobleminspects.Logout().click();

                   }
    			catch (Exception exp) {
    				Viewprobleminspects.Loginpage().click();
    				
    			}
    		}
    }
}
