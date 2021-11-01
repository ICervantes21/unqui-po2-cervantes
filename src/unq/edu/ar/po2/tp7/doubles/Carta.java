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

	public Carta(int valor, Palo palo) {
		this.valor = valor;
		this.palo = palo;
	}
	
	public boolean es_masGrandeQue_(Carta carta1, Carta carta2) {
		return carta1.getValor() > carta2.getValor();
	}
	
	public boolean sonDelMismoPalo(Carta carta1, Carta carta2) {
		return carta1.getPalo() == carta2.getPalo();
	}
	
	

}
