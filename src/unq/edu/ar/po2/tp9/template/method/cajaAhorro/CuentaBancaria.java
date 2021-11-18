package unq.edu.ar.po2.tp9.template.method.cajaAhorro;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {

	private String titular;
	private int saldo;
	private List<String> movimientos;

	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0;
		this.movimientos = new ArrayList<String>();
	}

	public String getTitular() {
		return titular;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void agregarMovimiento(String movimiento) {
		this.movimientos.add(movimiento);
	}

	public abstract int getDesc();

	public abstract boolean condición(int desc);

	// Template method
	public final void extraer(int monto) {
		if (this.condición(monto)) {
			this.setSaldo(this.getSaldo() - monto);
			this.agregarMovimiento("Extración");
		}
	}

}
