package unq.edu.ar.po2.tp6;

public class Propiedad {

	private String descripci�n;
	private String direcci�n;
	private double valorFiscal;

	public double getValorFiscal() {
		return valorFiscal;
	}

	public Propiedad(String descripci�n, String direcci�n, double valorFiscal) {
		this.descripci�n = descripci�n;
		this.direcci�n = direcci�n;
		this.valorFiscal = valorFiscal;
	}

}
