package Actions;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import Objects.AddConstitutionInsp;
import Objects.Browsercode;
import Values.AddConstitutionValues;
/* author Gopi Kuncham
 * Sheet name-----AddConstitution 
*TC_001
*TC_002
*TC_003
*TC_004
*TC_005
*TC_006
*TC_007
*TC_008
*
*/
public class AddConstitutionActions {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFSheet sheet1;
	static XSSFCell cell;
	
public static void addConstitution() throws Exception{
	Browsercode.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	AddConstitutionInsp.admin().click();
	File f1=new File(AddConstitutionValues.fil);
	FileInputStream fis=new FileInputStream(f1);
	
	workbook =new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(AddConstitutionValues.sheetat);
	sheet1 = workbook.getSheetAt(AddConstitutionValues.sheeta);
	for(int j=AddConstitutionValues.a; j<=sheet.getLastRowNum(); j++) {
		
		 cell =sheet.getRow(j).getCell(AddConstitutionValues.a);
		 AddConstitutionInsp.adminuser().sendKeys(cell.getStringCellValue());
		 cell =sheet.getRow(j).getCell(AddConstitutionValues.b);
		 AddConstitutionInsp.adminpass().sendKeys(cell.getStringCellValue());
	
		 AddConstitutionInsp.adminlogin().click();
		 	
		 try {
				
			 String s2 =Browsercode.driver.findElement(By.xpath(AddConstitutionValues.addcon)).getText();
			 System.out.println("text" +s2);
			 String s3="ADD CONSTITUTION";
			 if (s2.equalsIgnoreCase(s3)) {
	

	for(int i=AddConstitutionValues.a; i<=AddConstitutionValues.b; i++) {
		AddConstitutionInsp.addconstitution().click();
		 cell =sheet1.getRow(i).getCell(AddConstitutionValues.a);
		 AddConstitutionInsp.constitution().sendKeys(cell.getStringCellValue());
		/* cell =sheet.getRow(i).getCell(2);
		 AddConstitutionInsp.division().sendKeys(cell.getStringCellValue());*/
		 cell =sheet1.getRow(i).getCell(AddConstitutionValues.b);
		 AddConstitutionInsp.firstname().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(AddConstitutionValues.c);
		 AddConstitutionInsp.lastname().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(AddConstitutionValues.d);
		 AddConstitutionInsp.username().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(AddConstitutionValues.e);
		 
		 if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
	    	 int k =(int)cell.getNumericCellValue();
	    		String g=String.valueOf(k);
	    	            System.out.println(g);
	    	            
	    	            AddConstitutionInsp.password().sendKeys(g);
	   			   }
	       else {
	    	   AddConstitutionInsp.password().sendKeys(cell.getStringCellValue());
	         }
		 
		 
		 cell =sheet1.getRow(i).getCell(AddConstitutionValues.f);
		 AddConstitutionInsp.email().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(AddConstitutionValues.g);
           if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
	    	 int k =(int)cell.getNumericCellValue();
	    		String g=String.valueOf(k);
	    	            System.out.println(g);
	    	            
	    	            AddConstitutionInsp.mobile().sendKeys(g);
	   			   }
	       else {
	    	   AddConstitutionInsp.mobile().sendKeys(cell.getStringCellValue());
	         }
           cell =sheet1.getRow(i).getCell(AddConstitutionValues.h);
           AddConstitutionInsp.gender().selectByValue(cell.getStringCellValue());
          
           AddConstitutionInsp.register().click();
	}
	
	AddConstitutionInsp.addconstitution().click();
	
	AddConstitutionInsp.register().click();
	AddConstitutionInsp.logout().click();
	}
		 }
		 catch (Exception e) {
			System.out.println("fvDhk");;
		}
	}
	}
	
	
		
	

}	

//}

