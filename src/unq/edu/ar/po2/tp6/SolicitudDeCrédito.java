package unq.edu.ar.po2.tp6;

public abstract class SolicitudDeCrédito implements Solicitable {
	
	private Cliente solicitante;
	private double montoSolicitado;
	private int plazo;
	
	public double montoMensual() {
		return montoSolicitado / plazo;
	}

	public SolicitudDeCrédito(Cliente solicitante, double montoSolicitado, int plazo) {
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

	public void setSolicitante(Cliente solicitante) {
		this.solicitante = solicitante;
	}
	
	public abstract boolean aceptable();
	
	@Override
	public void generarse(Banco banco) {
		banco.agregarSolicitud(this);
		
	}

}
