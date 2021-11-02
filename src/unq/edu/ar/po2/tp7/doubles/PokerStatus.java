package unq.edu.ar.po2.tp7.doubles;

import java.util.List;

public class PokerStatus {
	
	/*public boolean verificar(String a, String b, String c, String d, String e) {
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
	}*/
	
	public boolean hayPoker(List<Carta> manoDePoker) {
		/*List<Integer> valores = manoDePoker.stream().map(carta -> carta.getValor()).toList();
		List<Integer> poker = new ArrayList<Integer>();
		while (valores.size() != 1) {
			if (valores.get(0) == valores.get(1)) {
				poker.add(0);
				valores.remove(0);
			}
			else {
				valores.remove(0);
			}
		}
		return !poker.isEmpty();*/
		return manoDePoker.isEmpty();
		
	}
	
	
	/*public List<String> getNúmerosDeCartas(List<String> lista) {
		List<String> números; 
		números = lista.stream().map(string -> string.substring(0, string.length() - 1)).toList();
		return números;
	}*/
	

}
