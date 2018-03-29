package Executions;

import org.testng.annotations.Test;

import Actions.AddDivisionActions;
import Objects.Browsercode;
/* author Gopi Kuncham
 * Sheet name-----Adddivision 
*TC_001
*TC_002
*TC_003
*TC_004
*/
public class AddDivisionExecution {
	@Test
	public void Signin() throws Exception
	{
	Thread.sleep(5000);
	Browsercode.Browserc();
	AddDivisionActions.addDivision();
	Browsercode.Close();
	}


}
