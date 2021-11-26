package unq.edu.ar.po2.tp11.refactor.Registro.TP_Refactoring.Registro.Registro.src.automotor;

import java.time.LocalDate;

/**
 * 
 * @author Ignacio Cervantes
 *
 * Possible bad smell: feature envy
 */
public class RegistroAutomotor {

	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {

		LocalDate fechaFabricacion = vehiculo.getFechaFabricacion();
		Boolean esVehiculoPolicial = vehiculo.esVehiculoPolicial();
		String ciudadRadicacion = vehiculo.ciudadRadicacion();
		
		// vehiculos policiales no realizan vtv, ya que tienen otro tipo de control
		// sólo realizan vtv los vehículos con más de 1 anio de antiguedad y radicados
		// en 'Buenos Aires'
		return (!esVehiculoPolicial && fecha.minusYears(1).isAfter(fechaFabricacion)
				&& ciudadRadicacion.equalsIgnoreCase("Buenos Aires"));

	}
}
