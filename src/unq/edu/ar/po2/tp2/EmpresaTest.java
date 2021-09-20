package unq.edu.ar.po2.tp2;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EmpresaTest {
	
	Empresa empresa;
	EmpleadoTemporal empleado1;
	EmpleadoTemporal empleado2;
	EmpleadoPermanente empleado3;
	
	@Before
	public void setUp() throws Exception {
	empresa = new Empresa("UNQ.SA", 34563156);
	empleado1 = new EmpleadoTemporal("Carlos", "Chacabuco 743", "Soltero", 1990, "11/4/2021", 7);
	empleado2 = new EmpleadoTemporal("Paula", "9 de Julio 40", "Soltera", 1993, "15/7/2021", 2);
    empleado3 = new EmpleadoPermanente("Nacho", "Ayacucho838", "Casado", 1989, 2, 15);
	
	empresa.agregarEmpleado(empleado1);
	empresa.agregarEmpleado(empleado2);
	empresa.agregarEmpleado(empleado3);
	}
	
	@Test
	public void testTamaño() {
		int cantDeEmpleados = empresa.getEmpleados().size();
		assertEquals(cantDeEmpleados, 3);
		
	}
	
	@Test
	public void testMontosBrutos() {
		assertEquals(2400, empresa.montoTotalBrutos().intValue());
	}
	
	@Test
	public void testRetenciones() {
		assertEquals(608, empresa.montoTotalRetenciones().intValue());
	}
	
	@Test
	public void testSueldoNeto() {
		assertEquals(1791, empresa.montoTotalNeto().intValue());
	}
	
	@Test
	public void testMontoTotal() {
		assertEquals(4800, empresa.montoTotal().intValue());
	}
	
	@Test //Liquido todos los sueldos, debería conseguir 3 recibos.
	public void testLiquidación() {
		empresa.liquidarSueldos();
		assertEquals(3, empresa.getRecibos().size());
		
	}
	
	

}
