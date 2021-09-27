package unq.edu.ar.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	
	private List<Integer> listaDeEnteros = new ArrayList<Integer>();
	
	public int sumarLosEnteros() {
		int resultado = listaDeEnteros.stream().reduce(0, (acumulado, nuevo) -> (acumulado + nuevo));
		return resultado;
	}
	
	public void addNumber(int número) {
		listaDeEnteros.add(número);
	}

}
