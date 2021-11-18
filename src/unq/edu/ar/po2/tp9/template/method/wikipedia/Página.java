package unq.edu.ar.po2.tp9.template.method.wikipedia;

import java.util.List;
import java.util.Map;

public class Página implements WikipediaPage{
	
	private String title;
	private List<WikipediaPage> links;
	private List<String> infobox;

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public List<WikipediaPage> getLinks() {
		return links;
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		// TODO Auto-generated method stub
		return null;
	}

}
