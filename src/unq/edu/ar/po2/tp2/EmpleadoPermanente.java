package unq.edu.ar.po2.tp2;

public class EmpleadoPermanente extends Empleado{
	
	private int cantDeHijos;
	private int antiguedad;

	@Override
	protected int sueldoBruto() {
		if (antiguedad >= 1) {
			return (100 + (50 * antiguedad)) + (100 * cantDeHijos);
		}
		else {
			return 100 * cantDeHijos;
		}
	}

	@Override
	protected int obraSocial() {
		return ((this.sueldoBruto() / 100) * 10) + (20 * cantDeHijos);
	}

	@Override
	protected int aporteJubilación() {
		return (this.sueldoBruto() / 100) * 15;
	}
	
	

}
