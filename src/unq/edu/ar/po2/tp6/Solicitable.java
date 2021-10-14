package unq.edu.ar.po2.tp6;

public interface Solicitable {

	public void generarse(Banco banco);

	public boolean aceptable();

	public double getMontoSolicitado();

	public void setSolicitante(Cliente solicitante);

}
