package unq.edu.ar.po2.tp2;

import java.util.Date;

public abstract class Empleado {

	public Empleado(String nombre, String direcci�n, String estadoCivil, int a�oDeNac) {
		this.nombre = nombre;
		this.direcci�n = direcci�n;
		this.estadoCivil = estadoCivil;
		this.a�oDeNac = a�oDeNac;
	}

	private String nombre;
	private String direcci�n;
	private String estadoCivil;
	private int a�oDeNac;

	public int calcularEdad() {
		return 2021 - a�oDeNac;
	}

	protected abstract int sueldoBruto();

	public int retenciones() {
		return this.obraSocial() + this.aporteJubilaci�n();
	}

	public int sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}

	protected abstract int obraSocial();

	protected abstract int aporteJubilaci�n();

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

}
