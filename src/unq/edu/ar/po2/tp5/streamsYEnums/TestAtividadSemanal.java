package unq.edu.ar.po2.tp5.streamsYEnums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;



public class TestAtividadSemanal {
	
	SecretaríaDeDeportes secretaría;
	ActividadSemanal futbol;
	ActividadSemanal futbol2;
	ActividadSemanal basket;
	ActividadSemanal tennis;
	ActividadSemanal tennis2;
	ActividadSemanal jabalina;
	ActividadSemanal running;
	
	@Before
	public void setUp() throws Exception {
		secretaría = new SecretaríaDeDeportes();
		futbol = new ActividadSemanal(Día.Lunes, 13, 2, Deporte.Fútbol);
		futbol2 = new ActividadSemanal(Día.Jueves, 13, 2, Deporte.Fútbol);
		basket = new ActividadSemanal(Día.Martes, 18, 3, Deporte.Basket);
		tennis = new ActividadSemanal(Día.Miércoles, 10, 4, Deporte.Tennis);
		tennis2 = new ActividadSemanal(Día.Sábado, 10, 4, Deporte.Tennis);
		jabalina = new ActividadSemanal(Día.Domingo, 17, 1, Deporte.Jabalina);
		running = new ActividadSemanal(Día.Viernes, 8, 2, Deporte.Running);
		secretaría.agregarActividades(Arrays.asList(futbol, futbol2, basket, tennis, 
				tennis2, jabalina, running));
	}
	
	@Test
	public void testTodasFutbol() {
		List<ActividadSemanal> lasDeFutbol = secretaría.todaslasDeFutbol();
		
		assertEquals(Arrays.asList(futbol, futbol2),lasDeFutbol);
	}
	
	@Test
	public void testComplejidades() {
		List<ActividadSemanal> complejas = secretaría.actividadesDeComplejidad_(3);
		
		assertTrue(complejas.containsAll(Arrays.asList(tennis, tennis2)));
	}

}
