package unq.edu.ar.po2.tp6;

public class Propiedad {

	private String descripción;
	private String dirección;
	private double valorFiscal;

	public double getValorFiscal() {
		return valorFiscal;
	}

	public Propiedad(String descripción, String dirección, double valorFiscal) {
		this.descripción = descripción;
		this.dirección = dirección;
		this.valorFiscal = valorFiscal;
	}

}
