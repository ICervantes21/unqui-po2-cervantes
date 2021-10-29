package unq.edu.ar.po2.tp8.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Investigador implements Observer {

	private List<String> suscripciones = new ArrayList<String>();
	private List<Art�culo> interesantes = new ArrayList<Art�culo>();

	public Investigador(List<String> suscripciones, Sistema cat�logo) {
		this.suscripciones = suscripciones;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (this.leInteresa((Art�culo) arg)) {
			this.interesantes.add((Art�culo) arg);
		}
	}

	public List<Art�culo> getInteresantes() {
		return interesantes;
	}

	public boolean leInteresa(Art�culo art�culo) {
		List<String> atributos = art�culo.atributos();
		List<String> coincidencias = atributos.stream().filter(atributo -> this.suscripciones.contains(atributo))
				.toList();
		return this.suscripciones.removeAll(coincidencias);
	}

}
