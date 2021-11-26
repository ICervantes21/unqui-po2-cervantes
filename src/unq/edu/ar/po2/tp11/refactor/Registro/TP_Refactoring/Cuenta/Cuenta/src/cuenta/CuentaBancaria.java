package unq.edu.ar.po2.tp11.refactor.Registro.TP_Refactoring.Cuenta.Cuenta.src.cuenta;

public abstract class CuentaBancaria {
	protected HistorialMovimientos historialDeMovimientos;
	protected Notificador notificador;
	protected int saldo;

	public CuentaBancaria(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super();
		this.historialDeMovimientos = historialDeMovimientos;
		this.notificador = notificador;
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}

	/**
	 * Re factor: extract method
	 * 
	 * @param monto
	 */
	public final void extraer(Integer monto) {
		if (this.condici�n()) {
			this.saldo = saldo - monto;
			this.historialDeMovimientos.registrarMovimiento("Extracción", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
		}
	}

	protected abstract boolean condici�n();
}
