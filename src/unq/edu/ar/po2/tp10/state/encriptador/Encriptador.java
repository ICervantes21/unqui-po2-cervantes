package unq.edu.ar.po2.tp10.state.encriptador;

/**
 * 
 * @author Ignacio Cervantes
 *
 */

public abstract class Encriptador {
	
	/**
	 * State class
	 */

	protected abstract String encriptar(String texto);

	protected abstract String desencriptar(String texto);

}
