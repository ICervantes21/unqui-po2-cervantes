package unq.edu.ar.po2.tp7.doubles;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
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
	public void setUp() throws Exception{
		
		//Set Up
		P2 = new Carta(2, Palo.Pica);
		C2 = new Carta(2, Palo.Corazón);
		D2 = new Carta(2, Palo.Diamante);
		T2 = new Carta(2, Palo.Trebol);
		P10 = new Carta(10, Palo.Pica);
		C10 = new Carta(10, Palo.Corazón);
		P4 = new Carta(4, Palo.Pica);
		P5 = new Carta(5, Palo.Pica);
		P6 = new Carta(6, Palo.Pica);
		poker = new PokerStatus();
	}
	
	@Test
	public void pokerTest() {
		List<Carta> manoDePoker = Arrays.asList(P2, C2, D2, T2, C10);
		assertTrue(poker.hayPoker(manoDePoker));
	}
	

}
