package unq.edu.ar.po2.tp8.observer.deportes;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Servidor implements Observer {

	private List<Partido> encuentrosInteresantes;
	private String suscripción;

	@Override
	public void update(Observable o, Object arg) {

		this.encuentrosInteresantes.add((Partido) arg);

	}

	public String getSuscripción() {
		return suscripción;
	}

	public List<Partido> getEncuentrosInteresantes() {
		return encuentrosInteresantes;
	}

	public boolean leInteresa(Partido partido) {
		return partido.getDeporte() == this.suscripción;
	}

	public Servidor(String suscripción) {
		this.encuentrosInteresantes = new ArrayList<Partido>();
		this.suscripción = suscripción;
	}

}
