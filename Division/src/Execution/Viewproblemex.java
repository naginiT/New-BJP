package Execution;

import org.testng.annotations.Test;


import Action.Viewproblems;
import Objects.Browserc;

public class Viewproblemex {
	@Test
	public void Signin() throws Exception
	{
		
		Thread.sleep(5000);
		Browserc.Browsercode();
		Thread.sleep(5000);
		//Login.Logins();
	Viewproblems.Logins();	
	Browserc.Close();
	}


}






