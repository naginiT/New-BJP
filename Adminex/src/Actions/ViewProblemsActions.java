package Actions;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import Objects.Browsercode;
import Objects.ViewProblemsInspect;
import Values.ViewProblemsValues;
/* author Gopi Kuncham
 * Sheet name-----viewproblems 
 * Sheet name-----Problems in each division 
*TC_001
*TC_002
*TC_003
*TC_004
*TC_005
*TC_006
*
*/
public class ViewProblemsActions {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	static XSSFCell cell;
	
public static void viewProblemsInspect() throws Exception{
	ViewProblemsInspect.admin().click();
	
	File f1=new File(ViewProblemsValues.fil);
	FileInputStream fis=new FileInputStream(f1);
	workbook =new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(ViewProblemsValues.c);

	System.out.println("sheet.getLastRowNum()"+sheet.getLastRowNum());
	for(int j=ViewProblemsValues.a; j<=ViewProblemsValues.c; j++) {
		 cell =sheet.getRow(j).getCell(ViewProblemsValues.a);
		 ViewProblemsInspect.adminuser().sendKeys(cell.getStringCellValue());
		 cell =sheet.getRow(j).getCell(ViewProblemsValues.b);
		 ViewProblemsInspect.adminpass().sendKeys(cell.getStringCellValue());
		 ViewProblemsInspect.adminlogin().click();
	 
	 try {
			
		 String s2 =Browsercode.driver.findElement(By.xpath(ViewProblemsValues.addcon)).getText();
		 System.out.println("text" +s2);
		 String s3="ADD CONSTITUTION";
		 if (s2.equalsIgnoreCase(s3)) {
			 ViewProblemsInspect.viewproblems().click();
			 ViewProblemsInspect.kukatpally().click();
			 ViewProblemsInspect.manjeera().click();
			 ViewProblemsInspect.pendingproblems().click();
			 ViewProblemsInspect.logout().click();
}
		 else {
			 Browsercode.driver.close();
		 }
}
	 catch (Exception e) {
		 
		System.out.println(e);
		
		
	}
}
}
}
