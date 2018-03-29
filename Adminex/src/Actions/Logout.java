package Actions;

import Objects.Logoutinspects;


/* Author--- Naga Prasad
 * 
 * Sheet Name--- LOG OUT 
 * 
 * Tc_001 --- 
 * 
 * 
 * 
 * 
 */

public class Logout {
	public static void Logins() throws Exception{
	Logoutinspects.Click().click();
	Thread.sleep(5000);
	Logoutinspects.Username().sendKeys(Logout_data.username1);
	Logoutinspects.Pass().sendKeys(Logout_data.password1);
		Thread.sleep(5000);
		Logoutinspects.Login().click();
		Thread.sleep(5000);
		Logoutinspects.Logout().click();
		Thread.sleep(5000);
		Logoutinspects.Log().click();

}
}