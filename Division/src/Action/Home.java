package Action;

import Objects.Homeinspects;



/* Author--- Naga Prasad
 * 
 * Sheet Name--- Division Home
 * 
 * Tc_001 --- 
 * 
 * 
 * 
 * 
 */

public class Home {
	public static void Logins() throws Exception{
		Thread.sleep(5000);
		Homeinspects.Clik().click();
		Thread.sleep(5000);
		System.out.println("enter");
		/*Homeinspects.User().sendKeys(Home_Data.user1);
		Homeinspects.pass().sendKeys(Home_Data.pass1);*/
		Homeinspects.User().sendKeys("xyz");
		Homeinspects.pass().sendKeys("xyz");
		Thread.sleep(5000);
		Homeinspects.login().click();

}
}
