package unq.edu.ar.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Solicitable> solicitudesDeCr�dito = new ArrayList<Solicitable>();

	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public void agregarSolicitud(Solicitable solicitud) {
		this.solicitudesDeCr�dito.add(solicitud);
	}

	public List<Solicitable> getAceptables() {
		List<Solicitable> aceptables = this.solicitudesDeCr�dito.stream().filter(solicitud -> solicitud.aceptable())
				.toList();
		return aceptables;
	}

	public double getMontosSolicitados() {
		List<Solicitable> aceptables = this.getAceptables();
		double cantidad = aceptables.stream().mapToDouble(Solicitable::getMontoSolicitado).sum();
		return cantidad;
	}

	public List<Solicitable> getSolicitudesDeCr�dito() {
		return solicitudesDeCr�dito;
	}

}
