package unq.edu.ar.po2.tp6;

public class SolicitudDeCr�ditoHipotecario extends SolicitudDeCr�dito{
	
	private Propiedad garant�a;

	public SolicitudDeCr�ditoHipotecario(Cliente solicitante, double montoSolicitado, int plazo) {
		super(solicitante, montoSolicitado, plazo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean aceptable() {
		return this.montoMensual() < this.getSolicitante().getSueldoNetoMensual() * 0.5
				&& this.getMontoSolicitado() < garant�a.getValorFiscal() * 0.7
				&& this.getSolicitante().getEdad() <= 64;
	}
	
	

}
