package Execution;

import org.testng.annotations.Test;

import Action.Viewprofile;
import Objects.Browserc;



public class Viewprofileex {
	@Test
	public void Signin() throws Exception
	{
		Thread.sleep(5000);
		Browserc.Browsercode();
		Viewprofile.Logins();
		Browserc.Close();
		
		
	}


}
