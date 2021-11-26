package unq.edu.ar.po2.tp10.state.videojuego;

public class Videojuego {

	private Estado state = new InsertCoin();
	private int fichas;

	
	public String iniciar() {
		return state.iniciar(this);
	}

	public void registrarFicha() {
		this.fichas = this.fichas + 1;
		this.siguienteEstado();
	}

	public Estado getState() {
		return state;
	}

	public void setState(Estado state) {
		this.state = state;
	}

	public void reiniciar() {
		fichas = 0;
		this.setState(new InsertCoin());
	}

	public int getFichas() {
		return fichas;
	}

	public void siguienteEstado() {
		state.cambiarEstado(this);
	}

}
