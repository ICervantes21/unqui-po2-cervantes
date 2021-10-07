package unq.edu.ar.po2.tp5.streamsYEnums;

import java.util.ArrayList;
import java.util.List;

public class SecretaríaDeDeportes {
	
	private List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
	
	public List<ActividadSemanal> todaslasDeFutbol() {
		List<ActividadSemanal> lasDeFutbol = this.actividades.stream().filter(actividad -> actividad.getDeporte() == 
				Deporte.Fútbol).toList();
		return lasDeFutbol;
	}
	
	public void agregarActividades(List<ActividadSemanal> actividades) {
		this.actividades.addAll(actividades);
	}

}
