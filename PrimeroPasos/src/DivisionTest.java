import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void test() {
		Division D = new Division(15, 2); 
	       assertTrue(D.Dividir() == 7.5); 
	
	}

}
