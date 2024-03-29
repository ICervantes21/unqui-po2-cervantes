package unq.edu.ar.po2.tp8.observer.artículos;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.function.Predicate;

@SuppressWarnings("deprecation")
public class Investigador implements Observer {

	private List<String> suscripciones = new ArrayList<String>();
	private List<Artículo> interesantes = new ArrayList<Artículo>();

	public Investigador(List<String> suscripciones, Sistema catálogo) {
		this.suscripciones = suscripciones;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (this.leInteresa((Artículo) arg)) {
			this.interesantes.add((Artículo) arg);
		}
	}

	public List<Artículo> getInteresantes() {
		return interesantes;
	}

	public boolean leInteresa(Artículo artículo) {
		List<String> atributos = artículo.atributos();
		List<String> coincidencias = atributos.stream().filter(atributo -> this.getSuscripciones().contains(atributo))
				.toList();
		return this.getSuscripciones().containsAll(coincidencias) && !coincidencias.isEmpty();
	}

	public List<String> getSuscripciones() {
		return suscripciones;
	}

}
