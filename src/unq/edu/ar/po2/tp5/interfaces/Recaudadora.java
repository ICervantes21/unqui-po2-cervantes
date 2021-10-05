package unq.edu.ar.po2.tp5.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Recaudadora implements Agencia {
	
	private List<Factura> facturas = new ArrayList<Factura>();

	@Override
	public void registrarPago(Factura factura) {
		facturas.add(factura);
		
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

}
