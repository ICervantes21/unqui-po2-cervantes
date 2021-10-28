package unq.edu.ar.po2.tp8.observer;

import java.util.Arrays;
import java.util.List;

public class Art�culo {
	
	private String t�tulo;
	private String autores;
	private String filiaci�n;
	private String tipo;
	private String origen;
	private String palabrasClaves;
	
	
	public Art�culo(String t�tulo, String autores, String filiaci�n, String tipo, String origen,
			String palabrasClaves) {
		this.t�tulo = t�tulo;
		this.autores = autores;
		this.filiaci�n = filiaci�n;
		this.tipo = tipo;
		this.origen = origen;
		this.palabrasClaves = palabrasClaves;
	}
	
	public List<String> atributos() {
		return Arrays.asList(this.autores, this.filiaci�n, this.origen, this.palabrasClaves, this.tipo,
				this.t�tulo);
	}
	
	

}
