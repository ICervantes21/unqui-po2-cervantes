package unq.edu.ar.po2.tp3;

/**
 * 
 * @author Ignacio
 * 
 *         TP3, Ejercicio 8: Point.
 *
 */

public class Point {
	
	/**
	 * Atributos:
	 */

	private int x;
	private int y;
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 
	 * @param punto Es de tipo Point, no debe ser null (solo estoy probando comentarios).
	 * @return Un Point,
	 */
	
	public Point sumarPuntos(Point punto) {
		return new Point(this.x + punto.x, this.y + punto.y);
	}

}
