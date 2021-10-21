package unq.edu.ar.po2.tp8.composite.cultivos;

import java.util.ArrayList;
import java.util.List;

public class Porci�nMixta extends Porci�n {
	
	private List<Cultivo> cultivos = new ArrayList<Cultivo>();
	
	@Override
	public int getGanancia() {
		int monto = 0;
		for (Cultivo i : cultivos) {
			monto = monto + i.getPrecio() / 4;
		}
		return monto;
	}

	public Porci�nMixta(List<Cultivo> cultivos, Cultivo cultivo) {
		super(cultivo);
		this.cultivos = cultivos;
	}
	

}
