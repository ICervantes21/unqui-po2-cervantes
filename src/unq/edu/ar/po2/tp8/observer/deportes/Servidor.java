package unq.edu.ar.po2.tp8.observer.deportes;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Servidor implements Observer {

	private List<Partido> encuentrosInteresantes;
	private String suscripci�n;

	@Override
	public void update(Observable o, Object arg) {

		this.encuentrosInteresantes.add((Partido) arg);

	}

	public String getSuscripci�n() {
		return suscripci�n;
	}

	public List<Partido> getEncuentrosInteresantes() {
		return encuentrosInteresantes;
	}

	public boolean leInteresa(Partido partido) {
		return partido.getDeporte() == this.suscripci�n;
	}

	public Servidor(String suscripci�n) {
		this.encuentrosInteresantes = new ArrayList<Partido>();
		this.suscripci�n = suscripci�n;
	}

}
