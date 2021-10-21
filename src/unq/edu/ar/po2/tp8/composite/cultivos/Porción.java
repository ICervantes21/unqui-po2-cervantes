package unq.edu.ar.po2.tp8.composite.cultivos;

public class Porción {
	
	private Cultivo cultivo;

	public int getGanancia() {
		return cultivo.getPrecio();
	}

	public Porción(Cultivo cultivo) {
		this.cultivo = cultivo;
	}
	

}
