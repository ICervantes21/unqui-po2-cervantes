package unq.edu.ar.po2.tp2;

import java.util.Date;

public abstract class Empleado {

	private String nombre;
	private String direcci�n;
	private String estadoCivil;
	private int a�oDeNac;
	private float sueldoB�sico;

	
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
