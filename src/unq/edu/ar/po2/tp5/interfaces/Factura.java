package unq.edu.ar.po2.tp5.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Factura implements Registrable {

	private List<Registrable> serviciosEImpuestos = new ArrayList<Registrable>();
	private Agencia agencia;

	@Override
	public double getPrecio() {
		double monto = this.serviciosEImpuestos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
		agencia.registrarPago(this);
		return monto;

	}
	
	/**
	 * 
	 * @param registrable: Debe ser un servicio o un impuesto.
	 */
	
	public void agregarRegistrable(Registrable registrable) {
		this.serviciosEImpuestos.add(registrable);
	}

	public List<Registrable> getServiciosEImpuestos() {
		return serviciosEImpuestos;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

}
