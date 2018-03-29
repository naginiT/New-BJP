package Action;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.Inspect;
import Objects.Logoutinspects;



/* Author--- Naga Prasad
 * 
 * Sheet Name--- Logout
 * 
 * Tc_001 --- 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Logout {
	static XSSFWorkbook wb;
	
    static XSSFSheet sh;
    static XSSFCell cell;
    
    public static void Logins() throws Exception{
    	 File f=new File(Logout_Data.sheet);
 		FileInputStream fi=new FileInputStream(f);
 		wb =new XSSFWorkbook(fi);
 		sh= wb.getSheetAt(Logout_Data.sheetno);
 		for(int i=1;i<=sh.getLastRowNum();i++)
 		{
 			try
			{
 			Logoutinspects.Click().click();
			cell =sh.getRow(i).getCell(Logout_Data.num1);
			Logoutinspects.Username().sendKeys(cell.getStringCellValue());
			cell =sh.getRow(i).getCell(Logout_Data.num2);
			Logoutinspects.Pass().sendKeys(cell.getStringCellValue());
			Logoutinspects.Login().click();
			Inspect.Logout().click();
			}
 			catch (Exception exp) {
 				Logoutinspects.Loginpage().click();
				
			}
 			
 		}
    }
}
 			
 				


    

