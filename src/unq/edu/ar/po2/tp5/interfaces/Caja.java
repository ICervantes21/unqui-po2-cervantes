package unq.edu.ar.po2.tp5.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	private List<Registrable> listaDeproductos = new ArrayList<Registrable>();
	private double montoAPagar;

	public void registrarRegistrable(Registrable producto) {
		this.listaDeproductos.remove(producto);
		this.montoAPagar = montoAPagar + producto.getPrecio();
	}

	public void agregarProducto(Registrable producto) {
		this.listaDeproductos.add(producto);
	}

	public double getMontoAPagar() {
		return montoAPagar;
	}

	public Caja(List<Registrable> listaDeproductos, int montoAPagar) {
		this.listaDeproductos = listaDeproductos;
		this.montoAPagar = montoAPagar;
	}

}
