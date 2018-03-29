package Actions;

import Objects.Pendinginspects;


/* Author--- Naga Prasad
 * 
 * Sheet Name--- View division problemsPROBLEM PENDING IN DIV 
 * 
 * Tc_001 --- 
 * Tc_002 ---
 * Tc_003 ---
 * 
 * 
 * 
 * 
 */


public class Pending_Problems {
	public static void Logins() throws Exception{
		Thread.sleep(5000);
		Pendinginspects.Click().click();
		Thread.sleep(5000);
		Pendinginspects.Username().sendKeys(Pendingproblems_Data.username1);
		Pendinginspects.Pass().sendKeys(Pendingproblems_Data.password1);
			Thread.sleep(5000);
			Pendinginspects.Login().click();
			Pendinginspects.Viewproblem().click();
			Thread.sleep(5000);
			Pendinginspects.Division().click();
			Thread.sleep(5000);
			Pendinginspects.Constitution().click();
			Thread.sleep(10000);
			Pendinginspects.Pending().click();
			Thread.sleep(5000);
			Pendinginspects.Update().click();
			

}
}