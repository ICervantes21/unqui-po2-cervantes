package unq.edu.ar.po2.tp2;

public class ReciboDeHaberes {
	
	private String nombre;
	private String direcci�n;
	private String fechaDeEmisi�n;
	private float sueldoBruto;
	private float sueldoNeto;
	private String conceptos;

	public ReciboDeHaberes(String nombre, String direcci�n, String fechaDeEmisi�n, float sueldoBruto, float sueldoNeto,
			String conceptos) {
		super();
		this.nombre = nombre;
		this.direcci�n = direcci�n;
		this.fechaDeEmisi�n = fechaDeEmisi�n;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.conceptos = conceptos;
	}

}
