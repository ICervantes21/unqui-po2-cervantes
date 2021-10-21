package unq.edu.ar.po2.tp7.doubles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerStatus {
	
	public boolean verificar(String a, String b, String c, String d, String e) {
		List<String> listaDeStrings = new ArrayList<String>();
		List<String> listaDePoker = new ArrayList<String>();
		List<String> listaDeNúmeros = new ArrayList<String>();
		listaDeStrings.addAll(Arrays.asList(a, b, c, d, e));
		listaDeNúmeros = this.getNúmerosDeCartas(listaDeStrings);
		listaDePoker= listaDeNúmeros.stream().map(string -> string.chars().anyMatch(listaDeNúmeros.));
	}
	
	public List<String> getNúmerosDeCartas(List<String> lista) {
		List<String> números; 
		números = lista.stream().map(string -> string.substring(string.length(), string.length())).toList();
		return números;
	}
	

}
