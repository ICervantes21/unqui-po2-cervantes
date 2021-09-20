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
	protected float aporteJubilaci�n() {
		return (this.sueldoBruto() / 100) * 15;
	}

	public EmpleadoPermanente(String nombre, String direcci�n, String estadoCivil, int a�oDeNac, int cantDeHijos, int antiguedad) {
		super(nombre, direcci�n, estadoCivil, a�oDeNac);
		this.cantDeHijos = cantDeHijos;
		this.antiguedad = antiguedad;
	}
	
	

}
