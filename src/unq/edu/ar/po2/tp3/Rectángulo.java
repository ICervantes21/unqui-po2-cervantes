package unq.edu.ar.po2.tp3;

import java.util.List;

/**
 * 
 * @author Ignacio Cervantes
 * 
 *         TP3, ejercicio 9: Rectángulo.
 *
 */

public class Rectángulo {

	/**
	 * coordenadas deben ser 4 Points.
	 */

	@SuppressWarnings("unused")
	private List<Point> coordenadas;
	private int base;
	private int altura;

	public Rectángulo(List<Point> coordenadas, int base, int altura) {
		this.coordenadas = coordenadas;
		this.base = base;
		this.altura = altura;
	}

	public int calcularArea() {
		return base * altura;
	}

	public int calcularPerímetro() {
		return (base * 2) + (altura * 2);
	}

	public boolean esVertical() {
		return altura > base;
	}

	public boolean esHorizontal() {
		return altura < base;
	}

}
