package unq.edu.ar.po2.tp8.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class Sistema extends Observable{
	
	private List<Artículo> artículos = new ArrayList<Artículo>();
	
	public void agregarArtículo(Artículo artículo) {
		this.artículos.add(artículo);
		this.setChanged();
		this.notify();
		
	}
	
	/**
	 * 
	 * @return El último artículo que se agregó (o sea, el primero en la lista)
	 * dara error si la lista esta vacía.
	 */
	
	public Artículo últimoAgregado() {
		return this.artículos.get(0);
	}
	

}
