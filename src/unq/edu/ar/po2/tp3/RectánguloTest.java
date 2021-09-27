package unq.edu.ar.po2.tp3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Test;

public class RectánguloTest {

	/**
	 * Creo la instancia
	 */

	Rectángulo rectángulo = new Rectángulo(
			Arrays.asList(new Point(1, 1), new Point(1, 4), new Point(4, 4), new Point(4, 1)), 7, 4);

	/**
	 * Calculo el area total, debería en este caso dar 28.
	 */

	@Test
	public void testArea() {
		assertEquals(28, rectángulo.calcularArea());
	}

	/**
	 * Calculo el perímetro del rectangulo, en este caso debería ser 22.
	 */

	@Test
	public void testPerímetro() {
		assertEquals(22, rectángulo.calcularPerímetro());
	}

	/**
	 * Como la base es mayor a la altura, su forma debería ser horizontal.
	 */

	@Test
	public void testForma() {
		assertTrue(rectángulo.esHorizontal());
	}

}
