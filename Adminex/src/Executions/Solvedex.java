package Executions;

import org.testng.annotations.Test;

import Actions.Solved_Problems;
import Objects.Browsercode;

public class Solvedex {
	@Test
	public void Signin() throws Exception
	{
		
		Thread.sleep(5000);
		Browsercode.Browserc();
		Thread.sleep(5000);
	    Solved_Problems.Logins();
		
	    Browsercode.Close();
	}

}
