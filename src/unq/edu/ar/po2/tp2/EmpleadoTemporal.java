package unq.edu.ar.po2.tp2;

public class EmpleadoTemporal extends Empleado {

	public EmpleadoTemporal(String nombre, String dirección, String estadoCivil, int añoDeNac, String fechaDeDesignación, int horasExtra) {
		super(nombre, dirección, estadoCivil, añoDeNac);
		this.fechaDeDesignación = fechaDeDesignación;
		this.horasExtra = horasExtra;
	}

	private String fechaDeDesignación;
	private int horasExtra;

	@Override
	protected int sueldoBruto() {
		return 150 * horasExtra;
	}

	protected int obraSocial() {
		int cálculo;
		if (this.calcularEdad() > 50) {
			cálculo = ((this.sueldoBruto() / 100) * 10) + 25;
		} else {
			cálculo = ((this.sueldoBruto() / 100) * 10);
		}
		return cálculo;
	}

	protected int aporteJubilación() {
		return ((this.sueldoBruto() / 100) * 10) + horasExtra * 4;
	}

	

}
