package unq.edu.ar.po2.tp2;

import java.util.Date;

public abstract class Empleado {

	public Empleado(String nombre, String dirección, String estadoCivil, int añoDeNac) {
		this.nombre = nombre;
		this.dirección = dirección;
		this.estadoCivil = estadoCivil;
		this.añoDeNac = añoDeNac;
	}

	private String nombre;
	private String dirección;
	private String estadoCivil;
	private int añoDeNac;

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

}
