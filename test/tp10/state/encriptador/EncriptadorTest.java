package tp10.state.encriptador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import unq.edu.ar.po2.tp10.state.encriptador.EncriptadorConVocales;
import unq.edu.ar.po2.tp10.state.encriptador.EncriptadorNaive;

public class EncriptadorTest {

	EncriptadorNaive encriptador;
	EncriptadorConVocales state;
	String A;

	@Before
	public void setUp() throws Exception {
		encriptador = new EncriptadorNaive(state);
		state = mock(EncriptadorConVocales.class);
		encriptador = new EncriptadorNaive(state);
	}

	@Test
	public void testDoubleEncriptar() {
		// Exercise
		when(encriptador.encriptar(A)).thenReturn("Encriptado");

		// Verify
		assertTrue(encriptador.encriptar(A).equals("Encriptado"));
	}
	
	/**
	 * Utilizo el == para comparar strings por un error en el mensaje equals.
	 */
	@Test
	public void testDesencriptarDouble() {
		// Exercise
				when(encriptador.desencriptar("Encriptado")).thenReturn(A);

				// Verify
				assertTrue(encriptador.desencriptar("Encriptado") == A); 
	}
}
