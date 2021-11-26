package unq.edu.ar.po2.tp11.refactor.Registro.TP_Refactoring.Cuenta.Cuenta.test.cuenta;

import static org.junit.Assert.assertEquals;

import unq.edu.ar.po2.tp11.refactor.Registro.TP_Refactoring.Cuenta.Cuenta.src.cuenta.*;

import org.junit.Test;
import org.mockito.Mockito;

public class CuentaCorrienteTest {
	@Test
	public void testCajaAhorro() {
		HistorialMovimientos historialMovimientos = Mockito.mock(HistorialMovimientos.class);
		Notificador notificador = Mockito.mock(Notificador.class);
		
		CuentaCorriente cuentaCorriente = new CuentaCorriente(historialMovimientos, notificador, 100, 1);
		
		cuentaCorriente.extraer(90);
		assertEquals(10, cuentaCorriente.getSaldo());
		Mockito.verify(historialMovimientos).registrarMovimiento("Extracción", 90);
		
		cuentaCorriente.extraer(10);
		assertEquals(0, cuentaCorriente.getSaldo());
		Mockito.verify(historialMovimientos).registrarMovimiento("Extracción", 10);
		
		cuentaCorriente.extraer(1);
		assertEquals(-1, cuentaCorriente.getSaldo());
		Mockito.verify(historialMovimientos).registrarMovimiento("Extracción", 1);
		
		Mockito.verify(notificador, Mockito.times(3)).notificarNuevoSaldoACliente(cuentaCorriente);
	}
}
