package tp2;

import org.junit.Before;
import org.junit.Test;

import unq.edu.ar.po2.tp2.Empleado;
import unq.edu.ar.po2.tp2.EmpleadoContratado;
import unq.edu.ar.po2.tp2.EmpleadoPermanente;
import unq.edu.ar.po2.tp2.EmpleadoTemporal;
import unq.edu.ar.po2.tp2.Empresa;

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
	
	@Test
	public void testPunto2() {
		Empleado empleado4 = new EmpleadoContratado("Juán", "Miramar", "Soltero", 1996, 619947, "Depósito bancario", 70);
		empresa.agregarEmpleado(empleado4);
		assertEquals(empresa.getEmpleados().size(), 4);
		assertEquals(4940, empresa.montoTotal().intValue());
		empresa.liquidarSueldos();
		assertEquals(4, empresa.getRecibos().size());
	}
	
	

}
