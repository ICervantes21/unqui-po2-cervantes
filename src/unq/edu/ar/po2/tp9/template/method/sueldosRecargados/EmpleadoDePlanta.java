package unq.edu.ar.po2.tp9.template.method.sueldosRecargados;

/**
 * 
 * @author Ignacio Cervantes
 *
 */

public class EmpleadoDePlanta extends Empleado {

	private int cantidadDeHijos;

	@Override
	protected double sueldoBase() {
		return 3000;
	}

	@Override
	protected double calcularMonto(double monto) {
		return monto + (150 * this.cantidadDeHijos);
	}

	/**
	 * @param cantidadDeHijos
	 */
	public EmpleadoDePlanta(int cantidadDeHijos) {
		super();
		this.cantidadDeHijos = cantidadDeHijos;
	}

}
