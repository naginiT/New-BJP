package Actions;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import Objects.ViewConstitutionInspect;
import Values.ViewConstitutionValues;
import Objects.Browsercode;
/* author Gopi Kuncham
 * Sheet name-----Viewconstitution 
*TC_001
*TC_002
*TC_003
*TC_004
*/
public class ViewConstitutionActions {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	static XSSFCell cell;
	
public static void viewConstitution() throws Exception{
	ViewConstitutionInspect.admin().click();
	
	File f1=new File(ViewConstitutionValues.fil);
	FileInputStream fis=new FileInputStream(f1);
	workbook =new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(ViewConstitutionValues.c);

	System.out.println("sheet.getLastRowNum()"+sheet.getLastRowNum());
	for(int j=ViewConstitutionValues.a; j<=ViewConstitutionValues.c; j++) {
		 cell =sheet.getRow(j).getCell(ViewConstitutionValues.a);
		 ViewConstitutionInspect.adminuser().sendKeys(cell.getStringCellValue());
		 cell =sheet.getRow(j).getCell(ViewConstitutionValues.b);
		 ViewConstitutionInspect.adminpass().sendKeys(cell.getStringCellValue());
		 ViewConstitutionInspect.adminlogin().click();
	 
	 try {
			
		 String s2 =Browsercode.driver.findElement(By.xpath("//*[@id=\"link-effect-2\"]/ul/li[2]/a")).getText();
		 System.out.println("text" +s2);
		 String s3="ADD CONSTITUTION";
		 if (s2.equalsIgnoreCase(s3)) {
			 ViewConstitutionInspect.viewconstitution().click();
			 ViewConstitutionInspect.kukatpally().click();
			 ViewConstitutionInspect.manjeera().click();
			 ViewConstitutionInspect.delete().click();
			 ViewConstitutionInspect.logout().click();
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
