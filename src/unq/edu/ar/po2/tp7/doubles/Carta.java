package unq.edu.ar.po2.tp7.doubles;

public class Carta {

	private int valor;
	private Palo palo;

	public int getValor() {
		return valor;
	}

	public Palo getPalo() {
		return palo;
	}

	/**
	 * 
	 * @param valor no debe ser mayor a 12.
	 */
	public Carta(int valor, Palo palo) {
		this.valor = valor;
		this.palo = palo;
	}
	
	/**
	 * 
	 * @param carta a comparar
	 * @return Verdadero si el valor de this es mayor al de carta
	 */
	public boolean esMasGrandeQue_(Carta carta) {
		return this.getValor() > carta.getValor();
	}
	
	
	/**
	 * 
	 * @param carta a comparar
	 * @return Verdadero si ambas cartas tienen el mismo palo.
	 */
	public boolean mismoPaloQue_(Carta carta) {
		return this.getPalo() == carta.getPalo();
	}
	
	

}
