package Action;

import Objects.Viewprobleminspects;

/* Author--- Naga Prasad
 * 
 * Sheet Name--- View Problem
 * 
 * Tc_001 --- 
 * 
 * 
 * 
 * 
 */


public class Viewproblems {
	
	public static void Logins() throws Exception{
		Viewprobleminspects.Clik().click();
		Thread.sleep(5000);
		Viewprobleminspects.User().sendKeys( Viewproblems_Data.user1);
		Viewprobleminspects.pass().sendKeys( Viewproblems_Data.pass1);
		Thread.sleep(5000);
		Viewprobleminspects.login().click();
		Thread.sleep(5000);
		Viewprobleminspects.viewp().click();
}
}
