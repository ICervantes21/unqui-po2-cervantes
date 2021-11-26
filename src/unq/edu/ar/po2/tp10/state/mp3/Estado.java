package unq.edu.ar.po2.tp10.state.mp3;

public abstract class Estado {

	public abstract void play(Song song);

	protected abstract void pause(Song song);

	protected abstract void stop(Song song);

	protected boolean estaReproduciendo() {
		return false;
	}

	protected boolean estaEnPausa() {
		return false;
	}

	protected boolean estaEnStop() {
		return false;
	}

}
