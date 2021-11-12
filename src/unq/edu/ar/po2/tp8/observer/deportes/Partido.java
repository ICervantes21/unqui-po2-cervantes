package unq.edu.ar.po2.tp8.observer.deportes;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class Partido extends Observable {

	private String resultado;
	private List<Equipo> contrincantes;
	private String deporte;

	public String getResultado() {
		return resultado;
	}

	public List<Equipo> getContrincantes() {
		return contrincantes;
	}

	public String getDeporte() {
		return deporte;
	}

	public Partido(String resultado, List<Equipo> contrincantes, String deporte) {
		this.contrincantes = new ArrayList<Equipo>();
		this.resultado = resultado;
		this.contrincantes = contrincantes;
		this.deporte = deporte;
	}

}
