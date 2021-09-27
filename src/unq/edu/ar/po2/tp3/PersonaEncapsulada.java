package unq.edu.ar.po2.tp3;

import java.util.Date;

public class PersonaEncapsulada {
	
	private String nombre;
	private Date fechaDeNac;
	
	
	
	public PersonaEncapsulada(String nombre, Date fechaDeNac, int edad) {
		this.nombre = nombre;
		this.fechaDeNac = fechaDeNac;
		
	}
	
	@SuppressWarnings("deprecation")
	public int edad() {
		return 2021 - this.fechaDeNac.getYear();
	}
	
	public boolean menorQue(PersonaEncapsulada persona) {
		if (this.edad() < persona.edad()) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
