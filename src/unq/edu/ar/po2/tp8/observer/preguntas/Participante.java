package unq.edu.ar.po2.tp8.observer.preguntas;

import java.util.List;

public class Participante implements Listener {

	private JuegoDePreguntas servidor;
	private boolean puedeJugar;
	private List<Pregunta> preguntas;

	@Override
	public void solicitarJugar() {
		servidor.añadirParticipante(this);

	}

	@Override
	public void puedeJugar() {
		this.puedeJugar = true;
	}

	@Override
	public void contestarPregunta() {
		// TODO Auto-generated method stub

	}

	@Override
	public void terminóElJuego() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPreguntas(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

}
