package unq.edu.ar.po2.tp3;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Counter {
	
	private ArrayList<Integer> contador = new ArrayList<Integer>();
	
	public void addNumber(int número) {
		this.contador.add(número);
	}
	
	public int getEvenOcurrences() {
		Stream<Integer> amount = contador.stream().filter(número -> número % 2 == 0);
		return amount.toList().size();
	}
	
	public int getNotEvenOcurrences() {
		Stream<Integer> amount = contador.stream().filter(número -> número % 2 != 0);
		return amount.toList().size();
	}
	
	public int getMultiplosDe(int número) {
		Stream<Integer> amount = contador.stream().filter(number -> this.esMultiplo(número, number) );
		return amount.toList().size();
	}
	
	public boolean esMultiplo(int número1, int número2) {
		return Math.floorMod(número1, número2) == 0;
	}

}
