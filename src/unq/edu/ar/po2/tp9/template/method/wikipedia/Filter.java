package unq.edu.ar.po2.tp9.template.method.wikipedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Filter {
	
	@SuppressWarnings("unused")
	private String filtro;
	
	
	
	public Filter(String filtro) {
		super();
		this.filtro = filtro;
	}

	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia){
		
		ArrayList<WikipediaPage> paginasSimilares = new ArrayList<WikipediaPage>();
		for(WikipediaPage pagina : wikipedia) {
			if(this.condicionDeFiltro(page, pagina)) {
			paginasSimilares.add(pagina);
			}
		}
		return paginasSimilares;
	}

	protected abstract boolean condicionDeFiltro(WikipediaPage page, WikipediaPage pagina);

}
