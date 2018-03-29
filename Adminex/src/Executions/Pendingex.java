package Executions;

import org.testng.annotations.Test;

import Actions.Pending_Problems;
import Objects.Browsercode;

public class Pendingex {
	@Test
	public void Signin() throws Exception
	{
		
		Thread.sleep(5000);
		Browsercode.Browserc();
		Thread.sleep(5000);
	    Pending_Problems.Logins();
	    Browsercode.Close();
		
	}

}
