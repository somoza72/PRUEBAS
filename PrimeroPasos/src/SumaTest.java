import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {

	   @Test 
	   public void sumaPositivos() { 
	      System.out.println("la suma es"); 
	       Suma S = new Suma(2, 3); 
	       assertTrue(S.Sumar() == 5); 
	   } 
	   @Test 
	   public void sumaNegativos() { 
	       System.out.println("la suma negativa es"); 
	       Suma S = new Suma(-2, -3); 
	       assertTrue(S.Sumar() == -5); 
	   } 
	   @Test 
	   public void sumaPositivoNegativo() { 
	       System.out.println("la suma posi y nega es."); 
	       Suma S = new Suma(2, -3); 
	       assertTrue(S.Sumar() == -1); 
	   }
}
