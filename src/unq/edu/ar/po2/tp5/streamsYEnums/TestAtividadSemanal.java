package unq.edu.ar.po2.tp5.streamsYEnums;

import org.junit.Before;

public class TestAtividadSemanal {
	
	ActividadSemanal futbol;
	ActividadSemanal futbol2;
	ActividadSemanal basket;
	ActividadSemanal tennis;
	ActividadSemanal tennis2;
	ActividadSemanal jabalina;
	ActividadSemanal running;
	
	@Before
	public void setUp() throws Exception {
		futbol = new ActividadSemanal(D�a.Lunes, 13, 2, Deporte.F�tbol);
		futbol2 = new ActividadSemanal(D�a.Jueves, 13, 2, Deporte.F�tbol);
		basket = new ActividadSemanal(D�a.Martes, 18, 3, Deporte.Basket);
		tennis = new ActividadSemanal(D�a.Mi�rcoles, 10, 4, Deporte.Tennis);
		tennis2 = new ActividadSemanal(D�a.S�bado, 10, 4, Deporte.Tennis);
		jabalina = new ActividadSemanal(D�a.Domingo, 17, 1, Deporte.Jabalina);
		running = new ActividadSemanal(D�a.Viernes, 8, 2, Deporte.Running);
	}
	
	

}
