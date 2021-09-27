package unq.edu.ar.po2.tp3;

import java.util.List;

/**
 * 
 * @author Ignacio Cervantes
 * 
 * TP3, ejercicio 11: Equipo de trabajo.
 *
 */

public class EquipoDeTrabajo {
	
	private String nombre;
	private List<Persona> integrantes;
	
	
	public String getNombre() {
		return nombre;
	}


	public EquipoDeTrabajo(String nombre, List<Persona> integrantes) {
		this.nombre = nombre;
		this.integrantes = integrantes;
	}
	
	/**
	 * 
	 * @return El promedio de todas las edades de las personas en la lista.
	 * En el test, el valor debe convertirse en Integer o no funcionará.
	 */
	
	public double promedioDeEdades() {
		double total = integrantes.stream().mapToInt(persona -> persona.getEdad()).sum();
		return total / integrantes.size();
	}
	

}
