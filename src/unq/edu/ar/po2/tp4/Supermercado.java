package unq.edu.ar.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	@SuppressWarnings("unused")
	private String nombre;
	@SuppressWarnings("unused")
	private String direcci�n;
	
	
	
	public Supermercado(String nombre, String direcci�n) {
		this.nombre = nombre;
		this.direcci�n = direcci�n;
	}



	private List<Producto> cat�logo = new ArrayList<Producto>();



	public void agregarProducto(Producto producto) {
		this.cat�logo.add(producto);
		
	}



	public double getPrecioTotal() {
		double total = this.cat�logo.stream().mapToDouble(producto -> producto.precio).sum();
		return total;
	}



	public int getCantidadDeProductos() {
		return this.cat�logo.size();
	}

}
