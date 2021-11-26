package unq.edu.ar.po2.tp10.state.videojuego;

public class Videojuego {

	private Estado state = new InsertCoin();

	public String iniciar() {
		return state.iniciar();
	}

	public void registrarFicha() {
		state.agregarFicha();
	}

	public Estado getState() {
		return state;
	}

	public void setState(Estado state) {
		this.state = state;
	}

	public void reiniciar() {
		state.reiniciar();
	}

	public int getFichas() {
		return state.getFichas();
	}

	public void cambiarEstado() {
		if (this.getFichas() == 1) {
			this.setState(new UnJugador());
		}
		if (this.getFichas() == 2) {
			this.setState(new DosJugadores());
		} else {
			this.setState(new InsertCoin());
		}
	}

}
