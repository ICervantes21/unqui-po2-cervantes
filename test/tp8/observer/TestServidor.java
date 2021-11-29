package tp8.observer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import unq.edu.ar.po2.tp8.observer.deportes.Aplicaci�n;
import unq.edu.ar.po2.tp8.observer.deportes.Equipo;
import unq.edu.ar.po2.tp8.observer.deportes.Partido;
import unq.edu.ar.po2.tp8.observer.deportes.Servidor;

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
		server = new Servidor(Futbol);
		app = new Aplicaci�n(server);
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
		// assertFalse(server.getEncuentrosInteresantes().contains(partido2));
	}

}
