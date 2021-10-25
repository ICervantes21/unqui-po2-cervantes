package unq.edu.ar.po2.tp8.composite.archivos;

import java.util.Calendar;

public interface FileSystem {
	
	/**
	 * Retorna el total ocupado en disco del receptor, expresado
	 * en cantidad de bytes
	 */
	
	public int totalSize();
	
	/**
	 * Imprime en consola el contenido indicando el nombre del elemento e identandolo
	 * con tantos espacios como profundidad en la estructura.
	 */
	
	public void printStructure();
	
	/**
	 * Elemento mas nuevo.
	 */
	
	public FileSystem lastModified();
	
	/**
	 * Elemento mas antiguo.
	 */
	
	public FileSystem oldestElement();
	
	public Calendar get�ltimaModificaci�n();

}
