package unq.edu.ar.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	@Override
	public double getPrecio() {
		return precio * 0.9;
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean perteneceAPrograma) {
		super(nombre, precio, perteneceAPrograma);
		// TODO Auto-generated constructor stub
	}


}
