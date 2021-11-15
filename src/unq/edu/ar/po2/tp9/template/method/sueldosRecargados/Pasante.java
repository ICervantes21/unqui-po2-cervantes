package unq.edu.ar.po2.tp9.template.method.sueldosRecargados;

public class Pasante extends Empleado{

	@Override
	protected double sueldoBase() {
		return 40;
	}

	@Override
	protected double calcularMonto(double monto) {
		return monto * this.getHorasTrabajadas();
	}
	

}
