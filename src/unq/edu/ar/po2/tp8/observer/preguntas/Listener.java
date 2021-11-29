package unq.edu.ar.po2.tp8.observer.preguntas;

import java.util.List;

public interface Listener {
	
	public void solicitarJugar();
	
	public void puedeJugar();
	
	public void contestarPregunta();
	
	public void termin�ElJuego();
	
	public void setPreguntas(List<Pregunta> p);

}
