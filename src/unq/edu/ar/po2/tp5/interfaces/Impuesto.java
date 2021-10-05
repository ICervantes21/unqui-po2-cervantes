package unq.edu.ar.po2.tp5.interfaces;

public class Impuesto implements Registrable{
	
	private double tasaServicio;

	@Override
	public double getPrecio() {
		return tasaServicio;
	}

	public Impuesto(double tasaServicio) {
		this.tasaServicio = tasaServicio;
	}
	
	

}
