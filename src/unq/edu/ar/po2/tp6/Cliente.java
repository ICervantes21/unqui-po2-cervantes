package unq.edu.ar.po2.tp6;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direcci�n;
	private int edad;
	private double sueldoNetoMensual;

	public double sueldoNetoAnual() {
		return sueldoNetoMensual * 12;
	}

	public Cliente(String nombre, String apellido, String direcci�n, int edad, double sueldoNetoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direcci�n = direcci�n;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public int getEdad() {
		return edad;
	}

	public void pedirCr�dito_A_(Solicitable tipo, Banco banco) {
		tipo.setSolicitante(this);
		tipo.generarse(banco);
	}

}
