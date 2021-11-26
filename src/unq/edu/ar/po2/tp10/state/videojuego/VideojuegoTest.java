package unq.edu.ar.po2.tp10.state.videojuego;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VideojuegoTest {

	Videojuego game;
	Estado state;

	@BeforeEach
	public void setUp() throws Exception {
		game = new Videojuego();
		state = mock(Estado.class);
		state.setFichas(0);
	}

	@Test
	public void testInsertCoin() {
		// Exercise
		assertEquals(game.getFichas(), 0);
		String pantalla = game.iniciar();
		String test = "Insertar ficha";
		
		// Verify
		assertTrue(pantalla.equals(test));
	}

}
