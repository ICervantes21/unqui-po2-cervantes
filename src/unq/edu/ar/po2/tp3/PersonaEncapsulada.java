package unq.edu.ar.po2.tp3;

import java.util.Calendar;

/**
 * 
 * @author Ignacio CErvantes
 * 
 * TP3, ejercicio 10: encapsulamiento.
 *
 */

public class PersonaEncapsulada {
	
	@SuppressWarnings("unused")
	private String nombre;
	private Calendar fechaDeNac;
	
	
	
	public PersonaEncapsulada(String nombre, Calendar fechaDeNac, int edad) {
		this.nombre = nombre;
		this.fechaDeNac = fechaDeNac;
		
	}
	
	/**
	 * 
	 * @return La edad de la persona.
	 */
	
	public int edad() {
		return 2021 - this.fechaDeNac.get(Calendar.YEAR);
	}
	
	/**
	 * 
	 * @param persona Debe ser una PersonaEncapsulada.
	 * @return Verdadero si la edad de la instancia receptora del mensaje es
	 * menor a la recibida en el parámetro, falso en caso contrario.
	 */
	
	public boolean menorQue(PersonaEncapsulada persona) {
		if (this.edad() < persona.edad()) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
