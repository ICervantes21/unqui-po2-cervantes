package tp5.streamsYEnums;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import unq.edu.ar.po2.tp5.streamsYEnums.Lesi�n;

public class Lesi�nTest {

	// SUT
	Lesi�n lesi�n;

	@Before
	public void setUp() throws Exception {
		lesi�n = Lesi�n.Rojo;

	}

	@Test
	public void testEnum() {
		// Exercise.
		int riesgo = lesi�n.nivelDeRiesgo;
		String descripci�n = lesi�n.descripci�n;
		
		// Verify.
		assertEquals(Lesi�n.Gris, lesi�n.siguienteLesi�n());
		assertEquals(4, riesgo);
		assertEquals("Lesi�n de piel color roja", descripci�n);
	}

}
