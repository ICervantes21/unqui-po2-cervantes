package unq.edu.ar.po2.tp2;

import java.util.Date;

public abstract class Empleado {


	private String nombre;
	private String direcci�n;
	private String estadoCivil;
	private int a�oDeNac;
	private float sueldoBasico;

	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public int calcularEdad() {
		return 2021 - a�oDeNac;
	}

	protected abstract float sueldoBruto();

	public float retenciones() {
		return this.obraSocial() + this.aporteJubilaci�n();
	}

	public float sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}

	protected abstract float obraSocial();

	protected abstract float aporteJubilaci�n();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirecci�n() {
		return direcci�n;
	}

	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
	}
	
	public Empleado(String nombre, String direcci�n, String estadoCivil, int a�oDeNac) {
		this.nombre = nombre;
		this.direcci�n = direcci�n;
		this.estadoCivil = estadoCivil;
		this.a�oDeNac = a�oDeNac;
	}

}
