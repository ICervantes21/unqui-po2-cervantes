package unq.edu.ar.po2.tp8.composite.cultivos;

public class Porci�n {
	
	private Cultivo cultivo;

	public int getGanancia() {
		return cultivo.getPrecio();
	}

	public Porci�n(Cultivo cultivo) {
		this.cultivo = cultivo;
	}
	

}
