package tp4;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.edu.ar.po2.tp4.Producto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



public class ProductoTest {
	
	 private Producto arroz;
	 private Producto vino;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		vino = new Producto("Vino", 55d, false);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(18.9, arroz.getPrecio(), 0);
		assertTrue(arroz.esPrecioCuidado);
		
		assertEquals("Vino", vino.getNombre());
		assertEquals(55, vino.getPrecio(), 0);
		assertFalse(vino.esPrecioCuidado);
	
	}
	
	@Test
	public void testAumentarPrecio() {
		arroz.aumentarPrecio(1.5);
		assertEquals(20.4, arroz.getPrecio(), 0);
	}
}
