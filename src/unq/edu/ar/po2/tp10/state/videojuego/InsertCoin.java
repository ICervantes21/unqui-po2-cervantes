package unq.edu.ar.po2.tp10.state.videojuego;

public class InsertCoin extends Estado {

	@Override
	public String iniciar(Videojuego videojuego) {
		String pantalla = null;
		if (videojuego.getFichas() == 0) {
			this.cambiarEstado(videojuego);
			pantalla = "Insertar ficha";
		}
		return pantalla;
	}

	@Override
	protected void cambiarEstado(Videojuego videojuego) {
		videojuego.setState(new UnJugador());
		
	}

}
