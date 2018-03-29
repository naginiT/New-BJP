package Execution;

import org.testng.annotations.Test;

import Action.Addproblem;
import Action.Home;
import Objects.Browserc;

public class Addproblemex {
	@Test
	public void Signin() throws Exception
	{
		
		Thread.sleep(5000);
		Browserc.Browsercode();
		Thread.sleep(5000);
		//Login.Logins();
	Addproblem.Logins();
	Browserc.Close();
	}


}
