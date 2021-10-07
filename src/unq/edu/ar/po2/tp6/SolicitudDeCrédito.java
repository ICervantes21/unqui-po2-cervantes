package unq.edu.ar.po2.tp6;

public abstract class SolicitudDeCr�dito {
	
	private Cliente solicitante;
	private double montoSolicitado;
	private int plazo;
	
	public double montoMensual() {
		return montoSolicitado / plazo;
	}

	public SolicitudDeCr�dito(Cliente solicitante, double montoSolicitado, int plazo) {
		this.solicitante = solicitante;
		this.montoSolicitado = montoSolicitado;
		this.plazo = plazo;
	}

	public Cliente getSolicitante() {
		return solicitante;
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public int getPlazo() {
		return plazo;
	}
	
	public abstract boolean aceptable();

}
