package unq.edu.ar.po2.tp9.template.method.wikipedia;

public class LetraInicial extends Filter {

	public LetraInicial(String filtro) {
		super(filtro);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean condicionDeFiltro(WikipediaPage page, WikipediaPage pagina) {
		return (page.getTitle().charAt(0)) == (pagina.getTitle().charAt(0));
	}

}
