package tp10.state.mp3;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import unq.edu.ar.po2.tp10.state.mp3.*;


public class TestPlay {
	
	MP3 mp3;
	Song A;
	Song B;
	
	@Before
	public void setUp() throws Exception {
		mp3 = new MP3();
		A = new Song(); 
		B = new Song();
		mp3.setCanciones(Arrays.asList(A,B));
	}
	
	@Test
	public void testPlay() {
		assertTrue(mp3.getCanciones().contains(A));
		A.play();
		
		// Verify
	    assertTrue(mp3.getCancionActual().equals(A));
		// assertThrows(new RuntimeException(), A.play());
	    B.play();
	    assertTrue(mp3.getCancionActual().equals(B));
	    
	    B.pause();
	    assertTrue(mp3.getCancionActual().equals(B));
	    
	    B.stop();
	    assertNull(mp3.getCancionActual());
	}

}
