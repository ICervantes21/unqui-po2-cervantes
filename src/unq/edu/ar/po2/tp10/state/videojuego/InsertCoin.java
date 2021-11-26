package unq.edu.ar.po2.tp10.state.videojuego;

public class InsertCoin extends Estado {

	@Override
	public String iniciar() {
		String pantalla = null;
		if (fichas == 0) {
			pantalla = "Insertar ficha";
		}
		return pantalla;
	}

}
