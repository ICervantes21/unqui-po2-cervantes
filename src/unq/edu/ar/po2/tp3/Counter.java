package unq.edu.ar.po2.tp3;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Counter {
	
	private ArrayList<Integer> contador = new ArrayList<Integer>();
	
	public void addNumber(int n�mero) {
		this.contador.add(n�mero);
	}
	
	public int getEvenOcurrences() {
		Stream<Integer> amount = contador.stream().filter(n�mero -> n�mero % 2 == 0);
		return amount.toList().size();
	}
	
	public int getNotEvenOcurrences() {
		Stream<Integer> amount = contador.stream().filter(n�mero -> n�mero % 2 != 0);
		return amount.toList().size();
	}
	
	public int getMultiplosDe(int n�mero) {
		Stream<Integer> amount = contador.stream().filter(number -> this.esMultiplo(n�mero, number) );
		return amount.toList().size();
	}
	
	public boolean esMultiplo(int n�mero1, int n�mero2) {
		return Math.floorMod(n�mero1, n�mero2) == 0;
	}

}
