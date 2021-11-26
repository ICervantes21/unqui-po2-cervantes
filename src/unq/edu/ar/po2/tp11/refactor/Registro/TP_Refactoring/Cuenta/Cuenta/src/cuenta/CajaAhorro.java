package unq.edu.ar.po2.tp11.refactor.Registro.TP_Refactoring.Cuenta.Cuenta.src.cuenta;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	/**
	 * Bad smell detected, switch statements
	 */
	@Override
	public void extraer(Integer monto) {
		if(this.saldo >= monto) {
			this.saldo = saldo - monto;
			this.historialDeMovimientos.registrarMovimiento("Extracción", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
		}
	}
	

}
