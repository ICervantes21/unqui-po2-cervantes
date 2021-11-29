package unq.edu.ar.po2.tp8.observer.preguntas;

public class Pregunta {

	private String contenido;
	private String respuesta;

	public String getContenido() {
		return contenido;
	}

	public String getRespuesta() {
		return respuesta;
	}

	/**
	 * @param contenido
	 * @param respuesta
	 */
	public Pregunta(String contenido, String respuesta) {
		super();
		this.contenido = contenido;
		this.respuesta = respuesta;
	}

}
