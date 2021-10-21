package unq.edu.ar.po2.tp7.doubles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PokerStatus {
	
	public boolean verificar(String a, String b, String c, String d, String e) {
		List<String> listaDeStrings = new ArrayList<String>();
		LinkedList<String> listaDePoker = new LinkedList<String>();
		List<String> listaDeNúmeros = new ArrayList<String>();
		listaDeStrings.addAll(Arrays.asList(a, b, c, d, e));
		listaDeNúmeros = this.getNúmerosDeCartas(listaDeStrings);
		listaDePoker.addAll(listaDeNúmeros);
		int contador = 0;
		while (listaDePoker.size() != 0) {
			if (listaDePoker.getFirst() != listaDePoker.get(1)) {
				listaDePoker.remove(0);
			}
			else {
				contador = contador + 1;
				listaDePoker.remove(0);
			}
		}
		return listaDePoker.size() >= 4;
	}
	
	public List<String> getNúmerosDeCartas(List<String> lista) {
		List<String> números; 
		números = lista.stream().map(string -> string.substring(0, string.length()-1)).toList();
		return números;
	}
	

}
