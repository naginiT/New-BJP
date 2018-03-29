package Executions;

import org.testng.annotations.Test;

import Actions.AddConstitutionActions;
import Actions.ViewConstitutionActions;
import Objects.Browsercode;
/* author Gopi Kuncham
 * Sheet name-----Viewconstitution  
*TC_001
*TC_002
*TC_003
*TC_004
*/
public class ViewConstitutionExecution {
	@Test
	public void Signin() throws Exception 
	{

	Browsercode.Browserc();
	ViewConstitutionActions.viewConstitution();
	Browsercode.Close();
	}
}

