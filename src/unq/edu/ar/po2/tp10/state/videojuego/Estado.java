package unq.edu.ar.po2.tp10.state.videojuego;

public abstract class Estado {

	public abstract String iniciar(Videojuego videojuego);

	protected abstract void cambiarEstado(Videojuego videojuego);

	
}
