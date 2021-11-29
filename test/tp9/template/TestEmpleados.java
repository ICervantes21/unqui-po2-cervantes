package tp9.template;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.edu.ar.po2.tp9.template.method.sueldosRecargados.Empleado;
import unq.edu.ar.po2.tp9.template.method.sueldosRecargados.EmpleadoDePlanta;
import unq.edu.ar.po2.tp9.template.method.sueldosRecargados.EmpleadoTemporario;
import unq.edu.ar.po2.tp9.template.method.sueldosRecargados.Empresa;
import unq.edu.ar.po2.tp9.template.method.sueldosRecargados.Pasante;


public class TestEmpleados {
	
	Empresa empresa;
	Empleado Juán;
	Empleado Carla;
	Empleado Juana;
	
	@BeforeEach
	public void setUp() throws Exception {
		// Set up
		empresa = new Empresa();
		Juán = new EmpleadoDePlanta(2, 27);
		Carla = new EmpleadoTemporario(false, false, 19);
		Juana = new Pasante(14);
		empresa.setEmpleados(Arrays.asList(Juán, Carla, Juana));
	}
	
	@Test
	public void testPagoDeSueldos() {
		// Exercise
		empresa.pagarTodosLosSueldos();
		
		// Verify
		assertEquals(Juán.getCuenta(), 2871, 0);
		assertEquals(Carla.getCuenta(),952.65, 0 );
		assertEquals(Juana.getCuenta(), 487.2, 0);
	}

}
