package unq.edu.ar.po2.tp2;

import java.util.Date;

public class Empleado {

	private String nombre;
	private String dirección;
	private String estadoCivil;
	private int añoDeNac;
	private float sueldoBásico;

	public Empleado(String nombre, String dirección, String estadoCivil, int fechaDeNac, float sueldoBásico) {
		super();
		this.nombre = nombre;
		this.dirección = dirección;
		this.estadoCivil = estadoCivil;
		this.añoDeNac = fechaDeNac;
		this.sueldoBásico = sueldoBásico;
	}
	
	public int calcularEdad() {
		return 2021 - añoDeNac;
	}
	
	

}
