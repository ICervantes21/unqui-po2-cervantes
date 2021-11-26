package unq.edu.ar.po2.tp10.state.videojuego;

public class DosJugadores extends Estado {

	@Override
	public String iniciar() {
		String pantalla = null;
		if (fichas == 2) {
			pantalla = "2 Jugadores";
		}
		return pantalla;
	}

}
