package unq.edu.ar.po2.tp9.template.method.cajaAhorro;

public class CajaDeAhorro extends CuentaBancaria{

	private int l�mite;
	
	public CajaDeAhorro(String titular, int l�mite) {
		super(titular);
		this.l�mite = l�mite;
	}

	@Override
	public int getDesc() {
		return l�mite;
	}

	@Override
	public boolean condici�n(int monto) {
		return this.getSaldo() >= monto && this.getDesc() >= monto;
	}
	
	

}
