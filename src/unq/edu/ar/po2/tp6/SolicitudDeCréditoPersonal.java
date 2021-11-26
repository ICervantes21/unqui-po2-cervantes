package unq.edu.ar.po2.tp6;

public class SolicitudDeCr�ditoPersonal extends SolicitudDeCr�dito {

	public SolicitudDeCr�ditoPersonal(Cliente solicitante, double montoSolicitado, int plazo) {
		super(solicitante, montoSolicitado, plazo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean aceptable() {
		return this.getSolicitante().sueldoNetoAnual() >= 15000
				&& this.montoMensual() < this.getSolicitante().getSueldoNetoMensual() * 0.7;
	} 

}
