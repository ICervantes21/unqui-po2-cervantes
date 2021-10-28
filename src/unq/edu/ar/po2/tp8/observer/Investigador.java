package unq.edu.ar.po2.tp8.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Investigador implements Observer {

	private List<String> suscripciones = new ArrayList<String>();
	private Sistema cat�logo;
	private List<Art�culo> interesantes = new ArrayList<Art�culo>();

	public Investigador(List<String> suscripciones, Sistema cat�logo) {
		this.suscripciones = suscripciones;
		this.cat�logo = cat�logo;
	}

	public List<String> getSuscripciones() {
		return suscripciones;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (this.leInteresa(cat�logo.�ltimoAgregado())) {
			this.interesantes.add(cat�logo.�ltimoAgregado());
		}
	}

	public boolean leInteresa(Art�culo art�culo) {
		List<String> atributos = art�culo.atributos();
		List<String> coincidencias = new ArrayList<String>();
		for (String i : suscripciones) {
			while (atributos.size() != 0) {
				if (i == atributos.get(0)) {
					coincidencias.add(i);
					atributos.remove(0);
				} else {
					atributos.remove(0);
				}
			}
		}
		return (coincidencias.size() == suscripciones.size());
	}

}
