package unq.edu.ar.po2.tp5.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	private List<Registrable> listaDeproductos = new ArrayList<Registrable>();
	private double montoAPagar = 0;

	public List<Registrable> getListaDeproductos() {
		return listaDeproductos;
	}

	public void registrarProducto(Registrable producto) {
		this.listaDeproductos.remove(producto);
		this.montoAPagar = montoAPagar + producto.getPrecio();
	}
	
	public void registrarTodosLosProductos() {
		this.montoAPagar = montoAPagar + this.getPrecios();
		this.listaDeproductos.removeAll(listaDeproductos);
		
	}
	
	public double getPrecios() {
		double monto = this.listaDeproductos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
		return monto;
		
	}

	public void agregarProducto(Registrable producto) {
		this.listaDeproductos.add(producto);
	}

	public double getMontoAPagar() {
		return montoAPagar;
	}

	

}
