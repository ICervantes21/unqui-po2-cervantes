package unq.edu.ar.po2.tp2;

import java.util.Date;

public abstract class Empleado {


	private String nombre;
	private String dirección;
	private String estadoCivil;
	private int añoDeNac;
	private float sueldoBasico;

	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public int calcularEdad() {
		return 2021 - añoDeNac;
	}

	protected abstract float sueldoBruto();

	public float retenciones() {
		return this.obraSocial() + this.aporteJubilación();
	}

	public float sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}

	protected abstract float obraSocial();

	protected abstract float aporteJubilación();

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
	
	public Empleado(String nombre, String dirección, String estadoCivil, int añoDeNac) {
		this.nombre = nombre;
		this.dirección = dirección;
		this.estadoCivil = estadoCivil;
		this.añoDeNac = añoDeNac;
	}

}
