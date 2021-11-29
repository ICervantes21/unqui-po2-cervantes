package tp8.observer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import unq.edu.ar.po2.tp8.observer.art�culos.Art�culo;
import unq.edu.ar.po2.tp8.observer.art�culos.Investigador;
import unq.edu.ar.po2.tp8.observer.art�culos.Sistema;

public class SistemaTest {
	
	//SUT
	
	Sistema cat�logo;
	Art�culo art�culo1;
	Art�culo art�culo2;
	Art�culo art�culo3;
	Investigador carlos;
	Investigador ju�n;
	
	
	@Before
	public void setUp() throws Exception {
		
		//SetUp
		cat�logo = new Sistema();
		art�culo1 = new Art�culo("A","B","C","D","E","F");
		art�culo2 = new Art�culo("G","H","I","J","K","L");
		art�culo3 = new Art�culo("M","N","�","O","P","Q");
		carlos = new Investigador(Arrays.asList("A","B","K"), cat�logo);
		ju�n = new Investigador(Arrays.asList("G","H"), cat�logo);
		cat�logo.addObserver(carlos);
		cat�logo.addObserver(ju�n);
	}
	
	/**
	 * Todos los observers fueron notifivacos correctamente.
	 */
	@Test
	public void observerTest() {
		//Exercise
		cat�logo.agregarArt�culo(art�culo1);
		cat�logo.agregarArt�culo(art�culo2);
		cat�logo.agregarArt�culo(art�culo3);
		
		//Verify
		assertTrue(carlos.getInteresantes().size()==2);
		assertTrue(carlos.getInteresantes().contains(art�culo1));
		assertTrue(carlos.getInteresantes().contains(art�culo2));
		assertFalse(carlos.getInteresantes().contains(art�culo3));
		assertTrue(ju�n.getInteresantes().size() == 1);
		assertTrue(ju�n.getInteresantes().contains(art�culo2));		
	}
	

}
