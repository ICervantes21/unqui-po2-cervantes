package unq.edu.ar.po2.tp8.composite.cultivos;

import java.util.Arrays;

import org.junit.Before;

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
	    porciónMixta = new PorciónMixta(Arrays.asList(soja, soja, trigo, trigo), null);
	}

}
