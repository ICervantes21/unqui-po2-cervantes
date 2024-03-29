package tp3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import unq.edu.ar.po2.tp3.Multioperador;

public class MultioperadorTest {
	Multioperador multioperador = new Multioperador();
	
	
	@Before
	public void setUp() throws Exception {
		multioperador.addNumber(5);
		multioperador.addNumber(5);
		multioperador.addNumber(5);
		multioperador.addNumber(5);
		multioperador.addNumber(5);
		multioperador.addNumber(5);
		multioperador.addNumber(5);
		multioperador.addNumber(5);
	}
	
	@Test
	public void testSuma() {
		assertEquals(40, multioperador.sumarLosEnteros());
	}
	
	@Test
	public void testResta() {
		assertEquals((-40), multioperador.restarLosEnteros());
	}
	
	@Test
	public void testMultiplicación() {
		assertEquals(390625, multioperador.multiplicarLosEnteros());
	}

}
