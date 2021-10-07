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
	
	/**
	 * 
	 * @param complejidad: Un número, representa la complejidad de la/s actividades a buscar.
	 * @return Una lista de las actividades tan complejas como el parámetro otorgado.
	 */
	
	public List<ActividadSemanal> actividadesDeComplejidad_(int complejidad) {
		List<ActividadSemanal> complejas = this.actividades.stream().filter(actividad -> actividad.getDeporte().comlpejidad == 
				complejidad).toList();
		return complejas;
	}
	
	public void agregarActividades(List<ActividadSemanal> actividades) {
		this.actividades.addAll(actividades);
	}

}
