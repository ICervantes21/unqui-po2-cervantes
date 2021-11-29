package unq.edu.ar.po2.tp9.template.method.wikipedia;

public class MismoLink extends Filter{
	
	public MismoLink(String filtro) {
		super(filtro);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean condicionDeFiltro(WikipediaPage page, WikipediaPage pagina) {
		return pagina.getLinks()
					 .stream()
					 .filter(link -> page.getLinks().contains(link)).toList().size() > 0;
	}

}
