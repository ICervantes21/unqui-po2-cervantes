package unq.edu.ar.po2.tp8.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Investigador implements Observer {

	private List<String> suscripciones = new ArrayList<String>();
	private Sistema catálogo;
	private List<Artículo> interesantes = new ArrayList<Artículo>();

	public Investigador(List<String> suscripciones, Sistema catálogo) {
		this.suscripciones = suscripciones;
		this.catálogo = catálogo;
	}

	public List<String> getSuscripciones() {
		return suscripciones;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (this.leInteresa(catálogo.últimoAgregado())) {
			this.interesantes.add(catálogo.últimoAgregado());
		}
	}

	public boolean leInteresa(Artículo artículo) {
		List<String> atributos = artículo.atributos();
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
