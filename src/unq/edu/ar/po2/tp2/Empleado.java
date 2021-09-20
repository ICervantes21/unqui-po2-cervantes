package unq.edu.ar.po2.tp2;

import java.util.Date;

public abstract class Empleado {

	private String nombre;
	private String dirección;
	private String estadoCivil;
	private int añoDeNac;
	private float sueldoBásico;

	
	public int calcularEdad() {
		return 2021 - añoDeNac;
	}
	
	protected abstract int sueldoBruto();
	
	public int retenciones() {
		return this.obraSocial() + this.aporteJubilación();
	}
	
	public int sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	protected abstract int obraSocial();
	
	protected abstract int aporteJubilación();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	
	
	

}
