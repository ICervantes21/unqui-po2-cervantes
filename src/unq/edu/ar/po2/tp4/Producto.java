package unq.edu.ar.po2.tp4;

public class Producto {

	private String nombre;
	protected double precio;
	boolean esPrecioCuidado;


	public double getPrecio() {
		return precio;
	}

	public Producto(String nombre, double precio, boolean perteneceAPrograma) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = perteneceAPrograma;
	}

	public String getNombre() {
		return nombre;
	}


	public void aumentarPrecio(double d) {
		this.precio = precio + d;

	}

}
