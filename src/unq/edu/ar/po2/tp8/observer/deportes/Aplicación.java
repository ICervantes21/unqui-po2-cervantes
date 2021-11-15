package unq.edu.ar.po2.tp8.observer.deportes;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Aplicación extends Observable{
	
	private List<Partido> encuentros;
	private Servidor servidor;
	
	public void addPartido(Partido partido) {
		this.encuentros.add(partido);
		if (this.leInteresaA(servidor, partido)) {
		this.setChanged();
		this.notifyObservers(partido); }
	}
	 
	public Aplicación(Servidor servidor) {
		this.encuentros = new ArrayList<Partido>();
		this.servidor = servidor;
	}
	
	public boolean leInteresaA(Servidor serv, Partido dep) {
		return serv.getSuscripción() == dep.getDeporte();
	}
	
	

}
