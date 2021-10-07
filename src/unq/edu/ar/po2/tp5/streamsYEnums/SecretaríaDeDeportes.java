package unq.edu.ar.po2.tp5.streamsYEnums;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Secretar�aDeDeportes {

	private List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();

	public List<ActividadSemanal> todaslasDeFutbol() {
		List<ActividadSemanal> lasDeFutbol = this.actividades.stream()
				.filter(actividad -> actividad.getDeporte() == Deporte.F�tbol).toList();
		return lasDeFutbol;
	}

	/**
	 * 
	 * @param complejidad: Un n�mero, representa la complejidad de la/s actividades
	 *                     a buscar.
	 * @return Una lista de las actividades tan complejas como el par�metro
	 *         otorgado.
	 */

	public List<ActividadSemanal> actividadesDeComplejidad_(int complejidad) {
		List<ActividadSemanal> complejas = this.actividades.stream()
				.filter(actividad -> actividad.getDeporte().comlpejidad == complejidad).toList();
		return complejas;
	}

	public void agregarActividades(List<ActividadSemanal> actividades) {
		this.actividades.addAll(actividades);
	}

	public int horasTotales() {
		int horas = this.actividades.stream().mapToInt(actividad -> actividad.getDuraci�n()).sum();
		return horas;
	}

	/**
	 * 
	 * @param deporte: de tipo Deporte.
	 * @return Una actividad semanal, la del deporte dado por el par�metro y menor
	 *         costo.
	 * 
	 *         Increible pero funciona...
	 */

	public ActividadSemanal menorCostoDe_(Deporte deporte) {
		List<ActividadSemanal> menor = this.actividades.stream().filter(actividad -> actividad.getDeporte() == deporte)
				.toList();
		return menor.stream().min(Comparator.comparing(actividad -> actividad.costo())).get();

	}
	
	public String imprimirActividades() {
		String data = null;
        data = this.actividades.toString();
        return data;
	}
	
	/**
	 * Consultar en clase
	 * @return
	 */
	
	/*public Map<Actividad, ActividadSemanal> laMasEcon�mica() {
		Map<Actividad, ActividadSemanal> economica = 
				this.actividades.stream().min(Collectors.groupingBy(actividad -> actividad.costo()));
	} */
	
	

}
