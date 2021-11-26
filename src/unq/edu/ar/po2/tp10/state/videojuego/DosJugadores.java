package unq.edu.ar.po2.tp10.state.videojuego;

public class DosJugadores extends Estado {

	@Override
	public String iniciar(Videojuego videojuego) {
		String pantalla = null;
		if (videojuego.getFichas() == 2) {
			this.cambiarEstado(videojuego);
			pantalla = "2 Jugadores";
		}
		return pantalla;
	}

	@Override
	protected void cambiarEstado(Videojuego videojuego) {
		videojuego.setState(this);
		
	}

}
