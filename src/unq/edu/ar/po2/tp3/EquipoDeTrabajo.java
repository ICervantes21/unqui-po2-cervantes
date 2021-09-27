package unq.edu.ar.po2.tp3;

import java.util.ArrayList;
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
	private List<Persona> integrantes = new ArrayList<Persona>();
	
	
	public String getNombre() {
		return nombre;
	}


	public EquipoDeTrabajo(String nombre, List<Persona> integrantes) {
		this.nombre = nombre;
		this.integrantes = integrantes;
	}
	
	
	public int promedioDeEdades() {
		int total = integrantes.stream().mapToInt(persona -> persona.getEdad()).sum();
		return total / integrantes.size();
	}
	

}
