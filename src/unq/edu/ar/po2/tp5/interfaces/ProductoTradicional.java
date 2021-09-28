package unq.edu.ar.po2.tp5.interfaces;

public class ProductoTradicional implements Registrable {
	
	private double precio;

	@Override
	public double getPrecio() {
		return this.precio;
	}

	public ProductoTradicional(double precio) {
		this.precio = precio;
	}

}
