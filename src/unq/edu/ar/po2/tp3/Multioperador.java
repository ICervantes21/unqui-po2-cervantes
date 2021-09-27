package unq.edu.ar.po2.tp3;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ignacio
 * 
 * TP3, ejercicio 6: Multioperador.
 *
 */

public class Multioperador {
	
	private List<Integer> listaDeEnteros = new ArrayList<Integer>();
	
	public int sumarLosEnteros() {
		int resultado = listaDeEnteros.stream().reduce(0, (acumulado, nuevo) -> (acumulado + nuevo));
		return resultado;
	}
	
	public int restarLosEnteros() {
		int resultado = listaDeEnteros.stream().reduce(0, (acumulado, nuevo) -> (acumulado - nuevo));
		return resultado;
	}
	
	/**
	 * Notar en este caso que se debe comenzar con un 1 al ser multiplicación.
	 */
	
	public int multiplicarLosEnteros() {
		int resultado = listaDeEnteros.stream().reduce(1, (acumulado, nuevo) -> (acumulado * nuevo));
		return resultado;
	}
	
	public void addNumber(int número) {
		listaDeEnteros.add(número);
	}

}
