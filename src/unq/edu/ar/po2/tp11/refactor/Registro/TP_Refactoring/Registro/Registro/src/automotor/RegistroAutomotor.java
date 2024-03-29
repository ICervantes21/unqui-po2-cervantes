package unq.edu.ar.po2.tp11.refactor.Registro.TP_Refactoring.Registro.Registro.src.automotor;

import java.time.LocalDate;

/**
 * 
 * @author Ignacio Cervantes
 */
public class RegistroAutomotor {

	/**
	 * Long method!!
	 * 
	 * @param vehiculo
	 * @param fecha
	 * @return
	 */
	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {

		/*
		 * LocalDate fechaFabricacion = vehiculo.getFechaFabricacion(); Boolean
		 * esVehiculoPolicial = vehiculo.esVehiculoPolicial(); String ciudadRadicacion =
		 * vehiculo.ciudadRadicacion();
		 */

		// vehiculos policiales no realizan vtv, ya que tienen otro tipo de control
		// sólo realizan vtv los vehículos con más de 1 anio de antiguedad y
		// radicados
		// en 'Buenos Aires'
		return (this.vehiculoNoPolicial(vehiculo) && this.tieneMasDeUnA�o(vehiculo, fecha)
				&& this.esDeBuenosAires(vehiculo));

	}

	public boolean vehiculoNoPolicial(Vehiculo vehiculo) {
		return !vehiculo.esVehiculoPolicial();
	}

	public boolean tieneMasDeUnA�o(Vehiculo vehiculo, LocalDate fecha) {
		return fecha.minusYears(1).isAfter(vehiculo.getFechaFabricacion());
	}

	public boolean esDeBuenosAires(Vehiculo vehiculo) {
		return vehiculo.ciudadRadicacion().equalsIgnoreCase("Buenos Aires");
	}
}
