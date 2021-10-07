package unq.edu.ar.po2.tp5.streamsYEnums;

public class ActividadSemanal {

	private Día día = null;
	private int horaDeInicio;
	private int duración;
	private Deporte deporte;

	public int costo() {
		if (día.esDíaBarato()) {
			return 500 * getDeporte().comlpejidad;
		}
		else {
			return 1000 * getDeporte().comlpejidad;
		}
	}

	public ActividadSemanal(Día día, int horaDeInicio, int duración, Deporte deporte) {
		this.día = día;
		this.horaDeInicio = horaDeInicio;
		this.duración = duración;
		this.deporte = deporte;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public int getDuración() {
		return duración;
	}

	public void setDía(Día día) {
		this.día = día;
	}
	
	@Override
	public String toString() {
		return "Deporte: " + this.deporte + ". Día: " + this.día + " a las " + this.horaDeInicio + ". Duración: " + 
	this.duración + " horas.";
		
	}
		
	

}
