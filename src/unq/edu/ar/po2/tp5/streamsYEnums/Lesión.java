package unq.edu.ar.po2.tp5.streamsYEnums;

public enum Lesión {
	
	Rojo("Lesión de piel color roja", 4), 
	Gris("Lesión de piel color gris", 3), 
	Amarillo("Lesión de piel color amarilla",2), 
	Miel("Lesión de piel color miel", 1);
	
	String descripción;
	int nivelDeRiesgo;

	Lesión(String descripción, int i) {
		this.descripción = descripción;
		this.nivelDeRiesgo = i;
		
	}
	
	public Lesión siguienteLesiónDe(Lesión lesión) {
		Lesión siguiente = null;
		if (lesión == Rojo) siguiente = Gris;
		if (lesión == Gris) siguiente = Amarillo;
		if (lesión == Amarillo) siguiente = Miel;
		if (lesión == Miel) siguiente = Rojo;
		return siguiente;
	}

	

}
