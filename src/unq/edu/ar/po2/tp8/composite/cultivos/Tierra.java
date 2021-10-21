package unq.edu.ar.po2.tp8.composite.cultivos;

import java.util.ArrayList;
import java.util.List;

public class Tierra {
	
	private List<Porción> porcionesDeTierra = new ArrayList<Porción>();
	
	public int gananciaAnual() {
		int monto = 0;
		for(Porción i : porcionesDeTierra) {
			monto = monto + i.getGanancia();
		}
		return monto;
	}
	
	public void agregarPorciónes(List<Porción> porciones) {
		this.porcionesDeTierra.addAll(porciones);
	}

}
