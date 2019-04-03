import static org.junit.Assert.*;

import org.junit.Test;

public class MultTest {

	@Test
	public void test() {
		Mult M = new Mult(8, 5); 
	       assertTrue(M.Multiplicar() == 40); 
	
	}

}
