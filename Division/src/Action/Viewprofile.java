package Action;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.Viewprofileinspects;



/* Author--- Naga Prasad
 * 
 * Sheet Name--- DIV HEAD PROFILE
 * 
 * Tc_001 --- 
 * Tc_002---
 * Tc_003---
 * Tc_004---
 * Tc_005---
 * Tc_006---
 * Tc_007---
 * 
 * 
 * 
 * 
 */

public class Viewprofile extends Addproblem {
	
	
	static XSSFWorkbook w;
    static XSSFSheet s;
    static XSSFCell cel;
public static void Logins () throws Exception{
	Viewprofileinspects.Clik().click();
	Thread.sleep(5000);
	Viewprofileinspects.User().sendKeys(Viewprofile_Data.user1);
	Viewprofileinspects.pass().sendKeys(Viewprofile_Data.pass1);
	Thread.sleep(5000);
	Viewprofileinspects.login().click();
	File f=new File(Viewprofile_Data.s);
	FileInputStream fi=new FileInputStream(f);
	w =new XSSFWorkbook(fi);
	s= w.getSheetAt(Viewprofile_Data.sheetno);
	//for(int j=1;j<=sh.getLastRowNum();j++)
	for(int j=Viewprofile_Data.num1;j<=Viewprofile_Data.num2;j++)
	{
		Thread.sleep(5000);
		Viewprofileinspects.profile().click();
		Viewprofileinspects.Coname().clear();
		Viewprofileinspects.Colname().clear();
		Viewprofileinspects.Cousername().clear();
		Viewprofileinspects.Copassword().clear();
		Viewprofileinspects.Coemail().clear();
		Viewprofileinspects.Comobile().clear();
		//Inspect.Cogender().deselectAll();
		cel =s.getRow(j).getCell(Viewprofile_Data.num5);
		Viewprofileinspects.Coname().sendKeys(cel.getStringCellValue());
		 cel =s.getRow(j).getCell(Viewprofile_Data.num6);
		 
		 Viewprofileinspects.Colname().sendKeys(cel.getStringCellValue());
		 cel =s.getRow(j).getCell(Viewprofile_Data.num7);
		 Viewprofileinspects.Cousername().sendKeys(cel.getStringCellValue());
		 cel =s.getRow(j).getCell(Viewprofile_Data.num8);
		 Viewprofileinspects.Copassword().sendKeys(cel.getStringCellValue());
		 cel =s.getRow(j).getCell(Viewprofile_Data.num9);
		 Viewprofileinspects.Coemail().sendKeys(cel.getStringCellValue());
		 cel =s.getRow(j).getCell(Viewprofile_Data.num10);
		 if(cel.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
		    {
			 int k =(int)cel.getNumericCellValue();
	         String p=String.valueOf(k);
	    
	                     Thread.sleep(5000);
	                     Viewprofileinspects.Comobile().sendKeys(p);
		                     
		    }
		        
		else  {
		        //Inspect.mbl().sendKeys(cell.getStringCellValue());
			Viewprofileinspects.Comobile().sendKeys(cel.getStringCellValue());
		}
		 
		 //Inspect.Comobile().sendKeys(cell.getStringCellValue());
		 cel =s.getRow(j).getCell(Viewprofile_Data.num11);
		 
		 
			
		 Viewprofileinspects.Cogender().selectByVisibleText(cel.getStringCellValue());
			
		 Viewprofileinspects.Cogender().selectByValue(cel.getStringCellValue());
			Thread.sleep(5000);
			Viewprofileinspects.Coupdate().click();
			try {
				cel =s.getRow(j).getCell(Viewprofile_Data.num5);
				Viewprofileinspects.User().sendKeys(cel.getStringCellValue());
				 cel =s.getRow(j).getCell(Viewprofile_Data.num6);
				 Viewprofileinspects.pass().sendKeys(cel.getStringCellValue());
				 Thread.sleep(5000);
				 Viewprofileinspects.login().click();
			}
			catch (Exception exp){
				Viewprofileinspects.profile().click();
			
			}
			//Inspect.profile().click();
			
	}
}
}
