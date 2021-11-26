package unq.edu.ar.po2.tp6;

public class SolicitudDeCréditoPersonal extends SolicitudDeCrédito {

	public SolicitudDeCréditoPersonal(Cliente solicitante, double montoSolicitado, int plazo) {
		super(solicitante, montoSolicitado, plazo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean aceptable() {
		return this.getSolicitante().sueldoNetoAnual() >= 15000
				&& this.montoMensual() < this.getSolicitante().getSueldoNetoMensual() * 0.7;
	} 

}
