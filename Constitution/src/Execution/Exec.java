package Execution;

import org.testng.annotations.Test;

import Action.Login;
import Objects.Browser;

public class Exec {
	@Test
	public void Signin() throws Exception
	{
		
		Thread.sleep(5000);
		Browser.Browserc();
		Thread.sleep(5000);
		Login.Logins();
		
		
	}

}
