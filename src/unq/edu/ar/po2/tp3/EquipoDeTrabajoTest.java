package unq.edu.ar.po2.tp3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class EquipoDeTrabajoTest {
	
	static Persona persona1 = new Persona("Juan Carlos", 30);
	static Persona persona2 = new Persona("Juan Perez", 22);
	static Persona persona3 = new Persona("Ignacio Cervantes", 24);
	static Persona persona4 = new Persona("Ian Alvarez", 20);
	static Persona persona5 = new Persona("Juana Santoro", 19);
	static EquipoDeTrabajo equipo = new EquipoDeTrabajo("Java Team", Arrays.asList(persona1, persona2, persona3, persona4, persona5));
	
	
	
	@Test
	public void testPromedio() {
		assertEquals(23, equipo.promedioDeEdades());
	}
	
	public static void main(String[] args) {
		int promedio = equipo.promedioDeEdades();
		System.out.print(promedio);
	} 

}
