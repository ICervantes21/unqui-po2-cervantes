package unq.edu.ar.po2.tp11.refactor.Registro.TP_Refactoring.Cuenta.Cuenta.src.cuenta;

public class CuentaCorriente extends CuentaBancaria{
	private Integer limiteDescubierto;
	
	public CuentaCorriente(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo, Integer limiteDescubierto) {
		super(historialDeMovimientos, notificador, saldo);
		this.limiteDescubierto = limiteDescubierto;
	}
	
	/**
	 * Bad smell detected, switch statements
	 */
	@Override
	public void extraer(Integer monto) {
		if(this.saldo + this.limiteDescubierto >= monto)
			this.saldo = saldo - monto;
			this.historialDeMovimientos.registrarMovimiento("Extracción", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
	}

}
