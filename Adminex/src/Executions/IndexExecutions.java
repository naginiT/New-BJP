package Executions;

import org.testng.annotations.Test;

import Actions.IndexActions;
import Objects.Browsercode;
/* author Gopi Kuncham
 * Sheet name-----Index 
*TC_001
*TC_002
*
*/
public class IndexExecutions {

	@Test
	public void indexEx() throws Exception {
		Thread.sleep(5000);
		Browsercode.Browserc();
		IndexActions.index();
		Browsercode.Close();
		
	}
	
}

