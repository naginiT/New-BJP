package Execution;

import org.testng.annotations.Test;


import Action.Logout;
import Objects.Browserc;

public class Logoutex {
	@Test
	public void Signin() throws Exception
	{
		
		Thread.sleep(5000);
		Browserc.Browsercode();
		Thread.sleep(5000);
		//Login.Logins();
	//Addproblem.Logins();	
		Logout.Logins();
		Browserc.Close();
	}

}
