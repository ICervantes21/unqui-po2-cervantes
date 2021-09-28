package unq.edu.ar.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	@SuppressWarnings("unused")
	private String nombre;
	@SuppressWarnings("unused")
	private String dirección;
	
	
	
	public Supermercado(String nombre, String dirección) {
		this.nombre = nombre;
		this.dirección = dirección;
	}



	private List<Producto> catálogo = new ArrayList<Producto>();



	public void agregarProducto(Producto producto) {
		this.catálogo.add(producto);
		
	}



	public double getPrecioTotal() {
		double total = this.catálogo.stream().mapToDouble(producto -> producto.precio).sum();
		return total;
	}



	public int getCantidadDeProductos() {
		return this.catálogo.size();
	}

}
