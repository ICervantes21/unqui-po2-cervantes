package unq.edu.ar.po2.tp8.observer;

import java.util.Arrays;
import java.util.List;

public class Artículo {
	
	private String título;
	private String autores;
	private String filiación;
	private String tipo;
	private String origen;
	private String palabrasClaves;
	
	
	public Artículo(String título, String autores, String filiación, String tipo, String origen,
			String palabrasClaves) {
		this.título = título;
		this.autores = autores;
		this.filiación = filiación;
		this.tipo = tipo;
		this.origen = origen;
		this.palabrasClaves = palabrasClaves;
	}
	
	public List<String> atributos() {
		return Arrays.asList(this.autores, this.filiación, this.origen, this.palabrasClaves, this.tipo,
				this.título);
	}
	
	

}
