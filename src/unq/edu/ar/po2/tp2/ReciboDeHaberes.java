package unq.edu.ar.po2.tp2;

public class ReciboDeHaberes {
	
	private String nombre;
	private String dirección;
	private String fechaDeEmisión;
	private float sueldoBruto;
	private float sueldoNeto;
	private String conceptos;

	public ReciboDeHaberes(String nombre, String dirección, String fechaDeEmisión, float sueldoBruto, float sueldoNeto,
			String conceptos) {
		super();
		this.nombre = nombre;
		this.dirección = dirección;
		this.fechaDeEmisión = fechaDeEmisión;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.conceptos = conceptos;
	}

}
