package unq.edu.ar.po2.tp5.streamsYEnums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;



public class TestAtividadSemanal {
	
	Secretar�aDeDeportes secretar�a;
	ActividadSemanal futbol;
	ActividadSemanal futbol2;
	ActividadSemanal basket;
	ActividadSemanal tennis;
	ActividadSemanal tennis2;
	ActividadSemanal jabalina;
	ActividadSemanal running;
	
	@Before
	public void setUp() throws Exception {
		secretar�a = new Secretar�aDeDeportes();
		futbol = new ActividadSemanal(D�a.Lunes, 13, 2, Deporte.F�tbol);
		futbol2 = new ActividadSemanal(D�a.Jueves, 13, 2, Deporte.F�tbol);
		basket = new ActividadSemanal(D�a.Martes, 18, 3, Deporte.Basket);
		tennis = new ActividadSemanal(D�a.Mi�rcoles, 10, 4, Deporte.Tennis);
		tennis2 = new ActividadSemanal(D�a.S�bado, 10, 4, Deporte.Tennis);
		jabalina = new ActividadSemanal(D�a.Domingo, 17, 1, Deporte.Jabalina);
		running = new ActividadSemanal(D�a.Viernes, 8, 2, Deporte.Running);
		secretar�a.agregarActividades(Arrays.asList(futbol, futbol2, basket, tennis, 
				tennis2, jabalina, running));
	}
	
	@Test
	public void testTodasFutbol() {
		List<ActividadSemanal> lasDeFutbol = secretar�a.todaslasDeFutbol();
		
		assertEquals(Arrays.asList(futbol, futbol2),lasDeFutbol);
	}
	
	@Test
	public void testComplejidades() {
		List<ActividadSemanal> complejas = secretar�a.actividadesDeComplejidad_(3);
		
		assertTrue(complejas.containsAll(Arrays.asList(tennis, tennis2)));
	}

}
