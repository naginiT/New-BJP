package Action;

import Objects.Logoutinspects;

/* Author--- Naga Prasad
 * 
 * Sheet Name--- DIVISION LOGOUT
 * 
 * Tc_001 --- 
 * 
 * 
 * 
 * 
 */


public class Logout {
	public static void Logins() throws Exception{
		Thread.sleep(5000);
		Logoutinspects .Clik().click();
		Thread.sleep(5000);
		Logoutinspects .User().sendKeys(Logout_Data.user1);
		Logoutinspects .pass().sendKeys(Logout_Data.pass1);
			Thread.sleep(5000);
			Logoutinspects .login().click();
			Thread.sleep(5000);
			Logoutinspects .logot().click();
}
}
