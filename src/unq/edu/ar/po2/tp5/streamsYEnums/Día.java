package unq.edu.ar.po2.tp5.streamsYEnums;

public enum D�a {
	
	Lunes, Martes, Mi�rcoles, Jueves, Viernes, S�bado, Domingo;
	
	/**
	 * 
	 * @return Verdadero si el d�a es de los de menor precio, falso
	 * si es de mayor precio (Jueves a Domingos).
	 */
	
	public boolean esD�aBarato() {
		if (this == D�a.Lunes 
				|| this == D�a.Martes
				|| this == D�a.Mi�rcoles) {
			return true;
		}
		else {
			return false;
		}
	}

}
