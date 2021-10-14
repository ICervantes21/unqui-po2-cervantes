package unq.edu.ar.po2.tp6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CréditosTest {
	
	Banco bvba;
	SolicitudDeCréditoPersonal solicitud1;
	SolicitudDeCréditoHipotecario solicitud2;
	Propiedad propiedad;
	Cliente Juán;
	Cliente Nacho;
	
	@Before
	public void setUp() throws Exception {
		
		Juán = new Cliente("Juán", "Astor", "Ezpeleta", 32, 32000);
		Nacho = new Cliente("Nacho", "Cervantes", "Bernal", 25, 30000);
		bvba = new Banco();
		solicitud1 = new SolicitudDeCréditoPersonal(null, 30000, 14);
		solicitud2 = new SolicitudDeCréditoHipotecario(null, 15000, 17);
		propiedad = new Propiedad("depto", "Bernal", 90000);
		solicitud2.setGarantía(propiedad);
	}
	
	@Test
	public void testSolicitudes() {
		bvba.agregarCliente(Juán);
		bvba.agregarCliente(Nacho);
		Juán.pedirCrédito_A_(solicitud1, bvba);
		Nacho.pedirCrédito_A_(solicitud2, bvba);
		
		assertEquals(2, bvba.getSolicitudesDeCrédito().size());
		assertTrue(solicitud2.aceptable());
		assertTrue(solicitud1.aceptable());
		assertEquals(45000, bvba.getMontosSolicitados(), 0);
	}

}
