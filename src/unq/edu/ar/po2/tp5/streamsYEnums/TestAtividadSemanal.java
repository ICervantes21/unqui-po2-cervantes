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
		futbol = new ActividadSemanal(Día.Lunes, 13, 2, Deporte.Fútbol);
		futbol2 = new ActividadSemanal(Día.Jueves, 13, 2, Deporte.Fútbol);
		basket = new ActividadSemanal(Día.Martes, 18, 3, Deporte.Basket);
		tennis = new ActividadSemanal(Día.Miércoles, 10, 4, Deporte.Tennis);
		tennis2 = new ActividadSemanal(Día.Sábado, 10, 4, Deporte.Tennis);
		jabalina = new ActividadSemanal(Día.Domingo, 17, 1, Deporte.Jabalina);
		running = new ActividadSemanal(Día.Viernes, 8, 2, Deporte.Running);
	}
	
	

}
