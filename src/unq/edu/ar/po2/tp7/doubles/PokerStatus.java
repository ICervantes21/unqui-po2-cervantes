package unq.edu.ar.po2.tp7.doubles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerStatus {
	
	public boolean verificar(String a, String b, String c, String d, String e) {
		List<String> listaDeStrings = new ArrayList<String>();
		List<String> listaDePoker = new ArrayList<String>();
		List<String> listaDeN�meros = new ArrayList<String>();
		listaDeStrings.addAll(Arrays.asList(a, b, c, d, e));
		listaDeN�meros = this.getN�merosDeCartas(listaDeStrings);
		listaDePoker= listaDeN�meros.stream().map(string -> string.chars().anyMatch(listaDeN�meros.));
	}
	
	public List<String> getN�merosDeCartas(List<String> lista) {
		List<String> n�meros; 
		n�meros = lista.stream().map(string -> string.substring(string.length(), string.length())).toList();
		return n�meros;
	}
	

}
