package unq.edu.ar.po2.tp10.state.mp3;

public class Stop extends Estado {

	@Override
	public void play(Song song) {
		song.setState(new Play());

	}

	@Override
	protected void pause(Song song) {
		throw new RuntimeException("Ya está en stop");

	}

	@Override
	protected void stop(Song song) {

	}

}
