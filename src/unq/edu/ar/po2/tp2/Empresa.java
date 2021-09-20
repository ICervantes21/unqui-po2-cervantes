package unq.edu.ar.po2.tp2;

import java.util.ArrayList;
import java.util.Collection;

public class Empresa {

	private String nombre;
	private int cuit;
	private ArrayList<Empleado> empleados;
	private Collection<ReciboDeHaberes> recibos;

	public Empresa(String nombre, int cuit, ArrayList<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public double montoTotalBrutos() {
		double total = (empleados.stream().mapToDouble(Empleado::sueldoBruto)).sum();
		return total;
	}

	public double montoTotalRetenciones() {
		double total = (empleados.stream().mapToDouble(Empleado::retenciones)).sum();
		return total;
	}

	public double montoTotalNeto() {
		double total = (empleados.stream().mapToDouble(Empleado::sueldoNeto)).sum();
		return total;
	}
	
	@SuppressWarnings("null")
	public ArrayList<Double> montoTotal() {
		ArrayList<Double> listaTotal = null;
		listaTotal.add(this.montoTotalBrutos());
		listaTotal.add(this.montoTotalRetenciones());
		listaTotal.add(this.montoTotalNeto());
		return listaTotal;
		
	}
	
	public void liquidarSueldos() {
		empleados.forEach(empleado -> this.guardarRecibo(this.generarRecibo(empleado)));
	}
	
	
	
	public void guardarRecibo(ReciboDeHaberes recibo) {
		recibos.add(recibo);
	}
	
	public ReciboDeHaberes generarRecibo(Empleado empleado) {
		return new ReciboDeHaberes(empleado.getNombre(), empleado.getDirección(), null, empleado.sueldoBruto()
				, empleado.sueldoNeto(), null);
	}

}
