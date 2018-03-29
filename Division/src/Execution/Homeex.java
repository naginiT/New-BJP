package Execution;

import org.testng.annotations.Test;

import Action.Home;
import Objects.Browserc;

public class Homeex {
	@Test
	public void Signin() throws Exception
	{
		
		Thread.sleep(5000);
		Browserc.Browsercode();
		
		Thread.sleep(5000);
		//Login.Logins();
	Home.Logins();	
	Browserc.Close();
	}


}
