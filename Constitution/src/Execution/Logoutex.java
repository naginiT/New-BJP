package Execution;

import org.testng.annotations.Test;

import Action.Logout;
import Objects.Browser;

public class Logoutex {
	@Test
	public void Signin() throws Exception
	{
		
		Thread.sleep(5000);
		Browser.Browserc();
		Thread.sleep(5000);
		Logout.Logins();
		Browser.Close();
		
	}

}
