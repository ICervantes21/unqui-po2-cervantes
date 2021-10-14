package unq.edu.ar.po2.tp6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Cr�ditosTest {
	
	Banco bvba;
	SolicitudDeCr�ditoPersonal solicitud1;
	SolicitudDeCr�ditoHipotecario solicitud2;
	Propiedad propiedad;
	Cliente Ju�n;
	Cliente Nacho;
	
	@Before
	public void setUp() throws Exception {
		
		Ju�n = new Cliente("Ju�n", "Astor", "Ezpeleta", 32, 32000);
		Nacho = new Cliente("Nacho", "Cervantes", "Bernal", 25, 30000);
		bvba = new Banco();
		solicitud1 = new SolicitudDeCr�ditoPersonal(null, 30000, 14);
		solicitud2 = new SolicitudDeCr�ditoHipotecario(null, 15000, 17);
		propiedad = new Propiedad("depto", "Bernal", 90000);
		solicitud2.setGarant�a(propiedad);
	}
	
	@Test
	public void testSolicitudes() {
		bvba.agregarCliente(Ju�n);
		bvba.agregarCliente(Nacho);
		Ju�n.pedirCr�dito_A_(solicitud1, bvba);
		Nacho.pedirCr�dito_A_(solicitud2, bvba);
		
		assertEquals(2, bvba.getSolicitudesDeCr�dito().size());
		assertTrue(solicitud2.aceptable());
		assertTrue(solicitud1.aceptable());
		assertEquals(45000, bvba.getMontosSolicitados(), 0);
	}

}
