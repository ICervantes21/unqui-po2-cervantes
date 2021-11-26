package unq.edu.ar.po2.tp10.state.mp3;

public class Song {

	private Estado state;
	private MP3 reproductor;

	public void play() {
		state.play(this);
		reproductor.selecionar(this);
	}

	public void pause() {
		state.pause(this);
	}

	public void stop() {
		state.stop(this);
		reproductor.desSeleccionar(this);
	}

	public void setState(Estado state) {
		this.state = state;
	}

	public void setReproductor(MP3 reproductor) {
		this.reproductor = reproductor;
	}
	
	public Song() {
		state = new Stop();
	}

	public Estado getState() {
		return state;
	}

	

}
