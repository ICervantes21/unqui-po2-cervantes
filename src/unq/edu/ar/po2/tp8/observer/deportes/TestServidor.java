package unq.edu.ar.po2.tp8.observer.deportes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestServidor {
	
	Equipo A;
	Equipo B;
	Partido partido;
	Partido partido2;
	Aplicación app;
	Servidor server;
	String Quilmes;
	String River;
	String GanóA;
	String Futbol;
	String Basket;
	
	@Before
	public void setUp() throws Exception {
		// Set up
		
		A = new Equipo(Quilmes);
		B = new Equipo(River);
		partido = new Partido(GanóA, Arrays.asList(A, B), Futbol);
		partido2 = new Partido(GanóA, Arrays.asList(A, B), Basket);
		server = new Servidor(Futbol);
		app = new Aplicación(server);
		app.addObserver(server);		
	}
	
	@Test
	public void testDeFutbol() {
		// Exercise
		app.addPartido(partido);
		assertTrue(partido.getDeporte() == Futbol);
		
		//Verify
		assertTrue(server.getEncuentrosInteresantes().contains(partido));
	}
	
	@Test
	public void testDeBasket() {
		// Exercise
		app.addPartido(partido2);
		assertTrue(partido2.getDeporte() == Basket);
		
		// Verify
		assertFalse(server.getEncuentrosInteresantes().contains(partido2));
	}

}
