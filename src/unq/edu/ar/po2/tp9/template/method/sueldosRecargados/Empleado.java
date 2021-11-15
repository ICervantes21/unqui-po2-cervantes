/**
 * 
 */
package unq.edu.ar.po2.tp9.template.method.sueldosRecargados;

/**
 * @author ignacio
 *
 */
public abstract class Empleado {

	private double cuenta;
	private int horasTrabajadas;

	/**
	 * Template method
	 */
	public final void cobrarSueldo() {
		double sueldoBase = this.calcularMonto(this.sueldoBase());
		this.agregarACuenta(sueldoBase, this.aportes(sueldoBase));

	}

	/**
	 * 
	 * @return EL sueldo base de cada tipo de empleado.
	 */
	protected abstract double sueldoBase();

	/**
	 * 
	 * @return Las horas trabajadas, sirve para calcular cada sueldo base.
	 */
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	/**
	 * 
	 * @param monto Debe ser el sueldo base de cada empleado
	 * @return El calculo del sueldo final de cada empleado, sin desontar aportes.
	 */
	protected abstract double calcularMonto(double monto);

	/**
	 * 
	 * @param monto
	 * @param descuento De cada sueldo se descuentan los aportes.
	 */
	private void agregarACuenta(double monto, double descuento) {
		this.cuenta = this.cuenta + (monto - descuento);
	}

	/**
	 * 
	 * @param monto
	 * @return El 13% del monto.
	 */
	private double aportes(double monto) {
		return monto * 0.13;
	}

	public double getCuenta() {
		return cuenta;
	}

	/**
	 * @param horasTrabajadas
	 */
	public Empleado(int horasTrabajadas) {
		super();
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	

}
