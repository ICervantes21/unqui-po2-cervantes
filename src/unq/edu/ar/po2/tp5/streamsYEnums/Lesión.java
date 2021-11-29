package unq.edu.ar.po2.tp5.streamsYEnums;

public enum Lesión {

	Rojo("Lesión de piel color roja", 4), Gris("Lesión de piel color gris", 3),
	Amarillo("Lesión de piel color amarilla", 2), Miel("Lesión de piel color miel", 1);

	public String descripción;
	public int nivelDeRiesgo;

	Lesión(String descripción, int i) {
		this.descripción = descripción;
		this.nivelDeRiesgo = i;

	}

	public Lesión siguienteLesión() {
		Lesión siguiente = null;
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
