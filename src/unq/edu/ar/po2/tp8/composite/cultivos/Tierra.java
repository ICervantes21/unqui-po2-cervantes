package unq.edu.ar.po2.tp8.composite.cultivos;

import java.util.ArrayList;
import java.util.List;

public class Tierra {
	
	private List<Porci�n> porcionesDeTierra = new ArrayList<Porci�n>();
	
	public int gananciaAnual() {
		int monto = 0;
		for(Porci�n i : porcionesDeTierra) {
			monto = monto + i.getGanancia();
		}
		return monto;
	}
	
	public void agregarPorci�nes(List<Porci�n> porciones) {
		this.porcionesDeTierra.addAll(porciones);
	}

}
