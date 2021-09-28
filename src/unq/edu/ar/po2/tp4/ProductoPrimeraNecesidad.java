package unq.edu.ar.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	public double getPrecio(double descuento) {
		return precio * descuento;
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean perteneceAPrograma) {
		super(nombre, precio, perteneceAPrograma);
		// TODO Auto-generated constructor stub
	}


}
