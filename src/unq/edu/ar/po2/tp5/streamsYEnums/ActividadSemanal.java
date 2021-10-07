package unq.edu.ar.po2.tp5.streamsYEnums;

public class ActividadSemanal {

	private D�a d�a = null;
	private int horaDeInicio;
	private int duraci�n;
	private Deporte deporte;

	public int costo() {
		if (d�a.esD�aBarato()) {
			return 500 * getDeporte().comlpejidad;
		}
		else {
			return 1000 * getDeporte().comlpejidad;
		}
	}

	public ActividadSemanal(D�a d�a, int horaDeInicio, int duraci�n, Deporte deporte) {
		this.d�a = d�a;
		this.horaDeInicio = horaDeInicio;
		this.duraci�n = duraci�n;
		this.deporte = deporte;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public int getDuraci�n() {
		return duraci�n;
	}

	public void setD�a(D�a d�a) {
		this.d�a = d�a;
	}
	
	@Override
	public String toString() {
		return "Deporte: " + this.deporte + ". D�a: " + this.d�a + " a las " + this.horaDeInicio + ". Duraci�n: " + 
	this.duraci�n + " horas.";
		
	}
		
	

}
