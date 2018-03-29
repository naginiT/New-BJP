package Execution;

import org.testng.annotations.Test;


import Action.Viewproblem;
import Objects.Browser;

public class Viewproblemex {
	@Test
	public void Signin() throws Exception
	{
		
		Thread.sleep(1000);
		Browser.Browserc();
		Thread.sleep(1000);
		Viewproblem.Logins();
		Browser.Close();
		
	}

}
