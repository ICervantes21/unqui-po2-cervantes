package unq.edu.ar.po2.tp10.state.encriptador;

public class EncriptadorNaive {

	private Encriptador state;

	/**
	 * Método handle
	 * 
	 * @param texto
	 * @return El texto encriptado
	 */
	public String encriptar(String texto) {
		return state.encriptar(texto);
	}

	public String desencriptar(String texto) {
		return state.desencriptar(texto);
	}

	/**
	 * @param state
	 */
	public EncriptadorNaive(Encriptador state) {
		super();
		this.state = state;
	}

}
