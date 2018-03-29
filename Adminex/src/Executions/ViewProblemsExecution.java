package Executions;

import org.testng.annotations.Test;

import Actions.ViewConstitutionActions;
import Objects.Browsercode;
/* author Gopi Kuncham
 * Sheet name-----viewproblems 
 * Sheet name-----Problems in each division 
*TC_001
*TC_002
*TC_003
*TC_004
*TC_005
*TC_006
*
*/
public class ViewProblemsExecution {
	@Test
	public void problems() throws Exception 
	{

	Browsercode.Browserc();
	ViewConstitutionActions.viewConstitution();
	Browsercode.Close();
	}
}
