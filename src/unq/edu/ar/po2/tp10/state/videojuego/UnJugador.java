package unq.edu.ar.po2.tp10.state.videojuego;

public class UnJugador extends Estado {


	@Override
	public String iniciar(Videojuego videojuego) {
		String pantalla = null;
		if (videojuego.getFichas() == 1) {
			this.cambiarEstado(videojuego);
			pantalla = "1 Jugador";
		}
		return pantalla;
	}

	@Override
	protected void cambiarEstado(Videojuego videojuego) {
		videojuego.setState(new DosJugadores());;
		
	}

}
