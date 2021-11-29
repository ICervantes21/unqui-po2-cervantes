package tp4;



import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import unq.edu.ar.po2.tp4.ProductoPrimeraNecesidad;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@Before
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
	}
	
	
	
	@Test
	public void testCalcularPrecio() {
	    assertEquals(7.2, leche.getPrecio(0.9), 0);
	}
}
