package Execution;

import org.testng.annotations.Test;

import Action.Home;
import Objects.Browser;

public class Homeex {
	@Test
	public void Signin() throws Exception
	{
		
		Thread.sleep(5000);
		Browser.Browserc();
		Thread.sleep(5000);
		Home.Logins();
		Browser.Close();
	}
}
