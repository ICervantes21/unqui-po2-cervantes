package unq.edu.ar.po2.tp7.doubles;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PokerTest {
	
	//SUT
	
	PokerStatus poker;
	
	//SetUp
	
	@Before
	public void setUp() throws Exception {
		poker = new PokerStatus();
	}
	
	@Test
	public void testPokerString() {
		//Exercise
		//Verify
		
		assertTrue(poker.verificar("3E", "3P", "3C", "4T", "9E"));
		
	}

}
