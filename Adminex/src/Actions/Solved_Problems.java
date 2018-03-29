package Actions;

import Objects.Solvedinspects;


/* Author--- Naga Prasad
 * 
 * Sheet Name--- SOLVED PROBLEMS IN  DIV
 * Tc_001 --- 
 * Tc_002 --- 
 * Tc_003 --- 
 * Tc_004 --- 
 * 
 * 
 * 
 * 
 *  
 * 
 */

public class Solved_Problems {                             
	public static void Logins() throws Exception{
		Thread.sleep(5000);
		Solvedinspects.Click().click();
		Thread.sleep(5000);
		Solvedinspects.Username().sendKeys(Solvedproblems_Data.username1);
		Solvedinspects.Pass().sendKeys(Solvedproblems_Data.password1);
			Thread.sleep(5000);
			Solvedinspects.Login().click();
			Solvedinspects.Viewproblem().click();
			Thread.sleep(5000);
			Solvedinspects.Division().click();           
			Solvedinspects.Constitution().click();    
			Thread.sleep(10000);
	
	
			Solvedinspects.Solved().click();
			Solvedinspects.Select().click();
			Solvedinspects.Delete().click();
                                                     
}
}
