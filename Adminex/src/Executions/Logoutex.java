package Executions;

import org.testng.annotations.Test;

import Actions.Logout;
import Objects.Browsercode;

public class Logoutex {
	@Test
	public void Signin() throws Exception
	{
		
		Thread.sleep(5000);
		Browsercode.Browserc();
		Thread.sleep(5000);
	    Logout.Logins();
	    Browsercode.Close();
		
	}
	

}
