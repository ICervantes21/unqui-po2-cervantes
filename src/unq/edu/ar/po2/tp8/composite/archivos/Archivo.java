package unq.edu.ar.po2.tp8.composite.archivos;

import java.util.Calendar;

import org.junit.jupiter.api.Disabled;

public class Archivo implements FileSystem {

	private String nombre;
	private int espacioEnDisco;
	private Calendar �ltimaModificaci�n;

	@Override
	public int totalSize() {
		return this.espacioEnDisco;
	}

	@Override
	public void printStructure() {
		System.out.println(this.nombre);

	}

	public Calendar get�ltimaModificaci�n() {
		return �ltimaModificaci�n;
	}
	

	/**
	 * 
	 * @return este mismo elemento, porque es un archivo solo.
	 */
	@Override
	@Disabled
	public FileSystem lastModified() {
		return this;
	}

	/**
	 * @return este mismo elemento, porque es un archivo solo.
	 */

	@Override
	@Disabled
	public FileSystem oldestElement() {
		return this;
	}

}
