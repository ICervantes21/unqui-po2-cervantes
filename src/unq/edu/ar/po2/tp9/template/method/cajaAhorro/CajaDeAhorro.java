package unq.edu.ar.po2.tp9.template.method.cajaAhorro;

public class CajaDeAhorro extends CuentaBancaria{

	private int límite;
	
	public CajaDeAhorro(String titular, int límite) {
		super(titular);
		this.límite = límite;
	}

	@Override
	public int getDesc() {
		return límite;
	}

	@Override
	public boolean condición(int monto) {
		return this.getSaldo() >= monto && this.getDesc() >= monto;
	}
	
	

}
