package unq.edu.ar.po2.tp5.interfaces;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MercadoTest {
	
	ProductoCooperativa fideos;
	ProductoTradicional arroz;
	Caja caja;
	
	@Before
	public void setUp() throws Exception {
		
		fideos = new ProductoCooperativa(100);
		arroz = new ProductoTradicional(40);
		caja = new Caja();
		caja.agregarProducto(arroz);
		caja.agregarProducto(fideos);
		
	}
	
	/**
	 * Primero verifico que pueda realizar operaciones de a un solo producto a la vez.
	 */
	
	@Test
	public void testProductos() {
		assertEquals(2, caja.getListaDeproductos().size());
		caja.registrarProducto(arroz);
		assertEquals(1, caja.getListaDeproductos().size());
		assertEquals(40, caja.getMontoAPagar(), 0);
		caja.registrarProducto(fideos);
		assertEquals(50, caja.getMontoAPagar(), 0);
	}
	
	/**
	 * Ahora pruebo que pueda registrar varios productos a la vez.
	 */
	
	@Test
	public void testRegistrarTodo() {
		caja.registrarTodosLosProductos();
		assertEquals(50, caja.getMontoAPagar(), 0);
		assertEquals(0, caja.getListaDeproductos().size());
	}

}
