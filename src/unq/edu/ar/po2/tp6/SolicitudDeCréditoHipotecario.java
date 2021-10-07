package unq.edu.ar.po2.tp6;

public class SolicitudDeCréditoHipotecario extends SolicitudDeCrédito{
	
	private Propiedad garantía;

	public SolicitudDeCréditoHipotecario(Cliente solicitante, double montoSolicitado, int plazo) {
		super(solicitante, montoSolicitado, plazo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean aceptable() {
		return this.montoMensual() < this.getSolicitante().getSueldoNetoMensual() * 0.5
				&& this.getMontoSolicitado() < garantía.getValorFiscal() * 0.7
				&& this.getSolicitante().getEdad() <= 64;
	}
	
	

}
