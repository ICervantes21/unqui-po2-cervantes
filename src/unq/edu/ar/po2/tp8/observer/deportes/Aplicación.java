package unq.edu.ar.po2.tp8.observer.deportes;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Aplicaci�n extends Observable{
	
	private List<Partido> encuentros;
	
	public void addPartido(Partido partido) {
		this.encuentros.add(partido);
		this.setChanged();
		this.notifyObservers(partido);
	}
	
	public Aplicaci�n() {
		this.encuentros = new ArrayList<Partido>();
	}

}
