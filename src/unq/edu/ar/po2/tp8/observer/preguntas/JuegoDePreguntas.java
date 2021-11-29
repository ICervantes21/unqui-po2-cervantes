package unq.edu.ar.po2.tp8.observer.preguntas;

import java.util.List;

public class JuegoDePreguntas {

	private List<Pregunta> preguntas;
	private List<Listener> listeners;

	public void añadirParticipante(Listener p) {
		this.listeners.add(p);
	}

	public void setPreguntas(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
	
	public void comenzarJuego() {
		if (this.hayCincoJugadores()) {
			this.notificarAParticipantes();
		}
	}

	private void notificarAParticipantes() {
		for (Listener l : listeners) {
			l.puedeJugar();
			l.setPreguntas(preguntas);
		}
		
	}

	private boolean hayCincoJugadores() {
		return this.listeners.size() == 5;
	}

}
