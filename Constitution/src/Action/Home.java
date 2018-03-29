package Action;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.Homeinspects;
import Objects.Inspect;

/* Author--- Naga Prasad
 * 
 * Sheet Name--- Constitution Home 
 * 
 * Tc_001 --- 
 * Tc_002 --- 
 * 
 * 
 * 
 * 
 * 
 */


public class Home extends Data {
	static XSSFWorkbook wb;
    static XSSFSheet sh;
    static XSSFCell cell;
	public static void Logins() throws Exception{
		
		File f=new File(Data.s);
		FileInputStream fi=new FileInputStream(f);
		wb =new XSSFWorkbook(fi);
		sh= wb.getSheetAt(Data.sheetno);
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			try
			{
		
			 Homeinspects.Click().click();
			cell =sh.getRow(i).getCell(Data.num1);
			Homeinspects.Username().sendKeys(cell.getStringCellValue());
			cell =sh.getRow(i).getCell(Data.num2);
			Homeinspects.Pass().sendKeys(cell.getStringCellValue());
			Homeinspects.Login().click();
			Homeinspects.Home().click();
			System.out.println("hi");
			System.out.println("test");
			
			Homeinspects.Logout().click();
			
			}
			
			catch (Exception exp) {
				
				Homeinspects.Loginpage().click();
				
				
				
			}

}
}
}