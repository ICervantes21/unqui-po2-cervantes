package unq.edu.ar.po2.tp10.state.videojuego;

public class UnJugador extends Estado {

	@Override
	public String iniciar() {
		String pantalla = null;
		if (fichas == 1) {
			pantalla = "1 Jugador";
		}
		return pantalla;
	}

}
