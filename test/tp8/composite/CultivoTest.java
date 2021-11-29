package tp8.composite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import unq.edu.ar.po2.tp8.composite.cultivos.Porción;
import unq.edu.ar.po2.tp8.composite.cultivos.PorciónMixta;
import unq.edu.ar.po2.tp8.composite.cultivos.Soja;
import unq.edu.ar.po2.tp8.composite.cultivos.Tierra;
import unq.edu.ar.po2.tp8.composite.cultivos.Trigo;

public class CultivoTest {
	
	//SUT
	
	Tierra campo;
	Porción porción1;
	Porción porción2;
	Porción porción3;
	PorciónMixta porciónMixta;
	Soja soja;
	Trigo trigo;
	
	//SetUp
	
	@Before
	public void setUp() throws Exception {
		campo = new Tierra();
		soja = new Soja();
		trigo = new Trigo();
		porción1 = new Porción(soja);
		porción2 = new Porción(soja);
		porción3 = new Porción(trigo);
		/**
		 * @parameter null
		 */
	    porciónMixta = new PorciónMixta(Arrays.asList(soja, soja, trigo, trigo), null);
	}
	
	@Test
	public void testDeControl() {
		//Exercise
		campo.agregarPorciónes(Arrays.asList(porción1, porción2, porción3, porciónMixta));
		int gananciasAnuales = campo.gananciaAnual();
		
		//Verify
		assertEquals(1700, gananciasAnuales);
		assertTrue(porciónMixta.maxCapacidad());
	}

}
