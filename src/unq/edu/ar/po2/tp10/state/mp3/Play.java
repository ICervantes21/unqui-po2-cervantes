package unq.edu.ar.po2.tp10.state.mp3;

public class Play extends Estado{

	@Override
	public void play(Song song) {
		throw new RuntimeException("Already playing");
		
	}

	@Override
	protected void pause(Song song) {
		song.setState(new Pause());
		
	}

	@Override
	protected void stop(Song song) {
		song.setState(new Stop());
	}
	
	@Override
	protected boolean estaReproduciendo() {
		return true;
	}

}
