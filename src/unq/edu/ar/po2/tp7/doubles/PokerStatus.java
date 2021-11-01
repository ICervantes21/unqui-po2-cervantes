package unq.edu.ar.po2.tp7.doubles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PokerStatus {
	
	public boolean verificar(String a, String b, String c, String d, String e) {
		List<String> listaDeStrings = new ArrayList<String>();
		List<String> listaDeNúmeros = new ArrayList<String>();
		listaDeStrings.addAll(Arrays.asList(a, b, c, d, e));
		listaDeNúmeros = this.getNúmerosDeCartas(listaDeStrings);
		int contador = 0;
		for (String i : listaDeNúmeros) {
			if (i.equals(i));
			contador = contador + 1;
		}
		return contador >= 4;
	}
	
	public List<String> getNúmerosDeCartas(List<String> lista) {
		List<String> números; 
		números = lista.stream().map(string -> string.substring(0, string.length() - 1)).toList();
		return números;
	}
	

}
