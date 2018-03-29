package Action;

import java.io.File;

/* Author--- Naga Prasad
 * 
 * Sheet Name--- Add Problem
 * 
 * Tc_001 --- 
 * Tc 002---
 * Tc 003---
 * Tc 004---
 * 
 * 
 * 
 * 
 */
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.Addprobleminspects;



public class Addproblem {
	static XSSFWorkbook wb;
    static XSSFSheet sh;
    static XSSFCell cell;
    public static void Logins() throws Exception{
    	Addprobleminspects.Clik().click();
    	Thread.sleep(5000);
    	Addprobleminspects.User().sendKeys(Addproblem_Data.user1);
    	Addprobleminspects.pass().sendKeys(Addproblem_Data.pass1);
    	System.out.println("change");
    	System.out.println("change1");
		Thread.sleep(5000);
		Addprobleminspects.login().click();
    	File f=new File("E:\\BJP Excel1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		wb =new XSSFWorkbook(fi);
		sh= wb.getSheetAt(Addproblem_Data.sheetno);
		for(int i=Addproblem_Data.num1;i<=sh.getLastRowNum();i++)
		{
			Addprobleminspects.addpro().click();
			/*cell =sh.getRow(i).getCell(3);
				
			Inspect.Type().selectByVisibleText(cell.getStringCellValue());
			*/
			try {
				
				cell =sh.getRow(i).getCell(Addproblem_Data.num3);
					
				Addprobleminspects.Type().selectByVisibleText(cell.getStringCellValue());
				
				Addprobleminspects.Type().selectByValue(cell.getStringCellValue());	
				cell =sh.getRow(i).getCell(Addproblem_Data.num4);
				Addprobleminspects.area().sendKeys(cell.getStringCellValue());
				 cell =sh.getRow(i).getCell(Addproblem_Data.num5);
				 Addprobleminspects. msg().sendKeys(cell.getStringCellValue());
				 cell =sh.getRow(i).getCell(Addproblem_Data.num6);
				 Addprobleminspects. nme().sendKeys(cell.getStringCellValue());
				 cell =sh.getRow(i).getCell(Addproblem_Data.num7);
				 if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
				    {
				       int h =(int)cell.getNumericCellValue();
				         String l=String.valueOf(h);
				    
				                     Thread.sleep(5000);
				                     Addprobleminspects.mbl().sendKeys(l);
				                     
				    }
				        
				else  {
				        //Inspect.mbl().sendKeys(cell.getStringCellValue());
				}
				 Thread.sleep(5000);
				 Addprobleminspects.reg().click();
			}
			catch (Exception exp){
			Thread.sleep(5000);
			//Inspect.Type().selectByIndex(cell.getStringCellValue());
			
			cell =sh.getRow(i).getCell(Addproblem_Data.num4);
			Addprobleminspects.area().sendKeys(cell.getStringCellValue());
			 cell =sh.getRow(i).getCell(Addproblem_Data.num5);
			 Addprobleminspects. msg().sendKeys(cell.getStringCellValue());
			 cell =sh.getRow(i).getCell(Addproblem_Data.num6);
			 Addprobleminspects. nme().sendKeys(cell.getStringCellValue());
			 cell =sh.getRow(i).getCell(Addproblem_Data.num7);
			 if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
			    {
			       int h =(int)cell.getNumericCellValue();
			         String l=String.valueOf(h);
			                     Thread.sleep(5000);
			                     Addprobleminspects.mbl().sendKeys(l);
			                     
			                     
			                     
			     }
			else  {
			        //Inspect.mbl().sendKeys(cell.getStringCellValue());
			}
			 Thread.sleep(5000);
			 Addprobleminspects.reg().click();	 
			 
		}
		}
		Addprobleminspects.reg().click();
		
}
}
