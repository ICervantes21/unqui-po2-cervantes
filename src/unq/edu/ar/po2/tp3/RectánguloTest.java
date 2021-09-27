package unq.edu.ar.po2.tp3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Test;

public class Rect�nguloTest {

	/**
	 * Creo la instancia
	 */

	Rect�ngulo rect�ngulo = new Rect�ngulo(
			Arrays.asList(new Point(1, 1), new Point(1, 4), new Point(4, 4), new Point(4, 1)), 7, 4);

	/**
	 * Calculo el area total, deber�a en este caso dar 28.
	 */

	@Test
	public void testArea() {
		assertEquals(28, rect�ngulo.calcularArea());
	}

	/**
	 * Calculo el per�metro del rectangulo, en este caso deber�a ser 22.
	 */

	@Test
	public void testPer�metro() {
		assertEquals(22, rect�ngulo.calcularPer�metro());
	}

	/**
	 * Como la base es mayor a la altura, su forma deber�a ser horizontal.
	 */

	@Test
	public void testForma() {
		assertTrue(rect�ngulo.esHorizontal());
	}

}
