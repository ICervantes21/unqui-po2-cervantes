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
	 * @return El nombre de la p�gina
	 */
	public String getTitle();

	/**
	 * 
	 * @return Lista de p�ginas de wikipedia con las que se conecta
	 */
	public List<WikipediaPage> getLinks();

	/**
	 * 
	 * @return Un map con un valor en texto y la p�gina que describe ese valor que
	 *         aparecen en los infobx de la p�gina de wikipedia
	 */
	public Map<String, WikipediaPage> getInfobox();
}
