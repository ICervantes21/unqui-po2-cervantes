package unq.edu.ar.po2.tp2;

public class EmpleadoTemporal extends Empleado{

	private String fechaDeDesignaci�n;
	private int horasExtra;
	
	@Override
	protected int sueldoBruto() {
		return 150*horasExtra;
		}
	
	protected int obraSocial() {
		int c�lculo;
		if (this.calcularEdad() > 50) {
			c�lculo =  ((this.sueldoBruto() / 100) * 10) + 25;
		}
		else {
			c�lculo =  ((this.sueldoBruto() / 100) * 10);
		}
		return c�lculo;
	}
	
	protected int aporteJubilaci�n() {
		return ((this.sueldoBruto() / 100) * 10) + horasExtra * 4;
	}

}
