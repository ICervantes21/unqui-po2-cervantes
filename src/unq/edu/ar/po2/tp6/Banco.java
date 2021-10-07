package unq.edu.ar.po2.tp6;

import java.util.List;

public class Banco {
	
	private List<Cliente> clientes;
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

}
