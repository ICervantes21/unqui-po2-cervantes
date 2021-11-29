package unq.edu.ar.po2.tp9.template.method.wikipedia;

import java.util.stream.Collector;

public class PropiedadComun extends Filter {

	public PropiedadComun(String filtro) {
		super(filtro);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean condicionDeFiltro(WikipediaPage page, WikipediaPage pagina) {
		return page.getInfobox().keySet().stream().filter(clave -> pagina.getInfobox().containsKey(clave)).toList()
				.size() > 0;
	}

}