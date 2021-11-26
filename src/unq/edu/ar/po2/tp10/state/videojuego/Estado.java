package unq.edu.ar.po2.tp10.state.videojuego;

public abstract class Estado {
	
	protected int fichas;

	public abstract String iniciar();

	protected void agregarFicha() {
		fichas = fichas + 1;
	}
	
	protected void reiniciar() {
		this.setFichas(0);
		this.iniciar();
	}

	public void setFichas(int fichas) {
		this.fichas = fichas;
	}

	public int getFichas() {
		return fichas;
	}

}
