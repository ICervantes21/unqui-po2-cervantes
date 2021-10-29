package unq.edu.ar.po2.tp8.observer;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class SistemaTest {
	
	//SUT
	
	Sistema catálogo;
	Artículo artículo1;
	Artículo artículo2;
	Artículo artículo3;
	Investigador carlos;
	Investigador juán;
	String A, B, C, D, E, F, G, H, I, J, K, L, M, N, Ñ, O, P, Q;
	
	
	@Before
	public void setUp() throws Exception {
		catálogo = new Sistema();
		artículo1 = new Artículo(A,B,C,D,E,F);
		artículo2 = new Artículo(G,H,I,J,K,L);
		artículo3 = new Artículo(M,N,Ñ,O,P,Q);
		carlos = new Investigador(Arrays.asList(A,B,K), catálogo);
		juán = new Investigador(Arrays.asList(G,H), catálogo);
	}
	
	@Test
	public void observerTest() {
		//Exercise
		catálogo.agregarArtículo(artículo1);
		catálogo.agregarArtículo(artículo2);
		catálogo.agregarArtículo(artículo3);
		
		//Verify
		assertTrue(carlos.getInteresantes().size()==0);
		
	}
	

}
