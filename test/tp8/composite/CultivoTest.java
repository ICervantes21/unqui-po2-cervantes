package tp8.composite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import unq.edu.ar.po2.tp8.composite.cultivos.Porci�n;
import unq.edu.ar.po2.tp8.composite.cultivos.Porci�nMixta;
import unq.edu.ar.po2.tp8.composite.cultivos.Soja;
import unq.edu.ar.po2.tp8.composite.cultivos.Tierra;
import unq.edu.ar.po2.tp8.composite.cultivos.Trigo;

public class CultivoTest {
	
	//SUT
	
	Tierra campo;
	Porci�n porci�n1;
	Porci�n porci�n2;
	Porci�n porci�n3;
	Porci�nMixta porci�nMixta;
	Soja soja;
	Trigo trigo;
	
	//SetUp
	
	@Before
	public void setUp() throws Exception {
		campo = new Tierra();
		soja = new Soja();
		trigo = new Trigo();
		porci�n1 = new Porci�n(soja);
		porci�n2 = new Porci�n(soja);
		porci�n3 = new Porci�n(trigo);
		/**
		 * @parameter null
		 */
	    porci�nMixta = new Porci�nMixta(Arrays.asList(soja, soja, trigo, trigo), null);
	}
	
	@Test
	public void testDeControl() {
		//Exercise
		campo.agregarPorci�nes(Arrays.asList(porci�n1, porci�n2, porci�n3, porci�nMixta));
		int gananciasAnuales = campo.gananciaAnual();
		
		//Verify
		assertEquals(1700, gananciasAnuales);
		assertTrue(porci�nMixta.maxCapacidad());
	}

}
