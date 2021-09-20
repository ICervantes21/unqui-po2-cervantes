package unq.edu.ar.po2.tp2;

public class EmpleadoTemporal extends Empleado {

	public EmpleadoTemporal(String nombre, String direcci�n, String estadoCivil, int a�oDeNac, String fechaDeDesignaci�n, int horasExtra) {
		super(nombre, direcci�n, estadoCivil, a�oDeNac);
		this.fechaDeDesignaci�n = fechaDeDesignaci�n;
		this.horasExtra = horasExtra;
	}

	private String fechaDeDesignaci�n;
	private int horasExtra;

	@Override
	protected float sueldoBruto() {
		return 150 * horasExtra;
	}

	protected float obraSocial() {
		float c�lculo;
		if (this.calcularEdad() > 50) {
			c�lculo = ((this.sueldoBruto() / 100) * 10) + 25;
		} else {
			c�lculo = ((this.sueldoBruto() / 100) * 10);
		}
		return c�lculo;
	}

	protected float aporteJubilaci�n() {
		return ((this.sueldoBruto() / 100) * 10) + horasExtra * 4;
	}

	

}
