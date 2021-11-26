package unq.edu.ar.po2.tp10.state.mp3;

import java.util.ArrayList;
import java.util.List;

public class MP3 {

	private List<Song> canciones;
	private Song canciónActual;

	public List<Song> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Song> canciones) {
		this.canciones = canciones;
		for (Song s : canciones) {
			s.setReproductor(this);
		}
	}

	public Song getCancionActual() {
		return canciónActual;
	}

	public void setCancionActual(Song cancionActual) {
		this.canciónActual = cancionActual;
	}

	public MP3() {
		this.canciones = new ArrayList<Song>();
	}

	public void selecionar(Song song) { 
		this.setCancionActual(song);

	}

	public void desSeleccionar(Song song) {
		this.setCancionActual(null);
	}

}
