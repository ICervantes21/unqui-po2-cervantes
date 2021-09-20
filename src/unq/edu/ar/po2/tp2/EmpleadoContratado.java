package unq.edu.ar.po2.tp2;

public class EmpleadoContratado extends Empleado {
	
	private float númeroDeContrato;
	private String medioDePago;
	
	public EmpleadoContratado(String nombre, String dirección, String estadoCivil, int añoDeNac, float númeroDeContrato
			, String medioDePago, float sueldoBasico) {
		super(nombre, dirección, estadoCivil, añoDeNac);
		this.númeroDeContrato = númeroDeContrato;
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
	protected float aporteJubilación() {
		return 0;
	}
	
	@Override
	public float retenciones() {
		return 50;
	}

}
