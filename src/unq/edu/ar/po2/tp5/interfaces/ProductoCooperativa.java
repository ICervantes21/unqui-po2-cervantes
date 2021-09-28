package unq.edu.ar.po2.tp5.interfaces;

public class ProductoCooperativa implements Registrable {
	
	private double precio;

	@Override
	public double getPrecio() {
		return this.precio * 0.10;
	}

	public ProductoCooperativa(double precio) {
		this.precio = precio;
	}

}
