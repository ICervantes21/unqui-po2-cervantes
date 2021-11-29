package tp5.streamsYEnums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import unq.edu.ar.po2.tp5.streamsYEnums.ActividadSemanal;
import unq.edu.ar.po2.tp5.streamsYEnums.Deporte;
import unq.edu.ar.po2.tp5.streamsYEnums.D�a;
import unq.edu.ar.po2.tp5.streamsYEnums.Secretar�aDeDeportes;



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
		tennis = new ActividadSemanal(D�a.S�bado, 10, 4, Deporte.Tennis);
		tennis2 = new ActividadSemanal(D�a.Martes, 10, 4, Deporte.Tennis);
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
	
	@Test
	public void testHorasSemanales() {
		int horas = secretar�a.horasTotales();
		
		assertEquals(18, horas);
	}
	
	@Test
	public void testLasMasBaratas() {
		ActividadSemanal barata = secretar�a.menorCostoDe_(Deporte.F�tbol);
		
		assertEquals(futbol, barata);
	}
	
	/**
	 * Todav�a no creo como este test pas�...
	 */
	@Test
	public void testLasMasBaratasToma2() {
		ActividadSemanal barata2 = secretar�a.menorCostoDe_(Deporte.Tennis);
		
		assertEquals(tennis2, barata2);
	}
	
	/**
	 * Este m�todo imprime todos los deportes en la secretar�a, sin embargo debo volver a onstruir todo el escenario 
	 * para realizar esta acci�n. Consultar.
	 * @param args
	 */
	
	public static void main(String[] args) {
		Secretar�aDeDeportes secretar�a = new Secretar�aDeDeportes();;
		ActividadSemanal futbol = new ActividadSemanal(D�a.Lunes, 13, 2, Deporte.F�tbol);
		ActividadSemanal futbol2 = new ActividadSemanal(D�a.Jueves, 13, 2, Deporte.F�tbol);
		ActividadSemanal basket = new ActividadSemanal(D�a.Martes, 18, 3, Deporte.Basket);
		ActividadSemanal tennis = new ActividadSemanal(D�a.S�bado, 10, 4, Deporte.Tennis) ;
		ActividadSemanal tennis2 = new ActividadSemanal(D�a.Martes, 10, 4, Deporte.Tennis);
		ActividadSemanal jabalina = new ActividadSemanal(D�a.Domingo, 17, 1, Deporte.Jabalina) ;
		ActividadSemanal running = new ActividadSemanal(D�a.Viernes, 8, 2, Deporte.Running);
		secretar�a.agregarActividades(Arrays.asList(futbol, futbol2, basket, tennis, 
				tennis2, jabalina, running));
		System.out.println(secretar�a.imprimirActividades());

	}

}
