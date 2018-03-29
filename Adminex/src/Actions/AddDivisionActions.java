package Actions;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import Objects.Browsercode;
import Objects.AddDivisionInspectElements;
import Values.AddConstitutionValues;
import Values.AddDivisionValues;
/* author Gopi Kuncham
 * Sheet name-----adddivision 
*TC_001
*TC_002
*TC_003
*TC_004
*
*/
public class AddDivisionActions {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFSheet sheet1;
	static XSSFCell cell;
	
public static void addDivision() throws Exception{
	AddDivisionInspectElements.admin().click();
	
	File f1=new File(AddDivisionValues.fil);
	FileInputStream fis=new FileInputStream(f1);
	workbook =new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(AddDivisionValues.c);
	sheet1 = workbook.getSheetAt(AddDivisionValues.h);
	System.out.println("sheet.getLastRowNum()"+sheet.getLastRowNum());
	for(int j=AddDivisionValues.a; j<=AddDivisionValues.c; j++) {
		 cell =sheet.getRow(j).getCell(AddDivisionValues.a);
		 AddDivisionInspectElements.adminuser().sendKeys(cell.getStringCellValue());
		 cell =sheet.getRow(j).getCell(AddDivisionValues.b);
		 AddDivisionInspectElements.adminpass().sendKeys(cell.getStringCellValue());
	 AddDivisionInspectElements.adminlogin().click();
	 
	 try {
	
		 String s2 =Browsercode.driver.findElement(By.xpath(AddDivisionValues.addcon)).getText();
		 System.out.println("text" +s2);
		 String s3="ADD CONSTITUTION";
		 if (s2.equalsIgnoreCase(s3)) {
	
	for(int i=AddDivisionValues.a; i<=AddDivisionValues.b; i++) {
		
		AddDivisionInspectElements.adddivision().click();
		 cell =sheet1.getRow(i).getCell(AddDivisionValues.a);
		 AddDivisionInspectElements.constitution().selectByValue(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(AddDivisionValues.b);
		 AddDivisionInspectElements.division().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(AddDivisionValues.c);
		 AddDivisionInspectElements.firstname().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(AddDivisionValues.d);
		 AddDivisionInspectElements.lastname().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(AddDivisionValues.e);
		 AddDivisionInspectElements.username().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(AddDivisionValues.f);
		 AddDivisionInspectElements.password().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(AddDivisionValues.g);
		 AddDivisionInspectElements.email().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(AddDivisionValues.h);
		 
           if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
	    	 int k =(int)cell.getNumericCellValue();
	    		String g=String.valueOf(k);
	    	            System.out.println(g);
	    	            Thread.sleep(5000);
	    	            AddDivisionInspectElements.mobile().sendKeys(g);
	   			   }
	       else {
		                AddDivisionInspectElements.mobile().sendKeys(cell.getStringCellValue());
	         }
           cell =sheet1.getRow(i).getCell(AddDivisionValues.i);
           AddDivisionInspectElements.gender().selectByValue(cell.getStringCellValue());
           Thread.sleep(5000);
           
           AddDivisionInspectElements.register().click();
           System.out.println("clicked on register");
	}
	
	Thread.sleep(5000);
	AddDivisionInspectElements.adddivision().click();
	Thread.sleep(5000);
	AddDivisionInspectElements.register().click();
	Thread.sleep(5000);
	AddDivisionInspectElements.logout().click();
	
		 }
	 }
	
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
		
	 }
	 
	}
	
	
	}
	
	
		
	

	

//}