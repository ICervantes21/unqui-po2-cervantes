package unq.edu.ar.po2.tp5.streamsYEnums;

public class ActividadSemanal {

	private Día día = null;
	private int horaDeInicio;
	private int duración;
	private Deporte deporte;

	public int costo() {
		if (día.esDíaBarato()) {
			return 500 * deporte.comlpejidad;
		}
		else {
			return 1000 * deporte.comlpejidad;
		}
	}

	public ActividadSemanal(Día día, int horaDeInicio, int duración, Deporte deporte) {
		this.día = día;
		this.horaDeInicio = horaDeInicio;
		this.duración = duración;
		this.deporte = deporte;
	}
	
	

}
