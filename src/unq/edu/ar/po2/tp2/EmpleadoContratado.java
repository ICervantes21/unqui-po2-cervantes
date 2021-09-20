package unq.edu.ar.po2.tp2;

public class EmpleadoContratado extends Empleado {
	
	private float n�meroDeContrato;
	private String medioDePago;
	
	public EmpleadoContratado(String nombre, String direcci�n, String estadoCivil, int a�oDeNac, float n�meroDeContrato
			, String medioDePago, float sueldoBasico) {
		super(nombre, direcci�n, estadoCivil, a�oDeNac);
		this.n�meroDeContrato = n�meroDeContrato;
		this.medioDePago = medioDePago;
		this.setSueldoBasico(sueldoBasico);
	}

	@Override
	protected float sueldoBruto() {
		return this.getSueldoBasico();
	}

	@Override
	protected float obraSocial() {
		return 0;
	}

	@Override
	protected float aporteJubilaci�n() {
		return 0;
	}
	
	@Override
	public float retenciones() {
		return 50;
	}

}
