package unq.edu.ar.po2.tp5.streamsYEnums;

public enum Día {
	
	Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo;
	
	/**
	 * 
	 * @return Verdadero si el día es de los de menor precio, falso
	 * si es de mayor precio (Jueves a Domingos).
	 */
	
	public boolean esDíaBarato() {
		if (this == Día.Lunes 
				|| this == Día.Martes
				|| this == Día.Miércoles) {
			return true;
		}
		else {
			return false;
		}
	}

}
