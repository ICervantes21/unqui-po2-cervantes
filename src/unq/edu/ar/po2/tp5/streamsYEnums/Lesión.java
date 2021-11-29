package unq.edu.ar.po2.tp5.streamsYEnums;

public enum Lesi�n {

	Rojo("Lesi�n de piel color roja", 4), Gris("Lesi�n de piel color gris", 3),
	Amarillo("Lesi�n de piel color amarilla", 2), Miel("Lesi�n de piel color miel", 1);

	public String descripci�n;
	public int nivelDeRiesgo;

	Lesi�n(String descripci�n, int i) {
		this.descripci�n = descripci�n;
		this.nivelDeRiesgo = i;

	}

	public Lesi�n siguienteLesi�n() {
		Lesi�n siguiente = null;
		if (this == Rojo)
			siguiente = Gris;
		if (this == Gris)
			siguiente = Amarillo;
		if (this == Amarillo)
			siguiente = Miel;
		if (this == Miel)
			siguiente = Rojo;
		return siguiente;
	}

}
