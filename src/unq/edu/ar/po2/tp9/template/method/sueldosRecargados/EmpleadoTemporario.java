package unq.edu.ar.po2.tp9.template.method.sueldosRecargados;

public class EmpleadoTemporario extends Empleado {

	private boolean tieneHijos;
	private boolean esCasado;

	@Override
	protected double sueldoBase() {
		return 1000;
	}

	@Override
	protected double calcularMonto(double monto) {
		return 5 * getHorasTrabajadas() + monto + this.extraPorFamilia();
	}

	private int extraPorFamilia() {
		if (this.esCasado || this.tieneHijos) {
			return 100;
		} else {
			return 0;
		}
	}

	/**
	 * @param tieneHijos
	 * @param esCasado
	 */
	public EmpleadoTemporario(boolean tieneHijos, boolean esCasado) {
		super();
		this.tieneHijos = tieneHijos;
		this.esCasado = esCasado;
	}

}
