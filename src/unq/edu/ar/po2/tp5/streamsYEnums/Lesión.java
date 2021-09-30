package unq.edu.ar.po2.tp5.streamsYEnums;

public enum Lesi�n {
	
	Rojo("Lesi�n de piel color roja", 4), 
	Gris("Lesi�n de piel color gris", 3), 
	Amarillo("Lesi�n de piel color amarilla",2), 
	Miel("Lesi�n de piel color miel", 1);
	
	String descripci�n;
	int nivelDeRiesgo;

	Lesi�n(String descripci�n, int i) {
		this.descripci�n = descripci�n;
		this.nivelDeRiesgo = i;
		
	}
	
	public Lesi�n siguienteLesi�nDe(Lesi�n lesi�n) {
		Lesi�n siguiente = null;
		if (lesi�n == Rojo) siguiente = Gris;
		if (lesi�n == Gris) siguiente = Amarillo;
		if (lesi�n == Amarillo) siguiente = Miel;
		if (lesi�n == Miel) siguiente = Rojo;
		return siguiente;
	}

	

}
