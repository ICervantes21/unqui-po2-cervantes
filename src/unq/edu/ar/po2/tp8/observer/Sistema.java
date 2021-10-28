package unq.edu.ar.po2.tp8.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class Sistema extends Observable{
	
	private List<Art�culo> art�culos = new ArrayList<Art�culo>();
	
	public void agregarArt�culo(Art�culo art�culo) {
		this.art�culos.add(art�culo);
		this.setChanged();
		this.notify();
		
	}
	
	/**
	 * 
	 * @return El �ltimo art�culo que se agreg� (o sea, el primero en la lista)
	 * dara error si la lista esta vac�a.
	 */
	
	public Art�culo �ltimoAgregado() {
		return this.art�culos.get(0);
	}
	

}
