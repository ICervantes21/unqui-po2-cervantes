package tp9.template;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import unq.edu.ar.po2.tp9.template.method.wikipedia.LetraInicial;
import unq.edu.ar.po2.tp9.template.method.wikipedia.MismoLink;
import unq.edu.ar.po2.tp9.template.method.wikipedia.PropiedadComun;
import unq.edu.ar.po2.tp9.template.method.wikipedia.Wikipedia;
import unq.edu.ar.po2.tp9.template.method.wikipedia.WikipediaPage;

public class WikiTest {

		Wikipedia laPlata;
	    Wikipedia lucasArt;
		Wikipedia lobo;
        Wikipedia gimnasia;
		Wikipedia bsAs;
		List<WikipediaPage> wikipedias;
		LetraInicial filtroLetra;  
		MismoLink filtroLink;
		PropiedadComun filtroPropiedad;
		
		@Before
		public void setUp() throws Exception {
			laPlata = new Wikipedia("La Plata");
			lucasArt = new Wikipedia("LucasArt");
			lobo = new Wikipedia("Lobo");
			gimnasia = new Wikipedia("Gimnasia y Esgrima La Plata");
			bsAs =  new Wikipedia("Buenos Aires");
			wikipedias = Arrays.asList(laPlata, lucasArt, lobo, gimnasia, bsAs);
			filtroLetra = new LetraInicial("letra");
			filtroLink = new MismoLink("link");
			filtroPropiedad = new PropiedadComun("propiedad");
			
			gimnasia.getLinks().add(laPlata);
			bsAs.getLinks().add(laPlata);
			gimnasia.getInfobox().put("birth_place", laPlata);
			lobo.getInfobox().put("birth_place", laPlata);
		}
		

		@Test
		public void MismaLetraInicialTest() {
			
			assertTrue(filtroLetra.getSimilarPages(laPlata, wikipedias).contains(lucasArt));
			
		}
		
		@Test
		public void PropiedadEnComunTest() {
			
			assertTrue(filtroPropiedad.getSimilarPages(gimnasia, wikipedias).contains(lobo));
			
		}
		
		@Test
		public void LinkEnComunTest() {
			
			assertTrue(filtroLink.getSimilarPages(gimnasia, wikipedias).contains(bsAs));
			
		}

	
}
