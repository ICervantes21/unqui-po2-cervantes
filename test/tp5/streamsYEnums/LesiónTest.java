package tp5.streamsYEnums;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import unq.edu.ar.po2.tp5.streamsYEnums.Lesión;

public class LesiónTest {

	// SUT
	Lesión lesión;

	@Before
	public void setUp() throws Exception {
		lesión = Lesión.Rojo;

	}

	@Test
	public void testEnum() {
		// Exercise.
		int riesgo = lesión.nivelDeRiesgo;
		String descripción = lesión.descripción;
		
		// Verify.
		assertEquals(Lesión.Gris, lesión.siguienteLesión());
		assertEquals(4, riesgo);
		assertEquals("Lesión de piel color roja", descripción);
	}

}
