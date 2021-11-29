package tp8.observer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import unq.edu.ar.po2.tp8.observer.artículos.Artículo;
import unq.edu.ar.po2.tp8.observer.artículos.Investigador;
import unq.edu.ar.po2.tp8.observer.artículos.Sistema;

public class SistemaTest {
	
	//SUT
	
	Sistema catálogo;
	Artículo artículo1;
	Artículo artículo2;
	Artículo artículo3;
	Investigador carlos;
	Investigador juán;
	
	
	@Before
	public void setUp() throws Exception {
		
		//SetUp
		catálogo = new Sistema();
		artículo1 = new Artículo("A","B","C","D","E","F");
		artículo2 = new Artículo("G","H","I","J","K","L");
		artículo3 = new Artículo("M","N","Ñ","O","P","Q");
		carlos = new Investigador(Arrays.asList("A","B","K"), catálogo);
		juán = new Investigador(Arrays.asList("G","H"), catálogo);
		catálogo.addObserver(carlos);
		catálogo.addObserver(juán);
	}
	
	/**
	 * Todos los observers fueron notifivacos correctamente.
	 */
	@Test
	public void observerTest() {
		//Exercise
		catálogo.agregarArtículo(artículo1);
		catálogo.agregarArtículo(artículo2);
		catálogo.agregarArtículo(artículo3);
		
		//Verify
		assertTrue(carlos.getInteresantes().size()==2);
		assertTrue(carlos.getInteresantes().contains(artículo1));
		assertTrue(carlos.getInteresantes().contains(artículo2));
		assertFalse(carlos.getInteresantes().contains(artículo3));
		assertTrue(juán.getInteresantes().size() == 1);
		assertTrue(juán.getInteresantes().contains(artículo2));		
	}
	

}
