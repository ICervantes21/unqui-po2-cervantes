package tp5.interfaces;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import unq.edu.ar.po2.tp5.interfaces.Factura;
import unq.edu.ar.po2.tp5.interfaces.Impuesto;
import unq.edu.ar.po2.tp5.interfaces.Recaudadora;
import unq.edu.ar.po2.tp5.interfaces.Servicio;

public class FacturaTest {
	
	Factura factura;
	Servicio delivery;
	Impuesto iva;
	Recaudadora afip;
	
	@Before
	public void setUp() throws Exception {
		
		delivery = new Servicio(20, 5);
		iva = new Impuesto(21);
		afip = new Recaudadora();
		factura = new Factura();
		factura.setAgencia(afip);
		factura.agregarRegistrable(iva);
		factura.agregarRegistrable(delivery);
		
	}
	
	@Test
	public void facturaTest() {
		assertEquals(2, factura.getServiciosEImpuestos().size());
		assertEquals(121,factura.getPrecio(), 0);
	}

}
