package unq.edu.ar.po2.tp2;

import java.util.Date;

public class Empleado {

	private String nombre;
	private String direcci�n;
	private String estadoCivil;
	private int a�oDeNac;
	private float sueldoB�sico;

	public Empleado(String nombre, String direcci�n, String estadoCivil, int fechaDeNac, float sueldoB�sico) {
		super();
		this.nombre = nombre;
		this.direcci�n = direcci�n;
		this.estadoCivil = estadoCivil;
		this.a�oDeNac = fechaDeNac;
		this.sueldoB�sico = sueldoB�sico;
	}
	
	public int calcularEdad() {
		return 2021 - a�oDeNac;
	}
	
	

}
