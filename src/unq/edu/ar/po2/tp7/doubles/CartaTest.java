package unq.edu.ar.po2.tp7.doubles;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CartaTest {

	Carta P2;
	Carta C2;
	Carta D2;
	Carta T2;
	Carta P10;
	Carta C10;
	Carta P4;
	Carta P5;
	Carta P6;
	PokerStatus poker;

	@BeforeEach
	public void setUp() throws Exception {

		// Set Up
		P2 = new Carta(2, Palo.Pica);
		C2 = new Carta(2, Palo.Corazón);
		D2 = new Carta(2, Palo.Diamante);
		T2 = new Carta(2, Palo.Trebol);
		P10 = new Carta(10, Palo.Pica);
		C10 = new Carta(10, Palo.Corazón);
		P4 = new Carta(4, Palo.Pica);
		P5 = new Carta(5, Palo.Pica);
		P6 = new Carta(6, Palo.Pica);
		poker = mock(PokerStatus.class);
	}

	@Test
	public void testSuperiorA() {
		// Verify
		assertTrue(C10.esMasGrandeQue_(C2));

	}

	@Test
	public void testMismoPalo() {
		// Verify
		assertTrue(C10.mismoPaloQue_(C2));

	}

	@Test
	void testConPoker() {
		// Exercise
		when(poker.verificar(P2, C2, D2, T2, C10)).thenReturn("Poker");

		// Verify
		assertTrue(poker.verificar(P2, C2, D2, T2, C10) == "Poker");
	}

	@Test
	void testColor() {

		// Test Double Configuration
		when(poker.verificar(P10, P4, P5, P6, P2)).thenReturn("Color");

		// Verify
		// el poker.verificar = Exercise
		assertTrue(poker.verificar(P10, P4, P5, P6, P2) == "Color");
	}

	/**
	 * Trio = tres cartas poseen el mismo valor
	 */

	@Test
	void testTrio() {

		// Test Double Configuration
		when(poker.verificar(P2, C2, D2, P4, C10)).thenReturn("Trio");

		// Verify
		// el poker.verificar = Exercise
		assertTrue(poker.verificar(P2, C2, D2, P4, C10) == "Trio");
	}

	@Test
	void testManoGanadora() {
		String manoConPoker = poker.verificar(P2, C2, D2, T2, C10);

		// Test Double Configuration
		when(manoConPoker).thenReturn("Poker");
	}

}
