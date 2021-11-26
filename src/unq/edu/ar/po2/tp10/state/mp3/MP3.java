package unq.edu.ar.po2.tp10.state.mp3;

import java.util.ArrayList;
import java.util.List;

public class MP3 {

	private List<Song> canciones;
	private Song canci�nActual;

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
		return canci�nActual;
	}

	public void setCancionActual(Song cancionActual) {
		this.canci�nActual = cancionActual;
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
