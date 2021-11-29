package tp3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import unq.edu.ar.po2.tp3.Counter;

public class CounterTestCase {
	private Counter counter;
	/** Crea un escenario de test básico, que consiste en un contador
	 * con 10 enteros.
	 * 
	 * @Throws Exception
	 */
	
	@Before
	public void setUp() throws Exception {
		//Se crea el contador.
		counter = new Counter();
		
		//Se agregan los números.
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	
	/** 
	 * Verifica la cantidad de pares.
	 */
	
	@Test
	public void testEvenNumbers() {
		int amount = counter.getEvenOcurrences();
		assertEquals(1, amount);
	}
	
	/**
	 * Verifica la cantidad de impares.
	 */
	
	@Test
	public void testNotEvenNumbers() {
		int amount = counter.getNotEvenOcurrences();
		assertEquals(9, amount);
	}
	
	/**
	 * Verifica la cantidad de múltiplos de un número.
	 */
	
	@Test
	public void testMúltiplos() {
		int amount = counter.getMultiplosDe(7); //should be 3...
		assertEquals(6, amount); //no anda
	}

}
