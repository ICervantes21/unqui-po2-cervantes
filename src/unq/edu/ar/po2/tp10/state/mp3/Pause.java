package unq.edu.ar.po2.tp10.state.mp3;

public class Pause extends Estado {

	@Override
	public void play(Song song) {
		song.setState(new Play());
	}

	@Override
	protected void pause(Song song) {
		throw new RuntimeException("Ya esta en pausa");

	}

	@Override
	protected void stop(Song song) {
		song.setState(new Stop());

	}
	
	@Override
	protected boolean estaEnPausa() {
		return true;
	}

}
