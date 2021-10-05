package unq.edu.ar.po2.tp5.interfaces;

public class Servicio implements Registrable{
	
	private double costo;
	private int unidades;
	
	@Override
	public double getPrecio() {
		return costo * unidades;
	}

	public Servicio(double costo, int unidades) {
		this.costo = costo;
		this.unidades = unidades;
	}


}
