package unq.edu.ar.po2.tp8.observer.artículos;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class Sistema extends Observable {

	private List<Artículo> artículos = new ArrayList<Artículo>();

	public void agregarArtículo(Artículo artículo) {
		this.artículos.add(artículo);
		this.setChanged();
		this.notifyObservers(artículo);;

	}

}
