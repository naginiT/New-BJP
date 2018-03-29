package Execution;

import org.testng.annotations.Test;

import Action.Login;
import Action.Viewdivision;
import Objects.Browser;

public class Viewdivisionex {
	@Test
	public void Signin() throws Exception
	{
		
		Thread.sleep(5000);
		Browser.Browserc();
		Thread.sleep(5000);
		Viewdivision.Logins();
		Browser.Close();
		
	}
}
