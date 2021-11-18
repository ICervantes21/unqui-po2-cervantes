package unq.edu.ar.po2.tp9.template.method.wikipedia;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author Ignacio Cervantes
 *
 */

public interface WikipediaPage {

	/**
	 * 
	 * @return El nombre de la página
	 */
	public String getTitle();

	/**
	 * 
	 * @return Lista de páginas de wikipedia con las que se conecta
	 */
	public List<WikipediaPage> getLinks();

	/**
	 * 
	 * @return Un map con un valor en texto y la página que describe ese valor que
	 *         aparecen en los infobx de la página de wikipedia
	 */
	public Map<String, WikipediaPage> getInfobox();
}
