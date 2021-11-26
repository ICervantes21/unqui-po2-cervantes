package unq.edu.ar.po2.tp10.state.videojuego;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VideojuegoTest {

	Videojuego game;

	@BeforeEach
	public void setUp() throws Exception {
		game = new Videojuego();
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

	@Test
	public void test1Jugador() {
		// Exercise
		game.registrarFicha();
		String pantalla = game.iniciar();
		String test = "1 Jugador";

		// Verify
		assertTrue(pantalla.equals(test));
	}

	@Test
	public void testDosJugadores() {
		// Exercise
		game.registrarFicha();
		String pantalla = game.iniciar();
		String test = "1 Jugador";
		assertTrue(pantalla.equals(test));

		game.registrarFicha();
		pantalla = game.iniciar();
		test = "2 Jugadores";

		// Verify
		assertTrue(pantalla.equals(test));
	}

	@Test
	public void testReiniciar() {
		// Exercise
		game.registrarFicha();
		String pantalla = game.iniciar();
		String test = "1 Jugador";
		assertTrue(pantalla.equals(test));

		game.registrarFicha();
		pantalla = game.iniciar();
		test = "2 Jugadores";
		assertTrue(pantalla.equals(test));

		game.reiniciar();
		pantalla = game.iniciar();
		test = "Insertar ficha";

		// Verify
		assertTrue(pantalla.equals(test));
	}

}
