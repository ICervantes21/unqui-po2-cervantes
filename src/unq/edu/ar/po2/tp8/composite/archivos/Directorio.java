package unq.edu.ar.po2.tp8.composite.archivos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.jupiter.api.Disabled;

/**
 * 
 * @author ignacio
 *
 */

public class Directorio implements FileSystem {

	private String nombre;
	private Calendar fechaDeCreación;
	private List<FileSystem> contenido = new ArrayList<FileSystem>();

	@Override
	public int totalSize() {
		int cantidad = this.contenido.stream().mapToInt(file -> file.totalSize()).sum();
		return cantidad;
	}

	@Override
	public void printStructure() {
		for (FileSystem i : contenido) {
			i.printStructure();
		}

	}

	@Override
	public FileSystem lastModified() {
		FileSystem último = null;
		for (FileSystem i : contenido) {
			
		}
		return último;
	}

	@Override
	public FileSystem oldestElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Disabled
	@Override
	public Calendar getÚltimaModificación() {
		// TODO Auto-generated method stub
		return null;
	}

}
