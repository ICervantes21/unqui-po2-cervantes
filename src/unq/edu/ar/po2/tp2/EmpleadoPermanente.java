package unq.edu.ar.po2.tp2;

public class EmpleadoPermanente extends Empleado{
	

	private int cantDeHijos;
	private int antiguedad;

	@Override
	protected float sueldoBruto() {
		if (antiguedad >= 1) {
			return (100 + (50 * antiguedad)) + (100 * cantDeHijos);
		}
		else {
			return 100 * cantDeHijos;
		}
	}

	@Override
	protected float obraSocial() {
		return ((this.sueldoBruto() / 100) * 10) + (20 * cantDeHijos);
	}

	@Override
	protected float aporteJubilación() {
		return (this.sueldoBruto() / 100) * 15;
	}

	public EmpleadoPermanente(String nombre, String dirección, String estadoCivil, int añoDeNac, int cantDeHijos, int antiguedad) {
		super(nombre, dirección, estadoCivil, añoDeNac);
		this.cantDeHijos = cantDeHijos;
		this.antiguedad = antiguedad;
	}
	
	

}
