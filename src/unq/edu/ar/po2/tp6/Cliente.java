package unq.edu.ar.po2.tp6;

public class Cliente {

	private String nombre;
	private String apellido;
	private String dirección;
	private int edad;
	private double sueldoNetoMensual;

	public double sueldoNetoAnual() {
		return sueldoNetoMensual * 12;
	}

	public Cliente(String nombre, String apellido, String dirección, int edad, double sueldoNetoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dirección = dirección;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public int getEdad() {
		return edad;
	}

	public void pedirCrédito_A_(Solicitable tipo, Banco banco) {
		tipo.setSolicitante(this);
		tipo.generarse(banco);
	}

}
