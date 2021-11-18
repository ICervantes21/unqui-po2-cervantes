package unq.edu.ar.po2.tp9.template.method.cajaAhorro;

public class CuentaCorriente extends CuentaBancaria {

	private int descubierto;

	public CuentaCorriente(String titular, int descubierto) {
		super(titular);
		this.descubierto = descubierto;

	}

	@Override
	public int getDesc() {
		return this.descubierto;
	}

	@Override
	public boolean condición(int monto) {
		return this.getSaldo() + this.getDesc() >= monto;
	}

}
