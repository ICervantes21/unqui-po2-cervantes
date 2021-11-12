package unq.edu.ar.po2.tp8.observer.deportes;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestServidor {
	
	Equipo A;
	Equipo B;
	Partido partido;
	Partido partido2;
	Aplicaci�n app;
	Servidor server;
	String Quilmes;
	String River;
	String Gan�A;
	String Futbol;
	String Basket;
	
	@Before
	public void setUp() throws Exception {
		// Set up
		
		A = new Equipo(Quilmes);
		B = new Equipo(River);
		partido = new Partido(Gan�A, Arrays.asList(A, B), Futbol);
		partido2 = new Partido(Gan�A, Arrays.asList(A, B), Basket);
		app = new Aplicaci�n();
		server = new Servidor(Futbol);
		app.addObserver(server);		
	}
	
	@Test
	public void testDeFutbol() {
		// Exercise
		app.addPartido(partido);
		
		//Verify
		assertTrue(server.getEncuentrosInteresantes().contains(partido));
	}

}
